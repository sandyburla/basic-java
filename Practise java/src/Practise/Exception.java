package Practise;
import java.io.*;

public class Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "/Users/sburla/Downloads/MeruScrapping/src/resource/Sandy.txt";
       PrintWriter pw = null;
	try {
		pw = new PrintWriter(s);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
       pw.write("hello world");
	}

}
