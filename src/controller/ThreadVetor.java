package controller;

import java.util.Random;

public class ThreadVetor extends Thread {
	private int num;
	private int i;
	private int soma;
	private Random sorteio = new Random();

	public ThreadVetor(int i) {
		this.i = i;
	}

	@Override
	public void run() {
		soma();
	}

	private void soma() {
		try {
			Thread.sleep(i*1000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		for (int j = 0; j < 5; j++) {
			num = sorteio.nextInt(10);
			soma += num;
			if(j==4) {
				System.out.print(" " + num);
			}else {
				System.out.print(" " + num + " +");
			}
		}

		System.out.println("\n Id#"+ getId() +"  =>  " + soma + "\n ");
		
	}
}
