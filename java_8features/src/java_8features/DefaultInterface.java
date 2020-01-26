package java_8features;

public interface DefaultInterface {

	public String show();
	
	default void display() {
		System.out.println("Hi this is default interface"); 
	}
	
	static void dis() {
		System.out.println(12+13);
	}
	 
}
