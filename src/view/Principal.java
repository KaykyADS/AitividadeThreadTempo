package view;

import controller.ThreadVetor;

public class Principal {

	public static void main(String[] args) {
		int[] vet = new int[1000];
		
		for (int i = 0; i < 1000; i++) {
			vet[i] = (int) ((Math.random() * 100) + 1);		
		}
		Thread t = new ThreadVetor(vet, 2);
		t.start();
		Thread t2 = new ThreadVetor(vet, 1);
		t2.start();
	}
}
