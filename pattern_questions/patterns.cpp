#include<iostream>
#include<bits/stdc++.h>
using namespace std;
    void lower_function(int n){
    for(int i=1;i<=n;i++){
        for(int j=1;j<i;j++){
            cout<<" ";
        }
        for(int j=n;j>=i;j--){
            cout<<"*";
        }

        for(int j=n;j>i;j--){
            cout<<"*";
        }
        cout<<endl;
    }
    }

    void upper_function(int n){
            for(int i=1;i<=n;i++){

        for(int j=n;j>i;j--){
            cout<<" ";
        }

        for(int j=1;j<=i;j++){
            cout<<"*";
        }

        for(int j=1;j<i;j++){
            cout<<"*";
        }
        cout<<endl;
    }
    }
int main(){
    int n;
    cin>>n;

    for(int i=1;i<=n;i++){
        for(int j=1;j<=n;j++){
            cout<<"*";
        }
        cout<<endl;
    }

    cout<<endl<<endl;

    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            cout<<"*";
        }
        cout<<endl;
    }

    cout<<endl<<endl;

    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            cout<<j;
        }
        cout<<endl;
    }

    cout<<endl<<endl;

    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            cout<<i;
        }
        cout<<endl;
    }

    cout<<endl<<endl;

    for(int i=1;i<=n;i++){
        for(int j=n;j>=i;j--){
            cout<<"*";
        }
        cout<<endl;
    }

    cout<<endl<<endl;

    for(int i=n;i>=1;i--){
        for(int j=1;j<=i;j++){
            cout<<j;
        }
        cout<<endl;
    }
    cout<<endl<<endl;
    upper_function(n);
    cout<<endl<<endl;
    lower_function(n);
    cout<<endl<<endl;

    upper_function(n);
    lower_function(n);



    cout<<endl<<endl;


    


}
