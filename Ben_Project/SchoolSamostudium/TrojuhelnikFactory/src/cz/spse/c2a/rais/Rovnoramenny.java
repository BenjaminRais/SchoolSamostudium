package cz.spse.c2a.rais;

public class Rovnoramenny implements Trojuhelnik{
	double a;
	double b;
	double c;
	

	
	@Override
	public String toString() {
		return "Rovnoramenny [a=" + a + ", b=" + b + ", c=" + c + " O=" + getObvod() + " S=" + getObsah() +"]";
	}


	public String getName() {
		
		return "Rovnoramenny";
	}

	
	public double getObvod() {
		
		return a+b+c;
	}

	
	public Rovnoramenny(double a, double b, double c) throws Exception {
		super();
		if(a==b||a==c||b==c) {
		setA(a);
		setB(b);
		setC(c);
		}
	}


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


	public double getObsah() {
		double p=(a+b+c)/2;
		double S = Math.sqrt(p*(p-a)*(p-b)*(p-c));

		
		return S;
	}

}
