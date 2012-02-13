package pliki;


import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;


public class Main {


	public static void main(String[] args) {
		
		List <Zespol> zespoly = new ArrayList<Zespol>();
		List <Mecz> mecze = new ArrayList<Mecz>();
		Liga L = new Liga("Pierwsza", zespoly, mecze);
		
		Mecz m1 = new Mecz("Diably", "Krety", 2, 1);
		Mecz m2 = new Mecz("Krety", "Malpy", 2, 1);
		
		List <Zawodnik> diably = new ArrayList<Zawodnik>();
		Zespol z1 = new Zespol ("Diably", "Gdańsk", diably);
		List <Zawodnik> krety = new ArrayList<Zawodnik>();
		Zespol z2 = new Zespol ("Krety", "Gdańsk", krety);
		List <Zawodnik> malpy = new ArrayList<Zawodnik>();
		Zespol z3 = new Zespol ("Malpy", "Gdańsk", malpy);
		z1.DodajZawodnika(new Zawodnik("Adam", "A", new GregorianCalendar(1977,9,10).getTime()));
		z1.DodajZawodnika(new Zawodnik("Adam", "B", new GregorianCalendar(1976,11,01).getTime()));
		z1.DodajZawodnika(new Zawodnik("Czesław", "C", new GregorianCalendar(1956,10,11).getTime()));
		z1.DodajZawodnika(new Zawodnik("Damian", "D", new GregorianCalendar(1977,10,11).getTime()));
		z2.DodajZawodnika(new Zawodnik("Eryk", "E", new GregorianCalendar(1977,10,11).getTime()));
		z2.DodajZawodnika(new Zawodnik("Franciszek", "F", new GregorianCalendar(1987,9,11).getTime()));
		L.DodajZesopl(z1);
		L.DodajZesopl(z2);
		L.DodajZesopl(z3);
		L.DodajMecz(m1);
		L.DodajMecz(m2);
		L.ObliczPunkty(zespoly, mecze);

		z1.WypiszZawodnikow(z1.ZnajdzZawodnikow(34, diably));
		System.out.println("****************");
		z2.WypiszZawodnikow(z2.ZnajdzZawodnikow(24, krety));
		System.out.println("****************");
		z1.WypiszZawodnikow("Adam");
		System.out.println("****************");
		z2.WypiszZawodnika(z2.ZnajdzZawodnika("Eryk", "E"));
		System.out.println("****************");
		z2.WypiszZawodnikow(krety);
		System.out.println("****************");
		z2.UsunZawodnika("Franciszek", "F");
		z2.WypiszZawodnikow(krety);




	}

}
