package controller;

public class ThreadCalc extends Thread {
	private int tid;
	private int i;
	
	public ThreadCalc (int i) {
		this.i = i;
		
	}
	
	public void run ( ) {
		calc ( );
	}
	
	private void calc () {
		tid = (int)threadId();
		
		System.out.println ("Thread " +i +": " +tid);
	}
}
