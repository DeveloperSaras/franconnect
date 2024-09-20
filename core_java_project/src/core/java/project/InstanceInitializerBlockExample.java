package core.java.project;

public class InstanceInitializerBlockExample {

	private int value;
	private String str;

	// instance initializer block
	/*
	 * { System.out.println("From inside initalizer block"); }
	 */

	public static void main(String[] args) {

		InstanceInitializerBlockExample obj1 = new InstanceInitializerBlockExample();

		InstanceInitializerBlockExample obj2 = new InstanceInitializerBlockExample(101);

	}

	public InstanceInitializerBlockExample() {
		super();
		System.out.println("From inside initalizer block");
		System.out.println("Default constructor invoked");
	}

	public InstanceInitializerBlockExample(int value, String str) {
		super();
		System.out.println("From inside initalizer block");
		System.out.println("value and str Constructor invoked");
		this.value = value;
		this.str = str;
	}

	public InstanceInitializerBlockExample(String str) {
		super();
		System.out.println("From inside initalizer block");
		System.out.println("str Constructor invoked");
		this.str = str;
	}

	public InstanceInitializerBlockExample(int value) {
		super();
		System.out.println("From inside initalizer block");
		System.out.println("value Constructor invoked");
		this.value = value;
	}

}
