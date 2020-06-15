package cz.spse.c2a.rais;

public class Rovnostranny implements Trojuhelnik {
	double a;
	double b;
	double c;
		public double getA() {
		return a;
	}


	public void setA(double a) throws Exception{
		if(a<=0) {
			throw new Exception();
		}else {
		this.a = a;
		}
	}


	public double getB() {
		return b;
	}


	public void setB(double b) throws Exception{
		if(b<=0) {
			throw new Exception();
		}else {
		this.b = b;
		}
	}
	


	public double getC() {
		return c;
	}


	public void setC(double c)throws Exception {
		if(c<=0) {
			throw new Exception();
		}else {
		this.c = c;
		}
	}	

	
	public String getName() {
		
		return "Rovnostranny";
	}

	
	public double getObvod() {
		
		return a+b+c;
	}

	
	public double getObsah() {
		double p=(a+b+c)/2;
		double S = Math.sqrt(p*(p-a)*(p-b)*(p-c));

		return S;
	}


	@Override
	public String toString() {
		return "Rovnostranny [a=" + a + ", b=" + b + ", c=" + c + " O=" + getObvod() + " S=" + getObsah() +"]";
	}


	public Rovnostranny(double a, double b, double c) throws Exception {
		super();
		if(a==b&&a==c) {
		setA(a);
		setB(b);
		setC(c);
		}
	}

}
