package Practise;

import java.util.LinkedList; 
import java.util.Queue; 
import java.util.*; 

public class EnDeQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Queue<String> u = (Queue<String>) new LinkedList();
		Queue<Integer> q = new LinkedList();
		Scanner s = new Scanner(System.in);
		for(int i =0;i< 5;i++) {
			q.add(i);
		}
		System.out.println(q);
		int removedele = q.remove(); 
	    System.out.println("removed element-" + removedele); 
	    int head = q.poll(); 
	    System.out.println("head of queue-" + head); 
	    int size = q.size(); 
	    System.out.println("Size of queue-" + size); 
	}
	
//	public static void main(String[] args) {
//   Deque<Integer> d = new LinkedList<Integer>();
//              d.add(10);
//         System.out.println(d);
//             d.push(110);
//         System.out.println(d);
//             d.addFirst(11);
//         System.out.println(d);
//         	d.addLast(12);
//         System.out.println(d);
//         	d.push(110);
//         System.out.println(d);
//         	d.offer(111);
//         System.out.println(d);
//         	d.offerFirst(123);
//         System.out.println(d);
//         	d.offerLast(1234);
//         System.out.println(d);
//         
//	}
	
 }
