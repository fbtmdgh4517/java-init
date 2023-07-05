package p08;

import java.util.ArrayList;

public class ListTest2 {

	public static void main(String[] args) {
		float[] fls = new float[3];
		fls[0] = 1.1F;
		fls[1] = 22.1F;
		fls[2] = 0.1111F;
		
		char[] chars = new char[3];
		chars[0] = 'a';
		chars[1] = 'b';
		chars[2] = 'd';
		
		String[] strs = new String[3];
		strs[0] = "우리";
		strs[1] = "모두";
		strs[2] = "화이팅";
		
		ArrayList<Float> floatList = new ArrayList<Float>();
		floatList.add(1.1F);
		floatList.add(22.1F);
		floatList.add(0.1111F);
		for(int i=0; i<floatList.size(); i++) {
			System.out.println(floatList.get(i));			
		}
		
		ArrayList<Character> charList = new ArrayList<Character>();
		charList.add('a');
		charList.add('b');
		charList.add('d');
		for(int i=0; i<charList.size(); i++) {
			System.out.println(charList.get(i));			
		}
		
		ArrayList<String> strList = new ArrayList<String>();
		strList.add("우리");
		strList.add("모두");
		strList.add("화이팅");
		for(int i=0; i<strList.size(); i++) {
			System.out.println(strList.get(i));
		}
	}
}
