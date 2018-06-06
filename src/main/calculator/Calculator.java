package main.calculator;

import java.util.List;

import main.calculator.calc.*;

public class Calculator {

	private CalcTrivial triv;
	private CalcFaku faku;
	private CalcFibonacci fibo;
		
	public Calculator() {
		System.out.println("Start Calculator");
		triv = new CalcTrivial();
		faku = new CalcFaku();
		fibo = new CalcFibonacci();
	}

	public void start() {
		nextNum();
		prevNum();
		calcSin();
		calcFaku();
		calcMod();
		calcFibonacci();
	}

	public void nextNum() {
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
			newFak = faku.calcFaku(i);
			System.out.println("Falkultät von "+i+" ist "+newFak);	
		}
		
		myNum = 15;
		newFak = faku.calcFaku(myNum);
		System.out.println("Falkultät von "+myNum+" ist "+newFak);	
	}
	
	public void calcMod() {
		int a = 4;
		int b = 3;
		List<Integer> modList = triv.mod(a, b);
		System.out.println(a+"/"+b+" = "+modList.get(0) + " Rest "+modList.get(1));
		
		a = 20;
		b = 6;
		modList = triv.mod(a, b);
		System.out.println(a+"/"+b+" = "+modList.get(0) + " Rest "+modList.get(1));	
	}
	
	public void calcFibonacci() {
		int fiboLength = 10;
		String fib = fibo.calc(fiboLength);
		System.out.println("Die ersten "+fiboLength+" Fibonacci-Folgen lauten: \n"+fib);
	}
	
	
}
