package Practise;
import java.util.*;

public class Factorial {

	public static void main(String args[]){  
		Scanner s=new Scanner(System.in);
		  int i,fact=1,x=1;  
		  int number=s.nextInt();//It is the number to calculate factorial    
		  for(i=x;i<=number;i++){    
		      fact=fact*i;    
		  }    
		  System.out.println("Factorial of "+number+" is: "+fact);    
		  s.close(); }  

}
