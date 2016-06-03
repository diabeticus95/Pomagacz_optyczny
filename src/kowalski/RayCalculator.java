package kowalski;

import java.awt.Graphics;
import java.awt.Point;
import java.security.KeyPair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class RayCalculator {
	List<Element> elementListForCalculations = new ArrayList<Element>();
//lista wsp. z-owych przecięcia z osią
	List<Point> keyPoints = new ArrayList<Point>(); //z coordinates crossing the axis
	Point startingPoint = new Point(0,0);
	Graphics graphicsForRay;

	
	RayCalculator(PomagaczOptycznyPanel content){
		update(content.getelementList(), content.getStartingPoint());
	}
	private Point calculate(Element el, Point Sp){ //iterated through elementList
		Point So = new Point(0,0);
		int x = (int)(-el.z - el.h1 + Sp.x); //x ujemne
		So.x = (int)((el.f + x) / (el.f*x)) + el.z;
		So.y = So.x/Sp.x * Sp.y; //powiekszenie
		System.out.println(So.x+" "+So.y);//to z jakiegos powodu (0,0)
		return So; 
	}
	public void update(List<Element> updatedList, Point startingPoint){ //pobieranie z content
		elementListForCalculations = updatedList;
		Collections.sort(elementListForCalculations, new Comparator<Element>(){
			@Override
			public int compare(Element el1, Element el2) {
				return (el1.z+el1.h1<el2.z+el2.h1) ? -1 : 1; //conditional operator, returns -1 if a<b, and 1 if a>b. It's enough to check the first surface of lens, cause they already are not colliding
			}
		});
		this.startingPoint = startingPoint;
	}
	public void simulate(){
		//za inf dać startingPoint i zastosować rekurencję w calculate
		keyPoints.add(startingPoint);

//tu keypoints(0) = 0.320
		keyPoints.add(new Point((int)elementListForCalculations.get(0).z+(int)elementListForCalculations.get(0).h1, (int)elementListForCalculations.get(0).h/2));
		keyPoints.add(new Point((int)elementListForCalculations.get(0).z-(int)elementListForCalculations.get(0).h2, (int)elementListForCalculations.get(0).h/2));
		for(int i = 1; i<elementListForCalculations.size(); i++){
			keyPoints.add(new Point(calculate(elementListForCalculations.get(i), keyPoints.get(keyPoints.size()-1)))); 
		}
		for (Point pt:keyPoints) System.out.println(pt);
// cos dziwnego points(1) = -10, 20, niewazne gdzie klikam
	}
	public void paintRay(PomagaczOptycznyPanel content){
		graphicsForRay = content.getGraphics();
		int height = content.getHeight();  // Height of the panel
	    int axisHeight = (2*height/3);
	    List<Point> fixedKP = keyPoints;
//keypoints ma tylko wysokosc soczewki, ale nie wie nic o polozeniu osi, trzeba to uwzględnić
	    for(Point kp:fixedKP){
	    	kp.y = axisHeight - kp.y;
	    }
	    
		for (int i = 0; i < fixedKP.size() - 1; i++){
			graphicsForRay.drawLine(fixedKP.get(i).x, fixedKP.get(i).y, fixedKP.get(i+1).x, fixedKP.get(i+1).y);
			
		}
	}
}
