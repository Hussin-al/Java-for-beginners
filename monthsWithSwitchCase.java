import java.util.Scanner;

class Monante{
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.err.println("Geben Sie Zahl ein , damit Sie in welche Monat sind ? ");

    int Zahl = scanner.nextInt();
    
    String  monate;
  
    switch (Zahl) {
      case  1: 
        monate = "Januar";
        break;
      case  2: 
        monate = "Februar";
        break;
      case  3: 
        monate = "März";
        break;
        case 4 : 
        monate = "April";
        break;
        case 5 : 
        monate = "Mai";
        break;
        
      default: 
        monate = "Wir haben haben nur 5 Monaten";
    } 
    
    System.out.println(monate);
  
  
  }
  
}
