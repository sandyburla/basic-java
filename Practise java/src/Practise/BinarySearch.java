package Practise;
import java.util.*;
public class BinarySearch {
	
	public int BinarySearch(int []arr,int q) {
		int l = 0, r = arr.length - 1;
		
		while(l<=r) {
		int m=l+(r-1)/2;
		
		if(arr[m]==q) 
			return m;
		if(arr[m]<q)
			l=m+1;
		else
			r=m-1;
		}
		
		return -1;
		
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the length");
		int x=s.nextInt();
		BinarySearch b=new BinarySearch();
		
		int arr[]=new int[x]; 
		System.out.println("enter the values");
		for (int i = 0; i < x; i++) {
			arr[i]=s.nextInt();
		}
		System.out.print("enter the elemenet to be found:");
		int y=s.nextInt();
		int bs=b.BinarySearch(arr,y);
		System.out.print("element found at:"+bs);
		s.close();

	}

}
