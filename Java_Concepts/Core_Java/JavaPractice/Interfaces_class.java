

public class Interfaces_class {
    public static void main(String[] args) {
        App a = new App() {
            public void show(){
               System.out.println("I am show function"); 
            }
        };

        a.show();
    }
}

interface App{
    void show();
}
