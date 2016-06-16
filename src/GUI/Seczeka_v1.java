package GUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import kowalski.Element;
import kowalski.PomagaczOptycznyPanel;

public class Seczeka_v1 extends JFrame {

double r1, r2, d, n, h,D1, Dc1, D2, Dc2, f, D,h1, h2,z,n_otoczenia;

JButton zatwierdz = new JButton("DODAJ Soczewke");
	
	JTextField Rr1=new JTextField(10);
	JTextField Rr2=new JTextField(10);
	JTextField Hh1=new JTextField(10);
	JTextField Dd1=new JTextField(10);
	JTextField Nn1=new JTextField(10);
	JTextField noto=new JTextField(10);
	private JPanel contentPane;
	
	MAIN_v1 oknogl=new MAIN_v1();
	static Seczeka_v1 frame = new Seczeka_v1();
	//PomagaczOptycznyPanel panelsoczo = new PomagaczOptycznyPanel();

	
	public Seczeka_v1() {
		setResizable(false);
		this.setSize(new Dimension(680, 500));
		this.setTitle("Dodawanie soczewki");
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		JLabel poletekstowe2 = new JLabel("SOCZEWKA");
		
		getContentPane().setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panel00=new JPanel();
		//	panel00.setBackground(Color.GRAY);
			panel00.setMinimumSize(new Dimension(640,480));
			getContentPane().add(panel00);
			panel00.setLayout(new BoxLayout(panel00, BoxLayout.X_AXIS));
			
			
			JPanel panel01=new JPanel();
			panel00.add(panel01);
			
					
					
//Label	R1	
					final JLabel radioR1=new JLabel("  R_1 = ");
					radioR1.setHorizontalAlignment(SwingConstants.CENTER);
					radioR1.setBackground(Color.RED);
					panel01.add(radioR1);
					
					panel01.add(Rr1);
					
					JLabel lblW = new JLabel("W ");
					lblW.setHorizontalAlignment(SwingConstants.RIGHT);
					panel01.add(lblW);
					
//Label	R2	
					final JLabel radioR2=new JLabel("R_2 = ");
					radioR2.setHorizontalAlignment(SwingConstants.CENTER);
					panel01.add(radioR2);
					
	
					//final JTextField Rr2=new JTextField(20);
					panel01.add(Rr2);
					
					JLabel lblY = new JLabel("Y  ");
					lblY.setHorizontalAlignment(SwingConstants.RIGHT);
					panel01.add(lblY);
					
//Label	N
					final JLabel radioN=new JLabel("n = ");
					radioN.setHorizontalAlignment(SwingConstants.CENTER);
					panel01.add(radioN);
					
					
					//final JTextField Nn1=new JTextField(20);
					panel01.add(Nn1);
					
					JLabel lblN = new JLabel("N  ");
					lblN.setHorizontalAlignment(SwingConstants.RIGHT);
					panel01.add(lblN);
					
//Label	H
					final JLabel radioH=new JLabel("h = ");
					radioH.setHorizontalAlignment(SwingConstants.CENTER);
					panel01.add(radioH);
					
					
					//final JTextField Hh1=new JTextField(20);
					panel01.add(Hh1);
					
					JLabel lblI = new JLabel("I  ");
					lblI.setHorizontalAlignment(SwingConstants.RIGHT);
					panel01.add(lblI);
					
//Label	D
					final JLabel radioD=new JLabel("d = ");
					radioD.setHorizontalAlignment(SwingConstants.CENTER);
					panel01.add(radioD);
					
					
					//final JTextField Dd1=new JTextField(20);
					panel01.add(Dd1);
					
					JLabel lblK = new JLabel("K  ");
					lblK.setHorizontalAlignment(SwingConstants.RIGHT);
					panel01.add(lblK);
		//n-otocz		
					final JLabel radioNOTO=new JLabel("n_otoczenia = ");
					radioNOTO.setHorizontalAlignment(SwingConstants.CENTER);
					panel01.add(radioNOTO);
							
							
		//final JTextField noto=new JTextField(20);
				panel01.add(noto);
				
				JLabel lblI_1 = new JLabel("I  ");
				lblI_1.setHorizontalAlignment(SwingConstants.RIGHT);
				panel01.add(lblI_1);
				
				JLabel lblOpcje = new JLabel("OPCJE ->");
				lblOpcje.setHorizontalAlignment(SwingConstants.RIGHT);
				panel01.add(lblOpcje);
				
				JPanel panel02=new JPanel();
				panel02.setBackground(Color.YELLOW);
				panel02.setMinimumSize(new Dimension(160,160));
				panel00.add(panel02);
				panel01.setLayout(new GridLayout(0, 3, 0, 0));
				panel02.setLayout(new GridLayout(0, 2, 0, 0));
				//Label	D1
						final JLabel radioD1=new JLabel("D_1 = ");
						radioD1.setHorizontalAlignment(SwingConstants.CENTER);
						panel02.add(radioD1);
						final JLabel radioD1_oblicz=new JLabel(""+D1);
						panel02.add(radioD1_oblicz);
						
//Label	D2
						final JLabel radioD2=new JLabel("D_2 = ");
						radioD2.setHorizontalAlignment(SwingConstants.CENTER);
						panel02.add(radioD2);
						final JLabel radioD2_oblicz=new JLabel(""+D2);
						panel02.add(radioD2_oblicz);
						
//Label	Dc1
						final JLabel radioDc1=new JLabel("Dc_1 = ");
						radioDc1.setHorizontalAlignment(SwingConstants.CENTER);
						panel02.add(radioDc1);
						final JLabel radioDc1_oblicz=new JLabel(""+Dc1);
						panel02.add(radioDc1_oblicz);
						
//Label	Dc2
						final JLabel radioDc2=new JLabel("Dc_2 = ");
						radioDc2.setHorizontalAlignment(SwingConstants.CENTER);
						panel02.add(radioDc2);
						final JLabel radioDc2_oblicz=new JLabel(""+Dc2);
						panel02.add(radioDc2_oblicz);
						
//Label	Dall
						final JLabel radioDall=new JLabel("D (og�lne) = ");
						radioDall.setHorizontalAlignment(SwingConstants.CENTER);
						panel02.add(radioDall);
						final JLabel radioDall_oblicz=new JLabel(""+D);
						panel02.add(radioDall_oblicz);
						
//Label	F
						final JLabel radiof=new JLabel("f = ");
						radiof.setHorizontalAlignment(SwingConstants.CENTER);
						panel02.add(radiof);
						final JLabel radiof_oblicz=new JLabel(""+f);
						panel02.add(radiof_oblicz);
						
//Label	h1
						final JLabel radioh1=new JLabel("H_1 = ");
						radioh1.setHorizontalAlignment(SwingConstants.CENTER);
						panel02.add(radioh1);
						final JLabel radioh1_oblicz=new JLabel(""+h1);
						panel02.add(radioh1_oblicz);
						
//Label	h2
						final JLabel radioh2=new JLabel("H_2 = ");
						radioh2.setHorizontalAlignment(SwingConstants.CENTER);
						panel02.add(radioh2);
						final JLabel radioh2_oblicz=new JLabel(""+h2);
						panel02.add(radioh2_oblicz);
						
						
	//OBLICZ
						
						JButton oblicz=new JButton("OBLICZ");
						panel01.add(oblicz);
						
						
						
						panel01.add(zatwierdz);
		
						

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
								
								radioD1_oblicz.setText(""+D1);
								radioD2_oblicz.setText(""+D2);
								radioDc1_oblicz.setText(""+Dc1);
								radioDc2_oblicz.setText(""+Dc2);
								radioDall_oblicz.setText(""+D);
								radiof_oblicz.setText(""+f);
								
								radioh1_oblicz.setText(""+h1);
								radioh2_oblicz.setText(""+h2);
							/*	
								System.out.println(r1);
								System.out.println(r2);
								System.out.println(n);
								System.out.println(h);
								System.out.println(d);
								System.out.println(n_otoczenia);
								
								
						    	D1 = (n-n_otoczenia)/r1;
								D2 = (1-n)/r2;
								Dc1 = D1/(1-((d*D1)/n))+D2;
								Dc2 = D2/(1-((d*D2)/n))+D1;
								D = D1+D2-((d*D1*D2)/n);
								f = n_otoczenia/D;
								h1 = -(f*(n-1)*d)/(n*r1);
								h2 = -(f*(n-1)*d)/(n*r2);
								
								System.out.println(D1);
								System.out.println(D2);
								System.out.println(Dc1);
								System.out.println(Dc2);
								System.out.println(D);
								System.out.println(f);
								System.out.println(h1);
								System.out.println(h2);
								
								
								
								radioD1_oblicz.setText(""+D1);
								radioD2_oblicz.setText(""+D2);
								radioDc1_oblicz.setText(""+Dc1);
								radioDc2_oblicz.setText(""+Dc2);
								radioDall_oblicz.setText(""+D);
								radiof_oblicz.setText(""+f);
								
								radioh1_oblicz.setText(""+h1);
								radioh2_oblicz.setText(""+h2);
								*/
						    	
						    	
			    	 
						    }
						};
		oblicz.addActionListener(obli);
		
		
		zatwierdz.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
						
				/*r1=Double.parseDouble(Rr1.getText());
				r2=Double.parseDouble(Rr2.getText());
				n=Double.parseDouble(Nn1.getText());
				h=Double.parseDouble(Hh1.getText());
				d=Double.parseDouble(Dd1.getText());
				n_otoczenia=Double.parseDouble(noto.getText());
				
				oknogl.panelsoczo.addLens(r1,r2,d,n,h,n_otoczenia);
				oknogl.panelsoczo.setplacingLens(true);
				*/
				Rr1.setText("");
				Rr2.setText("");
				Nn1.setText("");
				Hh1.setText("");
				Dd1.setText("");
				noto.setText("");
				
				//dispose();
				
				
			}
		});
			
		
	}



	
	
	public static void main(String[] args) {
		frame.setVisible(false);
		
	}}
