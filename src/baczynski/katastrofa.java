package baczynski;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import java.awt.GridLayout;
import javax.swing.BoxLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;

public class katastrofa extends JFrame {
double r1, r2, d, n, h,D, Dc1, D2, Dc2, D1, f, h1, h2,z,n_otoczenia;
	
	JTextField Rr1=new JTextField(10);
	JTextField Rr2=new JTextField(10);
	JTextField Hh1=new JTextField(10);
	JTextField Dd1=new JTextField(10);
	JTextField Nn1=new JTextField(10);
	JTextField noto=new JTextField(10);
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					katastrofa frame = new katastrofa();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public katastrofa() {
		super("Dodawanie soczewki");
		setSize(676,533);
		this.setMinimumSize(new Dimension(660, 500));
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{660, 0};
		gridBagLayout.rowHeights = new int[]{494, 0};
		gridBagLayout.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		getContentPane().setLayout(gridBagLayout);
		
		JLabel poletekstowe2 = new JLabel("SOCZEWKA");
		
		
		
		/*r1=Double.parseDouble(Rr1.getText());
		r2=Double.parseDouble(Rr2.getText());
		n=Double.parseDouble(Nn1.getText());
		h=Double.parseDouble(Hh1.getText());
		d=Double.parseDouble(Dd1.getText());
		n_otoczenia=Double.parseDouble(noto.getText());*/
		
		ActionListener obli = new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {

		    	r1=Double.parseDouble(Rr1.getText());
				r2=Double.parseDouble(Rr2.getText());
				n=Double.parseDouble(Nn1.getText());
				h=Double.parseDouble(Hh1.getText());
				d=Double.parseDouble(Dd1.getText());
				n_otoczenia=Double.parseDouble(noto.getText());
		    	
		    	D1 = (n-n_otoczenia)/r1;
				D2 = (1-n)/r2;
				Dc1 = D1/(1-((d*D1)/n))+D2;
				Dc2 = D2/(1-((d*D2)/n))+D1;
				D = D1+D2-((d*D1*D2)/n);
				f = n_otoczenia/D;
				h1 = -(f*(n-1)*d)/(n*r1);
				h2 = -(f*(n-1)*d)/(n*r2);
		    }
		};
		
	//Partia licz�ca	
/*		D1 = (n-n_otoczenia)/r1;
		D2 = (1-n)/r2;
		Dc1 = D1/(1-((d*D1)/n))+D2;
		Dc2 = D2/(1-((d*D2)/n))+D1;
		D = D1+D2-((d*D1*D2)/n);
		f = n_otoczenia/D;
		h1 = -(f*(n-1)*d)/(n*r1);
		h2 = -(f*(n-1)*d)/(n*r2);
		*/
		
		JPanel panel00=new JPanel();
		//	panel00.setBackground(Color.GRAY);
			panel00.setMinimumSize(new Dimension(640,480));
			GridBagConstraints gbc_panel00 = new GridBagConstraints();
			gbc_panel00.gridx = 0;
			gbc_panel00.gridy = 0;
			getContentPane().add(panel00, gbc_panel00);
			panel00.setLayout(new BoxLayout(panel00, BoxLayout.X_AXIS));
			
			JPanel panelrys=new JPanel();
			panelrys.setBackground(Color.RED);
			panelrys.setMinimumSize(new Dimension(320,480));
			panel00.add(panelrys);
			//	panel01.setBackground(Color.GREEN);
				panelrys.setMinimumSize(new Dimension(320,320));
				
				
				JPanel panel01=new JPanel();
				panel00.add(panel01);
				
				JLabel label_8 = new JLabel("");
				panel00.add(label_8);
				
				JLabel label_9 = new JLabel("");
				panel00.add(label_9);
				
				JLabel label_10 = new JLabel("");
				panel00.add(label_10);
				
