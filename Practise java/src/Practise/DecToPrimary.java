package Practise;

import java.util.*;

public class DecToPrimary {

	public static void main(String[] args) {
		System.out.println(" decimal to primary");
		System.out.println(" enter the dec no");
		Scanner s = new Scanner(System.in);
		int z = s.nextInt();
		int y = 0, w;
		int[] a = new int[50];

		while (z > 0) {
			a[y++] = z % 2;
			z = z / 2;
		}
		for (w = y - 1; w >= 0; w--) {
			System.out.print(a[w]);
           }
		System.out.println(" primary to decimal ");
		System.out.println(" enter the binary no ");
		int binaryNumber=s.nextInt();
		int decimal = 0;
	    int p = 0;
	    while(true){
	      if(binaryNumber == 0){
	        break;
	      } else {
	          int temp = binaryNumber%10;
	          decimal += temp*Math.pow(2, p);
	          binaryNumber = binaryNumber/10;
	          p++;
	       }		

	    }System.out.print(decimal);
	    s.close();}


		
	}

	

