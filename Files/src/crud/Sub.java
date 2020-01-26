package crud;

import test_file.Mul;
import test_file.Sum;

public class Sub extends Sum {
	Sum s1 = new Sum();
	Mul m = new Mul();
	
	private int i,j;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Sub s = new Sub(2,1);
	}

	public Sub(int i, int j) {
		// TODO Auto-generated method stub
		this.i = i;
		this.j = j;
		System.out.println(i-j);
		System.out.println(m.mul(3, 5));
	}
	
	public int subtract() {
		return i-j;
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public int getJ() {
		return j;
	}

	public void setJ(int j) {
		this.j = j;
	}
	
	

}
