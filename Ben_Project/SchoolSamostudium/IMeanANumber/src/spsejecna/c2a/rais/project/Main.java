package spsejecna.c2a.rais.project;

import java.util.InputMismatchException;
//nov� package, spsejecna/c2a/rais/project
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// CTRL + F

		System.out.println("Pravida:" + "\n" //dopl�n9 diakritiky
				+ "1... zadej ��slo od 0 do 1000 a program ti �ekne, jestli my�len� ��slo je v�tsi nebo m�n��" + "\n"
				+ "2....nesnaz se trolit...moc troleni=diskvalifikace" + "\n" + "PS...good luck");
		Random RNG = new Random();
		Scanner s1 = new Scanner(System.in);
		int mc = RNG.nextInt(1000); // zakl�d�me ��slo od 0 do 999
		System.out.println(mc);
		int cislo = -1; // lep�� by bylo pou��t do while, nemuselo by se zakl�dat nav�c prom�nna int cislo = -1
		// dopl�n� try catch = kdy� nap�e slovo, neshod� to program, ale bude d�l pokra�ovat
		boolean err = true;
		System.out.println("zadej ��slo");
		do {
		try {
				cislo = s1.nextInt();
				if (cislo == mc) {
					System.out.println("bravo uhodl jsi moje ��slo");
					err = false;
				}
				if (cislo > mc) {
					System.out.println("myslene cislo je mensi nez " + cislo);
				}
				if (cislo < mc) {
					System.out.println("myslene cislo je  vetsi nez " + cislo);
				}
		}catch (InputMismatchException e) { // pokud zada String, tenhle exception to chyt�
			s1 = new Scanner(System.in);
			System.err.println (" Please enter a digit number: ");
		} catch (Exception e) {
			s1 = new Scanner(System.in);
			System.err.println("Error");
		}
		}while(err);
		// TODO Auto-generated method stub

		s1.close(); // Scanner close, pro lep�� efektivitu
	}

}
