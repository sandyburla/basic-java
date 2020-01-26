package java_8features;

interface Demo{
	void show();
}

public class impleInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Demo d = 	new Demo() {

			public void show()
			{
				// TODO Auto-generated method stub
				System.out.println("hello java world");
				
			}
		};
			d.show();

	}

}
