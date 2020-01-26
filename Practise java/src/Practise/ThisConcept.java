package Practise;

public class ThisConcept {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisConcept t = new ThisConcept();
	
		int a = 10,b=20;
		t.find(a,b);
		
		

	}
       int c,d;
	private void find(int a, int b) {
		// TODO Auto-generated method stub
		
		this.c = a;
		this.d = b;
		
		this.c = this.c+1;
		this.d = this.d+1;
		this.c = a+1;
		this.d = b+2;
		System.out.println(a+" ==== "+b+" ======= "+c+" ==== "+d);
	}

}
