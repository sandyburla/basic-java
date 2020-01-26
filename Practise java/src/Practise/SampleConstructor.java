package Practise;

import java.util.Scanner;

public class SampleConstructor {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        long y = s.nextLong();
        String z = s.nextLine();
	
	
	
	SampleConstructor(){
		System.out.println("default constructor");
	}
	SampleConstructor(int a, int b){
		System.out.println(a*b);
	}
	public SampleConstructor(int a, int b, int c) {
		// TODO Auto-generated constructor stub
		
		System.out.println(a+b+c);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SampleConstructor sc = new SampleConstructor();
		int a =100,b=900,c=755;
		SampleConstructor sc1 = new SampleConstructor(a, b);
		SampleConstructor sc2 = new SampleConstructor(a, b,c);
		

	}

}
