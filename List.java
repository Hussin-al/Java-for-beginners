import java.util.ArrayList;

class List {

  public static void main (String [] args){
      ArrayList<String> auszubildner = new ArrayList<String>();
      System.out.println("# Liste ausgeben");
      auszubildner.add("Peter");
      auszubildner.add("Maximilian");
      auszubildner.add("Hans");
      System.out.println(auszubildner);

      System.out.println("");
      System.out.println("# Psition2");
      auszubildner.add( 2,"Metthew");
      System.out.println(auszubildner);


       System.out.println("");
      System.out.println("# Hans Entfernen");
      auszubildner.remove("Hans");
      System.out.println(auszubildner);

      System.out.println("");
      System.out.println("# Remove all ");
      auszubildner.clear();
      System.out.println(auszubildner);

      System.out.println("");
      System.out.println("# Erneut ausgeben");
      auszubildner.add("Peter ,Hans ,Maximilian");
      System.out.println(auszubildner);
}
}
