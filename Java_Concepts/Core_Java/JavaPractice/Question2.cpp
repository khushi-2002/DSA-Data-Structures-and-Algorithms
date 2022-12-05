#include<iostream>
using namespace std;



int main(){
    int value;
    cin>>value;
// 123455
    int arr[100];
    int k=0;
    while (value!=0){
        int digit = value%10;
        arr[k]= digit;
        k++;
        value = value/10;
    }
  
   int even=0;
   int odd=0;

    for(int i=0;i<k;i=i+2){
        even+=arr[i];
        odd+=arr[i+1];
    }

    cout<< abs(even-odd);


}