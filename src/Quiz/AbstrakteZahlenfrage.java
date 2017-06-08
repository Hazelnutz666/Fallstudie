 
package Quiz;
 
   abstract class AbstrakteZahlenfrage implements Zahlenfrage {
     
        String frage; 
 	int punkte; 
  	private boolean istBeantwortet; 
  	protected int antwort; 
 
 
 	//erzeugt eine neue Frage, mit der in frage übergebene Fragestellung und den in punkte übergebenen maximal möglichen Punkten
        public AbstrakteZahlenfrage(String frage, int punkte) { 
 		this.frage = frage; 
 		this.punkte = punkte; 
 	} 
 
        //entsprechend der Schnittstellenbeschreibung
        @Override
        public boolean istBeantwortet() { 
  		return istBeantwortet; 
  	} 

        // entsprechend der Schnittstellenbeschreibung
        @Override
        public void legeAntwortFest(int antwort) { 
  	this.istBeantwortet = true;
        this.antwort = antwort;
             } 
    
        // liefert die maximal mögliche Anzahl an Punkte, wenn die Frage beantwortet wurde und wenn die Antwort richtig war, ansonsten
        @Override
    public int liefereErreichtePunkte() {
        int punkte = 0; 
            if (istRichtigBeantwortet()) { 
            punkte = this.punkte; 
 	} 
      return punkte; 
          }   
        
    
      @Override
        public String liefereFrage() { 
  		return this.frage; 
  	} 
      
    @Override
        public int liefereMoeglichePunkte() { 
  		return this.punkte; 
  	} 
   
}
 