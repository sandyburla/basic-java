package Practise;

import java.util.*;

public class SelectionSort {

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
		for (j = 0; j < x; j++) {
			for (k = j + 1; k < x; k++) {
				if (z[j] > z[k]) {
					temp = z[k];
					z[k] = z[j];
					z[j] = temp;
				}
			}
		}
		for (i = 0; i < x; i++) {
			System.out.print(z[i] + ",");
		}
		s.close();
	}
}
