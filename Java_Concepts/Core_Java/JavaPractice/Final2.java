

public class Final2 {
    public static void main(String[] args) {
        Ant i = new Ant();
        i.show();
    }
}


class Ant{
    final int p;
    
    Ant(){
        p=90;
    }
   public void show(){
    System.out.println(p);
   }

}

class Bat{
    final public void show(){
        System.out.println("I am in the show ");
    }
}


final class Cricket{
  void show(){
    System.out.println("I am in the final show function");
  }
}



