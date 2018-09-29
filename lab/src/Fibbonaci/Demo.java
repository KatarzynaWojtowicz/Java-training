package Fibbonaci;

public class Demo {
	public static void main(String[] args) {
		Fibbo myFibbo = new Fibbo("a", "b", 6);
		String[] result = myFibbo.calculate();

		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);

		}

	}

}
