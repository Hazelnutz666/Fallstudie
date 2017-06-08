
package Rechnungtest;


  class Artikel {
    
    //Attribute
    long artikelnr;
    String beschreibung;
    double preis;
    double mehrwertsteuer;
    String name;
    
    
    //Konstruktoren
            Artikel(final long artikelnr, final String beschreibung, final double preis, double mehrwertsteuer) { 
                this.legeArtikelnummerFest(artikelnr); 
                this.legeBeschreibungFest(beschreibung);
                this.legePreisFest(preis);
                this.legeMehrwertsteuerFest(mehrwertsteuer);
            }

       Artikel(final double preis, final int artikelnr) {
this.legePreisFest(preis);
this.legeArtikelnummerFest(artikelnr);
}
       
Artikel(final double preis, final int artikelnr, final String name) {
this(preis, artikelnr);
this.legeNameFest(name);
}     

    //Methoden
    void legeArtikelnummerFest(final long neueNr) {
        this.artikelnr = neueNr;
    }
    
    String liefereName() {
        return this.name;
    }
    
    void legeNameFest(final String neuerName) { 
        this.name = neuerName;
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

void gebeInformationenAus() {
    System.out.print("Artikel ");
     System.out.println(this.liefereName()); 
    System.out.print("Nr: "); 
    System.out.println(this.liefereArtikelnummer()); 
    System.out.print("Preis: "); 
    System.out.println(this.lieferePreis()); 
      
}
}