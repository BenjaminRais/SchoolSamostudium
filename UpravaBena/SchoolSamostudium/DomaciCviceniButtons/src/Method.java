
public class Method {
	public static double Vypocitej(String s) {

		double vysledek = 0;
		double vysledek2 = 0;
		double vysledek3 = 0;
		double vysledek4 = 0;
		String numbers[] = s.split("\\+");
		
		vysledek4=0;
		for (int i = 0; i < numbers.length; i++) {
			String minus[] = numbers[i].split("\\-");
			
			vysledek3=0;
			for (int j = 0; j < minus.length; j++) {
				String krat[] = minus[j].split("\\*");
				
				vysledek2=1;
				for (int k = 0; k < krat.length; k++) {
					String deleno[] = krat[k].split("\\/");
					int help = Integer.parseInt(deleno[0]);
					vysledek = help;
					for (int l = 1; l < deleno.length; l++) {
						int help2 = Integer.parseInt(deleno[l]);
						vysledek = vysledek / help2;
						
					}
					vysledek2 = vysledek2*vysledek;
				}
				vysledek3=vysledek3-vysledek2;
			}
			vysledek4=vysledek4+vysledek3;

		}

		return vysledek4;
	}
}
