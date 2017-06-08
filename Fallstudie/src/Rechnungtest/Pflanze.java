 
package Rechnungtest;

 
class Pflanze extends Artikel { 
    double lagertemperatur;
    double liefereLagertemperatur() {
        return this.lagertemperatur; 
}

    //Konstruktur mit Aufruf super für die Unterklasse. Ansonsten Fehler
    Pflanze(final double preis, final int artikelnr, final double lagertemp) {
super(preis, artikelnr);
this.legeLagertemperaturFest(lagertemp);
}
Pflanze(final double preis, final int artikelnr, final String name, final double lagertemp) {
super(preis, artikelnr, name);
this.legeLagertemperaturFest(lagertemp);
}
 
// erweiterte und geerbte Methoden für die Unterklasse
void legeLagertemperaturFest(final double temp) {
this.lagertemperatur = temp; 
}

void gebeInformationenAus() {
super.gebeInformationenAus();
System.out.print("Lagertemperatur: "); 
System.out.println(this.liefereLagertemperatur());

}

}