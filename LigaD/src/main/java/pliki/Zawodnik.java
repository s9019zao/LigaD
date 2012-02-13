package pliki;

import java.util.Date;

public class Zawodnik extends Osoba{
	
	private int Liczba_s_b;
	private int Liczba_k_m;

	public Zawodnik(String imie, String nazwisko, Date data_urodzenia) {
		super(imie, nazwisko, data_urodzenia);
	}

	public int getLiczba_s_b() {
		return Liczba_s_b;
	}

	public void setLiczba_s_b(int liczba_s_b) {
		Liczba_s_b = liczba_s_b;
	}

	public int getLiczba_k_m() {
		return Liczba_k_m;
	}

	public void setLiczba_k_m(int liczba_k_m) {
		Liczba_k_m = liczba_k_m;
	}
	
	
}
