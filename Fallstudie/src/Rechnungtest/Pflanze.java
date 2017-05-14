/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rechnungtest;

 
class Pflanze extends Artikel { 
    double lagertemperatur;
    double liefereLagertemperatur() {
        return this.lagertemperatur; 
}

void legeLagertemperaturFest(final double temp) {
this.lagertemperatur = temp; 
}

void gebeInformationenAus() {
super.gebeInformationenAus();
System.out.print("Lagertemperatur: "); 
System.out.println(this.liefereLagertemperatur());

}

}