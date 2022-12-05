import java.util.Scanner;

public class Linear_search_strings {
    public static void main(String[] args) {
        String n = "Khushi";
        Scanner sc = new Scanner(System.in);
        char c = sc.next(".").charAt(0);
        System.out.println(searching(n, c));
        sc.close();
        

    }

    static boolean searching(String s, char target){
        if(s.length()==0){
            return false;
        }
        else{
            for(char a: s.toCharArray()){
                if(a==target){
                    return true;
                }
            }
        }
        return false;
    }
}
