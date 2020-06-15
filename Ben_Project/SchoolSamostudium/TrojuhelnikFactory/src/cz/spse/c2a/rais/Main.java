package cz.spse.c2a.rais;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try {
		Scanner s1 = new Scanner(System.in);
		System.out.println("zadej delku strany a");
		double a = s1.nextInt();
		System.out.println("zadej d0lku strany b");
		double b = s1.nextInt();
		
		System.out.println(TrojuhelnikFactory.getTrojuhelnik("rovnostranny",a,b));
		System.out.println(TrojuhelnikFactory.getTrojuhelnik("rovnoramenny",a,b));
		}catch(Exception e) {
			System.err.println("Mel jsi zadat kladne cislo...");
		}
		

	}

}
