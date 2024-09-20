package core.java.project;

public class CoffeeMain {
	
	public static void main(String[] args) {
		
		System.out.println("Hello from within the main method");
		
		Coffee c1 = new Coffee("Cafe Latte", "Hot Coffee", "Light Brown", 200);
		
		c1.displayInfo();
		
		Coffee.energizeConsumer();
		
	}
}