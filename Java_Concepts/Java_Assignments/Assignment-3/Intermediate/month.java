

public class month {
    public static void main(String[] args) {

        int no_of_days=0;
        for(int i=1;i<=31;i++){
            if(i%2==0){
               no_of_days+=1;
            }
        }

        System.out.println(no_of_days);
        
    }
}
