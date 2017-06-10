 
package Fallstudie;
 
//erbt von Kunde
//hat immer 5 % Rabatt und 10% ab 200 Bestellung
public class Premiumkunde extends Kunde {
    int rabatt1 = 5;
    int rabatt2 = 10;
    boolean status = false;
    
    
    
    Premiumkunde(String neuerName, String neueAnschrift, boolean premiumStatus) {
		super(neuerName, neueAnschrift);
		this.status = true;
		this.rabatt1 = rabatt1;
		this.rabatt2 = rabatt2;
}
    
}