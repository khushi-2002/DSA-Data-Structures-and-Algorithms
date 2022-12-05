

public class Functional_Interfaces {
    public static void main(String[] args) {
        khu k = ()-> System.out.println("I am fun function");
        k.show();
        k.fun();
    }
}

@FunctionalInterface
interface khu{
// we can have multiple methods with single abstract method in functional interface 
    void fun();
    default void show(){
        System.out.println("I am show");
    };
}
