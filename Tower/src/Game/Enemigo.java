package Game;

import javax.swing.ImageIcon;

public class Enemigo extends Entidad {
	
	public Enemigo(int velocidad, int vida, int x, int y) {
		
		super(velocidad, vida, x, y);
		this.Imagenes[0] = new ImageIcon(this.getClass().getResource("/Imagenes/MaloArriba80x100.png"));
		this.Imagenes[1] = new ImageIcon(this.getClass().getResource("/Imagenes/MaloAbajo80x100.png"));
		this.Imagenes[2] = new ImageIcon(this.getClass().getResource("/Imagenes/MaloIzquierda80x100.png"));
	}

}
