

public class var_args {
    public static void main(String[] args) {
        
                // Scanner sc = new Scanner(System.in);
            Bio("Hello");
            Bio("Hello", "sc.nextLine()");
                // sc.close;
            
        
           
        }

        static void Bio(String... bio){
            for(String s: bio){
                System.out.println(s);
            }
        }
    }