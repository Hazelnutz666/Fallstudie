
package Rechnungtest;


  class Rechnungsposten {
    
    //Atrribute
    int anzahl;
    Artikel artikel;
    
    
    //Konstruktoren
    
    Rechnungsposten(final int anzahl, final Artikel artikel) { 
        this.legeAnzahlFest(anzahl); 
        this.legeArtikelFest(artikel);
    }

            
    //methoden
    
    void legeAnzahlFest (final int neueAnzahl){
    this.anzahl = neueAnzahl;
    }
    
    void legeArtikelFest (final artikel neuerArtikel){
          this.artikel = neuerArtikel;
  
    }
    
    
    int liefereAnzahl(){
     return this.anzahl;
    }
    
      Artikel liefereArtikel() {
        return  this.artikel;
    }
    
    double  berechneGesamtbetrag ()     {
      return this.liefereAnzahl()
              * this.liefereArtikel().lieferePreis();
    }
       
  
    
}
    

