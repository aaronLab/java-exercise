//
//  DataEndpoint.swift
//  Demo
//
//  Created by Aaron Lee on 2020-11-23.
//

import Foundation

enum RootEndpoint {
    case data
}

extension RootEndpoint: RequestBuilder {
    
    var urlRequest: URLRequest {
        switch self {
        case .data:
            guard let url = URL(string: "http://localhost:8080/demo/data?apiKey=\(APIKey.data)")
            else { preconditionFailure("Invalid URL Format") }
            let request = URLRequest(url: url)
            return request
        }
    }
    
}
