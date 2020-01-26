package Multithreading;

import java.util.*;

public class StackPractise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Stack<String> s = new Stack<String>();
				s.push("sandy");
				printStack(s);
				s.push("mandy");
				printStack(s);
				s.push("dandy");
				printStack(s);
				
				System.out.println(s.peek());
				s.pop();
				printStack(s);
				s.pop();
				printStack(s);
				s.pop();
				printStack(s);
	}

	private static void printStack(Stack<String> s) {
		// TODO Auto-generated method stub
		if(!s.isEmpty()) {
			System.out.println(s);
		}else {
			System.out.println("you are a dead man");
		}
	}

}
