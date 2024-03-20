import java.util.Scanner;

public class Multiplicationnumber {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Geben Sie die Nummer:");
    int number = scanner.nextInt();
    int result = 1 ;
        int i = 1; 
      while (i<= number) {
        result = result * i;
        i++;

          System.out.println("n! = " + result );
      }
    }
} 


