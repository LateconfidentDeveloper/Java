import java.util.Scanner;
public class Function3 {
   
    public static int printPrimeNumber(int n) {
        //conditions
      if(n/2!=0){
       System.out.println("prime number");
      }
       return n;
    }
public static void main(String args[]) {
   Scanner sc = new Scanner(System.in);
   int n = sc.nextInt();
   printPrimeNumber();
  }
}
