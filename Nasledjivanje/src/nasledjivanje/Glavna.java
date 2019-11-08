package nasledjivanje;

import apstraktna.klasa.DodatnaOprema;
import apstraktna.klasa.Kablovi;
import interfejs.Iconstruct;

public class Glavna {

	public static void main(String[] args) {
	
		/*
		 * Kablovi k = new Kablovi();
		 * 
		 * k.dodatak = "kabl"; k.modelKabla = "Ja sam pomocni kabl";
		 * 
		 * k.katalog(); k.testiraj(); k.install(); k.unistall();
		 */
		
		
		Oprema oprema = new Oprema();
			oprema.barCode();
			
		Oprema komp = new KompjuterskaOprema();
			komp.barCode();
		
		Oprema hdd = new HardDisc();
			hdd.barCode();
		
		DodatnaOprema kablovi = new Kablovi();
			kablovi.testiraj();
		
		
		Iconstruct sagradi = new HardDisc();
			sagradi.install();
			
			
		

	}

}
