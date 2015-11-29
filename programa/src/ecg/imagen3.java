package ecg;

import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.ImageIcon;

public class imagen3 extends javax.swing.JPanel {
	String IMG;
	public imagen3(String url) {
		this.IMG=url;
	this.setSize(663, 458); //se selecciona el tamaño del panel
	}
	 
	//Se crea un método cuyo parámetro debe ser un objeto Graphics
	 
	public void paint(Graphics grafico) {
	Dimension height = getSize();
	 
	//Se selecciona la imagen que tenemos en el paquete de la //ruta del programa
	 
	ImageIcon Img = new ImageIcon(getClass().getResource(IMG)); 
	 
	//se dibuja la imagen que tenemos en el paquete Images //dentro de un panel
	 
	grafico.drawImage(Img.getImage(), 20, 30, height.width, height.height, null);
	 
	setOpaque(false);
	super.paintComponent(grafico);
	}
	
	}
