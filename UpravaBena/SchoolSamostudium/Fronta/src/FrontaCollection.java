
public class FrontaCollection<T> {
	T hodnota;
	Object[] pole;

	public T getHodnota() {
		return hodnota;
	}

	public void setHodnota(T hodnota) {
		this.hodnota = hodnota;
	}
	
	public FrontaCollection(T hodnota) {
		setHodnota(hodnota);
	}
	
	public T  add(){
		
		
		

	
		Object[] pole2 = new Object[pole.length*2];
		for(int i = 0;i<pole2.length;i++) {
			if(i<=pole.length) {
			pole2[i] = pole[i];
		}else {
			pole2[i] = null;
		}
		}
		
		return (T) pole2;
	}
	
	public T First() {
		Object help=pole[0];
		for(int i=0;i<pole.length;i++) {
			pole[i]=pole[i+1];
		}
		pole[pole.length]=null;
		return (T) help;
	}
	
	public T Last() {
		Object help = pole[pole.length];
		pole[pole.length]=null;
		return (T) help; 
		
		
	}
	public T Write() {
		 for(int i =0; i<pole.length;i++) {
			 System.out.println(pole[i]);
		 }
		return null;
	}

}
