package ecg;

import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.ImageIcon;

public class imag extends javax.swing.JPanel {
	 
	String IMG;
	public imag(String url) {
		this.IMG=url;
		this.setSize(663, 455); //se selecciona el tamaño del panel
	}
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
