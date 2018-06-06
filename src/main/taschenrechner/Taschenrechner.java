package main.taschenrechner;

public class Taschenrechner {

	private Calc triv;
		
	public Taschenrechner() {
		System.out.println("__START TASCHENRECHNER__");
		triv = new Calc();
	}

	public void start() {
		multiNum();
		prevNum();
		calcSin();
		calcFaku();
		calcMod();
		calcFibonacci();
	}

	public void multiNum() {
		int a = 123;
		int b = 5;
		int value = triv.multiNumber(a, b);
		System.out.println(a+"*"+b+" = "+value);
	}
	
	public void prevNum() {
		int myNum = 123;
		int nextNum = triv.prevNumber(myNum);
		System.out.println("Die vorherige Zahl von "+myNum+" ist "+nextNum);
	}
	
	public void calcSin() {
		double myNum = 90;
		double mySin = triv.sin(myNum);
		System.out.println("Der Sinus von "+myNum+" ist "+mySin);
	}
	
	public void calcFaku() {
		int myNum=0;
		int newFak=0;
		
		for(int i = 0;i<=6;i++) {
			newFak = triv.calcFaku(i);
			System.out.println("Falkultät von "+i+" ist "+newFak);	
		}
		
		myNum = 15;
		newFak = triv.calcFaku(myNum);
		System.out.println("Falkultät von "+myNum+" ist "+newFak);	
	}
	
	public void calcMod() {
		int a = 4;
		int b = 3;
		String ergebnis = triv.mod(a, b);
		
		a = 20;
		b = 6;
		ergebnis = triv.mod(a, b);
		System.out.println(ergebnis);	
	}
	
	public void calcFibonacci() {
		int fiboLength = 10;
		String fib = triv.calcFibonacci(fiboLength);
		System.out.println("Die ersten "+fiboLength+" Fibonacci-Folgen lauten: \n"+fib);
	}
	
	
}