				JPanel panel02=new JPanel();
				panel02.setBackground(Color.YELLOW);
				panel02.setMinimumSize(new Dimension(160,160));
				panel00.add(panel02);
				panel01.setLayout(new GridLayout(0, 3, 0, 0));
				
				
//Label	R1	
				final JLabel radioR1=new JLabel("R_1 = ");
				panel01.add(radioR1);
				
	
				//final JTextField Rr1=new JTextField(20);
				panel01.add(Rr1);
				
				JLabel label = new JLabel("");
				panel01.add(label);
				
//Label	R2	
				final JLabel radioR2=new JLabel("R_2 = ");
				panel01.add(radioR2);
				
	
				//final JTextField Rr2=new JTextField(20);
				panel01.add(Rr2);
				
				JLabel label_1 = new JLabel("");
				panel01.add(label_1);
				
//Label	N
				final JLabel radioN=new JLabel("f = ");
				panel01.add(radioN);
				
				
				//final JTextField Nn1=new JTextField(20);
				panel01.add(Nn1);
				
				JLabel label_2 = new JLabel("");
				panel01.add(label_2);
				
//Label	H
				final JLabel radioH=new JLabel("h = ");
				panel01.add(radioH);
				
				
				//final JTextField Hh1=new JTextField(20);
				panel01.add(Hh1);
				
				JLabel label_3 = new JLabel("");
				panel01.add(label_3);
				
//Label	D
				final JLabel radioD=new JLabel("d = ");
				panel01.add(radioD);
				
				
				//final JTextField Dd1=new JTextField(20);
				panel01.add(Dd1);
				
				JLabel label_4 = new JLabel("");
				panel01.add(label_4);
				//n-otocz		
						final JLabel radioNOTO=new JLabel("n_otoczenia = ");
						panel01.add(radioNOTO);
						
						
						//final JTextField noto=new JTextField(20);
						panel01.add(noto);
						
						JLabel label_5 = new JLabel("");
						panel01.add(label_5);
						
						JLabel label_6 = new JLabel("");
						panel01.add(label_6);
						//OBLICZ
		JButton oblicz=new JButton("OBLICZ");
		panel01.add(oblicz);
		
		JLabel label_7 = new JLabel("");
		panel01.add(label_7);
		oblicz.addActionListener(obli);
		panel02.setLayout(new GridLayout(0, 2, 0, 0));
		
//Label	D1
		final JLabel radioD1=new JLabel("D_1 = ");
		panel02.add(radioD1);
		final JLabel radioD1_oblicz=new JLabel(""+D1);
		panel02.add(radioD1_oblicz);
		
//Label	D2
		final JLabel radioD2=new JLabel("D_2 = ");
		panel02.add(radioD2);
		final JLabel radioD2_oblicz=new JLabel(""+D2);
		panel02.add(radioD2_oblicz);
		
//Label	Dc1
		final JLabel radioDc1=new JLabel("Dc_1 = ");
		panel02.add(radioDc1);
		final JLabel radioDc1_oblicz=new JLabel(""+Dc1);
		panel02.add(radioDc1_oblicz);
		
//Label	Dc2
		final JLabel radioDc2=new JLabel("Dc_2 = ");
		panel02.add(radioDc2);
		final JLabel radioDc2_oblicz=new JLabel(""+Dc2);
		panel02.add(radioDc2_oblicz);
		
//Label	Dall
		final JLabel radioDall=new JLabel("D (og�lne) = ");
		panel02.add(radioDall);
		final JLabel radioDall_oblicz=new JLabel(""+D);
		panel02.add(radioDall_oblicz);
		
//Label	F
		final JLabel radiof=new JLabel("f = ");
		panel02.add(radiof);
		final JLabel radiof_oblicz=new JLabel(""+f);
		panel02.add(radiof_oblicz);
		
//Label	h1
		final JLabel radioh1=new JLabel("H_1 = ");
		panel02.add(radioh1);
		final JLabel radioh1_oblicz=new JLabel(""+h1);
		panel02.add(radioh1_oblicz);
		
//Label	h2
		final JLabel radioh2=new JLabel("H_2 = ");
		panel02.add(radioh2);
		final JLabel radioh2_oblicz=new JLabel(""+h2);
		panel02.add(radioh2_oblicz);
		
	}

}
