import java.util.Scanner;

public class Vote {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int age= sc.nextInt();
        if(age>=18){
            System.out.println("Have a sex");
        }else{
            System.out.println("Not have sex");
        }
        
    }
}
