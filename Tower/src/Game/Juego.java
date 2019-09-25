package Game;
import java.util.Random;

import javax.swing.JLabel;
import javax.swing.JPanel;

import source.Principal;

public class Juego {
	
	private Aliado aliado;
	private Enemigo enemigos[];
	private int puntaje;
	
	public Juego(Principal GUI) {
		
		puntaje=0;
		aliado = new Aliado(40,100,200,100);
		GUI.PanelPrincipal().add(aliado.getGrafico());
		GUI.PanelPrincipal().repaint();
		
		enemigos = new Enemigo[7];
		for (int i = 0; i < enemigos.length; i++) {
			
			Random r = new Random();
			enemigos[i] = new Enemigo(10,100, GUI.getWidth()-80,r.nextInt(GUI.getHeight()-100));
			//enemigos[i].getGrafico().setLayout(null);
			JLabel grafico = enemigos[i].getGrafico();
			GUI.PanelPrincipal().add(grafico);
			
		}
	}
		
	public void mover() {
		
		for (int i = 0; i < enemigos.length; i++) {
			
			Random r = new Random();
			int direccion = r.nextInt(3);
			if (enemigos[i] !=  null) {
				enemigos[i].mover(direccion);
				}
		}
	
	
		
	}
	
	public Enemigo[] getEnemigos() {
	
	return this.enemigos;
	
	}

	
	public Aliado retornarAliado() {
		
		return this.aliado;
	}
	
	public void setPuntaje(int c) {
		
		this.puntaje+=c;
		
		}
	
	
	
	

}
