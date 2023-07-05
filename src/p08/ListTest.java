package p08;

import java.util.ArrayList;

public class ListTest {

	public static void main(String[] args) {
		String str = "안녕, ";
		String str2 = "내 소개를";
		String str3 = " 하지";
		String str4 = " 내 직업은";
		String str5 = " 대학생";
		
		String[] strs = new String[5];
		strs[0] = str;
		strs[1] = str2;
		strs[2] = str3;
		strs[3] = str4;
		strs[4] = str5;
		
//		for(int i=0; i<strs.length; i++) {
//			System.out.print(strs[i]);
//		}
		
		ArrayList<String> strList = new ArrayList<String>();	// 꺽새에 기본형 데이터 타입 못들어감 int같은 소문자로 시작하는거x
		strList.add("1");
		strList.add("2");
		strList.add("3");
		strList.remove(0);
		System.out.println(strList.size());
		System.out.println(strList);	// 주소가 아니라 배열 내용 나오는 이유 - toString()
		System.out.println(strList.get(0));
		
		ArrayList<Integer> intList = new ArrayList<Integer>();
		intList.add(1);
	}
}
