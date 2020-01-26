package Practise;

import java.util.regex.*;

public class PatternMatch {
	public static void main(String args[]) {
		String content = "This is Chaitanya " + "from Beginnersbook.com.";

		String pattern = ".*is.*";

		boolean isMatch = Pattern.matches(pattern, content);
		System.out.println("The text contains 'book'? " + isMatch);
	}
}
