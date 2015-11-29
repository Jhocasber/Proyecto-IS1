package ecg;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class grafica extends javax.swing.JPanel {
int a;
int b;	


public grafica(int valor){
	this.a=valor;

	
}


public void paintComponent(Graphics g) { 
super.paintComponent(g);
g.setColor(Color.red);
g.drawLine(10,10, 500+a,500);
	 
}

	
}



