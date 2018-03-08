package main;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import javax.swing.JSlider;

import net.sourceforge.jFuzzyLogic.FIS;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.EtchedBorder;
import javax.swing.JScrollPane;

public class mainWindow {

	private JFrame frmFuzzyEs;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mainWindow window = new mainWindow();
					window.frmFuzzyEs.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public mainWindow() {
		initialize();
	}

	private String opis(double val) { 
		if (val <=1) return "NE ";
		if ((val > 1)&&(val <=4)) return "SLABO ";
		if ((val > 4)&&(val <=7)) return "PREPORUKA ";
		if (val > 7) return "JAKA PREPORUKA ";
		return "";
	}
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmFuzzyEs = new JFrame();
		frmFuzzyEs.setTitle("Fuzzy ES - Borilacke vestine - Vladimir Urosevic 2017/3730");
		frmFuzzyEs.setBounds(100, 100, 904, 608);
		frmFuzzyEs.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmFuzzyEs.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Kondicija:");
		lblNewLabel.setBounds(10, 93, 103, 14);
		frmFuzzyEs.getContentPane().add(lblNewLabel);
		
		JLabel lblPotrebnaSnaga = new JLabel("Snaga:");
		lblPotrebnaSnaga.setBounds(10, 134, 103, 14);
		frmFuzzyEs.getContentPane().add(lblPotrebnaSnaga);
		
		JLabel lblUdarciRukama = new JLabel("Udarci rukama:");
		lblUdarciRukama.setBounds(10, 175, 103, 14);
		frmFuzzyEs.getContentPane().add(lblUdarciRukama);
		
		JLabel lblUdarciNogama = new JLabel("Udarci nogama:");
		lblUdarciNogama.setBounds(10, 216, 103, 14);
		frmFuzzyEs.getContentPane().add(lblUdarciNogama);
		
		JLabel lblUdarciLaktovima = new JLabel("Udarci laktovima:");
		lblUdarciLaktovima.setBounds(10, 257, 103, 14);
		frmFuzzyEs.getContentPane().add(lblUdarciLaktovima);
		
		JLabel lblUdarciKolenima = new JLabel("Udarci kolenima:");
		lblUdarciKolenima.setBounds(10, 298, 103, 14);
		frmFuzzyEs.getContentPane().add(lblUdarciKolenima);
		
		JLabel lblStarostVezbaca = new JLabel("Starost vezbaca:");
		lblStarostVezbaca.setBounds(10, 339, 103, 14);
		frmFuzzyEs.getContentPane().add(lblStarostVezbaca);
		
		JLabel lblPoluge = new JLabel("Poluge:");
		lblPoluge.setBounds(10, 380, 103, 14);
		frmFuzzyEs.getContentPane().add(lblPoluge);
		
		JLabel lblBacanja = new JLabel("Bacanja:");
		lblBacanja.setBounds(10, 421, 103, 14);
		frmFuzzyEs.getContentPane().add(lblBacanja);
		
		JLabel lblBorbaUParteru = new JLabel("Borba u parteru:");
		lblBorbaUParteru.setBounds(10, 462, 103, 14);
		frmFuzzyEs.getContentPane().add(lblBorbaUParteru);
		
		JLabel lblBorbaSaOruzjem = new JLabel("Sportska takmicenja:");
		lblBorbaSaOruzjem.setBounds(10, 503, 103, 14);
		frmFuzzyEs.getContentPane().add(lblBorbaSaOruzjem);
		
		JLabel lblBorbeSaOruzjem = new JLabel("Borbe sa oruzjem:");
		lblBorbeSaOruzjem.setBounds(10, 544, 103, 14);
		frmFuzzyEs.getContentPane().add(lblBorbeSaOruzjem);
		
		JSlider slKondicija = new JSlider();
		slKondicija.setValue(0);
		slKondicija.setBounds(123, 81, 200, 26);
		frmFuzzyEs.getContentPane().add(slKondicija);
		
		JSlider slSnaga = new JSlider();
		slSnaga.setValue(0);
		slSnaga.setBounds(123, 122, 200, 26);
		frmFuzzyEs.getContentPane().add(slSnaga);
		
		JSlider slRuke = new JSlider();
		slRuke.setValue(0);
		slRuke.setBounds(123, 163, 200, 26);
		frmFuzzyEs.getContentPane().add(slRuke);
		
		JSlider slNoge = new JSlider();
		slNoge.setValue(0);
		slNoge.setBounds(123, 204, 200, 26);
		frmFuzzyEs.getContentPane().add(slNoge);
		
		JSlider slLaktovi = new JSlider();
		slLaktovi.setValue(0);
		slLaktovi.setBounds(123, 245, 200, 26);
		frmFuzzyEs.getContentPane().add(slLaktovi);
		
		JSlider slKolena = new JSlider();
		slKolena.setValue(0);
		slKolena.setBounds(123, 286, 200, 26);
		frmFuzzyEs.getContentPane().add(slKolena);
		
		JSlider slStarost = new JSlider();
		slStarost.setValue(0);
		slStarost.setBounds(123, 327, 200, 26);
		frmFuzzyEs.getContentPane().add(slStarost);
		
		JSlider slPoluge = new JSlider();
		slPoluge.setValue(0);
		slPoluge.setBounds(123, 368, 200, 26);
		frmFuzzyEs.getContentPane().add(slPoluge);
		
