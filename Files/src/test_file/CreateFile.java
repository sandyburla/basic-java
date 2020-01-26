package test_file;

import java.io.*;

public class CreateFile {

	public static void main(String[] args) throws IOException {
		File fs = new File("/Users/sburla/Desktop/JavaFile.txt");
		FileWriter fw = new  FileWriter(fs);
		System.out.println(fs.exists());		//String sr = "make a life you dream of";
		fw.write("make a life you dream of==============");
		fw.flush();
		//System.out.print();

	}

 }
