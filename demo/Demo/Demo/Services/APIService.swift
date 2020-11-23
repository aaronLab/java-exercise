//
//  APIService.swift
//  Demo
//
//  Created by Aaron Lee on 2020-11-23.
//

import Combine

protocol APIService {
    func request<T: Decodable>(with builder: RequestBuilder) -> AnyPublisher<T, APIError>
}
