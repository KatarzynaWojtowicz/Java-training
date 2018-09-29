package pl.excercise;

public class Tablice {
	public static void main(String[] args) {
		int n = 10;
		int macierz[][] = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == j) {
					macierz[i][j] = 1;
				} else {
					macierz[i][j] = 0;
				}
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(macierz[i][j] + " ");
			}
			System.out.println();
		}
		int suma = 0;
		for (int i = 0; i < n; i++) {
			suma = suma + macierz[i][i];
		}
		System.out.println("Suma wynosi: " + suma);
	}
}
