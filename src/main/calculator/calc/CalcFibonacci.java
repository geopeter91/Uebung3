package main.calculator.calc;

public class CalcFibonacci {

	public String calc(int maxNum) {
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
	
}
