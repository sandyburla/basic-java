package Multithreading;

import java.awt.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class EntryMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> newmap1 = new HashMap();
		  newmap1.put(1, "tutorials");
	      newmap1.put(2, "point");
	      newmap1.put(3, "is best");
	      
	      for(Map.Entry<Integer,String> mp: newmap1.entrySet()) {
	    	  System.out.println(mp.getKey()+":"+mp.getValue());
	      }
	      ArrayList i = new ArrayList();
	      i.add(1);
	      i.add(11);
	      i.add(111);
	      i.add(1111);
	      i.add(11111);
	      
	      i.remove(2);
	      i.forEach((n) ->System.out.println(n));
	      
	      System.out.println("Values in newmap1: "+ newmap1);
	}

}
