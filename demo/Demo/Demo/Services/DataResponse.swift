//
//  DataResponse.swift
//  Demo
//
//  Created by Aaron Lee on 2020-11-23.
//

import Foundation

struct DataResponse: Decodable {
    
    let apiKey: String
    let firstName: String
    let lastName: String
    let age: String
    let email: String
    
}
