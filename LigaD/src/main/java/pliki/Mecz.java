package pliki;

import java.sql.Date;

public class Mecz {
	
	private Date data_meczu;
	private String gospodarz;
	private String gosc;
	private int Liczba_b_gospodarzy;
	private int Liczba_b_gosci;
	
	public Mecz(Date data_meczu, String gospodarz, String gosc, int liczba_b_gospodarzy, int liczba_b_gosci) {
		this.data_meczu = data_meczu;
		this.gospodarz = gospodarz;
		this.gosc = gosc;
		Liczba_b_gospodarzy = liczba_b_gospodarzy;
		Liczba_b_gosci = liczba_b_gosci;
	}
	
	public Mecz(String gospodarz, String gosc, int liczba_b_gospodarzy, int liczba_b_gosci) {
		this.gospodarz = gospodarz;
		this.gosc = gosc;
		Liczba_b_gospodarzy = liczba_b_gospodarzy;
		Liczba_b_gosci = liczba_b_gosci;
	}

	public Date getData_meczu() {
		return data_meczu;
	}

	public void setData_meczu(Date data_meczu) {
		this.data_meczu = data_meczu;
	}

	public String getGospodarz() {
		return gospodarz;
	}

	public void setGospodarz(String gospodarz) {
		this.gospodarz = gospodarz;
	}

	public String getGosc() {
		return gosc;
	}

	public void setGosc(String gosc) {
		this.gosc = gosc;
	}

	public int getLiczba_b_gospodarzy() {
		return Liczba_b_gospodarzy;
	}

	public void setLiczba_b_gospodarzy(int liczba_b_gospodarzy) {
		Liczba_b_gospodarzy = liczba_b_gospodarzy;
	}

	public int getLiczba_b_gosci() {
		return Liczba_b_gosci;
	}

	public void setLiczba_b_gosci(int liczba_b_gosci) {
		Liczba_b_gosci = liczba_b_gosci;
	}
	
	

}
