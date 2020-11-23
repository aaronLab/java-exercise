//
//  DataService.swift
//  Demo
//
//  Created by Aaron Lee on 2020-11-23.
//

import Foundation
import Combine

protocol DataService {
    
    var apiSession: APIService { get }
    
    func getData() -> AnyPublisher<DataResponse, APIError>
    
}

extension DataService {
    
    func getData() -> AnyPublisher<DataResponse, APIError> {
        return apiSession.request(with: RootEndpoint.data)
            .eraseToAnyPublisher()
    }
    
}
