package Practise;

import java.util.*;

public class NameSort {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		// ------------this is for replacing a word in para
		// graph----------------------------------------------
		String s4 = "this is my world worldof java world";
		String s5 = s4.replaceAll("\\bworld\\b", "dude");
		System.out.println(s5);
		// ----------------------------------------------------------
		System.out.println("enter the total no");
		int x = s.nextInt();
		int y;
		System.out.println("enter the" + x + " names");
		String[] s1 = new String[x];
		TreeSet<String> set = new TreeSet<>();
		for (y = 0; y < x; y++) {
			s1[y] = s.next();
			set.add(s.next());
			
		}

		for (String s3 : set) {
			System.out.println(s3);
		}
		Arrays.sort(s1);
		for (y = 0; y < x; y++) {

			System.out.println(s1[y]);
		}
		s.close();
	}
}
