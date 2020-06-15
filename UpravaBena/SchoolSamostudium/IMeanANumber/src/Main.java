import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Pravida:"
				+"\n"+ "1....zadej cislo od 0 do 1000 a program ti rekne jestli myslene cislo je vetsi nebo mensi"
				+"\n"+ "2....nesnaz se trolit...moc troleni=diskvalifikace"
				+"\n"+ "PS...good luck");
		Random RNG = new Random();
		Scanner s1 = new Scanner(System.in); 
		int mc = RNG.nextInt(1000);
		System.out.println(mc);
		int cislo = -1;
		
		try {
		while(mc!=cislo) {
			System.out.println("zadej cislo");
			cislo = s1.nextInt();
			if(cislo==mc) {
				System.out.println("bravo uhodl jsi");
			}
			if(cislo>mc) {
				System.out.println("myslene cislo je mensi nez " + cislo);
			}
			if(cislo<mc) {
				System.out.println("myslene cislo je  vetsi nez " + cislo);
			}
		}
		}catch(Exception e) {
			System.err.println("neco jsem rikal... jsi diskvalifikovan");
		}
		// TODO Auto-generated method stub

	}

}
