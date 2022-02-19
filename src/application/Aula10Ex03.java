package application;

import java.util.Locale;
import java.util.Scanner;

public class Aula10Ex03 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt(), n = sc.nextInt();
		
		int[][] mat = new int[m][n];
		
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		int x = sc.nextInt();
		
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat[i].length; j++) {
				if(mat[i][j] == x) {
					System.out.print("Position: " + i + "," + j + "\n");
					
					if(j > 0) {
						System.out.print("Left: " + mat[i][j-1] + "\n");
					}
					if(j < mat[i].length - 1) {
						System.out.print("Right: " + mat[i][j+1] + "\n");
					}
					if(i > 0) {
						System.out.print("Up: " + mat[i-1][j] + "\n");
					}
					if(i < mat.length - 1) {
						System.out.print("Down: " + mat[i+1][j] + "\n");
					}
				}
			}
		}
		
		sc.close();
	}

}
