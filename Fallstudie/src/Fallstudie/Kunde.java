
package Fallstudie;

class Kunde {
	// Attribute
	String name;
	String anschrift;
	
	
	
        //Konstruktoren
   Kunde(final String name, final String anschrift) {
       this.legeNameFest(name);
       this.legeAnschriftFest(anschrift);
   }

        
	// Methoden
	void legeNameFest(final String neuerName) {
		this.name = neuerName;
	}
	void legeAnschriftFest(final String neueAnschrift) {
		this.anschrift = neueAnschrift;
	}
	String liefereName() {
		return name;
	}
	String liefereAnschrift() {
		return anschrift;
	}
}