package java_8features;

public class InterfaceImpl implements DefaultInterface,StaticInterface  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InterfaceImpl impl = new InterfaceImpl();
		impl.display();
		System.out.println(impl.show());
		StaticInterface.name();
		DefaultInterface.dis();
		impl.show();
	}

	@Override
	public String show() {
		// TODO Auto-generated method stub
		return "implementing declared class in interface";
	}

}
