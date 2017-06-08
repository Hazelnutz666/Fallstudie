 
package Quiz;
import java.util.ArrayList;
 
//erzeugt ein neues Quiz, mit maximal fragenAnzahl Fragen
  class Quiz {
    private int FragenAnzahl;
    private ArrayList<Zahlenfrage> quizFragen;
    
    public Quiz(int FragenAnzahl) { 
 		this.FragenAnzahl = FragenAnzahl; 
 		this.quizFragen = new ArrayList<Zahlenfrage>(); 
        }
    
    // wenn schon die maximal mögliche Anzahl an Fragen im Quiz gespeichert wurde, wird false zurückgeliefert, 
    // ansonsten wird die Frage hinten ans Quiz angefügt und die Methode liefert true zurück; 
    // wird null übergeben, passiert nichts und es wird false zurückgeliefert
    public boolean fuegeFrageHinzu(Zahlenfrage zahlenfrage) { 
	boolean frageStatus = false; 
 	if (this.quizFragen.size() < this.FragenAnzahl && zahlenfrage != null) { 
 		this.quizFragen.add(zahlenfrage); 
 	frageStatus = true; 
} 
   		return frageStatus; 
 
 	} 


    // liefert die Summe aller erreichten Punkte
    public int berechneErreichtePunkte() { 
 		int erreichtePunkte = 0; 
 		for (Zahlenfrage zf : this.quizFragen) { 
 			erreichtePunkte = erreichtePunkte + zf.liefereErreichtePunkte(); 
 		} 
		return erreichtePunkte; 

    }
    
    //liefert die Summe der maximal möglichen Punkte
    public int berechneMaximalMoeglichePunkte() { 
 	int maximalePunkte = 0; 
 	for (Zahlenfrage zf : this.quizFragen) { 
		maximalePunkte += zf.liefereErreichtePunkte(); 
	} 
          return maximalePunkte; 
 	} 

//liefert die Anzahl der im Quiz gespeicherten Fragen
    public int liefereFragenAnzahl() { 
 		return this.FragenAnzahl; 
 	} 
    
    public Zahlenfrage liefereFrage(int index) { 
        if (index == 0) {
            return null;
        }
      
   return this.quizFragen.get(index) ;
           } 
    
} 


 

