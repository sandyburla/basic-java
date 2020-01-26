package Practise;

import java.util.*;

public class Counter {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int i;
		System.out.println("enter starting value");
		int x = s.nextInt();
		System.out.println("enter ending value");
		int y = s.nextInt();
		for (i = x; i <= y; i++) {
			System.out.print(" " + i);
			if (i == y) {
				i=x;s.close();
			}

		}

	}

}
