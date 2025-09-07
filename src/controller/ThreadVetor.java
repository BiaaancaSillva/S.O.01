
package controller;

public class ThreadVetor extends Thread{
	int num;
	int vet [] = new int [1000];
	
	public ThreadVetor (int vet[], int num) {
		this.num = num;
		this.vet = vet;
	}
	
	public void run () {
		if (num % 2 == 0) {
			calcpar();
		}
		else {
			calcimpar();
		}
	}
	
	public void calcpar () {
		double tempinicial = System.nanoTime();
		for (int i = 0 ; i < vet.length; i++) {
			int x = vet[i];
		}
		double tempototal = (long) (((System.nanoTime()) - tempinicial)/1000000000.0);
		System.out.printf ("Thread %d Par - Tempo total: %.15f %n" ,(int)threadId(), tempototal);
	}
	
	public void calcimpar () {
		double tempinicial = System.nanoTime();
		for (int n : vet) {
			int x = vet[n];
		}
		double tempototal = (long) (((System.nanoTime()) - tempinicial)/1000000000.0);
		System.out.printf ("Thread %d Impar - Tempo total: %.15f %n" , (int)threadId(), tempototal);
	}
}
