#include<iostream>
#include<bits/stdc++.h>
using namespace std;

int main(){
    list<int>li;
    li.push_back(20); // {20}
    li.emplace_back(4); // {20,4}

    li.push_front(5); // {5,20,4}
    li.emplace_front(); // {2,4}
    
}