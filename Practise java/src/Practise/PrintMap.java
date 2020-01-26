package Practise;

import java.util.HashMap;
import java.util.Map;

public class PrintMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Map<String,String> map = new HashMap<String,String>();
String sss = "there is a will there is a was";
String s1[] = sss.split(" ");
String a = "qwe";
String b = "asd";
for(String s2 : s1) {
	if(!map.containsKey(s2)) {
		map.put(s2, a);
	}else {
		map.put(s2, map.get(s2)+','+b);
	}
	
}

System.out.println(map);

	}

}
