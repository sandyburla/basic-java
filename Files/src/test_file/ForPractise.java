package test_file;

import java.io.File;
import java.io.IOException;

public class ForPractise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
File fs = new File("/Users/sburla/Desktop/Pratise.txt");
try {
	fs.createNewFile();
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
System.out.println(fs.exists());
	}

}
