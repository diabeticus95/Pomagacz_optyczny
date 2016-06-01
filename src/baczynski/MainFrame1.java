package baczynski;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EmptyBorder;


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

public class MainFrame1 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame1 frame = new MainFrame1();
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
	public MainFrame1() {
		
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
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 207, 554, 315);
		panel.add(panel_1);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.CYAN);
		panel_3.setForeground(Color.CYAN);
		panel_3.setBounds(10, 36, 264, 160);
		panel.add(panel_3);
		
		JButton btnDodajSoczewke = new JButton("DODAJ SOCZEWKE");
		panel_3.add(btnDodajSoczewke);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.GREEN);
		panel_4.setBounds(284, 36, 264, 160);
		panel.add(panel_4);
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setBounds(403, 537, 146, 14);
		panel.add(progressBar);
		
		JLabel lblNewLabel = new JLabel("Wyliczanie p\u0142aszczyzn:");
		lblNewLabel.setBounds(284, 531, 109, 20);
		panel.add(lblNewLabel);
		
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
		
		JLabel lblZwierciado = new JLabel("ZWIERCIAD\u0141O");
		lblZwierciado.setHorizontalAlignment(SwingConstants.CENTER);
		lblZwierciado.setBounds(298, 11, 236, 25);
		panel.add(lblZwierciado);
		
		JLabel lblJzyk = new JLabel("J\u0119zyk:");
		lblJzyk.setBounds(570, 16, 55, 20);
		panel.add(lblJzyk);
		
		JCheckBox chckbxPolski = new JCheckBox("Polski");
		chckbxPolski.setBounds(620, 15, 72, 23);
		panel.add(chckbxPolski);
		
		JCheckBox chckbxEnglish = new JCheckBox("English");
		chckbxEnglish.setBounds(691, 15, 72, 23);
		panel.add(chckbxEnglish);
		
		JLabel lblSymulacja = new JLabel("Symulacja:");
		lblSymulacja.setBounds(586, 137, 197, 25);
		panel.add(lblSymulacja);
		
		JCheckBox chckbxCigaSymulacja = new JCheckBox("Ci\u0105g\u0142a symulacja");
		chckbxCigaSymulacja.setBounds(666, 138, 117, 23);
		panel.add(chckbxCigaSymulacja);
		
		JButton btnWyliczWizk = new JButton("Wylicz wi\u0105zk\u0119");
		btnWyliczWizk.setBounds(620, 173, 117, 23);
		panel.add(btnWyliczWizk);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 207, 554, 315);
		panel.add(scrollPane);
		
		JLabel lblOgraniczenieUkdu = new JLabel("Ograniczenie uk\u0142adu :");
		lblOgraniczenieUkdu.setBounds(650, 263, 113, 36);
		panel.add(lblOgraniczenieUkdu);
		
		JRadioButton rdbtnZaznaczObszarWasnorcznie = new JRadioButton("Zaznacz obszar w\u0142asnor\u0119cznie");
		rdbtnZaznaczObszarWasnorcznie.setBounds(620, 294, 184, 23);
		panel.add(rdbtnZaznaczObszarWasnorcznie);
		
		JLabel lblZ = new JLabel("Z_1=");
		lblZ.setBounds(591, 327, 34, 14);
		panel.add(lblZ);
		
		textField = new JTextField();
		textField.setBounds(620, 324, 62, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblZ_1 = new JLabel("Z_2=");
		lblZ_1.setBounds(703, 327, 34, 14);
		panel.add(lblZ_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(730, 324, 62, 20);
		panel.add(textField_1);
		
		JLabel lblParametryZastpczeWejcia = new JLabel("Parametry zast\u0119pcze wej\u015Bcia i wyj\u015Bcia");
		lblParametryZastpczeWejcia.setBounds(586, 387, 184, 36);
		panel.add(lblParametryZastpczeWejcia);
		
		JLabel label = new JLabel("Z_1=");
		label.setBounds(580, 423, 34, 14);
		panel.add(label);
		
		JLabel label_1 = new JLabel("...");
		label_1.setBounds(609, 423, 83, 14);
		panel.add(label_1);
		
		JLabel lblZ_2 = new JLabel("Z_2=");
		lblZ_2.setBounds(703, 423, 34, 14);
		panel.add(lblZ_2);
		
		JLabel label_3 = new JLabel("...");
		label_3.setBounds(729, 423, 63, 14);
		panel.add(label_3);
		
		JLabel lblF = new JLabel("f = ");
		lblF.setBounds(650, 456, 34, 14);
		panel.add(lblF);
		
		JLabel label_4 = new JLabel("...");
		label_4.setBounds(666, 456, 63, 14);
		panel.add(label_4);
		
		
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
