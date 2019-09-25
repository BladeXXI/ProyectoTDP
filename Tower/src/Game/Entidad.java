package Game;

import java.awt.Point;

import javax.swing.Icon;
import javax.swing.JLabel;

public abstract class Entidad {
	
	protected JLabel grafico;
	protected Icon Imagenes[];
	public final int width = 80;
	public final int height = 100;
	protected int velocidad;
	protected Point pos;
	protected int vida;
	
	protected Entidad(int velocidad, int vida, int x, int y) {
		
		this.velocidad = velocidad;
		this.pos = new Point(x,y);
		this.Imagenes = new Icon[3];
		this.vida = vida;
				
	}
	
	public int getVelocidad() {
		
		return this.velocidad;
	}
	
	public Point getPos() {
		
		return this.pos;
	}
	
	protected void cambiarGrafico(int dir){
		if(this.grafico != null){
			this.grafico.setIcon(this.Imagenes[dir]);
			this.grafico.setBounds(this.pos.x, this.pos.y, width, height);
		}
	}
	
	public void mover(int dir){	
		switch (dir) {
			case 0 : //Arriba
				pos.setLocation(pos.x, pos.y - velocidad);
				break;
			case 1 : //Abajo
				pos.setLocation(pos.x, pos.y + velocidad);
				break;
			case 2 : //Izquierda
				pos.setLocation(pos.x - velocidad, pos.y);
				break;
			
		}
		cambiarGrafico(dir);
	}
	
	public JLabel getGrafico(){
		if(this.grafico == null){
			this.grafico = new JLabel(Imagenes[2]);
			this.grafico.setBounds(this.pos.x, this.pos.y, width, height);
		}
		
		return this.grafico;
	}
	
	public int vida() {
		
		return vida;
	}

}
