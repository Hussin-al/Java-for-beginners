import java.util.Scanner;

public class ImagesSizeCalculator {
    public static void main(String[] a) {
        Scanner input = new Scanner(System.in);

        System.out.println("Bitte geben sie erst die Breite und dann die Höhe ihres Bildes in Pixeln an:");
        System.out.println("Breite: ");
        int width = input.nextInt();
        System.out.println("Höhe: ");
        int height = input.nextInt();
        System.out.println("Wollen sie ein Farbbild speichern? (j/n)");
        String colored = input.next();

        System.out.println("Geben sie nun die Anzahl ihrer Bilder an, welche gespeichert werden sollen.");
        int numberOfPictures = input.nextInt();

        int pictureSize = width * height;
        int needetSpaceInBytes = pictureSize * numberOfPictures;
        // double needetSpaceInGigabyte = needetSpaceInBytes * Math.pow(10, -9);
        double needetSpaceInGibibyte = needetSpaceInBytes / Math.pow(1024, 3);
        needetSpaceInGibibyte = Math.round(needetSpaceInGibibyte * 100) / 100.0;
        if (colored.equals("j")) {
            needetSpaceInGibibyte = needetSpaceInGibibyte * 3;
        }
        System.out.println("Sie benötigen " + needetSpaceInGibibyte + " GiB Speicherplatz um ihre Bilder abzuspeichern.");
        input.close();
    }
}
