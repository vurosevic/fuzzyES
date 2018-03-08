package main;

import net.sourceforge.jFuzzyLogic.FIS;
import net.sourceforge.jFuzzyLogic.plot.JFuzzyChart;

public class borilackeVestine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Vladimir Urosevic - Borilacke Vestine");

		FIS fis = FIS.load("rules/pravila2.fcl");
		
		if (fis == null){
			System.err.println("Greska");
			return;
		}		
		
		
		fis.setVariable("kondicija", 8);
		fis.setVariable("snaga", 12);
		fis.setVariable("ruke", 7);
		fis.setVariable("noge", 7);
		fis.setVariable("laktovi", 0);
		fis.setVariable("kolena", 0);
		fis.setVariable("starost", 18);		
		fis.setVariable("poluge", 0);
		fis.setVariable("bacanja", 0);
		fis.setVariable("parter", 0);
		fis.setVariable("sport", 1);
		fis.setVariable("oruzje", 0);		
		
		fis.evaluate();

		System.out.println("Wing Tsun " + fis.getVariable("wing_tsun").defuzzify());		
		System.out.println("Karate " + fis.getVariable("karate").defuzzify());
		System.out.println("Tekvondo " + fis.getVariable("tekvondo").defuzzify());
		System.out.println("Boks " + fis.getVariable("boks").defuzzify());
		System.out.println("Kikboks " + fis.getVariable("kikboks").defuzzify());
		System.out.println("Tai boks " + fis.getVariable("taiboks").defuzzify());		
		System.out.println("Escrima " + fis.getVariable("escrima").defuzzify());
		System.out.println("Judo " + fis.getVariable("judo").defuzzify());
		System.out.println("MMA " + fis.getVariable("mma").defuzzify());
		System.out.println("BJJ " + fis.getVariable("bjj").defuzzify());		
		System.out.println("Jujutsu " + fis.getVariable("jujutsu").defuzzify());
		System.out.println("Aikido " + fis.getVariable("aikido").defuzzify());
		System.out.println("Ninjutsu " + fis.getVariable("ninjutsu").defuzzify());
		System.out.println("Ne trenirati " + fis.getVariable("ne_trenirati").defuzzify());		
		
		JFuzzyChart.get().chart(fis);
	}

}
