package controller;

import java.util.concurrent.Semaphore;

public class ThreadFrases extends Thread {

	private Semaphore semaforo;
	
	public ThreadFrases(Semaphore semaforo) {
		this.semaforo = semaforo;
	}

	@Override
	public void run() {
		try {
//			========seção crítica========
			semaforo.acquire();
			print();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
//			========seção crítica========
			semaforo.release();
		}

	}

	private void print() {
		long id = getId();

		System.out.println("Boa tarde a todos");
		System.err.println("Alunos do 3o ADS");
		System.out.println("Período noturno");
		System.err.println("Da Fatec ZL");
		System.out.println("Deseja a Thread #" + id);
		System.out.println("====================================");
	}

}
