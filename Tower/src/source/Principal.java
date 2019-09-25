package source;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;
import java.net.URL;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Game.Juego;

import javax.swing.JSplitPane;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Principal extends JFrame {

	private JPanel panel;	
	private JTextField textoPuntaje;
	private Juego j;
	private Tiempo tiempo;
	JButton btnNewButton;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
					frame.setVisible(true);
										
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Principal() {
		setTitle("ventana");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(50, 50, 1200, 700);
		//fondo = this.getClass().getResource("/source/Background2.jpg");
		//imagenFondo = new ImageIcon(fondo).getImage();
		
		
		panel = new Panel();
		panel.setBackground(Color.WHITE);
		setContentPane(panel);
		panel.setLayout(null);
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new EmptyBorder(0, 0, 0, 0));
		panel_1.setBackground(new Color(0,0,0,0));
		panel_1.setBounds(458, 560, 173, 90);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		
		
		JLabel lblNewLabel = new JLabel("Puntaje");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(10, 45, 53, 28);
		panel_1.add(lblNewLabel);
		
		Juego j = new Juego(this);
		tiempo = new Tiempo(j);
		tiempo.start();
		this.repaint();
		
		JButton btnNewButton = new JButton("Eliminar Enemigo");		
		
		
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Random r = new Random();
				int i = r.nextInt(7);
				while (j.getEnemigos()[i] == null) {
					
					i = r.nextInt(7);
									
				}
				//System.out.println("HOLA");
				if (j.getEnemigos()[i]!=null) {
					JLabel grafico = j.getEnemigos()[i].getGrafico();
					PanelPrincipal().remove(grafico);
														
					int valor = Integer.parseInt(textoPuntaje.getText());
					valor = valor + j.getEnemigos()[i].vida();
					textoPuntaje.setText(Integer.toString(valor));
					j.getEnemigos()[i] = null;
					
					panel_1.revalidate();
					panel_1.repaint();
					PanelPrincipal().revalidate();
					PanelPrincipal().repaint();
					repaint();
					
					
				}
				
				
				
				repaint();
				//j.getEnemigos()[i].getGrafico().setVisible(false);
				
				
			}
		});
		btnNewButton.setBounds(10, 11, 137, 23);
		panel_1.add(btnNewButton);
		
		textoPuntaje = new JTextField();
		textoPuntaje.setBounds(71, 51, 52, 20);
		panel_1.add(textoPuntaje);
		textoPuntaje.setEditable(false);
		textoPuntaje.setColumns(10);
		textoPuntaje.setText("0");
		
		
		
	}
	
	public JPanel PanelPrincipal() {
		return this.panel;
	}
	
	
}
