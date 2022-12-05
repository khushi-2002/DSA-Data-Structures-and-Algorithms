

public class UserDefined {
    public static void main(String[] args) {
        int i=90;
        int j=89;
        try{
           if(j>=89){
            throw new MyException("Wrong Input");
           }
           System.out.println(i);
        }catch(MyException e){
            System.out.println("Error"+ e.getMessage());
        }
    }
}

class MyException extends Exception{
    public MyException(String s){
        super(s);
    }
}
