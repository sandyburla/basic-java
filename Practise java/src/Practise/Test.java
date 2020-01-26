package Practise;

import java.util.*;

public class Test {

	public static void main(String[] args) {

		Stack<Integer> st = new Stack<Integer>();

		Stack_push(st);
	}

	static void Stack_push(Stack<Integer> st) {
		Scanner s = new Scanner(System.in);

		System.out.println("enter the length of array");
		int x = s.nextInt();
		int[] array = new int[x];
		System.out.println("enter the elements");
		for (int i = 0; i < array.length; i++) {
			Integer y=(Integer)st.push(i);
			System.out.println(y+" ");
		}
		Integer z=(Integer)st.pop();
		System.out.println(z);
		Integer zz=(Integer)st.search(7);
		System.out.println("---------"+zz);
		Integer yy=(Integer)st.peek();
				
		System.out.println(yy);
	}

}
