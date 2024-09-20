package core.java.project;

public class Coffee implements Comparable<Coffee> {

	private String name;
	private String type;
	private String colour;
	private int price;
	
	public Coffee() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Coffee(String name, String type, String colour, int price) {
		super();
		this.name = name;
		this.type = type;
		this.colour = colour;
		this.price = price;
	}

	public static final String CATEGORY;

	static {
		CATEGORY = "Beverage";
		System.out.println("Hello from within static block");
	}
	
	public static void info() {
		System.out.println("From inside static info method of coffee class");
	}

	@Override
	public int compareTo(Coffee c) {
		return -1 * Integer.valueOf(this.price).compareTo(c.price);
		
	}

	
	@Override
	public String toString() {
		return "Coffee [name=" + name + ", type=" + type + ", colour=" + colour + ", price=" + price + "]";
	}

	public void displayInfo() {
		System.out.println("Name : " + name + ", Type : " + type + ", colour : " + colour + ", price : " + price);
	}

	public static void energizeConsumer() {
		System.out.println("The consumer gets energized after consuming a cup of nice coffee");
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}
	
	

}
