# **STL Containers**

STL: Standard Templete Library 
It includes:
* Algorithms
* Containers
* Functions
* Iterators 

**Containers**  

1. Container:
## Pairs: 
It is storing the elements mainly pairs
1. It comes in utility library


For Declaration:
> pair<int,int>p  
> pair<pair<int,int>,int>p2;  
> pair<int,int> a[] = {{1,2},{2,4},{5,6}};

For Initialization:
> p={1,2}  
> p2={{1,2},4};

For Accessing:
> cout<<p.first<<" "<<p.second;  
> cout<<p2.first.first;  
> cout<<a[1].second<<" ";  
> cout<<a[2].first;

## Vectors:
The container to store the elements (Dynamic Container)

> v.push_back()
> v.emplace_back()

Note: emplace_back() is faster than push_back()

### iterators:

For declaring the iterator:
> vector<int>::iterator it = v.begin();

For moving to the next memory locations
> it++;

For Accessing the elements which is pointing by the iterator
> *(it);

For other iterators:
> vector<int>::iterator it = v.end(); --> This will point to the memory location after the last element  

> vector<int>::iterator it = v.rend();--> This will reverse the array and pointing the memory before the first element


### Erase Function:
> {10,20,30,40}
    v.erase(v.begin()+1); --> Deletes 2nd element  
    v.erase(v.begin()+1, v.begin());--> [start, end)  

### Insert Function
    vector<int>v(2,100);
    v.insert(v.begin(),20); --> Insert 20 at the starting
    v.insert(v.begin()+1,100); --> Insert at the second position
    v.insert(v.begin()+1,2,100); --> Insert two elements at the second position

### Inserting the vector anywhere inside the vector
    vector<int>copy(2,100);
    v.insert(v.begin(), copy.begin(), copy.end());

    cout<<v.size();
    v.pop_back();

    v.swap(v2);

    v.clear(); --> Returns the empty vector

    cout<<v.empty(); --> Check whether the vector is empty or not (True or False)

Note: Inserting in vector is costly and push_front is quite cheap in terms of Time complexity

## List
A list is same as vector, that can iterate from both the ends

> list <int> li;

same functions like vector:
* back()
* reverse()
* sort()
* size()
* empty()
* front()

Other functions :
* begin() – it refers to the first element of the list.
* end() – it refers to the theoretical element after the last element of the list.
* cbegin() – it refers to the first element of the list.
* cend() – it refers to the theoretical element after the last element of the list.
* rbegin() – it points to the last element of the list.
* rend() – it points to the theoretical element before the first element of the list.
* emplace_front() – to insert an element at the front of the list.
* emplace_back() – to insert an element at the end of the list.
* max_size() – the maximum elements a list can hold.
* clear() – to delete all the elements of the list.
* erase() – to delete a single element or elements between a particular range.

##  Deque:
This is also a container to store the elements dynamically and having same element as other containers

> deque<int> dq---> 

Other functions are same as other containers like pop, push_back, emplace_back, push_front

## Stack:
LIFO : Last come, first out

Functions:
* pop();
* push();
* top();
* size()

pop()--deletes the element and its space
Time complexity of each function is o(1)

## Queue:
FIF0: Fist in first out

Functions same as stack

## Priority Queue:
The element which is having high value will be at the top of the container





