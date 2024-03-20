import java.util.Scanner;

public class repeatgreeting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben Sie Ihren Namen ein: ");
        String name = scanner.next();

        int i = 0;      
        while ( i <= 5){
            System.out.println("Hallo "  + name );
            i++;
        }
    }
}
