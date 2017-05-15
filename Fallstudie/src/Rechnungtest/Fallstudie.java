package Rechnungtest;
class Fallstudie {
public static void main (String[] args) {

 Rechnung meineRechnung = new Rechnung();
 meineRechnung.fuegePostenHinzu(4, 1.20);
 meineRechnung.fuegePostenHinzu(13, 2.10);
 meineRechnung.fuegePostenHinzu(1, 7.80);
 meineRechnung.legeRabattFest(0.3); 
 meineRechnung.gebeAus();

 
    }
    
}
