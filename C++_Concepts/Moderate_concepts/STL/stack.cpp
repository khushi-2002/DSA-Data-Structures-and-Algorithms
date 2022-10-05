#include<iostream>
#include<bits/stdc++.h>
using namespace std;

int main(){
    stack<int>st;
    st.push(1);
    st.push(2);
    st.push(78);
    st.emplace(23);

    cout<<st.top()<<endl;
    cout<<st.size()<<endl;
    cout<<st.empty()<<endl;
}