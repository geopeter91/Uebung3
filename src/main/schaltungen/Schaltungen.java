package main.schaltungen;

public class Schaltungen {
	
	public void start() {
		System.out.println("__Start Schaltungen__");
		Boolean val = and(true, false);
		System.out.println("val true & false: "+val);
	}
	
	public boolean and(boolean a, boolean b) {
		boolean val = a && b;
		return val;
	}
	
}
