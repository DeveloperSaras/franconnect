package core.java.project;

import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

public class NameExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your name : ");
		String name = sc.nextLine();
		System.out.println(addressPerson(name));
		sc.close();
	}

	public static String addressPerson(String name) {

		String result = null;

		if (name == null || name.isBlank()) {
			result = "The name cannot be null. Please try again.";
		} else {
			StringTokenizer st = new StringTokenizer(name, " ");
			String firstName = st.nextToken();
			Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
			boolean nameEndsWithVowel = vowels.contains(firstName.charAt(firstName.length() - 1));

			result = nameEndsWithVowel ? "Hello, Miss " + name : "Hello, Mr. " + name;
		}

		return result;
	}

}
