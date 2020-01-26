package java_8features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list = Arrays.asList(12,43,23,432,231,11,2,9,87,75);
		
		System.out.println("using forEach");
		long start = System.currentTimeMillis();;
		list.forEach(i -> System.out.println(i*i));
        long end = System.currentTimeMillis();;
	    System.out.println((end - start) + " ms");
	    
	    
	    
		System.out.println("using Streams");
	list.stream().forEach(System.out::println);
//		System.out.println(l);
		
	}

}
