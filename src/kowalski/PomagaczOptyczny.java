package kowalski;

import javax.swing.JFrame;

public class PomagaczOptyczny extends JFrame{
	protected static float n_otoczenia = 1;
	
	   public static void main(String[] args) {
		      JFrame window = new JFrame("Pomagacz Optyczny");
		      PomagaczOptycznyPanel content = new PomagaczOptycznyPanel();
		      window.setDefaultCloseOperation(PomagaczOptyczny.DISPOSE_ON_CLOSE );
		      window.setContentPane(content);
		      window.setSize(600,480);
		      window.setLocation(100,100);
		      window.setVisible(true);		      
	   }

}
