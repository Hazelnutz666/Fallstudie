package Rechnungtest;
class Rechnung {

    //Klassenattribute
    static int naechsteRechnungsnummer = 10000;
    static final double STANDARD_MEHRWERTSTEUERSATZ = 0.19;
    final static int MAX_POSTEN = 100;
    final int rechnungsnummer;  
    
    //Exemplarattribute(variablen)
	double betrag;
	double rabatt;
	double mehrwertsteuer;
        Kunde rechnungsempfaenger;
                //Rechnungsposten nicht mehr als 100
        Rechnungsposten[] posten = new Rechnungsposten[Rechnung.MAX_POSTEN];
        int postenAnzahl = 0;
    
      
        
    //Konstruktoren
    Rechnung() {
                    this(Rechnung.STANDARD_MEHRWERTSTEUERSATZ);
                }
                
    Rechnung(double mwst) { 
        this.mehrwertsteuer = mwst; 
        this.rechnungsnummer = Rechnung.berechneNaechsteRechnungsnummer(); 
    }

    
    Rechnung(Kunde empfaenger) { 
        this.rechnungsempfaenger = empfaenger; 
        this.rechnungsnummer = Rechnung.berechneNaechsteRechnungsnummer(); 
    }

        //Klassenmethoden
       static int berechneNaechsteRechnungsnummer() {
           return Rechnung.naechsteRechnungsnummer++; 
       }

            
        
  //Methoden
       void legebetragFest (final double neuerBetrag){
           this.betrag = neuerBetrag;
       }
       
       double lieferebetrag ( ){
           return this.betrag ;
       }
       
 double liefereMehrwertsteuer() { 
     return this.mehrwertsteuer;
 }

     Kunde liefereRechnungsempfaenger() { 
         return this.rechnungsempfaenger; 
     }
     
void aendereRechnungsempfaenger(Kunde neuerEmpfaenger) {
    this.rechnungsempfaenger = neuerEmpfaenger;
}

        
 void legeMehrwertsteuerFest(final double neueMwSt   ) {
		this.mehrwertsteuer = neueMwSt;
	}
        
   
void fuegePostenHinzu(final Rechnungsposten posten) {
if (postenAnzahl >=Rechnung.MAX_POSTEN)	{
    System.out.print("Es wurde schon die maximal");
    System.out.print("zulassige Anzahl an Posten hinzugefügt");
    return;
}	
this.posten[postenAnzahl] = posten    ;
this.postenAnzahl++;
//this.betrag += posten.berechneGesamtbetrag()  ;
	}
	
	void legeRabattFest(final double neuerRabatt) {
            if (neuerRabatt >=0 && neuerRabatt <= 0.5)
            {
            this.rabatt = neuerRabatt;
            }
		}
	
	double liefereRabatt() {
		return this.rabatt;
	}
	
	double berechneNettopreis() {
            double summe = 0; 
            for (int i = 0; i < this.postenAnzahl; i++) { 
                Rechnungsposten rp = this.posten[i]; 
                summe += rp.berechneGesamtbetrag(); }
            return summe * (1 - this.liefereRabatt());
        }

        
            double berechneMehrwertsteuer() {
                double summe = 0;               
                for (int i = 0; i < this.postenAnzahl; i++) {
                Rechnungsposten rp = this.posten[i];
                summe += rp.berechneGesamtbetrag()* rp.liefereArtikel().liefereMehrwertsteuer(); 
                } 
               return summe * (1 - this.liefereRabatt());
            }

        double berechneBruttoPreis() { 
            return this.berechneNettopreis()+ this.berechneMehrwertsteuer; 
        }

  
        
	void gebeAus() {
	  // lokale Variablen
            double netto = betrag * (1 - rabatt); 
            double brutto = netto * (1 + mehrwertsteuer);
System.out.println("An:");
System.out.println(this.liefereRechnungsempfaenger(). liefereName());
System.out.println(this.liefereRechnungsempfaenger(). liefereAnschrift());
System.out.println("Artikel:");
for (int i = 0; i < postenAnzahl; i++) { 
    Rechnungsposten rp = this.posten[i];
    System.out.print(rp.liefereAnzahl()); 
    System.out.print(" x Nr. "); 
    System.out.print(rp.liefereArtikel(). liefereArtikelnummer());
    System.out.print(" "); 
    System.out.println(rp.liefereArtikel(). liefereBeschreibung());
}
System.out.print("Netto: ");
System.out.println(this.berechneNettopreis());
System.out.print("MwSt: "); System.out.println(this.berechneMehrwertsteuer()); 
System.out.print("Brutto: "); System.out.println(this.berechneBruttoPreis());
}

}
	
