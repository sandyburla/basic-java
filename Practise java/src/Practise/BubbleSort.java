package Practise;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("enter the size of array");
		int x = s.nextInt();
		int i, j, k, temp;
		System.out.println("enter the array elements");
		int[] z = new int[x];
		for (i = 0; i < x; i++) {
			z[i] = s.nextInt();
		}
		for (j = 0; j < x-1; j++) {
			for (k = 0; k < x-j-1; k++) {
				if (z[k] > z[k+1]) {
					temp = z[k+1];
					z[k+1] = z[k];
					z[k] = temp;
				}
			}
		}
		for (i = 0; i < x; i++) {
			System.out.print(z[i] + ",");
		}
		s.close();
	
	}

}
