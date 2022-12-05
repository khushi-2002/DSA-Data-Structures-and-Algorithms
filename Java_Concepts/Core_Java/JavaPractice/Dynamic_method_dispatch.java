

public class Dynamic_method_dispatch {
    public static void main(String[] args) {
       Apple obj = new Banana();
       obj.show();
       obj = new Carrot();
       obj.show();
       
    }
}

class Apple{
public void show(){
    System.out.println("I am show in class Apple");
}
}

class Banana extends Apple{
  public void show(){
    System.out.println("I am show in class Banana");
  }
}

class Carrot extends Apple{
public void show(){
    System.out.println("I am show in class Carrot");
}

}
