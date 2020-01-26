package Practise;


public class SquareRoot {

	public static void main(String[] args) {
		double t;int n=100;
		double s=n/2;
		do {
			t=s;
			s=(t+(n/t))/2;
		}while((t-s)!=0);
		System.out.println(s);
		System.out.println(Math.pow(25,(-0.25)));
	}

}
