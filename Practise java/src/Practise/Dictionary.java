package Practise;

public class Dictionary {

	String s = "abcd";
	StringBuilder sb = new StringBuilder();

	public static void main(String[] args) {

		Dictionary ds = new Dictionary();
		ds.iterate(0);

	}

	private void iterate(int i) {
		// TODO Auto-generated method stub
		for (int x = i; x < s.length(); ++x) {
			sb.append(s.charAt(x));
			System.out.println(sb);
			if (x < s.length()) {
				iterate(x + 1);
			}
			sb.setLength(sb.length() - 1);
		}

	}

}