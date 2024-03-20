import java.util.Scanner;

 class Cellphone {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double result ; 
        double Tarif = 5.99 ;

        System.out.println(" Welche Type hast du von Nachrichten genommen (1.SMS oder 2.MMS)");
        int messeg = scanner.nextInt();

        System.out.println("Wie viel NAchrichten hast du geschickt");
        int sentMesseg = scanner.nextInt();
        if (messeg == 1 ) {
            result = Tarif + ((19 * sentMesseg));
            System.out.println("Dein gesammte Monat abrechnung ist : " + result);
            
        } else if (messeg == 2){

            result = Tarif + ((29 * sentMesseg));
            System.out.println("Dein gesammte Monat abrechnung ist : " + result);
        }

    }
}