		JSlider slBacanja = new JSlider();
		slBacanja.setValue(0);
		slBacanja.setBounds(123, 409, 200, 26);
		frmFuzzyEs.getContentPane().add(slBacanja);
		
		JSlider slParter = new JSlider();
		slParter.setValue(0);
		slParter.setBounds(123, 450, 200, 26);
		frmFuzzyEs.getContentPane().add(slParter);
		
		JSlider slTakmicenja = new JSlider();
		slTakmicenja.setValue(0);
		slTakmicenja.setBounds(123, 491, 200, 26);
		frmFuzzyEs.getContentPane().add(slTakmicenja);
		
		JSlider slOruzje = new JSlider();
		slOruzje.setValue(0);
		slOruzje.setBounds(123, 532, 200, 26);
		frmFuzzyEs.getContentPane().add(slOruzje);
		

		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Vestina");
		model.addColumn("Izlaz");
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(378, 92, 500, 466);
		frmFuzzyEs.getContentPane().add(scrollPane);
		
		table = new JTable(model);
		table.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		scrollPane.setViewportView(table);
		
		JButton btnStart = new JButton("Start");
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				//ES FIS
				
				FIS fis = FIS.load("rules/pravila.fcl");
				
				if (fis == null){
					JOptionPane.showMessageDialog(null, "Greska prilikom ucitavanja pravila.");
					return;
				}		
								
				fis.setVariable("kondicija", slKondicija.getValue()/10);
				fis.setVariable("snaga", slSnaga.getValue()/10);
				fis.setVariable("ruke", slRuke.getValue()/10);
				fis.setVariable("noge", slNoge.getValue()/10);
				fis.setVariable("laktovi", slLaktovi.getValue()/10);
				fis.setVariable("kolena", slKolena.getValue()/10);
				fis.setVariable("starost", slStarost.getValue());		
				fis.setVariable("poluge", slPoluge.getValue()/10);
				fis.setVariable("bacanja", slBacanja.getValue()/10);
				fis.setVariable("parter", slParter.getValue()/10);
				fis.setVariable("sport", slTakmicenja.getValue()/10);
				fis.setVariable("oruzje", slOruzje.getValue()/10);		
				
				fis.evaluate();								
				model.setRowCount(0);			
				model.addRow(new Object[]{"Wing Tsun", opis(fis.getVariable("wing_tsun").defuzzify()) + fis.getVariable("wing_tsun").defuzzify()});
				model.addRow(new Object[]{"Karate", opis(fis.getVariable("karate").defuzzify()) + fis.getVariable("karate").defuzzify()});
				model.addRow(new Object[]{"Tekvondo", opis(fis.getVariable("tekvondo").defuzzify()) + fis.getVariable("tekvondo").defuzzify()});
				model.addRow(new Object[]{"Boks", opis(fis.getVariable("boks").defuzzify()) + fis.getVariable("boks").defuzzify()});
				model.addRow(new Object[]{"Kikboks", opis(fis.getVariable("kikboks").defuzzify()) + fis.getVariable("kikboks").defuzzify()});
				model.addRow(new Object[]{"Tai boks", opis(fis.getVariable("taiboks").defuzzify()) + fis.getVariable("taiboks").defuzzify()});
				model.addRow(new Object[]{"Escrima", opis(fis.getVariable("escrima").defuzzify()) + fis.getVariable("escrima").defuzzify()});
				model.addRow(new Object[]{"Judo", opis(fis.getVariable("judo").defuzzify()) + fis.getVariable("judo").defuzzify()});
				model.addRow(new Object[]{"MMA", opis(fis.getVariable("mma").defuzzify()) + fis.getVariable("mma").defuzzify()});
				model.addRow(new Object[]{"BJJ", opis(fis.getVariable("bjj").defuzzify()) + fis.getVariable("bjj").defuzzify()});
				model.addRow(new Object[]{"Jujutsu", opis(fis.getVariable("jujutsu").defuzzify()) + fis.getVariable("jujutsu").defuzzify()});
				model.addRow(new Object[]{"Aikido", opis(fis.getVariable("aikido").defuzzify()) + fis.getVariable("aikido").defuzzify()});
				model.addRow(new Object[]{"Ninjutsu", opis(fis.getVariable("ninjutsu").defuzzify()) + fis.getVariable("ninjutsu").defuzzify()});
				model.addRow(new Object[]{"Ne trenirati", opis(fis.getVariable("ne_trenirati").defuzzify()) + fis.getVariable("ne_trenirati").defuzzify()});		
				
									
			}
		});
		btnStart.setBounds(789, 58, 89, 23);
		frmFuzzyEs.getContentPane().add(btnStart);
		
		JLabel lblMin = new JLabel("min");
		lblMin.setBounds(118, 52, 28, 14);
		frmFuzzyEs.getContentPane().add(lblMin);
		
		JLabel lblMax = new JLabel("max");
		lblMax.setBounds(313, 52, 28, 14);
		frmFuzzyEs.getContentPane().add(lblMax);
		
		JLabel label = new JLabel(" |");
		label.setBounds(224, 52, 21, 14);
		frmFuzzyEs.getContentPane().add(label);
		
		
		

	}
}
