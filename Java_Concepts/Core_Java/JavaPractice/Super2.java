

public class Super2 {
    public static void main(String[] args) {
       C c = new C();
       c.myname();
    }
}


class A{
   public A(){
    System.out.println("I am constructor A");
   }

   public void name(){
     System.out.println("I am a name that you will call me");
   }
   
}

class B extends A{
    public B(){
        System.out.println("I am constructor B");
    }
    // public void name(){
    // System.out.println("I am Khushi Agarwal");
    // }
}

class C extends B{

    /* 
    1. Don't need to have the same function name as super class
    2. Firstly it'll check the super class method, if it found then display if not then check the upper super class 
     function */
    public void myname(){
        super.name();
    }
    public C(){
        System.out.println("I am constructor C");
    }
}
