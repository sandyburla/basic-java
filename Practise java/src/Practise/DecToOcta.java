package Practise;

import java.util.*;

public class DecToOcta {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the dec value");
		int x = s.nextInt();

		int i = 0, b = 0;
		double sum = 0;

		int[] a = new int[10];
		while (x > 0) {
			if (x != 0)
				a[i] = x % 8;
			x = x / 8;
			i++;

		}
		for (int y = (a.length) - 1; y >= 0; y--) {
			if (a[y] != 0)
				System.out.print(a[y] + "");
		}
		System.out.println("enter the octa value");
		int z = s.nextInt();
		int p = 0;
		while (z > 0) {
			b = z % 10;
			// System.out.println(b);

			z = z / 10;
			sum = sum + b * Math.pow(8, p);
			// System.out.println(sum);
			p++;

		}
		System.out.println(sum);

		s.close();
	}

}
