package kowalski;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;

public class PomagaczOptycznyPanel extends JPanel implements MouseListener {

   private boolean placing = false; // is the user trying to place the lens in panel?
   private int whichOne = 0; //which element is the user placing?
   private double startingPoint = 0;
   //przepisac mouseClicked na switcha, placing na placingLens i placingStartingPoint
   List<Element> elementList = new ArrayList<Element>(); // Container for lenses
   private Graphics graphicsForDrawing;  // A graphics context for the panel
   										// that is used to draw the lens
   
   
	
	//Constructor sets the background color to be white, and sets it to listen for mouse events on itself
   //!!! ADD method for adding lenses to container
    PomagaczOptycznyPanel() {
        setBackground(Color.WHITE);
        addMouseListener(this);
 //       elementList.add(new Soczewka(10,20,15,1.5,50)); //Just for now, a default lens for testing
 //       addElement(new Soczewka(10,10,30,1.5,100));
     }
    
    //Draw the contents of the panel.
    public void paintComponent(Graphics g) {    	
        super.paintComponent(g);  // Fill with background color (white).
        int width = getWidth();    // Width of the panel.
        int height = getHeight();  // Height of the panel.
        int grid = 10;
        int gridspace = 20;
        
	/* Draw a 3-pixel border around the applet in gray.  This has to be
	done by drawing three rectangles of different sizes. */
	   
	   g.setColor(Color.GRAY);
	   g.drawRect(0, 0, width-1, height-1);
	   g.drawRect(1, 1, width-3, height-3);
	   g.drawRect(2, 2, width-5, height-5);
	 
	   //Draw the Z Axis.
	   
	   g.setColor(Color.BLACK);
	   g.drawLine(3, 2*height/3, width-3, 2*height/3);
	   for (int i = 0; i < (width/gridspace + 1); i++){
	   g.drawLine(0+(gridspace*i), 2*height/3 + grid/2, 0+(gridspace*i), 2*height/3 - grid/2);
       }
	   for (Element el:elementList) el.paint(g,height,width);
    }
    private void setUpDrawingGraphics() {
        graphicsForDrawing = getGraphics();
    }
    
	@Override
	public void mouseClicked(MouseEvent evt) {
		//placing = true; //just for tests
		if (placing == false) // if the user hadn't just clicked the 'place lens' button quit function
			return;
    int width = getWidth();    // Width of the panel.
    int height = getHeight();  // Height of the panel.
    int x = evt.getX();   // x-coordinate where the user clicked.
//looking for collisions
    for (Element el:elementList){
    	if (!(x < el.z+el.h1 || x > el.z + el.h2)){
    		System.out.println("Kolizja!");
    		return;
    	}
    }
    elementList.get(whichOne).setZ(x);
    setUpDrawingGraphics();
    elementList.get(whichOne).paint(graphicsForDrawing,height, width);
    whichOne++; //so the user has to create another object
    placing = false; //so we don't end up with multiple lenses on image, but just one in collection
	}
	public void addLens(double r1, double r2, double d, double n, double h){
		Element el = new Soczewka(r1, r2, d, n, h);
		elementList.add(el);
	}

	@Override
	public void mouseEntered(MouseEvent evt) {

	}

	@Override
	public void mouseExited(MouseEvent evt) {

	}

	@Override
	public void mousePressed(MouseEvent evt) {

	}

	@Override
	public void mouseReleased(MouseEvent evt) {
	}

	public void setPlacing(boolean placing) {
		this.placing = placing;
	}
	public List<Element> getelementList(){
		return elementList;
	}
	public void setelementList(List<Element> newList){
		elementList = newList;
	}

}
