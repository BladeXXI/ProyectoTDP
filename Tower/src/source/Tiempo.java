package source;

import Game.Juego;

public class Tiempo extends Thread {
	
	private Juego juegoActual;
	
	public Tiempo(Juego j) {
		
		this.juegoActual=j;
	
	}
	
	public void run() {
		while(true){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			juegoActual.mover();
		}
	}

}
