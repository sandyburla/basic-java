package Multithreading;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapToSet {

	public static void main(String[] args) {
		Map<String, Set<String>> givenMap = new HashMap<String, Set<String>>();
		 Map<String, List<String>> newMap = new HashMap<String, List<String>>();
		 Map<String, Set<String>> givenMap1 = new HashMap<String, Set<String>>();

		    Set<String> newSet = new HashSet<String>();
		    // settings the values into set
		    newSet.add("rohit");
		    newSet.add("upendra");
		    // putting key, values into map
		    givenMap.put("a", newSet);
		    givenMap.put("b", newSet);
		    givenMap.put("c", newSet);
		    // putting one map into another map
		    givenMap1.putAll(givenMap);
		    System.out.println(givenMap);
		    System.out.println(givenMap1);
		    System.out.println("-------1-------");
		    // to iterate the map
		    for(String str1:givenMap1.keySet()) {
		        System.out.println(givenMap1.get(str1));
		    }
		    System.out.println("-------2-------");
		   

		    for (String str: givenMap.keySet()) {
		        newMap.put(str, new ArrayList<String>(givenMap.get(str)));
		    }
		    System.out.println("-------2-------"+newMap);
		    for(String str:newMap.keySet()) {
		        System.out.println(newMap.get(str));
		    }
		    System.out.println("-------3-------");
		    // create two hash maps
		      HashMap newmap1 = new HashMap();
		      HashMap newmap2 = new HashMap();

		      // populate hash map
		      newmap1.put(1, "tutorials");
		      newmap1.put(2, "point");
		      newmap1.put(3, "is best");

		      System.out.println("Values in newmap1: "+ newmap1);

		      // put all values in newmap2
		      newmap2.putAll(newmap1);

		      System.out.println("Values in newmap2: "+ newmap2);
	}

}
