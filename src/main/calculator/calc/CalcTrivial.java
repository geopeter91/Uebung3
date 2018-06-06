package main.calculator.calc;

import java.util.ArrayList;
import java.util.List;

public class CalcTrivial {

	public int multiNumber(int a, int b) {
		return a*b;
	}
	
	public int prevNumber(int a) {
		return a-1;
	}
	
	public List<Integer> mod(int a, int b) {
		List<Integer> restList = new ArrayList<Integer>();
		int rest = a%b;
		int voll = a/b;
		
		restList.add(rest);
		restList.add(voll);
		
		return restList;
	}
	
	public double divide(int a, int b) {
		return a/b;
	}
	
	public double sin(double a) {
		return Math.sin(Math.PI * (a/180));
	}
	
}
