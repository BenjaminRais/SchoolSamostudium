import java.util.Scanner;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		System.out.println("co chces vypocitat?");
		//Nedostate�n� popisek!! Nev�me co bude program po��tat, jestli obvod obsah nebo neco jin�ho.
		//Leda bys musel cel� program p�e��st a dle v�po�tu to zijstit.
		System.out.println("1...trojuhelnik");
		System.out.println("2...ctverec");
		System.out.println("3...obdelnik");
		Scanner s1 = new Scanner(System.in);
		int s = s1.nextInt();

		switch (s) {
		case 1:
			System.out.println("zadej stranu a");
			double aTroj = s1.nextInt();
			System.out.println("zadej stranu b");
			double bTroj = s1.nextInt();
			System.out.println("zadej stranu c");
			double cTroj = s1.nextInt();
			//Vyto�il bych t��du, ve kter� bych vytvo�il pro ka�d� geometrick� �tvar jednu metodu na v�po�et konkr�tn� nezn�m�
			double p = (aTroj + bTroj + cTroj) / 2;
			double O = aTroj + bTroj + cTroj;
			double S = Math.sqrt(p * (p - aTroj) * (p - bTroj) * (p - cTroj));
			System.out.println("Obvod trojuhelniku je " + O);
			System.out.println("Obsah trojuhelniku je " + S);

			break;
		case 2:
			System.out.println("zadej stranu ctverce");
			int aCtverce = s1.nextInt();
			//Vyto�il bych metodu, kterou bych zde jen pou�il.
			double OCtverce = aCtverce * 4;
			double SCtverce = aCtverce * aCtverce;
			System.out.println("Obvod ctverce je " + OCtverce);
			System.out.println("Obsah ctverce je " + SCtverce);

			break;
		case 3:
			System.out.println("zadej stranu a obdelniku");
			int aObdelniku = s1.nextInt();
			System.out.println("zadej stranu b obdelniku");
			int bObdelniku = s1.nextInt();
			//Vyto�il bych metodu, kterou bych zde jen pou�il.
			double OObdelniku = aObdelniku * 2 + bObdelniku * 2;
			double SObdelniku = aObdelniku * bObdelniku;
			System.out.println("Obvod Obdelniku je " + OObdelniku);
			System.out.println("Obsah Obdelniku je " + SObdelniku);
			break;
			//Celou metodu main bys m�l m�t v Try - Catch, abys o�et�il alespo� n�jak� chyby.
		}

	}

}
