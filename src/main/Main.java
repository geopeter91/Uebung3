package main;

import main.schaltungen.Schaltungen;
import main.taschenrechner.Taschenrechner;
import main.zahlensysteme.Zahlensysteme;

public class Main {
	
	private static Main main;
	private Taschenrechner calc = new Taschenrechner();
	private Zahlensysteme transformer = new Zahlensysteme();
	private Schaltungen schaltungen = new Schaltungen();
		
	public static void main(String[] args) {
		main = new Main();
	}
	
	public Main() {
		calc.start();
		transformer.start();
		schaltungen.start();
	}	
}