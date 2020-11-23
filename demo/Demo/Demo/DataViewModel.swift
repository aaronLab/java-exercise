//
//  DataViewModel.swift
//  Demo
//
//  Created by Aaron Lee on 2020-11-23.
//

import Foundation
import Combine

final class DataViewModel: ObservableObject, DataService {
    internal var apiSession: APIService
    @Published var dataResponse: DataResponse?
    
    private var cancellables = Set<AnyCancellable>()
    
    init(apiSession: APIService = APISession()) {
        self.apiSession = apiSession
    }
    
    func getData() {
        self.getData()
            .sink { result in
                switch result {
                case .failure(let err):
                    print("Handle err: \(err)")
                case .finished:
                    break
                }
            } receiveValue: { response in
                self.dataResponse = response
            }.store(in: &cancellables)
    }
    
}
