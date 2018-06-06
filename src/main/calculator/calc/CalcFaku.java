package main.calculator.calc;

public class CalcFaku {
	
	public int calcFaku(int a) {
		int lastNum=1;
		int val=1;
		a++;
		for(int i=1;i<=a;i++) {
			val = val*lastNum; 
			lastNum = i;
		}
		
		return val;
	}
	
}
