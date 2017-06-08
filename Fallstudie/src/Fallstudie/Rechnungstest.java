
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
    
}
