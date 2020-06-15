package cz.spse.C2a.rais;

public class Polozka {
	String jmeno;
	double cena;
	int pocet;

	public String getJmeno() {
		return jmeno;
	}

	public Polozka(String jmeno, double cena, int pocet) {
		super();
		this.jmeno = jmeno;
		this.cena = cena;
		this.pocet = pocet;
	}

	public void setJmeno(String jmeno) {
		this.jmeno = jmeno;
	}

	public double getCena() {
		return cena;
	}

	public void setCena(double cena) {
		this.cena = cena;
	}

	public int getPocet() {
		return pocet;
	}

	public void setPocet(int pocet) {
		this.pocet = pocet;
	}

	public String toString() {
		return "Polozka [jmeno=" + jmeno + ", cena=" + cena + ", pocet=" + pocet + "]";
	}
}
