package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Point;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EmptyBorder;

import kowalski.Element;
import kowalski.PomagaczOptycznyPanel;
import kowalski.RayCalculator;
import kowalski.Soczewka;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;

import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JSplitPane;
import javax.swing.KeyStroke;
import javax.swing.JProgressBar;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class MAIN_v1 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	static Seczeka_v1 oknosocz=new Seczeka_v1();
	final PomagaczOptycznyPanel panelsoczo = new PomagaczOptycznyPanel();
	RayCalculator engine = new RayCalculator(panelsoczo);
	
	
	/**
	 * Launch the application.
	 */
	
public static void main(String[] args) {
	final MAIN_v1 oknogl=new MAIN_v1();
	
		oknogl.setVisible(true);
		oknosocz.setVisible(false);
		oknosocz.zatwierdz.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				oknosocz.r1=Double.parseDouble(oknosocz.Rr1.getText());
				oknosocz.r2=Double.parseDouble(oknosocz.Rr2.getText());
				oknosocz.n=Double.parseDouble(oknosocz.Nn1.getText());
				oknosocz.h=Double.parseDouble(oknosocz.Hh1.getText());
				oknosocz.d=Double.parseDouble(oknosocz.Dd1.getText());
				oknosocz.n_otoczenia=Double.parseDouble(oknosocz.noto.getText());
				
				oknogl.panelsoczo.addLens(oknosocz.r1,oknosocz.r2,oknosocz.d,oknosocz.n,oknosocz.h,oknosocz.n_otoczenia);
				oknogl.panelsoczo.setplacingLens(true);			
				oknosocz.setVisible(false);
				
			}
		}); 
	}

	/**
	 * Create the frame.
	 */
	
	public MAIN_v1() {
		
		super("Pomagacz Optyczny - Zast�pcze parametry uk�adu");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 819, 621);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.X_AXIS));
		
		JPanel panel = new JPanel();
		contentPane.add(panel);
		panel.setLayout(null);
		
		
		panelsoczo.setBounds(10, 207, 773, 315);
		panel.add(panelsoczo);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.CYAN);
		panel_3.setForeground(Color.CYAN);
		panel_3.setBounds(10, 36, 264, 160);
		panel.add(panel_3);
		
		JButton btnDodajSoczewke = new JButton("DODAJ SOCZEWKE");
		btnDodajSoczewke.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				oknosocz.setVisible(true);
			}
		});
		panel_3.add(btnDodajSoczewke);
		
		JLabel lblNewLabel_1 = new JLabel("X =");
		lblNewLabel_1.setBounds(20, 533, 34, 20);
		panel.add(lblNewLabel_1);
		
		JLabel lblxxx = new JLabel(".XXX.");
		lblxxx.setBounds(50, 533, 72, 20);
		panel.add(lblxxx);
		
		JLabel lblY = new JLabel("Y =");
		lblY.setBounds(132, 533, 34, 20);
		panel.add(lblY);
		
		JLabel lblyyy = new JLabel(".YYY.");
		lblyyy.setBounds(158, 533, 72, 20);
		panel.add(lblyyy);
		
		JLabel lblSoczewka = new JLabel("SOCZEWKA");
		lblSoczewka.setBackground(Color.BLUE);
		lblSoczewka.setHorizontalAlignment(SwingConstants.CENTER);
		lblSoczewka.setBounds(20, 11, 236, 25);
		panel.add(lblSoczewka);
		
		JLabel lblJzyk = new JLabel("Jezyk:");
		lblJzyk.setBounds(379, 13, 55, 20);
		panel.add(lblJzyk);
		
		JCheckBox chckbxPolski = new JCheckBox("Polski");
		chckbxPolski.setBounds(306, 36, 72, 23);
		panel.add(chckbxPolski);
		
		JCheckBox chckbxEnglish = new JCheckBox("English");
		chckbxEnglish.setBounds(426, 36, 72, 23);
		panel.add(chckbxEnglish);
		
		
		
		JLabel lblSymulacja = new JLabel("Symulacja:");
		lblSymulacja.setBounds(306, 110, 197, 25);
		panel.add(lblSymulacja);
		
		JCheckBox chckbxCigaSymulacja = new JCheckBox("Ciagla symulacja");
		chckbxCigaSymulacja.setBounds(379, 111, 146, 23);
		panel.add(chckbxCigaSymulacja);
		
		
		
		JButton btnWyliczWizk = new JButton("Wylicz wiazke");
		btnWyliczWizk.setBounds(348, 155, 117, 23);
		btnWyliczWizk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				engine.simulate();
			    engine.paintRay(panelsoczo);
			}
		});
		panel.add(btnWyliczWizk);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 207, 554, 315);
		panel.add(scrollPane);
		
		JLabel lblOgraniczenieUkdu = new JLabel("Ograniczenie ukladu :");
		lblOgraniczenieUkdu.setBounds(586, 11, 197, 36);
		panel.add(lblOgraniczenieUkdu);
		
		JRadioButton rdbtnZaznaczObszarWasnorcznie = new JRadioButton("Zaznacz obszar wlasnorecznie");
		rdbtnZaznaczObszarWasnorcznie.setBounds(561, 46, 211, 23);
		panel.add(rdbtnZaznaczObszarWasnorcznie);
		
		JLabel lblZ = new JLabel("Z_1=");
		lblZ.setBounds(571, 78, 34, 14);
		panel.add(lblZ);
		
		textField = new JTextField();
		textField.setBounds(605, 75, 62, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblZ_1 = new JLabel("Z_2=");
		lblZ_1.setBounds(679, 78, 34, 14);
		panel.add(lblZ_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(715, 75, 62, 20);
		panel.add(textField_1);
		
		JLabel lblParametryZastpczeWejcia = new JLabel("Parametry zastepcze wejscia i wyjscia:");
		lblParametryZastpczeWejcia.setBounds(553, 110, 230, 36);
		panel.add(lblParametryZastpczeWejcia);
		
		JLabel label = new JLabel("Z_1=");
		label.setBounds(542, 144, 34, 14);
		panel.add(label);
		
		JLabel label_1 = new JLabel("...");
		label_1.setBounds(575, 144, 79, 14);
		panel.add(label_1);
		
		JLabel lblZ_2 = new JLabel("Z_2=");
		lblZ_2.setBounds(654, 144, 34, 14);
		panel.add(lblZ_2);
		
		JLabel label_3 = new JLabel("...");
		label_3.setBounds(688, 144, 73, 14);
		panel.add(label_3);
		
		JLabel lblF = new JLabel("f = ");
		lblF.setBounds(605, 171, 34, 14);
		panel.add(lblF);
		
		JLabel label_4 = new JLabel("...");
		label_4.setBounds(628, 171, 63, 14);
		panel.add(label_4);
		
		JButton btnWyczyscPanel = new JButton("Wyczysc Panel");
		btnWyczyscPanel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panelsoczo.erasePanel();
				engine.update(panelsoczo.getelementList(), panelsoczo.getStartingPoint());
				engine.clearKeyPoints();
				panelsoczo.resetWhichOne();
				//z jakiegos powodu po resecie startingPoint = panelHeight
			}
		});
		btnWyczyscPanel.setBounds(310, 524, 162, 33);
		panel.add(btnWyczyscPanel);
		
		
