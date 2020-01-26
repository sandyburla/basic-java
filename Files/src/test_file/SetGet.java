package test_file;

public class SetGet {
	
	public static String getFather() {
		return father;
	}
	public static void setFather(String father) {
		SetGet.father = father;
	}
	public static String getName() {
		return name;
	}
	public static void setName(String name) {
		SetGet.name = name;
	}
	public static String getSchool() {
		return school;
	}
	public static void setSchool(String school) {
		SetGet.school = school;
	}
	public static Integer getId() {
		return id;
	}
	public static void setId(Integer id) {
		SetGet.id = id;
	}
	public static boolean isId() {
		return Id;
	}
	public static void setId(boolean id) {
		Id = id;
	}
	private static String father;
	private static String name;
	private static String school;
	private static Integer id;
	private static boolean Id;
	

}
