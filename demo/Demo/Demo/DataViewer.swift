//
//  DataViewer.swift
//  Demo
//
//  Created by Aaron Lee on 2020-11-23.
//

import SwiftUI

struct DataViewer: View {
    
    @ObservedObject private var viewModel = DataViewModel()
    
    var body: some View {
        VStack(alignment: .leading, spacing: 16) {
            
            HStack(spacing: 10) {
                Text("API Key")
                Text(viewModel.dataResponse?.apiKey ?? "N/A")
            }
            
            HStack(spacing: 10) {
                Text("First Name")
                Text(viewModel.dataResponse?.firstName ?? "N/A")
            }
            
            HStack(spacing: 10) {
                Text("Last Name")
                Text(viewModel.dataResponse?.lastName ?? "N/A")
            }
            
            HStack(spacing: 10) {
                Text("Age")
                Text(viewModel.dataResponse?.age ?? "N/A")
            }
            
            HStack(spacing: 10) {
                Text("Email")
                Text(viewModel.dataResponse?.email ?? "N/A")
            }
        } //: VSTACK
        .onAppear {
            self.viewModel.getData()
        }
    }
}

struct DataViewer_Previews: PreviewProvider {
    static var previews: some View {
        DataViewer()
    }
}
