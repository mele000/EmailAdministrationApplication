package emailProject;

import java.util.Scanner;

public class EmailApp {

	public static void main(String[] args) {

		Scanner unos = new Scanner(System.in);

		System.out.println("Unesite email," + "\nemail mora biti tipa ime.prezime@posao.com");
		String email = unos.next();
		System.out.println("Unesite sifru");
		String sifra = unos.next();

		Email korisnik = new Email(email, sifra);
		
		System.out.println(korisnik.toString());
	
		
		
	}

}
