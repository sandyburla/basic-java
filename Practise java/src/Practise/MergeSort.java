package Practise;

import java.util.*;

public class MergeSort {

	

	void sort(int[] arr, int le, int ri, int d) {

		int n1 = d - le + 1;
		int n2 = ri - d;
		
		int k = le;
		int L[] = new int [n1];
		int R[] = new int [n2];

		for (int i = 0; i < n1; ++i) {
			L[i] = arr[le + i];
		}
		for (int j = 0; j < n2; ++j) {
			R[j] = arr[d + 1 + j];
		}
		int i=0,j=0;
		while (i < n1 && j < n2) {
			if (L[i] <= R[j]) {
				arr[k] = L[i];
				i++;
			} 
			else {
				arr[k] = R[j];
				j++;
			}
			k++;
		}
		while (i < n1) {
			arr[k] = L[i];
			i++;
			k++;
		}
		while (j < n2) {
			arr[k] = R[j];
			j++;
			k++;
		}
		for(int p = 0;p<le+ri-1;p++){
            System.out.print(" "+arr[p]);

        }
        System.out.println(" ");
	}
	void merge(int[] arr, int le, int ri) {

		
		if (le < ri) {
			int d = (le + ri) / 2;
			System.out.println(le+"====="+ri+"======"+d+"======="+arr.length);
			merge(arr, le, d);
			merge(arr, d + 1, ri);
		 	sort(arr, le, ri, d);
		}
	}

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
		
		
		MergeSort ms = new MergeSort();
		ms.merge(arr, 0, arr.length - 1);
		
		
		System.out.println("sorted array");
		printArray(arr);
		s.close();

	}

}
