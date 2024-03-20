import java.util.Scanner;

class Averagetemprature{
 public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);
  System.out.println("Bitte geben Sie die Temperaturen der ersten Woche ein:");
  for(int i = 0; i <= 5 ; i++){
    double temp = scanner.nextDouble();
while (temp <= 5) {
    if (temp < 0){

     double summe = temp * i;
    double durschnitt = summe / 5;
    System.out.printf("Die Durchschnittstemperatur war %.2f Grad.\n", durschnitt);
    }
     
  }

 }
 }
 }

