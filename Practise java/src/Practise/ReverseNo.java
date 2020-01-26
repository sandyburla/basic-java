package Practise;
import java.util.*;
public class ReverseNo {

	public static void main1(String[] args) {
		 Scanner s=new Scanner(System.in);
			System.out.println(" enter the no to be reversed");
			int x=s.nextInt();
			int sum=0;
          while(x!=0) {
        	  int y=x%10;
        	  x=x/10;
        	  sum=sum*10+y;
          }
			System.out.println(" reversed no is ="+sum);

			s.close();
	}
	
	public static void main(String[] args) {
		
		
		
		String s="abcd";
		
		for(int i=s.length()-1; i>=0; i--) {
			System.out.println(s.charAt(i));
		}
	}

}
