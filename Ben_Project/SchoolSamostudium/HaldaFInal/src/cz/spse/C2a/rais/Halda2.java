package cz.spse.C2a.rais;

import java.util.ArrayList;

public class Halda2 {

	int value;
	ArrayList<Integer> h = new ArrayList<Integer>();

	public void Insert(int value, ArrayList<Integer> h) {
		if (h.size() == 0) {
			h.add(0, value);
		} else {
			if (h.size() % 2 == 0) {
				h.add(value);
				int i = h.size()-1;
				while (h.get((i - 1) / 2) > value) {
					int help = h.get((i - 1) / 2);
					h.set((i - 1) / 2, value);
					h.set(i, help);
					i = (i-1)/2;
				}

			} else {
				h.add(value);
				int i = h.size() - 1;
				while (h.get(i / 2) > value) {
					int help = h.get(i / 2);
					h.set(i / 2, value);
					h.set(i, help);
					i = i/2;
				}
			}

		}
	}

	public int min() {
		int min = 0;
		if (h.size() == 0) {
			System.out.println("halda je prazdna");
		} else {
			min = h.get(0);
		}
		return min;

	}

	public int extractMin(ArrayList<Integer> h) {
		int min = 0;
		if (h.size() == 0) {
			System.out.println("halda je prazdna");
		} else {
			min = h.get(0);

			h.set(0, h.get(size() - 1));
			h.remove(h.size() - 1);
			int i = 0;
			boolean hotovo = false;
			while (hotovo == false) {
				if (i * 2 + 1 >= h.size()) {// nema naslednika
					hotovo = true;
				} else {
					if (i * 2 + 1 == h.size() - 1) {// ma jen jednoho naslednika
						if (h.get(i) > h.get(i * 2 + 1)) {
							int help = h.get(i * 2 + 1);
							h.set(i * 2 + 1, h.get(i));
							h.set(i, help);
						}
						hotovo = true;
					} else {// ma dva nasledniky
						if (h.get(i) > h.get(i * 2 + 1) || h.get(i) > h.get(i * 2 + 2)) {

							if (h.get(i * 2 + 1) < h.get(i * 2 + 2)) {

								int help = h.get(i * 2 + 1);
								h.set(i * 2 + 1, h.get(i));
								h.set(i, help);
								i = i * 2 + 1;

							} else {

								int help = h.get(i * 2 + 2);
								h.set(i * 2 + 2, h.get(i));
								h.set(i, help);
								i = i * 2 + 2;
								
							}
						} else {
							hotovo = true;
						}

					}
				}
			}//end while
		}

		return min;

	}

	@Override
	public String toString() {
		return h.toString();
	}

	public int size() {
		int size = h.size();
		return size;
	}

	public Halda2(ArrayList<Integer> h) {
		this.h = h;
	}
}
