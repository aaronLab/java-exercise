//
//  APIError.swift
//  Demo
//
//  Created by Aaron Lee on 2020-11-23.
//

enum APIError: Error {
    case decodingError
    case httpError(Int)
    case unknown
}
