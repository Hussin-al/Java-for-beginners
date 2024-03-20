import java.util.Scanner;

public class MemoryRequirementForImages {
    public static void main (String[]args){


 Scanner scanner = new Scanner(System.in);
 System.out.println("Geben Sie die Breite des Bildes in Pixel ein:");
 int breite = scanner.nextInt();
 System.out.println("Geben Sie die Höhe des Bildes in Pixel ein:");
 int heohe = scanner.nextInt();
System.out.println("Geben Sie die Anzahl des Bildes ein:");
int anzahlBilder = scanner.nextInt();
System.out.println("Ist Das Bild Farblich :");
String bild = scanner.next();
 int speicherBedarf ;  

if (bild == "ja") {

speicherBedarf = breite * heohe * 3 * anzahlBilder ;

    }else{
speicherBedarf = breite * heohe * 1 * anzahlBilder; 

    }

    System.out.println("Benötige SpeicherBedarf ist "  + speicherBedarf +  "Gibibyte");    
}

}

