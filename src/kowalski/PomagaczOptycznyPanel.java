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
   List<Element> ElementList = new ArrayList<Element>(); // Container for lenses
   private Graphics graphicsForDrawing;  // A graphics context for the panel
   										// that is used to draw the lens
   
   
	
	//Constructor sets the background color to be white, and sets it to listen for mouse events on itself
   //!!! ADD method for adding lenses to container
    PomagaczOptycznyPanel() {
        setBackground(Color.WHITE);
        addMouseListener(this);
        ElementList.add(new Soczewka(10,20,15,1.5,50)); //Just for now, a default lens for testing
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
	   for (Element el:ElementList) el.paint(g,height,width);
    }
    private void setUpDrawingGraphics() {
        graphicsForDrawing = getGraphics();
    }
    
	@Override
	public void mouseClicked(MouseEvent evt) {
		placing = true; //just for tests
		// TODO Auto-generated method stub
		if (placing == false) // if the user hadn't just clicked the 'place lens' button quit function
			return;
    int width = getWidth();    // Width of the panel.
    int height = getHeight();  // Height of the panel.
    int x = evt.getX();   // x-coordinate where the user clicked.
    ElementList.get(whichOne).setZ(x);
    setUpDrawingGraphics();
    ElementList.get(whichOne).paint(graphicsForDrawing,height, width);
    whichOne++; //so the user has to create another object
    placing = false; //so we don't end up with multiple lenses on image, but just one in collection
	}

	@Override
	public void mouseEntered(MouseEvent evt) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent evt) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent evt) {

	}

	@Override
	public void mouseReleased(MouseEvent evt) {
		// TODO Auto-generated method stub

	}

	public void setPlacing(boolean placing) {
		this.placing = placing;
	}

}
