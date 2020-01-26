package Multithreading;

public class MyThread extends Thread 
{

		// TODO Auto-generated method stub
		//int i;
		 public void run() 
		  { 
//			 ThreadTest t = new ThreadTest();
//			 t.start();
		    try
		    { 
		      // Displaying the thread that is running 
		      System.out.println ("====-----------------");
		      System.out.println ("Thread " + 
		                Thread.currentThread().getName() + 
		                " is running"+"'=-=-=-=-=-=-8=-=-00000=-=-=-=-='"); 
		  
		    } 
		    catch (Exception e) 
		    { 
		      // Throwing an exception 
		      System.out.println ("Exception is caught"); 
		    } 
		  } 

}
