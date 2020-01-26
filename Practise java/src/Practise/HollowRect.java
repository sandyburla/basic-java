package Practise;

public class HollowRect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int j = 1, k = 1;
		int n = 5;
		int m = 6;
		for (j = 1; j <= n; j++) {
			if (j == 1 || j == n) {
				for (k = 1; k <= m; k++) {
					System.out.print("* ");
				}
				
			} else {
				for(k=1;k<=m;k++) {
					if(k==1 || k==m) {
						System.out.print("* ");
					}else {
						System.out.print("  ");
					}
				}
			}
			System.out.println();
		}
	}
}
