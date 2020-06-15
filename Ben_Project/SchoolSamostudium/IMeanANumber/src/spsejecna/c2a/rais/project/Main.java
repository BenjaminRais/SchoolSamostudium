package spsejecna.c2a.rais.project;

import java.util.InputMismatchException;
//nový package, spsejecna/c2a/rais/project
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// CTRL + F

		System.out.println("Pravida:" + "\n" //doplìn9 diakritiky
				+ "1... zadej èíslo od 0 do 1000 a program ti øekne, jestli myšlené èíslo je vìtsi nebo mìnší" + "\n"
				+ "2....nesnaz se trolit...moc troleni=diskvalifikace" + "\n" + "PS...good luck");
		Random RNG = new Random();
		Scanner s1 = new Scanner(System.in);
		int mc = RNG.nextInt(1000); // zakládáme èíslo od 0 do 999
		System.out.println(mc);
		int cislo = -1; // lepší by bylo použít do while, nemuselo by se zakládat navíc promìnna int cislo = -1
		// doplìní try catch = když napíše slovo, neshodí to program, ale bude dál pokraèovat
		boolean err = true;
		System.out.println("zadej èíslo");
		do {
		try {
				cislo = s1.nextInt();
				if (cislo == mc) {
					System.out.println("bravo uhodl jsi moje èíslo");
					err = false;
				}
				if (cislo > mc) {
					System.out.println("myslene cislo je mensi nez " + cislo);
				}
				if (cislo < mc) {
					System.out.println("myslene cislo je  vetsi nez " + cislo);
				}
		}catch (InputMismatchException e) { // pokud zada String, tenhle exception to chytí
			s1 = new Scanner(System.in);
			System.err.println (" Please enter a digit number: ");
		} catch (Exception e) {
			s1 = new Scanner(System.in);
			System.err.println("Error");
		}
		}while(err);
		// TODO Auto-generated method stub

		s1.close(); // Scanner close, pro lepší efektivitu
	}

}
