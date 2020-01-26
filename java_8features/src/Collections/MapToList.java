package Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class MapToList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, Integer> m = new HashMap<>();
		
		m.put("sandy", 10);
		m.put("mandy", 110);
		m.put("dandy", 120);
		m.put("kandy", 140);
		m.put("randy", 130);
		m.put("shandy", 150);
		
		System.out.println("printing in map interface"+m);
		System.out.println("converting map to list");
		List<Entry<String, Integer>> l = new ArrayList<>(m.entrySet());
		
//		Collections.sort(l, new Comparator<Entry<String, Integer>>() {
//
//			@Override
//			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
//				// TODO Auto-generated method stub
//				return o1.getKey().compareTo(o2.getKey());
//			}
//			
//			
//		});
		
//		System.out.println("sorting based on key========>>>>>>>>>>");
//		Collections.sort(l, (o1,o2) -> o1.getKey().compareTo(o2.getKey()));
//		System.out.println(l);
//		System.out.println("sorting based on value========>>>>>>>>>>");
//		Collections.sort(l, (o1,o2) -> o1.getValue().compareTo(o2.getValue()));
//		System.out.println(l);
		
		m.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
	
		

	}

}
