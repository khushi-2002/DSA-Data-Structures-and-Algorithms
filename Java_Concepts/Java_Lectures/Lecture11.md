# Binary Search

* Used to find the target element in the array
* Time complexity of binary search algorithm is way better than linear seach algorithm
* Binary search is the modified version of linear search.
* middle element and then compare with the rest of the elements by reducing the search space

> mid = s+(e-s)/2   // like this cause the value can extend the maximum value of the integer
if(mid<target){    
    start=mid+1;  
}  
else if(mid>target){  
    end= mid-1;  
}   
else{  
    return mid;  
}

## Order Agnostic Binary Search

1. When we don't know whether the array is in increasing or decreasing order thus our fuunction doesn't concern the order.

we can use if and else condition by checking first and last element to get the order and can reply binary search accordingly