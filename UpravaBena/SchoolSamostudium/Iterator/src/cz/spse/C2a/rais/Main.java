package cz.spse.C2a.rais;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Main{

	public static void main(String[] args) {
	try {
		MyArrayList<Polozka> kosik= new MyArrayList<Polozka>();
		Polozka p1 = new Polozka("chleba",20.90,2);
		Polozka p2 = new Polozka("rohlik",2.90,10);
		Polozka p3 = new Polozka("houska",5.90,203);
		kosik.add(p1);
		kosik.add(p2);
		kosik.add(p3);
		//System.out.println(kosik.Write());
	for(Polozka polozka : kosik) {
		System.out.println(polozka);
	}
	for(Polozka polozka : kosik) {
		System.out.println(polozka.getJmeno());
	}
	for(Polozka polozka : kosik) {
		System.out.println(polozka.getCena());
	}
	for(Polozka polozka : kosik) {
		System.out.println(polozka.getPocet());
	}
	}catch(NullPointerException e) {
		System.err.println("nenalezena dalsi hodnota");
	}catch(Exception e) {
	System.err.println("celkova chzba");
	}
	
		
		
	}
}
