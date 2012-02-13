package pliki;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Zespol {
	
	private String nazwa;
	private String dzielnica;
	private int liczba_z;
	private int liczba_r;
	private int liczba_p;
	private int liczba_b_strz;
	private int liczba_b_stra;
	private int punkty;
	private List <Zawodnik> zawodnicy = new ArrayList<Zawodnik>();
	
	public Zespol(String nazwa, String dzielnica, List<Zawodnik> zawodnicy) {
		this.nazwa = nazwa;
		this.dzielnica = dzielnica;
		this.zawodnicy = zawodnicy;
	}

	public String getNazwa() {
		return nazwa;
	}

	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}

	public String getDzielnica() {
		return dzielnica;
	}

	public void setDzielnica(String dzielnica) {
		this.dzielnica = dzielnica;
	}

	public int getLiczba_z() {
		return liczba_z;
	}

	public void setLiczba_z(int liczba_z) {
		this.liczba_z = liczba_z;
	}

	public int getLiczba_r() {
		return liczba_r;
	}

	public void setLiczba_r(int liczba_r) {
		this.liczba_r = liczba_r;
	}

	public int getLiczba_p() {
		return liczba_p;
	}

	public void setLiczba_p(int liczba_p) {
		this.liczba_p = liczba_p;
	}

	public int getLiczba_b_strz() {
		return liczba_b_strz;
	}

	public void setLiczba_b_strz(int liczba_b_strz) {
		this.liczba_b_strz = liczba_b_strz;
	}

	public int getLiczba_b_stra() {
		return liczba_b_stra;
	}

	public void setLiczba_b_stra(int liczba_b_stra) {
		this.liczba_b_stra = liczba_b_stra;
	}

	public int getPunkty() {
		return punkty;
	}

	public void setPunkty(int punkty) {
		this.punkty = punkty;
	}

	public List<Zawodnik> getZawodnicy() {
		return zawodnicy;
	}

	public void setZawodnicy(List<Zawodnik> zawodnicy) {
		this.zawodnicy = zawodnicy;
	}
	
	public void DodajZawodnika(Zawodnik zawodnik){
		zawodnicy.add(zawodnik);
	}
	
	public void DodajZawodnika(String imie, String nazwisko, Date data_urodzenia){
		zawodnicy.add(new Zawodnik(imie, nazwisko, data_urodzenia));
	}
	
	public void UsunZawodnika(String imie, String nazwisko){
		zawodnicy.remove(ZnajdzZawodnika(imie, nazwisko));
	}
	
	public Zawodnik ZnajdzZawodnikaPoImieniu(String imie){
		for(Zawodnik zawodnik : zawodnicy){
			if(zawodnik.getImie().equals(imie))
			return zawodnik;		
		}
		return null;
	}
	
	public Zawodnik ZnajdzZawodnikaPoWieku(int wiek){
		for(Zawodnik zawodnik : zawodnicy){
			if(zawodnik.getWiek() == wiek)
			return zawodnik;		
		}
		return null;
	}
	
	public Zawodnik ZnajdzZawodnika(String imie, String nazwisko){
		for(Zawodnik zawodnik : zawodnicy){
			if((zawodnik.getImie().equals(imie))&&(zawodnik.getNazwisko().equals(nazwisko)))
			return zawodnik;		
		}
		return null;
	}
		
	public void WypiszZawodnikow(List<Zawodnik> zawodnicy){
		for(Zawodnik zawodnik : zawodnicy){
			System.out.println("Imie:" + zawodnik.getImie()+ " Nazwisko:" +zawodnik.getNazwisko()+ " Data urodzenia:" +zawodnik.getData_urodzenia()+ " Wiek:" +zawodnik.getWiek());
		}
	}
	
	public void WypiszZawodnika(Zawodnik zawodnik){
		System.out.println("Imie:" + zawodnik.getImie()+ " Nazwisko:" +zawodnik.getNazwisko()+ " Data urodzenia:" +zawodnik.getData_urodzenia().getDate()+"."+(zawodnik.getData_urodzenia().getMonth()+1)+"."+ zawodnik.getData_urodzenia().getYear()+" Wiek:" +zawodnik.getWiek());
	}
	
	public void WypiszZawodnikow(String imie){
		for(Zawodnik zawodnik : zawodnicy){
			if(zawodnik.getImie() == imie)
			WypiszZawodnika(zawodnik);
		}
	}
	
	public List<Zawodnik> ZnajdzZawodnikow(int wiek, List<Zawodnik> zawodnicy){
		List<Zawodnik> nowi = new ArrayList<Zawodnik>();
		for(Zawodnik zawodnik : zawodnicy){
			if(zawodnik.getWiek() == wiek){
			nowi.add(zawodnik);
			}
		}
		return nowi;
	}
	
	public void punkty (Mecz mecz){
		
	}

}
