

public class Intefaces {
    public static void main(String[] args) {
        Fruit f = new Fruit();
        f.color();
    }
}

interface apple{
    void show();
    void color();
    void taste();
}

interface banana{
    void color();
    void taste();
}

class Fruit implements apple, banana{
  @Override
  public void show() {
      System.out.println("I was in the apple interface");
  }
  public void color(){
    System.out.println("I am in the color");
  }
   public void taste(){
    System.out.println("I am in the taste phase");
   }
}
