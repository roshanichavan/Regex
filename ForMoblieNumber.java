package day18;

	import java.util.Scanner;
	import java.util.regex.*;

	public class ForMoblieNumber {

		public static void main(String[] args) {
			Pattern pattern = Pattern.compile("^[0-9]{2}\\s[0-9]{10}");
			try (Scanner sc = new Scanner(System.in)) {
				System.out.println("enter the mobile number");
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

