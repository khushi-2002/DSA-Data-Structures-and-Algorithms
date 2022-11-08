public class variables_in_interface {
    public static void main(String[] args) {
        
    }
}

interface A{
    int a =90;
}

class B implements A{
    public void change(){
      //  a=89; // cannot be possible
    }
}
