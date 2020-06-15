import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Pro spusteni hry napis: START");
		Scanner s1 = new Scanner(System.in);
		String play = s1.nextLine();
		if(play.equals("START")) {
			double money = 30;
			int energy = 100;
			int u=50;
			System.out.println("Nezapominej mas urcity pocet penez a urcitou energii"+"\n" +"pokud ti dojdou penize, nemuzes nic koupit a pokud ti dojde energie, tak jsi prohral.");
			System.out.println("Mas " + money + "penez a "+ energy+"energie a " + u+ "upesnosti");
			System.out.println("Tvym ukolem je dosahnout uspesnosti 100, ale pokud bude 0 tak jsi prohral");
			System.out.println("Jdes do baru a na baru sedi hezka brunetka... co udelas?");
			System.out.println("1...Pozves ji na drink");
			System.out.println("2...odejdes");
			System.out.println("3...pockas ");
			int p = s1.nextInt();
			switch(p) {
			case 1:
				System.out.println("Jaky Drink?");
				System.out.println("1..Cola...7");
				System.out.println("2..Vodka..17");
				int pit = s1.nextInt();
				if(pit==1) {
					money=money-7;
					u = u+10;
					energy=energy-30;
				}
				if(pit==2) {
					money=money-15;
					u = u+40;
					energy=energy-40;
				}
				System.out.println("Wow co ted");
				System.out.println("1..Jit tancovat");
				System.out.println("2..cekat");
				int t = s1.nextInt();
				if(t==1) {
					System.out.println("Jdete tancovat");
					u=u+10;
					energy = energy-50;
				}
				if(t==2) {
					System.out.println("asi jsi pohrbil sve nadeje...");
					u=0;
				}
				
				break;
				
			case 2:
				System.out.println("Jdes domu spat");
				energy = 0;
				u=0;
				break;
				
			case 3:
				energy = energy-5;
				u=u-10;
				System.out.println("Cekas ale nikdo novy neprisel a brunetka je jiz zabrana");
				System.out.println("cekas");
				System.out.println("cekas");
				System.out.println("cekas");
				System.out.println("cekas");
				System.out.println("cekas");
				System.out.println("cekas");
				System.out.println("Nikdo neprisel a ty dnes budes sam");
				u=0;
				
				break;
				
			case 4:
				System.out.println("Easter egg...Vyhral jsi gratuluju");
				money = 1000000;
				u=100;
				energy=100;
				break;
			
			}
			System.out.println("Vyhodnoceni:");
			if(u==100) {
				System.out.println("Gratulujeme, vzhrali jste");
				System.out.println("mas" + energy + "energie");
				System.out.println("mas" + u + "% uspesnotsi");
				System.out.println("mas" + money + "penez");
			}
			if(u>50&&u<100) {
				System.out.println("Jste lepsi nez polovina lidi!!!");
				System.out.println("mas" + energy + "energie");
				System.out.println("mas" + u + "% uspesnotsi");
				System.out.println("mas" + money + "penez");
			}
			if(u<50) {
				System.out.println("Umrete sam...");
				System.out.println("mas" + energy + "energie");
				System.out.println("mas" + u + "% uspesnotsi");
				System.out.println("mas" + money + "penez");
			}
		}

	}

}
