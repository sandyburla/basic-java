package test_file;

import crud.Sub;

public class Sum {

	public int sum(int a, int b){
		return a+b;
	}
	public static void main(String[] args) {
		Mul m = new Mul();
		System.out.println(m.mul(3, 5));
		Sub s = new Sub(7,1);
		System.out.println("Subtract result is "+s.subtract());
		s.setI(8);
		s.setJ(4);
		System.out.println("Subtract result is "+s.subtract());

	}
}
