package test_file;

import java.io.*;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class FileRead {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String text = fileReader("/Users/sburla/Downloads/MeruScrapping/src/resource/zipcodes");
//		System.out.println(text);
//		File fe = new File("/Users/sburla/Desktop/FileJava.txt");
//		try {
//			FileWriter fw = new FileWriter(fe);
//			
//			fw.write(text);
//			fw.flush();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	
		
		
		

	}

	private static String fileReader(String file) throws IOException {
		// TODO Auto-generated method stub
		Scanner s;
		String st = "";
		try {
			s = new Scanner(new File(file));
			FileReader fr = new FileReader(file);
			BufferedReader bf = new BufferedReader(fr); 
			File fe = new File("/Users/sburla/Downloads/MeruScrapping/src/resource/zipcodesoutput");
			FileWriter fw = new FileWriter(fe);
			bf.lines().forEach(x -> {
				try {
					
					fw.write("https://stores.sallybeauty.com/search?q="+x+"&rad=100"+' '+"\n");
					fw.flush();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			});
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("file not found");
		}
		return st+"\n";
	}

}
