package Practise;

import java.util.*;

public class BitWise {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println(" enter 1 no");
		int x = s.nextInt();
		System.out.println(" enter 2 no");
		int y = s.nextInt();
		System.out.println(" BitWise --- OR");
		int z1 = x | y;
		System.out.println(z1);
		System.out.println(" BitWise --- and");
		int z2 = x & y;
		System.out.println(z2);
		System.out.println(" BitWise --- xor");
        int z3=x^y;
		System.out.println(z3);
		System.out.println(" BitWise --- complement");
        int z4=~x;
		System.out.println(z4);
		System.out.println(" BitWise --- leftshift");
        int z5=x<<2;
		System.out.println(z5);
		System.out.println(" BitWise --- rightshift");
        int z6=y>>4;
		System.out.println(z6);
		System.out.println(" BitWise --- unsigned");
        int z7=x>>>2;
		System.out.println(z7);

		s.close();

	}

}
