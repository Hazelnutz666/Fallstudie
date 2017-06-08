
package Quiz;
 
  class EinfacheZahlenfrage extends AbstrakteZahlenfrage{
  
private int richtigeAntwort;

// erzeugt eine neue Frage, mit der in frage übergebene Fragestellung, 
  // den in punkte übergebenen maximal möglichen Punkten und der in richtigeAntwort übergebenen richtigen Antwort
     EinfacheZahlenfrage(String frage, int punkte, int richtigeAntwort){
       super(frage, punkte);
       this.richtigeAntwort = richtigeAntwort;
       
     }
     
     public boolean istRichtigBeantwortet(){
         boolean antwortStatus = false;
         if (this.antwort == richtigeAntwort) {
             antwortStatus = true;
         }
         return antwortStatus;
     }
}
