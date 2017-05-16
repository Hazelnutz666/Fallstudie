package Testshit;


 public class Durchschnitt {   
public static void main (String[] args) {
     
    
 public double berechneDurchschnitt(int[] feld) {
    
     
      // Mittelwert bestimmen
      double i, sum, avg;
      sum = 0;
              
      // Summe bilden
      for( i=0 ; i<feld.length ; i++){
          sum += feld[i] ;
      }

      //Durchschnittwert berechnen und ausgeben
      avg = sum / feld.length ;
      System.out.println("Summe ist:" +avg);
      
      if (avg == 0 ) {
          return avg = 0;
      }
      else 
      
      return avg ;
      
       
      
 }
 }
}
