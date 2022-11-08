# Doubts

> class A{  
    int a;  
    a=90; // gives error      
    
}

while
> class A{  
    int a=90; // doesn't gives any errors  
}


*Note*: Final variables cannot intialized inside the method, it can either intitialized inside the constructor or directly while declaration.

## Why we are using finally block?
finally block executes regardless either there is any exceptions or not, either we have catch or try, doesn't matters

> finally{  
    sout("I'll always being executed");  
>}