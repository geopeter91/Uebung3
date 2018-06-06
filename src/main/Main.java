package main;

import main.taschenrechner.Taschenrechner;
import main.zahlensysteme.Zahlensysteme;

public class Main {
	
	private static Main main;
	private Taschenrechner calc = new Taschenrechner();
	private Zahlensysteme transformer = new Zahlensysteme();
		
	public static void main(String[] args) {
		main = new Main();
	}
	
	public Main() {
		calc.start();
		transformer.start();
	}	
}