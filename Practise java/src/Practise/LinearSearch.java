package Practise;

import java.util.*;

public class LinearSearch {

	static void search(int arr[], int n, int x) {
		for (int i = 0; i < n; i++) {
			// Return the index of the element if the element
			// is found
			if (arr[i] == x) {

				System.out.println("element is found at" + i);}
		}

		// return -1 if the element is not found
		
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.err.println("enter the no of elements");

		int n = s.nextInt();

		int arr[] = new int[n];

		System.err.println("enter the elements");

		for (int i = 0; i < n; i++) {

			arr[i] = s.nextInt();

		}
		LinearSearch ls = new LinearSearch();
		System.err.println("enter the element to b found");
		int x = s.nextInt();
		ls.search(arr, 8, x);

	}

}
