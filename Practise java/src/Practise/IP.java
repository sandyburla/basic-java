package Practise;

import java.util.*;

public class IP {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		// int i;

		System.out.println("enter the ip");

		String sr = s.nextLine();
		System.out.println("sr " + sr);
		String se[] = sr.split("\\.");
		long sum = 0;
		for (int i = 0; i < se.length; i++) {
			int y = 3 - i;
			int x = Integer.parseInt(se[i]);
			sum += x * Math.pow(256, y);
			// System.out.println("enter the ip");
		}
		System.out.println(sum);s.close();

	}

}
