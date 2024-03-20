import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Bitte geben Sie die erste Zahl ein:");
        int number1 = scanner.nextInt();
        
        System.out.println("Bitte geben Sie die zweite Zahl ein:");
        int number2 = scanner.nextInt();

        System.out.println("Welche Operation möchten Sie durchführen? (1 für Addition, 2 für Subtraktion)");
        int operation = scanner.nextInt();

        int result = 0;

        switch (operation) {
            case 1:
                result = number1 + number2;
                break;
            case 2:
                result = number1 - number2;
                break;
            default:
                System.out.println("Ungültige Operation");
                return; 
        }

        System.out.println("Das Ergebnis ist: " + result);
        
        
        scanner.close();
    }
}
