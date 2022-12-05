# **Linear Search**
Searching in the whole array for a target is called as Linear search.

1. Searching of the element in the array.
2. Searching of the element in the array range.
3. Maximum, minimum, sum can be find out by using the linear search

Linear search can be applied to one dimensional array as well as two dimensional array 

!["image"](photos/Screenshot%202022-10-29%20161905.jpg)

Best case: When we get the element at the starting of the array.  
Worst case: When we don't find the target element in the array.

## Linear Search in Strings

* character will be the target to be searched
* In foreach loop, string needs to be converted into character array by using the method like *str.toCharArray()*
> for(char i: str.toCharArray()){  
    sout(i);  
} 

When we need to return an array, do always like this

> return new int[]{23,45};

## Shortcut to find the digits of a number
> return (int) Math.log10(num)+1;
