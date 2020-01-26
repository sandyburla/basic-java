package java_8features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Flatmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> l1 = Arrays.asList(1,2,3,4,5);
		List<Integer> l2 = Arrays.asList(11,21,13,41,51);
		List<Integer> l3 = Arrays.asList(12,222,23,24,25);
		List<Integer> l4 = Arrays.asList(1111,221,33,43,554);
		
		List<List<Integer>> o = Arrays.asList(l1,l2,l3,l4);
		System.out.println(o);
		
		List<Integer> t = o.stream().flatMap(x -> x.stream()).sorted().collect(Collectors.toList());
		System.out.println(t);
		
		System.out.println("simple example of flatmap");
		
//		List<String> s = Arrays.asList("a","1","sandeep");
//	    s.stream().filter(x -> x.equals("sandeep")).collect(Collectors.toList()).forEach(c -> System.out.println(c));
		
	}
}
