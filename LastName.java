package day18;

import java.util.Scanner;
import java.util.regex.*;

public class LastName {

	public static void main(String[] args) {
		// Last name starts with Cap and has minimum 3 characters
		Pattern pattern = Pattern.compile("^[A-Z][a-z]{2,}");
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the Last Name");
			String input = sc.next();
			Matcher matcher = pattern.matcher(input);
			boolean matchFound = matcher.find();
			if (matchFound)
				System.out.println("Valid entry");
			else
				System.out.println("Invalid entry");
		}

	}
}

