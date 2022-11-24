import java.util.Scanner;

public class Pattern_Stars {
  public static void main(String arg[]) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    // output print stars
    // int n = 4;
    for (int i = 1; i <= n; i++) {
      // inner loop ->space
      // for (int j = 1; j <= n - i; j++) {
      // System.out.print(" ");
      // }
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
    // System.out.println("*");
    // System.out.println("**");
    // System.out.println("***");
    // System.out.println("****");
    // System.out.println("*****");

  }
}