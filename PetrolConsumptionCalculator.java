import java.util.Scanner;

 class PetrolConsumptionCalculator {
    public static void main(String[]args){
         System.out.println("Geben Sie,Wie lagen haben Sie gefahren :");
         Scanner scanner = new Scanner(System.in);
         double strecke =scanner.nextDouble();
         System.out.println("Geben Sie,Wie viel Liter wird gebraucht  :");
         double liter = scanner.nextDouble();
         
         double duchschnitt = (strecke / liter) * 100;
         System.out.println("Die Durchschnit ist " + duchschnitt ); 


    } 
}
