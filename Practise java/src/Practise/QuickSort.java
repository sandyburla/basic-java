package Practise;

import java.util.Scanner;

public class QuickSort {

	static void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter no of elements");
		int x = s.nextInt();
		int i;
		System.out.println("each element");
		int[] arr = new int[x];
		for (i = 0; i < x; i++) {
			arr[i] = s.nextInt();
		}

		System.out.println("unsorted array");
		printArray(arr);
		
		QuickSort qs = new QuickSort();
		qs.sort(arr, 0, arr.length - 1);

		System.out.println("sorted array");
		printArray(arr);
		s.close();

		

	}

	void sort(int[] arr, int start, int end) {
		if (start < end) {
			int pindex = partition(arr, start, end);
			sort(arr, start, pindex - 1);
			sort(arr, pindex + 1, end);
		}

	}

	int partition(int[] arr, int start, int end) {

		int pivot = arr[end];
		int i = start - 1;
		for (int j = start; j < end; j++) {
			if (arr[j] <= pivot) {
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;

			}

		}
		int temp = arr[i + 1];
		arr[i + 1] = arr[end];
		arr[end] = temp;

		return i + 1;
	}

}
