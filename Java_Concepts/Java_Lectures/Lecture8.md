# Lecture 8

## Arrays and Array list:

If we want to store no of datatype in one variable then we can use Arrays for storing them which helps in code readabilty 

1. Objects store in heap
2. References store in stack

![image](photos/Screenshot%202022-10-12%20232539.jpg)

Arrays elements are not contiguous cause it depends on JVM

### Array having all 0 element by default internally once declared

By default, String array h0ave null as its default value

![image](photos/Screenshot%202022-10-12%20235758.jpg)


Note: All primitive types store in stack memory while all objects,classes, non -primitive store in heap memory

![image](photos/Screenshot%202022-10-13%20001136.jpg)

*Arrays are mutable and they can be changed*

When try to print elements via index which is more than the size then it shows an error of "Array index bound of exception"


Example: 
> int []arr = new int[5]  
> arr[5] // gives an error

Printing of an array:

1. Using for loop
2. using foreach loop
3. using Arrays.toString(array_name)

Multi Dimensional Arrays:
It is not mandatory to mention the no of columns because it will vary and no of rows are mandatory to be mentioned cause they decide the size of array it going to be.


ArrayList: Whenn you don't know the size of an array thus we use arraylist.

(dynamic array)

Collections: Already implemenred codes that can be used in the program same as STL in c++.

![images](photos/Screenshot%202022-10-14%20141903.jpg)






