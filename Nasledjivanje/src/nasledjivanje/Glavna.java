package nasledjivanje;

public class Glavna {

	public static void main(String[] args) {
		
		SvemirskiObjekat objekat = new SvemirskiObjekat("NGC 1290", 20000000);
			
			objekat.dobrodosli(objekat.ime);
		
		
		Planeta planeta = new Planeta("Zemlja", 678880,true);
		
		
			System.out.println("Da li na planeti ima vode? Odgovor: " + planeta.voda);
			System.out.println("Vi ste na planeti " + planeta.ime);
			planeta.dobrodosli(planeta.ime);
		

		

		
		
		

	}

}
