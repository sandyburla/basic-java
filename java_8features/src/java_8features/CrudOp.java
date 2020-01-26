package java_8features;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CrudOp {
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<String, Integer> m = new TreeMap<String, Integer>();
		List<Integer> l = Arrays.asList(1,2,3,4,5,6,7);
		m.put("sandy", 1);
		m.put("mandy", 2);
		m.put("dandy", 3);
		m.put("randy", 4);
		m.put("handy", 5);
		m.put("pandy", 6);
		Map<Integer, Object> m1 =  m.entrySet().stream()
				.filter(k -> k.getKey().equals("handy"))
				.map(x -> x.getValue()+10)
				.collect(Collectors.toMap(Function.identity(),
                        String::valueOf, (k1, k2) -> k1, 
                        TreeMap::new));
		System.out.println(m1);
		
//		TreeMap<Integer, String> aTreeMap
//	       = m.stream()
//	              .collect(Collectors.toMap(Function.identity(),
//	                                        String::valueOf, (k1, k2) -> k1, 
//	                                        TreeMap::new));
		
//		Integer i = l.stream()
		
	}

}
