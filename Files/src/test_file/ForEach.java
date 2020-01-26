package test_file;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.IntStream;

public class ForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		

		
//		long start = System.currentTimeMillis();;
//		ArrayList<Integer> a = new ArrayList<>();	
//		for (int i =0;i<1000;i++) {
//			a.add(i);
//		}
//		int x = 0;
//		for (Integer i : a) {
//			x = x + i;
//		}
//		System.out.println(x);
//		long end = System.currentTimeMillis();;
//
//	    System.out.println((end - start) + " ms");
	    
	    int []a1 = {1,2,3,4,5,6,7,8,9,10,11,12,131,4,45};
	     List<Integer> t = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,131,4,45);
	     
	     TreeSet<Integer> h = new TreeSet<>(t);
	     h.stream().forEach(s -> System.out.println("===="+s));
	    
//	    IntStream xr = Arrays.stream(a1);
//	    xr.forEach(xt -> System.out.println(xt));
		
//	  int d = a.stream().map(p -> f(p)).reduce(identity, accumulator)
	  
		
		

	}
int g =0;
 Integer f(Integer p) {
		// TODO Auto-generated method stub
		g = g+p;
		return g;
	}

}
