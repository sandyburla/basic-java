package Practise;
import java.util.*;
class Dupliacte
{ 
    // Function to remove duplicate elements 
    // This function returns new size of modified 
    // array. 
	
	
	  public static void main (String[] args)  
	    { 
	        int arr[] = {1, 2, 3, 4,4, 5};
	        int arr1[]= {4, 7, 2, 3, 5 }; 
	        int n = arr.length; 
	        
//	        String s = "sandeep";
////	        StringBuffer sb = new StringBuffer(s);
////	        System.out.println(sb.reverse());
//	        char ar[]= s.toCharArray();
//	        for(int x=ar.length-1;x>=0;x--) {
//	        	System.out.print(ar[x]);
//	        }
	        try {
	        Map<Integer,String> m = new HashMap<>();
	        m.put(1, "sandy");
	        m.put(2, "venu");
	        m.put(3, "upendra");m.put(4, "mahi");m.put(5, "vamshi");
	        
	        
	        System.out.println(m);
	        
//	        for(int x=0;x<arr.length;x++) {
//	        	for(int y=0;y<arr1.length;y++) {
//	        		if(arr[x]==arr1[y]) {
//	        			System.out.println(arr[x]);
//	        		}
//	        	}
//	        }
	        Arrays.sort(arr);
	        ArrayList<Integer> a = new ArrayList<>();
	        Set<Integer> b = new HashSet<>();
	        for(int i= 0;i<n;i++) {
	        	if(!a.contains(arr[i])) {
	        		a.add(arr[i]);
	        	}else {
	        		b.add(arr[i]);
	        	}
	        }
	        b.forEach(System.out::println);
//        for(int x : b) {
//	        	System.out.println("========"+x);
//        }
	     //System.out.println(10/0);   
	        
//	        int i=0,j=0;
//	        while(i<=n-2) {
//	        	System.out.println("========>>");
//	        	if(arr[i]!=arr[i+1]) {
//	        		System.out.println("========>>"+ arr[i]+"===="+arr[i+1]);
//	        		arrr[j] = arr[i];
//	        		j++;
//	        		arrr[j] = arr[i+1];
//	        	}i++;
//	        }
//	          
//	   for(int x= 0;x<arrr.length;x++) {
//		   System.out.println("========>>"+ arrr[x]);
//	   }
	        // Print updated array 
	        
	    
	    }finally{
	    	System.out.println("dream bigeer the better you become");
	    }
	    }
	  {
		  
		  String s= "hello";
		  String s1 = new String("hello");
		  System.out.println(s.equals(s1));
		  String s2=s1;//.intern();
		  System.out.println(s2==s);
		  System.out.println(s.toString());
		  System.out.println(s2.toString());
		  System.out.println();
}
}