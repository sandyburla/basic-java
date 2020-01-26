package Multithreading;

public class ExceptionE {

	public static void main(String[] args) throws Exception  {
		//throw new Exception();
		//System.out.println(10/0);
		try {
			System.out.println(10/0);
			System.exit(0);
		}catch(Exception e) {
		
		}finally {
			System.out.println("===================");
		}

}
}