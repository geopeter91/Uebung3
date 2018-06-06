package main.taschenrechner;

import java.util.ArrayList;
import java.util.List;

public class Calc {

	public int multiNumber(int a, int b) {
		return a*b;
	}
	
	public int prevNumber(int a) {
		return a-1;
	}
	
	public String mod(int a, int b) {
		List<Integer> restList = new ArrayList<Integer>();
		int rest = a%b;
		int voll = a/b;
		
		restList.add(rest);
		restList.add(voll);
		
		return a+"/"+b+" = "+ rest + " Rest "+voll;
	}
	
	public double divide(int a, int b) {
		return a/b;
	}
	
	public double sin(double a) {
		return Math.sin(Math.PI * (a/180));
	}
	
	public String calcFibonacci(int maxNum) {
		String output = "";
		int prev = 0;
		int curNum = 0;
		
		int prev0 = 0;
		int prev1 = 1;
		
		for(int i=0;i<maxNum;i++) {
			prev = prev0;
			curNum = prev1;
			
			prev0 = curNum;

			curNum = curNum + prev;
			prev1 = curNum;
			
			output += curNum+"\n";
		}
		
		return output;
	}
	

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
