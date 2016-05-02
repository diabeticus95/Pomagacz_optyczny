package kowalski;
import java.awt.Graphics;

import kowalski.PomagaczOptyczny;

public abstract class Element {
	double r1, r2, d, n, h, D1, Dc1, D2, Dc2, D, f, h1, h2;
	int z;
	
	Element(double r1, double r2, double d, double n, double h){
		this.r1 = r1;
		this.r2 = r2;
		this.d = d;
		this.n = n;
		this.h = h;
		float n_otoczenia = PomagaczOptyczny.n_otoczenia;
		
		D1 = (n-n_otoczenia)/r1;
		D2 = (1-n)/r2;
		Dc1 = D1/(1-((d*D1)/n))+D2;
		Dc2 = D2/(1-((d*D2)/n))+D1;
		D = D1+D2-((d*D1*D2)/n);
		f = n_otoczenia/D;
		
		h1 = -(f*(n-1)*d)/(n*r1);
		h2 = -(f*(n-1)*d)/(n*r2);
	}
	public void paint(Graphics g, int height, int width){
	}

	public double getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}
	public double geth1() {
		return h1;
	}
	public double geth2() {
		return h2;
	}
	public double geth() {
		return h;
	}
	
}