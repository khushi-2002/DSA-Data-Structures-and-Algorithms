#include<iostream>
#include<bits/stdc++.h>

using namespace std;

int main(){
    vector<int>v;
    v.push_back(1);
    v.emplace_back(2);

    vector<pair<int,int>> v1;
    v1.push_back({1,2});
    v1.emplace_back((1,2));

    vector<int>v2(5,100);
    vector<int>v3(4);

    vector<int>v4(v3);

    for (int i=0;i<v.size();i++){
        cout<<v[i]<<" ";
    }
    
    vector<int>:: iterator it = v.begin();

    it++; // moves to the other memory locations
    cout<< *(it);

    vector<int>:: iterator it = v.end();
    // vector<int>:: iterator it = v2.rend(); it++

    cout<< v[0]<<" "<< v.at(0);
    cout<<v.back();
    

    // Printing the elements of the vector
    for(vector<int>::iterator it= v.begin();it!=v.end();it++){
        cout<<*(it);
    }
    
    // Automatically asign the data
    for(auto it=v.begin();it!=v.end();it++){
        cout<<*(it)<<" ";
    }

    for (auto e: v){
        cout<<e<<" ";
    }
    
    // {10,20,30,40}
    v.erase(v.begin()+1); // Deletes 2nd element
    v.erase(v.begin()+1, v.begin());  //[start, end)

    // Insert Function
    vector<int>v(2,100);
    v.insert(v.begin(),20); // Insert 20 at the starting
    v.insert(v.begin()+1,100); // Insert at the second position
    v.insert(v.begin()+1,2,100); // Insert two elements at the second position

// inserting the vector anywhere inside the vector
    vector<int>copy(2,100);
    v.insert(v.begin(), copy.begin(), copy.end());

    cout<<v.size();
    v.pop_back();

    v.swap(v2);

    v.clear(); // Returns the empty vector

    cout<<v.empty(); // Check whether the vector is empty or not (True or False)

    // insert in vector is costly and push_front is quite cheap in term of Tine complexity

    
    



    



}