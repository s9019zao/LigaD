package pliki;

import java.util.Date;
import java.util.GregorianCalendar;

public class Osoba {
	
	private String imie;
	private String nazwisko;
	private Date data_urodzenia;
	private int wiek;
	
	GregorianCalendar dzis= new GregorianCalendar();
	
	public Osoba(String imie, String nazwisko, Date data_urodzenia) {
		
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.data_urodzenia = data_urodzenia;
		this.wiek = Wiek();
	}
	
	public String getImie() {
		return imie;
	}

	public void setImie(String imie) {
		this.imie = imie;
	}

	public String getNazwisko() {
		return nazwisko;
	}

	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}

	public Date getData_urodzenia() {
		return data_urodzenia;
	}

	public void setData_urodzenia(Date data_urodzenia) {
		this.data_urodzenia = data_urodzenia;
	}

	public int getWiek() {
		return wiek;
	}

	public void setWiek(int wiek) {
		this.wiek = wiek;
	}

	public int Wiek(){
		
		long diff = dzis.getTimeInMillis()- getData_urodzenia().getTime();
		int dni = (int) (diff/(1000*60*60*24));
		int wiek = dni/365;
		return wiek;
	}


}
