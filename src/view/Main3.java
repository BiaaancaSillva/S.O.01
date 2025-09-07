package view;

import controller.ThreadVetor;
public class Main3 {
	public static void main (String args []) {
		int vet [] = new int [1000];
		
		for (int i = 0; i < 1000; i++) {
			vet [i] = (int)((Math.random()*101)+1);			
		}
		ThreadVetor t1 = new ThreadVetor (vet, 1);
		ThreadVetor t2 = new ThreadVetor (vet, 2);
		t1.start();
		t2.start();
	}
}
