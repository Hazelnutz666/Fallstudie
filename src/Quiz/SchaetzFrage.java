 
package Quiz;

 
public class SchaetzFrage extends AbstrakteZahlenfrage  {
    
    private int richtigeAntwort;
    private int prozentualeAbweichung;
    
public  SchaetzFrage (String frage, int punkte, int richtigeAntwort, int prozentualeAbweichung){
        super(frage, punkte);
        this.richtigeAntwort = richtigeAntwort;
        this.prozentualeAbweichung = prozentualeAbweichung;
    }
    
    public boolean istRichtigBeantwortet() { 
        boolean antwortStatus = false; 
 	int abweichung = this.richtigeAntwort - richtigeAntwort; 
 		int erlaubteAbweichung = this.richtigeAntwort / 100 * this.prozentualeAbweichung; 
        if (abweichung <= erlaubteAbweichung) { 
        antwortStatus = true; 
   } 
 return antwortStatus; 
 } 

    
}
