package kowalski;
import kowalski.PomagaczOptyczny;

public abstract class Element {
	float r1, r2, d, n, h, D1, Dc1, D2, Dc2, D, f, h1, h2,z;
	
	Element(float r1, float r2, float d, float n){
		this.r1 = r1;
		this.r2 = r2;
		this.d = d;
		this.n = n;
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
	
}