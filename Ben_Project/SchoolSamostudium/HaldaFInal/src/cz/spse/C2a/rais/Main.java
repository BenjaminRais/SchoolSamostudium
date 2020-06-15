package cz.spse.C2a.rais;


import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import cz.spse.C2a.rais.Halda2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList <Integer> h = new ArrayList<Integer>();
		Halda2 halda = new Halda2(h);//zalozeni haldy
		Random RNG = new Random();
		
	
		for(int i = 0; i<100;i++) {
			int vloz = RNG.nextInt(500);
			halda.Insert(vloz, h);
		}
		

		for(int i = 0; i<100;i++) {
			System.out.println(halda.extractMin(h));
		}
	
	}

}
