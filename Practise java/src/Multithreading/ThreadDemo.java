package Multithreading;

public class ThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadTest mt = new ThreadTest();
		mt.start();
		mt.setName("sandy");
		for(int i=0;i<10;i++) {
       	 System.out.println("never ever give up");
       	 
       	 System.out.println ("Thread " + 
	                mt.getName() + 
	                " is running"); 
        }
		//mt.start();
		MyThread mtt = new MyThread();
		mtt.start();
		  System.out.println ("Thread " + 
	                Thread.currentThread().getName() + 
	                " is running"); 
		 // System.out.println(10/0);
	}

}
