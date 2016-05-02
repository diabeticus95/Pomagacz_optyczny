package kowalski;

import java.awt.Color;
import java.awt.Graphics;

public class Soczewka extends Element{

	Soczewka(double r1, double r2, double d, double n, double h) {
		super(r1, r2, d, n, h);
	}
	public void paint(Graphics g, int height, int width){
	g.setColor(Color.cyan);
    g.drawLine((int)z+(int)h1,2*height/3+(int)h/2,(int)z+(int)h1,2*height/3-(int)h/2);
    g.drawLine((int)z+(int)h2,2*height/3+(int)h/2,(int)z+(int)h2,2*height/3-(int)h/2);
	}
}
