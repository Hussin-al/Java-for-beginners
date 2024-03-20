import java.util.Scanner;

public class Note{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Bitte geben Sie eine Note ein (1-6): ");
    int note = sc.nextInt();
    
    String noteText;
  
    switch (note) {
      case  1: 
        noteText = "sehr gut";
        break;
      case  2: 
        noteText = "gut";
        break;
      case  3: 
        noteText = "befriedigend";
        break;
        case 4 : 
        noteText = "ausreichend";
        break;
        case 5 : 
        noteText = "mangelhaft";
        break;
        
      default: 
        noteText = "Unbekannte Noteneingabe";
    } // end of switch
    
    System.out.println(noteText);
  
  
  }
  
}