//Menu-pasek		
		JMenuBar pasek = new JMenuBar();
//dodanie do paska 
		JMenu koniec = new JMenu("Menu G��wne");
		pasek.add(koniec);
		
		JMenu second = new JMenu("Widok");
		pasek.add(second);
		
		JMenu third = new JMenu("Pomoc");
		pasek.add(third);
		
//Podmenu		
		JMenu submenu = new JMenu("Podmenu");
		//submenu.setMnemonic(KeyEvent.VK_S);
		koniec.add(submenu);
		
		setJMenuBar(pasek);
		
		
		
//separator		
		koniec.addSeparator();

//Koniec- opcja menu		
		JMenuItem koniec1 = new JMenuItem("Koniec");
		koniec1.setMnemonic(KeyEvent.VK_S);
		koniec1.setAccelerator(KeyStroke.getKeyStroke(
		        KeyEvent.VK_2, ActionEvent.ALT_MASK));
		koniec.add(koniec1);
		ActionListener kon = new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		    	dispose();
		    }
		};
		koniec1.addActionListener(kon);
		
		
//pomoc--		
		JMenuItem menuItempomoc = new JMenuItem("Pomoc");
		JMenuItem menuItemonas = new JMenuItem("O nas");
		third.add(menuItempomoc);
		third.add(menuItemonas);
			
//jezyk		
		JMenu menu2 = new JMenu("J�zyk/Language");
		submenu.add(menu2); 
		
//Jezyki		
		JMenuItem menuItem3 = new JMenuItem("Polski");
		JMenuItem menuItem7 = new JMenuItem("English");
		menu2.add(menuItem3);
		menu2.add(menuItem7);
		
		
//Res		
		JMenuItem menu4 = new JMenu("Rozdzielczo��/Res");
		second.add(menu4);
		JMenuItem menuItem4 = new JMenuItem("Minimalne okno");
		JMenuItem menuItem5 = new JMenuItem("Maksymalne okno");
		menu4.add(menuItem4);
		menu4.add(menuItem5);
		
		ActionListener mini = new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		    	setSize(680,480);
		    }
		};
		menuItem4.addActionListener(mini);
		
		ActionListener maksi = new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		    	setSize(1280,720);
		    }
		};
		menuItem5.addActionListener(maksi);
		
//Game Over- koniec programu		
		JMenuItem menuItem2 = new JMenuItem("Koniec/Game Over");
		submenu.add(menuItem2);
		
		ActionListener mi2 = new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		    	dispose();
		    }
		};
		menuItem2.addActionListener(mi2);
	
	}
}

	


