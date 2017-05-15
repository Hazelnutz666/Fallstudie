
package Rechnungtest;


  class Artikel {
    
    //Attribute
    long artikelnr;
    String beschreibung;
    double preis;
    double mehrwertsteuer;
    
    
    //Konstruktoren
            Artikel(final long artikelnr, final String beschreibung, final double preis, double mehrwertsteuer) { 
                this.legeArtikelnummerFest(artikelnr); 
                this.legeBeschreibungFest(beschreibung);
                this.legePreisFest(preis);
                this.legeMehrwertsteuerFest(mehrwertsteuer);
            }

            

    //Methoden
    void legeArtikelnummerFest(final long neueNr) {
        this.artikelnr = neueNr;
    }
    
     void legeBeschreibungFest ( final String neueB)  {
        this.beschreibung= neueB;
    }
     
     void legePreisFest (final double neuerPreis ) {
        this.preis = neuerPreis;
    }
     
     void legeMehrwertsteuerFest(double neueMehrwertsteuer) { 
         this.mehrwertsteuer = neueMehrwertsteuer; 
     }

            
      long liefereArtikelnummer()  {
        return this.artikelnr;
    }
      String liefereBeschreibung()  {
        return this.beschreibung;
    }
        double lieferePreis()  {
        return this.preis;
    }


      
}
