#include<iostream>
#include<bits/stdc++.h>
using namespace std;



int main(){
pair<int,int>p;
p={1,2};
cout<<p.first<<" "<<p.second;

// To store more than two elements

pair<pair<int,int>,int>p2;
p2={{1,2},4};
cout<<p2.second;
cout<<endl;
cout<<p2.first.first;

// Array of pairs

pair<int,int> a[] = {{1,2},{2,4},{5,6}};
cout<<a[1].second<<" ";
cout<<a[2].first;
}