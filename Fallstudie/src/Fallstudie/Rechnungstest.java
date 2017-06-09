
package Fallstudie;
 
public class Rechnungstest extends junit.framework.TestCase {
    Rechnung r;
    Rechnung rPremium;
    
    public void setUp() {
        Kunde k = new Kunde("Anna Meier", "normalstrasse1");
        Premiumkunde pk = new Premiumkunde ("Ina Kunze","Premiumstrasse 3",true);
        r = new Rechnung(k);
        rPremium = new Rechnung(pk);
        
    }
    public void testeRabattBeiNeuerRechnung() {
          assertEquals("Rabatt bei 0 € und normaler Kundin fehlerhaft." 0, r.bestimmeRabatt()); 
    }
    
    //Teste Premiumkunde, Rabatt ist immer 5% , ab 200 10%
    public void testeRabattBeiNeuerRechnungPremium() {
          assertEquals("Rabatt bei 0 € und Premium Kundin fehlerhaft." 5, r.bestimmeRabatt()); 
    }
  
    // Aufgabe 30.5-1 , 
    //erwartet 0
    public void testeRabattBeiNiedrigemBetrag() {
r.legeBetragFest(1.5);
assertEquals("Rabatt bei 1.5 Euro und normaler Kundin 
+ "fehlerhaft.", 0, r.bestimmeRabatt());
}  
    //erwartet 5 %
    public void testeRabattBeiNiedrigemBetragPremium() {
rPremium.legeBetragFest(1.5);
assertEquals("Rabatt bei 1.5 Euro und Premiumkundin "
+ "fehlerhaft.", 5, rPremium.bestimmeRabatt());
}
   
//Testfäll emit diverse Genzwerten , fuer normale Kunde bs 100€ und ueber 100€
    public void testeRabattBeiBetragsgrenze100() {
r.legeBetragFest(99.0);
assertEquals("Rabatt bei 99 Euro und normaler Kundin "
+ "fehlerhaft.", 0, r.bestimmeRabatt());
r.legeBetragFest(99.5);
assertEquals("Rabatt bei 99.5 Euro und normaler Kundin "
+ "fehlerhaft.", 0, r.bestimmeRabatt());
r.legeBetragFest(99.9);
assertEquals("Rabatt bei 99.9 Euro und normaler Kundin "
+ "fehlerhaft.", 0, r.bestimmeRabatt());
r.legeBetragFest(100);
assertEquals("Rabatt bei 100 Euro und normaler Kundin "
+ "fehlerhaft.", 5, r.bestimmeRabatt());
r.legeBetragFest(100.5);
assertEquals("Rabatt bei 100.5 Euro und normaler Kundin "
+ "fehlerhaft.", 5, r.bestimmeRabatt());
r.legeBetragFest(101);
assertEquals("Rabatt bei 101 Euro und normaler Kundin "
+ "fehlerhaft.", 5, r.bestimmeRabatt());
}
   
    //Testfäll emit diverse Genzwerten , fuer Premium  Kunde bis um 100€ rum
    public void testeRabattBeiBetragsgrenze100Premium() {
rPremium.legeBetragFest(99.0);
assertEquals("Rabatt bei 99 Euro und Premiumkundin "
+ "fehlerhaft.", 5, rPremium.bestimmeRabatt());
rPremium.legeBetragFest(99.5);
assertEquals("Rabatt bei 99.5 Euro und Premiumkundin "
+ "fehlerhaft.", 5, rPremium.bestimmeRabatt());
rPremium.legeBetragFest(99.9);
assertEquals("Rabatt bei 99.9 Euro und Premiumkundin "
+ "fehlerhaft.", 5, rPremium.bestimmeRabatt());
rPremium.legeBetragFest(100);
assertEquals("Rabatt bei 100 Euro und Premiumkundin "
+ "fehlerhaft.", 5, rPremium.bestimmeRabatt());
rPremium.legeBetragFest(100.5);
 
assertEquals("Rabatt bei 100.5 Euro und Premiumkundin "
+ "fehlerhaft.", 5, rPremium.bestimmeRabatt());
rPremium.legeBetragFest(101);
assertEquals("Rabatt bei 101 Euro und Premiumkundin "
+ "fehlerhaft.", 5, rPremium.bestimmeRabatt());
}
   
    //Immer 5 % für Normalkunde
    public void testeRabattBeiBetragsgrenze200() {
r.legeBetragFest(199.0);
assertEquals("Rabatt bei 199 Euro und normaler Kundin "
+ "fehlerhaft.", 5, r.bestimmeRabatt());
r.legeBetragFest(199.5);
assertEquals("Rabatt bei 199.5 Euro und normaler Kundin "
+ "fehlerhaft.", 5, r.bestimmeRabatt());
r.legeBetragFest(199.9);
assertEquals("Rabatt bei 199.9 Euro und normaler Kundin "
+ "fehlerhaft.", 5, r.bestimmeRabatt());
r.legeBetragFest(200);
assertEquals("Rabatt bei 200 Euro und normaler Kundin "
+ "fehlerhaft.", 5, r.bestimmeRabatt());
r.legeBetragFest(200.5);
assertEquals("Rabatt bei 200.5 Euro und normaler Kundin "
+ "fehlerhaft.", 5, r.bestimmeRabatt());
r.legeBetragFest(201);
assertEquals("Rabatt bei 201 Euro und normaler Kundin "
+ "fehlerhaft.", 5, r.bestimmeRabatt());
}
  
    //Premiumkunde über 200
    public void testeRabattBeiBetragsgrenze200Premium() {
rPremium.legeBetragFest(199.0);
assertEquals("Rabatt bei 199 Euro und Premiumkundin "
+ "fehlerhaft.", 5, rPremium.bestimmeRabatt());
rPremium.legeBetragFest(199.5);
assertEquals("Rabatt bei 199.5 Euro und Premiumkundin "
+ "fehlerhaft.", 5, rPremium.bestimmeRabatt());
rPremium.legeBetragFest(199.9);
assertEquals("Rabatt bei 199.9 Euro und Premiumkundin "
+ "fehlerhaft.", 5, rPremium.bestimmeRabatt());
rPremium.legeBetragFest(200);
assertEquals("Rabatt bei 200 Euro und Premiumkundin "
+ "fehlerhaft.", 10, rPremium.bestimmeRabatt());
rPremium.legeBetragFest(200.5);
assertEquals("Rabatt bei 200.5 Euro und Premiumkundin "
+ "fehlerhaft.", 10, rPremium.bestimmeRabatt());
rPremium.legeBetragFest(201);
assertEquals("Rabatt bei 201 Euro und Premiumkundin "
+ "fehlerhaft.", 10, rPremium.bestimmeRabatt());
}
    
}
