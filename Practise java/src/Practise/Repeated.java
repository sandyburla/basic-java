package Practise;

public class Repeated {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "if you can dream it, then you can do it";
		s = s.replace(" ", "");
		char[] ch = s.toCharArray();
		char[] chh = null;
		for(int i =0;i<ch.length;i++) {
			if(!chh.equals(ch[1])) {
				for(int j=0;j<ch.length;j++) {
					chh[j]=ch[i];
				}
			}
		}
				for (int k = 0; k < chh.length; k++) {
					
				System.out.println(chh[k]);}
	}

}
