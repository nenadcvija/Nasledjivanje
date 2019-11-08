package apstraktna.klasa;

import java.io.Serializable;

import interfejs.Iconstruct;

public class Kablovi extends DodatnaOprema implements Iconstruct,Serializable{
	
	public String modelKabla;
	
	@Override
	public void katalog() {
		System.out.println("Katalog kablova...............");
	}

	@Override
	public void testiraj() {
		System.out.println("Testiram kablove...");
		
	}

	@Override
	public void install() {
		System.out.println("Polozi kablove...");
	}

	@Override
	public void unistall() {
		System.out.println("Iscupaj kablove....");	
	}
	
	
	
	
	
	

}
