//
//  APISession.swift
//  Demo
//
//  Created by Aaron Lee on 2020-11-23.
//

import Foundation
import Combine

struct APISession: APIService {
    
    func request<T>(with builder: RequestBuilder) -> AnyPublisher<T, APIError> where T : Decodable {
        
        return URLSession.shared
            .dataTaskPublisher(for: builder.urlRequest)
            .receive(on: RunLoop.main)
            .mapError { _ in APIError.unknown }
            .flatMap { data, response -> AnyPublisher<T, APIError> in
                
                if let response = response as? HTTPURLResponse {
                    
                    if (200...299).contains(response.statusCode) {
                        
                        return Just(data)
                            .decode(type: T.self, decoder: JSONDecoder())
                            .mapError { _ in APIError.decodingError }
                            .eraseToAnyPublisher()
                        
                    } else {
                        return Fail(error: APIError.httpError(response.statusCode))
                            .eraseToAnyPublisher()
                    }
                    
                } else {
                    return Fail(error: APIError.unknown)
                        .eraseToAnyPublisher()
                }
                
            }
            .eraseToAnyPublisher()
        
    }
    
}
