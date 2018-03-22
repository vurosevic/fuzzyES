package main;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import javax.swing.JSlider;

import net.sourceforge.jFuzzyLogic.FIS;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.EtchedBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import java.awt.Toolkit;

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
	 * 
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmFuzzyEs = new JFrame();
		frmFuzzyEs.setAlwaysOnTop(true);
		frmFuzzyEs.setIconImage(Toolkit.getDefaultToolkit().getImage(mainWindow.class.getResource("/javax/swing/plaf/metal/icons/ocean/computer.gif")));
		frmFuzzyEs.setResizable(false);
		frmFuzzyEs.setTitle("Fuzzy ES - Borilacke vestine - Vladimir Urosevic 2017/3730");
		frmFuzzyEs.setBounds(100, 100, 904, 654);
		frmFuzzyEs.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmFuzzyEs.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Kondicija:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setBounds(10, 22, 103, 14);
		frmFuzzyEs.getContentPane().add(lblNewLabel);
		
		JLabel lblPotrebnaSnaga = new JLabel("Snaga:");
		lblPotrebnaSnaga.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPotrebnaSnaga.setBounds(10, 72, 103, 14);
		frmFuzzyEs.getContentPane().add(lblPotrebnaSnaga);
		
		JLabel lblUdarciRukama = new JLabel("Udarci rukama:");
		lblUdarciRukama.setHorizontalAlignment(SwingConstants.RIGHT);
		lblUdarciRukama.setBounds(10, 122, 103, 14);
		frmFuzzyEs.getContentPane().add(lblUdarciRukama);
		
		JLabel lblUdarciNogama = new JLabel("Udarci nogama:");
		lblUdarciNogama.setHorizontalAlignment(SwingConstants.RIGHT);
		lblUdarciNogama.setBounds(10, 172, 103, 14);
		frmFuzzyEs.getContentPane().add(lblUdarciNogama);
		
		JLabel lblUdarciLaktovima = new JLabel("Udarci laktovima:");
		lblUdarciLaktovima.setHorizontalAlignment(SwingConstants.RIGHT);
		lblUdarciLaktovima.setBounds(10, 222, 103, 14);
		frmFuzzyEs.getContentPane().add(lblUdarciLaktovima);
		
		JLabel lblUdarciKolenima = new JLabel("Udarci kolenima:");
		lblUdarciKolenima.setHorizontalAlignment(SwingConstants.RIGHT);
		lblUdarciKolenima.setBounds(10, 272, 103, 14);
		frmFuzzyEs.getContentPane().add(lblUdarciKolenima);
		
		JLabel lblStarostVezbaca = new JLabel("Starost vezbaca:");
		lblStarostVezbaca.setHorizontalAlignment(SwingConstants.RIGHT);
		lblStarostVezbaca.setBounds(10, 322, 103, 14);
		frmFuzzyEs.getContentPane().add(lblStarostVezbaca);
		
		JLabel lblPoluge = new JLabel("Poluge:");
		lblPoluge.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPoluge.setBounds(10, 372, 103, 14);
		frmFuzzyEs.getContentPane().add(lblPoluge);
		
		JLabel lblBacanja = new JLabel("Bacanja:");
		lblBacanja.setHorizontalAlignment(SwingConstants.RIGHT);
		lblBacanja.setBounds(10, 422, 103, 14);
		frmFuzzyEs.getContentPane().add(lblBacanja);
		
		JLabel lblBorbaUParteru = new JLabel("Borba u parteru:");
		lblBorbaUParteru.setHorizontalAlignment(SwingConstants.RIGHT);
		lblBorbaUParteru.setBounds(10, 472, 103, 14);
		frmFuzzyEs.getContentPane().add(lblBorbaUParteru);
		
		JLabel lblBorbaSaOruzjem = new JLabel("Sportska takmicenja:");
		lblBorbaSaOruzjem.setHorizontalAlignment(SwingConstants.RIGHT);
		lblBorbaSaOruzjem.setBounds(10, 522, 103, 14);
		frmFuzzyEs.getContentPane().add(lblBorbaSaOruzjem);
		
		JLabel lblBorbeSaOruzjem = new JLabel("Borbe sa oruzjem:");
		lblBorbeSaOruzjem.setHorizontalAlignment(SwingConstants.RIGHT);
		lblBorbeSaOruzjem.setBounds(10, 572, 103, 14);
		frmFuzzyEs.getContentPane().add(lblBorbeSaOruzjem);
		
		JSlider slKondicija = new JSlider();
		slKondicija.setMinorTickSpacing(5);
		slKondicija.setPaintLabels(true);
		slKondicija.setPaintTicks(true);
		slKondicija.setMajorTickSpacing(10);
		slKondicija.setValue(0);
		slKondicija.setBounds(123, 10, 245, 40);
		frmFuzzyEs.getContentPane().add(slKondicija);
		
		JSlider slSnaga = new JSlider();
		slSnaga.setMinorTickSpacing(5);
		slSnaga.setPaintLabels(true);
		slSnaga.setMajorTickSpacing(10);
		slSnaga.setPaintTicks(true);
		slSnaga.setValue(0);
		slSnaga.setBounds(123, 60, 245, 40);
		frmFuzzyEs.getContentPane().add(slSnaga);
		
		JSlider slRuke = new JSlider();
		slRuke.setMinorTickSpacing(5);
		slRuke.setPaintTicks(true);
		slRuke.setPaintLabels(true);
		slRuke.setMajorTickSpacing(10);
		slRuke.setValue(0);
		slRuke.setBounds(123, 110, 245, 40);
		frmFuzzyEs.getContentPane().add(slRuke);
		
		JSlider slNoge = new JSlider();
		slNoge.setMinorTickSpacing(5);
		slNoge.setMajorTickSpacing(10);
		slNoge.setPaintLabels(true);
		slNoge.setPaintTicks(true);
		slNoge.setValue(0);
		slNoge.setBounds(123, 160, 245, 40);
		frmFuzzyEs.getContentPane().add(slNoge);
		
		JSlider slLaktovi = new JSlider();
		slLaktovi.setMinorTickSpacing(5);
		slLaktovi.setMajorTickSpacing(10);
		slLaktovi.setPaintTicks(true);
		slLaktovi.setPaintLabels(true);
		slLaktovi.setValue(0);
		slLaktovi.setBounds(123, 210, 245, 40);
		frmFuzzyEs.getContentPane().add(slLaktovi);
		
		JSlider slKolena = new JSlider();
		slKolena.setMinorTickSpacing(5);
		slKolena.setMajorTickSpacing(10);
		slKolena.setPaintTicks(true);
		slKolena.setPaintLabels(true);
		slKolena.setValue(0);
		slKolena.setBounds(123, 260, 245, 40);
		frmFuzzyEs.getContentPane().add(slKolena);
		
		JSlider slStarost = new JSlider();
		slStarost.setMinorTickSpacing(5);
		slStarost.setMajorTickSpacing(10);
		slStarost.setPaintTicks(true);
		slStarost.setPaintLabels(true);
		slStarost.setValue(0);
		slStarost.setBounds(123, 310, 245, 40);
		frmFuzzyEs.getContentPane().add(slStarost);
		
		JSlider slPoluge = new JSlider();
		slPoluge.setMinorTickSpacing(5);
		slPoluge.setPaintTicks(true);
		slPoluge.setPaintLabels(true);
		slPoluge.setMajorTickSpacing(10);
		slPoluge.setValue(0);
		slPoluge.setBounds(123, 360, 245, 40);
		frmFuzzyEs.getContentPane().add(slPoluge);
		
		JSlider slBacanja = new JSlider();
		slBacanja.setMinorTickSpacing(5);
		slBacanja.setMajorTickSpacing(10);
		slBacanja.setPaintLabels(true);
		slBacanja.setPaintTicks(true);
		slBacanja.setValue(0);
		slBacanja.setBounds(123, 410, 245, 40);
		frmFuzzyEs.getContentPane().add(slBacanja);
		
		JSlider slParter = new JSlider();
		slParter.setMinorTickSpacing(5);
		slParter.setMajorTickSpacing(10);
		slParter.setPaintTicks(true);
		slParter.setPaintLabels(true);
		slParter.setValue(0);
		slParter.setBounds(123, 460, 245, 40);
		frmFuzzyEs.getContentPane().add(slParter);
		
		JSlider slTakmicenja = new JSlider();
		slTakmicenja.setMinorTickSpacing(5);
		slTakmicenja.setMajorTickSpacing(10);
		slTakmicenja.setPaintTicks(true);
		slTakmicenja.setPaintLabels(true);
		slTakmicenja.setValue(0);
		slTakmicenja.setBounds(123, 510, 245, 40);
		frmFuzzyEs.getContentPane().add(slTakmicenja);
		
		JSlider slOruzje = new JSlider();
		slOruzje.setMinorTickSpacing(5);
		slOruzje.setMajorTickSpacing(10);
		slOruzje.setPaintLabels(true);
		slOruzje.setPaintTicks(true);
		slOruzje.setValue(0);
		slOruzje.setBounds(123, 560, 245, 40);
		frmFuzzyEs.getContentPane().add(slOruzje);
		

		DefaultTableModel model = new DefaultTableModel() {
		    /**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
		    public boolean isCellEditable(int row, int column) {
		       //all cells false
		       return false;
		    }
		};
		model.addColumn("Vestina");
		model.addColumn("Izlaz");

		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(378, 67, 500, 260);
		frmFuzzyEs.getContentPane().add(scrollPane);
		
		JLabel lblPicture = new JLabel("");
		lblPicture.setBounds(378, 336, 500, 264);
		frmFuzzyEs.getContentPane().add(lblPicture);
		
		table = new JTable(model);
		table.setSurrendersFocusOnKeystroke(true);
		
		table.getSelectionModel().addListSelectionListener(new ListSelectionListener() {

		    public void valueChanged(ListSelectionEvent lse) {
		        if (!lse.getValueIsAdjusting()) {
		            
					switch (table.getSelectedRow())
					{
					case 0: lblPicture.setIcon(new ImageIcon("resources\\wt.jpg"));
						    break;
					case 1: lblPicture.setIcon(new ImageIcon("resources\\karate.jpg"));
				    		break;
					case 2: lblPicture.setIcon(new ImageIcon("resources\\tekvondo.jpg"));
		    				break;		    				
					case 3: lblPicture.setIcon(new ImageIcon("resources\\box.jpg"));
				    		break;
					case 4: lblPicture.setIcon(new ImageIcon("resources\\kikbox.jpg"));
							break;
					case 5: lblPicture.setIcon(new ImageIcon("resources\\mauthai.jpg"));
							break;										
					case 6: lblPicture.setIcon(new ImageIcon("resources\\escrima.jpg"));
				    		break;
					case 7: lblPicture.setIcon(new ImageIcon("resources\\judo.jpg"));
							break;
					case 8: lblPicture.setIcon(new ImageIcon("resources\\mma.jpg"));
    						break;		    				
					case 9: lblPicture.setIcon(new ImageIcon("resources\\bjj.jpg"));
		    				break;
					case 10: lblPicture.setIcon(new ImageIcon("resources\\jujutsu.jpg"));
							break;
					case 11: lblPicture.setIcon(new ImageIcon("resources\\aikido.jpg"));
							break;							
					case 12: lblPicture.setIcon(new ImageIcon("resources\\ninjutsu.jpg"));
							break;
					case 13: lblPicture.setIcon(new ImageIcon("resources\\netrenirati.jpg"));
							break;							
		    				
					}
		        	
		        }
		    }
		});
		
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
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
				model.addRow(new Object[]{"Wing Tsun", opis(fis.getVariable("wing_tsun").defuzzify()) + String.format("%1.2f", fis.getVariable("wing_tsun").defuzzify())  });
				model.addRow(new Object[]{"Karate", opis(fis.getVariable("karate").defuzzify()) + String.format("%1.2f", fis.getVariable("karate").defuzzify())});
				model.addRow(new Object[]{"Tekvondo", opis(fis.getVariable("tekvondo").defuzzify()) + String.format("%1.2f", fis.getVariable("tekvondo").defuzzify())});
				model.addRow(new Object[]{"Boks", opis(fis.getVariable("boks").defuzzify()) + String.format("%1.2f", fis.getVariable("boks").defuzzify())});
				model.addRow(new Object[]{"Kikboks", opis(fis.getVariable("kikboks").defuzzify()) + String.format("%1.2f", fis.getVariable("kikboks").defuzzify())});
				model.addRow(new Object[]{"Tai boks", opis(fis.getVariable("taiboks").defuzzify()) + String.format("%1.2f", fis.getVariable("taiboks").defuzzify())});
				model.addRow(new Object[]{"Escrima", opis(fis.getVariable("escrima").defuzzify()) + String.format("%1.2f", fis.getVariable("escrima").defuzzify())});
				model.addRow(new Object[]{"Judo", opis(fis.getVariable("judo").defuzzify()) + String.format("%1.2f", fis.getVariable("judo").defuzzify())});
				model.addRow(new Object[]{"MMA", opis(fis.getVariable("mma").defuzzify()) + String.format("%1.2f", fis.getVariable("mma").defuzzify())});
				model.addRow(new Object[]{"BJJ", opis(fis.getVariable("bjj").defuzzify()) + String.format("%1.2f", fis.getVariable("bjj").defuzzify())});
				model.addRow(new Object[]{"Jujutsu", opis(fis.getVariable("jujutsu").defuzzify()) + String.format("%1.2f", fis.getVariable("jujutsu").defuzzify())});
				model.addRow(new Object[]{"Aikido", opis(fis.getVariable("aikido").defuzzify()) + String.format("%1.2f", fis.getVariable("aikido").defuzzify())});
				model.addRow(new Object[]{"Ninjutsu", opis(fis.getVariable("ninjutsu").defuzzify()) + String.format("%1.2f", fis.getVariable("ninjutsu").defuzzify())});
				model.addRow(new Object[]{"Ne trenirati b.v.", opis(fis.getVariable("ne_trenirati").defuzzify()) + String.format("%1.2f", fis.getVariable("ne_trenirati").defuzzify())});											
				
			}
		});
		btnStart.setBounds(789, 32, 89, 23);
		frmFuzzyEs.getContentPane().add(btnStart);
		
		
		
		

	}
}
