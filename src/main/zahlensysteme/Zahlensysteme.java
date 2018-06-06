package main.zahlensysteme;

public class Zahlensysteme {
	
	public void start() {
		int myDec = 42;
		String myBin = "101010";
		String myHex = "2a";
		
		String dToB = decToBin(myDec);
		System.out.println("Die Dezimalzahl "+myDec+" in Binärform: "+dToB);
		
		int bToD = binToDec(myBin);
		System.out.println("Die Dezimalzahl "+myBin+" in Hexadezimal: "+bToD);
		
		String dToH = decToHexa(myDec);
		System.out.println("Die Dezimalzahl "+myDec+" in Hexadezimal: "+dToH);

		int hToD = hexToDec(myHex);
		System.out.println("Die Hexadezimalzahl "+myHex+" in Dezimal: "+hToD);
		
		String bToH = binToHex(myBin);
		System.out.println("Die Binärzahl "+myBin+" in Hexadezimal: "+bToH);
	}
	
	
	public String decToBin(int a) {
		return Integer.toBinaryString(a);
	}
	
	public int binToDec(String a) {
		return Integer.parseInt(a, 2);
	}
	
	public String decToHexa(int a) {
		return Integer.toString(a, 16);
	}
	
	public int hexToDec(String a) {
		return Integer.parseInt(a, 16);
	}
	
	public String binToHex(String a) {
		int dec = binToDec(a);
		String bin = decToHexa(dec);
		
		return bin;
	}
	
	
}
