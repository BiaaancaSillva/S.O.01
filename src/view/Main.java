package view;

import controller.ThreadCalc;
public class Main {
	public static void main (String args []) {
		for (int i = 0; i < 5; i++) {
			ThreadCalc t = new ThreadCalc (i);
			t.start ();
		}
	}
}
