package source;

import java.awt.Graphics;
import java.awt.Image;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Panel extends JPanel {
	
	public Image imagen;
	public URL fondo;

	
	public Panel() {
		
		fondo = this.getClass().getResource("/source/Background2.jpg");
		imagen = new ImageIcon(fondo).getImage();
				
	}
	
	public void paintComponent(Graphics g) {
		
		g.drawImage(imagen, 0, 0, this.getWidth(), this.getHeight(), null);
		
	}
	

}
