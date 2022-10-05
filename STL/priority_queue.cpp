#include<iostream>
#include<bits/stdc++.h>
using namespace std;

int main(){
    priority_queue<int>q;
    q.push(34);  //{34}
    q.push(2);  // {34,2}
    q.push(12); // {34,12,2}

    cout<<q.top(); // 34
    q.pop(); // {12,2}
    
    
}