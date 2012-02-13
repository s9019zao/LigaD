package pliki;

import java.util.ArrayList;
import java.util.List;

public class Liga {
	
	private String nazwa;
	private List <Zespol> zespoly = new ArrayList<Zespol>();
	private List <Mecz> mecze = new ArrayList<Mecz>();
	
	
	public Liga(String nazwa, List<Zespol> zespoly, List<Mecz> mecze) {
		this.nazwa = nazwa;
		this.zespoly = zespoly;
		this.mecze = mecze;
	}

	public String getNazwa() {
		return nazwa;
	}

	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}

	public List<Zespol> getZespoly() {
		return zespoly;
	}

	public void setZespoly(List<Zespol> zespoly) {
		this.zespoly = zespoly;
	}
	
	public List<Mecz> getMecze() {
		return mecze;
	}

	public void setMecze(List<Mecz> mecze) {
		this.mecze = mecze;
	}
	
	public void DodajZesopl(Zespol zespol){
		zespoly.add(zespol);
	}
	
	public void DodajMecz(Mecz mecz){
		mecze.add(mecz);
	}

	public void ObliczPunkty(List<Zespol> zespoly, List<Mecz> mecze){
		
		for(Zespol zespol : zespoly){
			for(Mecz mecz : mecze){
				if((zespol.getNazwa().equals(mecz.getGospodarz()))&&(mecz.getLiczba_b_gospodarzy()>mecz.getLiczba_b_gosci())){
					System.out.println(zespol.getNazwa());
				}
			
			}
		}
	}

}
