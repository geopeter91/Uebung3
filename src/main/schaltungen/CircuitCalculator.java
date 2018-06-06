package main.schaltungen;

public class CircuitCalculator {
	
	public void start() {
		and(true, false);
	}
	
	public boolean and(boolean a, boolean b) {
		boolean val = a && b;
		return val;
	}
	
}
