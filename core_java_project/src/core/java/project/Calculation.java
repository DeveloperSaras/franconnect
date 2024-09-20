package core.java.project;

public class Calculation {
	
	public void calculate(short n1, int n2) {
		System.out.println("short, double version is called");
	}
	
	public void calculate(byte n1, long n2) {
		System.out.println("short, float version is called");
	}
	
	
	public static void main(String[] args) {
		
		Calculation calc = new Calculation();
		
		byte n1 = 120;
		byte n2 = 121;
		
		//calc.calculate(n1, n2);
		
		
	}

}
