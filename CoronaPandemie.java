import java.util.Scanner;

class CoronaPandemie {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Inzidenzrechner & Corona-Ampel");
        System.out.println("Bitte geben Sie die Anzahl der neuInfektionen der Vergangenen 7 Tage ein: ");
        int newInfections = sc.nextInt();
        System.out.println("Bitte geben Sie die Bevölkerungsgröße ein: ");
        int population = sc.nextInt();
        double result = (double) newInfections / population * 100_000;
        System.out.println("7-Tages-Inzidenz: " + result);

        String ampelColor = determineAmpelColor(result);
        System.out.println("Corona Ampel: " + ampelColor);
    }

    static String determineAmpelColor(double result) {
        if (result < 20) {
            return "Grün";
        } else if (result >= 20) {
            return "Gelb";
        } else if (result >= 35) {
            return "Gelb";
        } else if (result >= 50) {
            return "Rot";
        } else if (result > 75) {
            return "DunkelRot";
        }
        return null;
         
        
    }
}
