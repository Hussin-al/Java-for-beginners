import java.util.Scanner;

 class CalculationAmount {
    public static void main(String [] args ){
  Scanner scanner = new Scanner(System.in);
 System.out.println("Bitte Geben Sie Ihre BestellWert :");
  double orderValue = scanner.nextDouble();
  
  if(orderValue >= 0){
    System.out.println("Ihr Rechnungsbetrag betragt nicht ");

  }else{
   System.out.println("Sie Haben zusäztlich Preis von HÖher : 5,50");
   orderValue += 5.50;


  }

System.out.println("Deine Gesammtbertag ist" + orderValue );


    }
     
    
}
