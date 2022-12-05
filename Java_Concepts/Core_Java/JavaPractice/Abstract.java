

public class Abstract {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.sound();
        a.walk();
    }
}
abstract class Animal{
    void eat(){
        System.out.println("I am eating");
    }

    void walk(){
        System.out.println("I am walking around you!");
    }
    abstract void sound();
}

class Dog extends Animal{
   void sound(){
    System.out.println("I am barking");
   }
}

