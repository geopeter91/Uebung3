package main;

import main.calculator.Calculator;
import main.numberTransformer.NumberTransformer;

public class Main {
	
	private static Main main;
	private Calculator calc = new Calculator();
	private NumberTransformer transformer = new NumberTransformer();
		
	public static void main(String[] args) {
		main = new Main();
	}
	
	public Main() {
		calc.start();
		transformer.start();
	}	
}