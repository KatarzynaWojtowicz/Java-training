package Fibbonaci;

public class Fibbo {
	private String a;
	private String b;
	private int n;

	public String getA() {
		return a;
	}

	public void setA(String a) {
		this.a = a;
	}

	public String getB() {
		return b;
	}

	public void setB(String b) {
		this.b = b;
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public Fibbo(String a, String b, int n) {
		super();
		this.a = a;
		this.b = b;
		this.n = n;
	}

	public String[] calculate() {
		String[] tab = new String[n];
		tab[0] = a;
		tab[1] = b;
		for (int i = 2; i < n; i++) {
			tab[i] = tab[i - 1] + tab[i - 2];
		}
		return tab;

	}

}
