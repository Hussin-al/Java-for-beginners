import java.util.ArrayList;
import java.util.Scanner;

public class TempraturArry {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Geben Sie den Tempratur ein :");
        ArrayList<Double> temperaturen = new ArrayList<Double>();
        double summe = 0;
        int anzahl = 0;
        while (sc.hasNextDouble()) {
            double temperatur = sc.nextDouble();
            temperaturen.add(temperatur);
            summe += temperatur;
            anzahl++;
        }
        double durchschnitt = summe / anzahl;
        System.out.println("Der Durchschnitt der Temperaturen ist: " + durchschnitt);
    }
    
}
