package Game;

import javax.swing.ImageIcon;

public class Aliado extends Entidad {
	
	
	
	public Aliado(int velocidad, int vida, int x, int y) {
		
		super(velocidad,vida,x,y);
		
		this.Imagenes[2] = new ImageIcon(this.getClass().getResource("/Imagenes/AliadoGrande80x100.png"));
	}
	
	


}
