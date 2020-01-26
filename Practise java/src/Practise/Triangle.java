package Practise;

import java.util.*;

public class Triangle {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter side lenths");

		int x = s.nextInt();
		int y = s.nextInt();
		int z = s.nextInt();
		if (x == y && y == z) {
			System.out.println("its an equilateral triangle");
		} else if (x == y || y == z) {
			System.out.println("its an isosceles triangle");
		} else {
			System.out.println("its an scalene triangle");
			s.close();
		}

	}
}
