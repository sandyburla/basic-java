package Practise;

import java.util.*;

public class DecToHexa {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the decimal no");
		int x = s.nextInt();
		int z = 0;
		String st = "";
		char hex[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
		while (x > 0) {
			z = x % 16;
			st = hex[z] + st;
			x = x / 16;
		}
		System.out.println(st);
		System.out.println("enter the hexacode");
		String inputHex = s.next();
		Integer in = Integer.parseInt(inputHex, 16);
		System.out.println(in);

		s.close();
	}

}
