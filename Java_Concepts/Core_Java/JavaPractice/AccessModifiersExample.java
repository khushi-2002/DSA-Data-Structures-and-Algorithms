

public class AccessModifiersExample {
    public static void main(String[] args) {
       Giraffe g = new Giraffe();
       System.out.println(g.s); 
    //    Giraffe.Thin t =  g.new Thin();
    }
}

class Giraffe{
    private class Thin{
        int size;
       void setSize(){
            this.size = 32;
        }
    }

    Thin obj;

    char s = (obj.size>32)?'C':'B';
    
    int height;
    void setHeight(){
        obj.setSize();
        this.height = 172;
    }

}
