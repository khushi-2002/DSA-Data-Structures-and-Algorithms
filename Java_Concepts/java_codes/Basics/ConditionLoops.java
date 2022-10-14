import java.util.Scanner;

public class ConditionLoops {
    public static void main(String[] args) {
      // If conditions
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();
      if (a>b){
       System.out.println(a+" is greater");
      }
      else{
        System.out.println(b+" is greater");
      }
      sc.close();
      // While loop

      int count =23;
      while(count!=24){
        System.out.println(count);
      }

      // For loop
      for(count=1;count<=45;count++){
        System.out.println(count);
      }

      
    }
}
