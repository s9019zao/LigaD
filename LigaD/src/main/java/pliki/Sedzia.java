package pliki;

import java.util.Date;

public class Sedzia extends Osoba{
	
	private String dzielnica;
	
	public Sedzia(String imie, String nazwisko, Date data_urodzenia) {
		super(imie, nazwisko, data_urodzenia);
	}

	public String getDzielnica() {
		return dzielnica;
	}

	public void setDzielnica(String dzielnica) {
		this.dzielnica = dzielnica;
	}

}
