package Practise;

import java.util.Scanner;

public class Insertionsort {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("enter the size of array");
		int x = s.nextInt();
		int i, j, key, temp;
		System.out.println("enter the array elements");
		int[] z = new int[x];
		for (i = 0; i < x; i++) {
			z[i] = s.nextInt();
		}
		for (j = 1; j < x; j++) {
			key = z[j];
			i = j - 1;
			while (j >= 0 && key < z[i]) {
				temp = z[i];
				z[i] = z[j];
				z[j] = temp;
				j--;	
			}
		}
		for (i = 0; i < x; i++) {
			System.out.print(z[i] + ",");
		}
		s.close();

	}

}
