import java.util.Scanner;

public class Conditions_1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        if(n%2==0){
            System.out.println("Even number");
        }else
            if(n%2!=0)
            System.out.println("odd number");
        else{
            if((n%n==0)&&(n%1==0))
                System.out.println("prime number");
            
        }
         
        
        
    }
 }

