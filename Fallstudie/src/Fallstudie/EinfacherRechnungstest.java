 
package Fallstudie;

  

//Rechnungstest für TEST...braucht noch Methode bestimmeRabatt
 class EinfacherRechnungstest {
public static void main(String[] args) {
    
Kunde k = new Kunde("Anna Meier","normalstrasse1");
Rechnung r = new Rechnung(k);
r.legeBetragFest(120);
int rabatt = r.bestimmeRabatt();
if (rabatt != 5) {
System.out.println("Der Rabatt bei einer Rechnung "
+ "von 120 Euro wird falsch berechnet!");
System.out.println("Der Rabatt sollte 5 Prozent "
+ "betragen, betraegt aber: " + rabatt);
}
k = new Premiumkunde("Hans Mayer", "Premiumstrasse1", true);
r = new Rechnung(k);
r.legeBetragFest(20);
rabatt = r.bestimmeRabatt();
if (rabatt != 5) {
System.out.println("Der Rabatt bei einer Rechnung " + "von 20 Euro für einen Premiumkunden wird " + "falsch berechnet!");
System.out.println("Der Rabatt sollte 5 Prozent " + "betragen, betraegt aber: " + rabatt);
}
k = new Premiumkunde("Ina Kunz", "Premiumstrasse2", true);
r = new Rechnung(k);
r.legeBetragFest(230);
rabatt = r.bestimmeRabatt();
if (rabatt != 10) {
System.out.println("Der Rabatt bei einer Rechnung " + "von 230 Euro für einen Premiumkunden wird " + "falsch berechnet!"); 
System.out.println("Der Rabatt sollte 10 Prozent " + "betragen, betraegt aber: " + rabatt); 
}

// Neues Rechnungsobjekt  erzeugen
r = new Rechnung(null);
try {
r.legeBetragFest(10);
rabatt = r.bestimmeRabatt();
System.out.println("Die Rabattbestimmung bei einer " + "Rechnung ohne Kunden ist unerwarteter " + "Weise erfolgreich verlaufen");
} catch (Exception e) {
// Wir erwarten eine Ausnahme
}
k = new Premiumkunde("Fritz Hinz","Premiumstrasse4",true);
r = new Rechnung(k);
try {
r.legeBetragFest(-10);
rabatt = r.bestimmeRabatt();
System.out.println("Die Rabattbestimmung bei einem " + "negativen ist unerwarteter Weise " 
+ "erfolgreich verlaufen");
} catch (Exception e) {
// Wir erwarten eine Ausnahme
} 

}
       }