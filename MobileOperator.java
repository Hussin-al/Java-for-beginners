import java.util.Scanner;

public class MobileOperator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Tarifrechner Mobilfunk");
        System.out.println("Bitte geben Sie den Tarif (1 oder 2) : ");
        double result;
        int Tarif = sc.nextInt();
        System.out.println("Bitte geben Sie Gesprächsminute an : ");
        int min = sc.nextInt();
        System.out.println("Bitte geben SMS an : ");
        int sms = sc.nextInt();

        switch (Tarif) {
            case 1:
                result = 11.50 + (min * 0.50) + (sms * 0.20);
                System.out.println(" Monatsrechrung im Tarif" + Tarif + " mit" + "GesprächeMinuten " + min + " und "
                        + sms + " SMS " + ": " + result);
                break;
            case 2:
                if (min <= 30) {
                    result = 22.50 + (sms * 0.10);
                    System.out.println(" Monatsrechrung im Tarif " + Tarif +" SMS "  + sms +  ": " + result);
                } else {
                    result = 22.50 + (sms * 0.10) + ((min - 30) * 0.35);
                    System.out.println(" Monatsrechrung im Tarif " + Tarif + " mit GesprächeMinuten " + min + " und "
                            + sms + " SMS " + ": " + result);
                    break;
                }
                default:
                    System.out.println("Kein gültig tarif");
                    break;
        }

    }

}
