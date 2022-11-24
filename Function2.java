import java.util.Scanner;

public class Function2 {
public static int CalculateProduct(int a , int b){
    int product = a*b;
    return product;

   } 
   public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int Product = CalculateProduct(a,b);
    System.out.println(Product);
   }
}
