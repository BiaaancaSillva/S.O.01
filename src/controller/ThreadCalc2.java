package controller;

public class ThreadCalc2 extends Thread {
		private int i, soma, linha;
		private int vet [];

		public ThreadCalc2 (int vet[], int i) {
			this.vet = vet.clone();
			linha = i;
		}
		
		public void run () {
			calc ();
		}
		
		public void calc () {
			for (i = 0; i < 5; i++) {
				soma += vet [i];
			}	
			System.out.println ((int)threadId() +" - resultado: " +soma +" da linha "+linha +" da matriz");
		}
}
