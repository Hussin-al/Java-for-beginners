import java.util.Scanner;

class age {
     public static void main(String [] args) {

         int age;

         Scanner scanner = new Scanner(System.in);
         System.out.println("Hallo , wie heißt du ?");
         String name = scanner.nextLine();
         System.out.println("Welches Jahr haben wir" +" "+ name + "?");
         int year = scanner.nextInt();
         System.out.println("jahre " + year );
         System.out.println("In welchem Jahr bist du geboren?" );
         int yearBorn = scanner.nextInt();
         System.out.println("geboren jahr : " + yearBorn );
         System.out.println("Hattest du dieses Jahr schon Geburtstag?");
         System.out.println("Für ja gebe 0 für nein 1 ein: ");
         int zahl = scanner.nextInt();
         if (zahl == 0 ){
                 age = year - yearBorn;
             System.out.println(name +" ," + "du bist " + age + " Jahre alt" );

         } else if (zahl == 1) {


         }
     }
}
