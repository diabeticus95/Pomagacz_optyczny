package kowalski;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class RayCalculator {
	static int raysAmount = 1;
	List<Element> elementListForCalculations = new ArrayList<Element>();
//lista wsp. z-owych przecięcia z osią
	List<Double> keyPoints = new ArrayList<Double>(); //z coordinates crossing the axis
	List<Double> startPoints = new ArrayList<Double>(); //y coordinates
	
	
	RayCalculator(PomagaczOptycznyPanel content){
		addRays();
		updateElementList(content.getelementList());
	}
	public void addRays(){
		startPoints.add(raysAmount*-5.0);
		startPoints.add(raysAmount*5.0); 
		raysAmount++;
	}
	private double calculate(Element el, double Sp){ //iterated through elementList || Sp = last elements So -> inf if el is first
		double So = (el.f + Sp) / (el.f*Sp);
		return So;
	}
	public void updateElementList(List<Element> updatedList){
		elementListForCalculations = updatedList;
		Collections.sort(elementListForCalculations, new Comparator<Element>(){
			@Override
			public int compare(Element el1, Element el2) {
				return (el1.z+el1.h1<el2.z+el2.h1) ? -1 : 1; //conditional operator, returns -1 if a<b, and 1 if a>b. It's enough to check the first surface of lens, cause they already are not colliding
			}
		});
	}
	public void simulate(){
		//za inf dać startingPoint i zastosować rekurencję w calculate
		keyPoints.add(calculate(elementListForCalculations.get(0), 1.79769e+308));
	}
}
