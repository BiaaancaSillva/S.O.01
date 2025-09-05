
package view;

import controller.ThreadCalc2;
public class Main2 {
	public static void main (String args []) {
		int mtz [][] = new int [3][5];
		int vet [] = new int [5];
		int i, j;
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 5; j++) {
				mtz [i][j] = (int)((Math.random()*11) +0);
			}
			
			for (j = 0; j < 5; j++) {
				vet [i]= mtz [i][j];			
			}
			ThreadCalc2 t = new ThreadCalc2 (vet, i);
			t.start();
		}
	}
}
