package kowalski;

import java.awt.Color;
import java.awt.Graphics;

public class Soczewka extends Element{

	Soczewka(double r1, double r2, double d, double n, double h) {
		super(r1, r2, d, n, h);
	}
	public void paint(Graphics g, int height, int width){ //height i width odnosi się do panelu, nie soczewki
	g.setColor(Color.cyan);
    g.drawLine(z+(int)h1,2*height/3+(int)h/2,z+(int)h1,2*height/3-(int)h/2);
    g.drawLine(z-(int)h2,2*height/3+(int)h/2,z-(int)h2,2*height/3-(int)h/2);
	}
}
