//
//  ContentView.swift
//  Demo
//
//  Created by Aaron Lee on 2020-11-23.
//

import SwiftUI

struct ContentView: View {
    var body: some View {
        NavigationView {
            
            NavigationLink("Data View", destination: DataViewer())
                .navigationBarTitle("Home", displayMode: .inline)
        }
    }
}

struct ContentView_Previews: PreviewProvider {
    static var previews: some View {
        ContentView()
    }
}
