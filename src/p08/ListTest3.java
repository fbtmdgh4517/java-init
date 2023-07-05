package p08;

import java.util.ArrayList;
import java.util.List;

public class ListTest3 {

	public static void main(String[] args) {
		ArrayList<String> strList = new ArrayList<>();	// 자바1.7 부터 오른쪽 꺽새 안에 생략가능
		/*
		 * Collection Framework
		 * List, Map, Set : 인터페이스
		 */
		List<String> strList2 = new ArrayList<>();	// 리스트는 메모리 생성이 안되서 ArrayList로 생성
		strList2.add("안녕");
		System.out.println(strList2.get(0));
		strList2.remove(0);
		System.out.println(strList2.get(0));
	}
}
