package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[][] mat = new int[n][n];
		
		System.out.print("MATRIZ: \n");
		
		for (int i=0; i<n; i++) { //percorrendo linha
			for (int j=0; j<n; j++) { //percorrendo coluna
				mat[i][j] = sc.nextInt();
			}
			System.out.print("------\n");
		}

		int negativos = 0;
		System.out.print("Diagonal: \n");
		for (int i=0; i<n; i++) {
			for (int j=0; j<n; j++) {
				if (mat[i][j]<0) {
					negativos++;
				}
				
				if (i==j) {
					System.out.printf("%d ", mat[i][j]);
				}
			}		
		}
		
		System.out.printf("\nNegativos: %d\n", negativos);
		
		System.out.print(mat.length);
		
		
		sc.close();
	}

}
	