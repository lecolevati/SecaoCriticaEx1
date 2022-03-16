package view;

import java.util.concurrent.Semaphore;

import controller.ThreadFrases;

public class Principal {

	public static void main(String[] args) {
		
		int permissao = 1;
		Semaphore semaforo = new Semaphore(permissao);
		
		for (int i = 0 ; i < 10 ; i++) {
			Thread t = new ThreadFrases(semaforo);
			t.start();
		}
		
	}

}
