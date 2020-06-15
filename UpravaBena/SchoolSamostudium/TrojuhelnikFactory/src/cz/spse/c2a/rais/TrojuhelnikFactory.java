package cz.spse.c2a.rais;

public class TrojuhelnikFactory {
	public static Trojuhelnik getTrojuhelnik(String jmeno, double a, double b) throws Exception {
		Trojuhelnik t=null;
		switch(jmeno) {
		case "rovnostranny":
			t=new Rovnostranny(a,a,a);
			break;
		case "rovnoramenny":
			t=new Rovnoramenny(a,a,b);
			break;
		default:
			t=new Rovnostranny(1,1,1);
			break;
		}
		return t;
	
	}

}
