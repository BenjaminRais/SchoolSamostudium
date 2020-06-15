package cz.spse.C2a.rais;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyArrayList<T> implements Iterable<T> {
	T hodnota;
	Object[] pole = new Object[10];
	int size;
	T start;
	T end;

	public T getHodnota() {
		return hodnota;
	}

	public void setHodnota(T hodnota) {
		this.hodnota = hodnota;
	}

	public MyArrayList() {
		setHodnota(hodnota);
	}

	public Object add(T hodnota) {
		if (pole[pole.length - 1] == null) {
			for (int i = 0; i < pole.length; i++) {
				if (pole[i] == null) {
					pole[i] = hodnota;
					size++;
					break;
				}
			}
		} else {
			Object[] pole2 = new Object[pole.length * 2];
			for (int i = 0; i < pole.length; i++) {
				pole2[i] = pole[i];
			}
			pole2[pole.length + 1] = hodnota;

		}
		return pole;
	}

	public T start() {
		for (int i = 0; i < pole.length; i++) {
			if (pole[0] != null) {
				start=(T) pole[0];
				break;
			}

		}
		return start;
	}

	public T end() {
		for (int i = 0; i < pole.length; i++) {
			if (pole[i] == null) {
				end = (T) pole[i-1];
				break;
			}
		}
		return end;
	}

	public int size() {
		return size;
	}
	@Override
	public Iterator<T> iterator() {

		return new MyArrayListIterator();
	}


	class MyArrayListIterator implements Iterator<T> {
		T akt;
		int i=-1;

		public MyArrayListIterator() {
			akt=(T) pole[i+1];
			
		}

		public boolean hasNext() {
			akt=(T)pole[i+1];
			return akt!=null;
		}

		public T next() {
			i++;
			return akt=(T) pole[i];
		}

		public void remove() {
		//	throw new UnsupportedOperationException();
		}
		;
	}


}
