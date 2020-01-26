package Practise;

import java.util.Scanner;

public class SumSquares {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a value");
		int num = s.nextInt(), count = 1, total = 0;

		while (count <= num) {
			total = total + count * count;
			count++;
		}

		System.out.println("Sum of  squares of first num natural numbers is: " + total);
		s.close();
	}

}
