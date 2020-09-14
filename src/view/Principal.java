package view;

import controller.ThreadVetor;

public class Principal {
	public static void main(String[] args) {
		
		
		for (int i = 0; i < 3; i++) {
			Thread t = new ThreadVetor(i);
			t.start();
	}
	
}
}