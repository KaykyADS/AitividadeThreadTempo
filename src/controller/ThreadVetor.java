package controller;

public class ThreadVetor extends Thread{
	private int [] vet = new int[1000];
	private double tempoIni, tempoFin, total;
	int i;
	
	public ThreadVetor(int[] vet, int indice) {
		i = indice;
		if (i % 2 == 0) {
			tempoIni = System.nanoTime();
			for(int j = 0; j < vet.length; j++) {
				this.vet[i] = vet[i];
			}
			tempoFin = System.nanoTime();
			total = tempoFin - tempoIni;
			total = total / Math.pow(10, 9);
		} else {
			tempoIni = System.nanoTime();
			for(int j : vet) {
				this.vet[i] = vet[i];
			}
			tempoFin = System.nanoTime();
			total = tempoFin - tempoIni;
			total = total / Math.pow(10, 9);
		}
	}

	@Override
	public void run() {
		if (i % 2 == 0) {
			System.out.println("Estrutura for --> " + total);
		} else {
			System.out.println("Estrutura foreach --> " + total);
		}
	}
}
