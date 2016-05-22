package kowalski;

import javax.swing.JFrame;

public class PomagaczOptyczny{
	protected static float n_otoczenia = 1;
	
	   public static void main(String[] args) {
		      JFrame window = new JFrame("Pomagacz Optyczny");
		      PomagaczOptycznyPanel content = new PomagaczOptycznyPanel();
		      window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE );
		      window.setContentPane(content);
		      window.setSize(600,480);
		      window.setLocation(100,100);
		      window.setVisible(true);
//tak będzie wyglądała metoda dodająca soczewkę wywołana guzikiem przez użytkownika.
		      try {
		    	    Thread.sleep(1000);                 //zeby pierwsza nie pojawiala sie na skraju ekranu
		      } catch(InterruptedException ex) {
		    	    Thread.currentThread().interrupt();
		      }
		      content.addLens(10,20,10,1.5,20);
		      content.setPlacing(true);
		      try {
		    	    Thread.sleep(1000);                 //dopoki uzytkownik nie moze wstawic następnej
		      } catch(InterruptedException ex) {
		    	    Thread.currentThread().interrupt();
		      }
		      content.addLens(10,20,10,1.5,20);
		      content.setPlacing(true);
		      RayCalculator engine = new RayCalculator(content);
	   }

}
