package emailProject;

public class Email {

	// polja

	String ime = "";
	String prezime = "";
	String posao = "";
	String com = "";
	String email;
	String sifra;

	// constr

	public Email() {
	}

	public Email(String email, String sifra) {
		this.email = email;
		this.sifra = sifra;

		if (provjeriIme() == true) {
			if (provjeriPrezime() == true) {
				if (postojiLiLudoA() == true) {
					if (provjeriPosao() == true) {
						if (postojiLiCom() == true) {
							System.out.println("Vas zahtjev za pristup  je odobren");
						} else
							System.out.println("Ne postoji com");
					} else
						System.out.println("Niste unjeli posao ili niste stavili tacku ili posao pocinje sa tackom");
				} else
					System.out.println("Ne postoji @");
			} else
				System.out.println("Niste unjeli prezime,niste unjeli @");

		} else
			System.out.println("Niste unjeli ime ili niste stavili tacku");

	}

	// metode

	public boolean provjeriIme() {

		for (int i = 0; i < email.length(); i++) {
			this.ime += this.email.charAt(i);
			if (this.email.charAt(i) == '.' && !(this.ime.startsWith("."))) {
				return true;
			} else
				continue;
		}

		return false;
	}

	public boolean provjeriPrezime() {

		for (int i = this.ime.length(); i < email.length(); i++) {
			this.prezime += this.email.charAt(i);
			if (this.email.charAt(i) == '@' && !(this.prezime.startsWith("@"))) {
				return true;
			} else
				continue;
		}

		return false;
	}

	public boolean postojiLiLudoA() {

		
		if (email.charAt((this.ime.length() + this.prezime.length() - 1)) == '@') {
			return true;
		}
		else
			return false;
		
	}
	

	public boolean provjeriPosao() {

		for (int i = (this.ime.length() + this.prezime.length()); i < email.length(); i++) {
			this.posao += this.email.charAt(i);
			if (this.email.charAt(i) == '.' && !(this.posao.startsWith("."))) {
				return true;
			} else
				continue;
		}

		return false;
	}

	public boolean postojiLiCom() {

		for (int i = (this.ime.length() + this.prezime.length() + this.posao.length()); i < email.length(); i++) {
			this.com += this.email.charAt(i);
		}

		if (this.com.equals("com")) {
			return true;
		} else {
			return false;
		}

	}

	// getters and setters

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public String getPosao() {
		return posao;
	}

	public void setPosao(String posao) {
		this.posao = posao;
	}

	public String getSifra() {
		return sifra;
	}

	public void setSifra(String sifra) {
		this.sifra = sifra;
	}

	
	//toString
	
	@Override
	public String toString() {
		return "Email [email=" + email + ", sifra=" + sifra + "]";
	}


	

	

}
