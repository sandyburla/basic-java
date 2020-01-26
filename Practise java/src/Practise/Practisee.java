package Practise;

import java.util.*;
import java.util.regex.Pattern;

public class Practisee {
	public static void main1(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the string");
		String s1 = s.nextLine();
		String clean = s1.replaceAll("[^\\d]", "");
		System.out.println(clean);

	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);String s2="";
		String s1 = "\"telephone\": \"(336) 760-4580\"\n" + 
				"\"image\": \"https://www.cars.com/feo-cdn/H/p/4N2ggr1Ic.png\",";
		System.out.println(s1);
		
		String reg="\"\\s+\"image\"";
		s2=s1.replaceAll(reg,"\",\"image\"");
		//boolean b = false;
		
		System.out.println(s2);

	}
}
