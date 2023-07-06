package p09;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListTest5 {

	public static void main(String[] args) {
		List<Integer> numList = new ArrayList<>();
		numList.add(10);
		numList.add(1);
		numList.add(35);
		numList.add(17);
		numList.add(4);
//		Collections.sort(numList); Collections 클래스의 sort는 스태틱 메소드라서 메모리 생성 안해도 됨
		for(int i=0; i<numList.size(); i++) {
			for(int j=i+1; j<numList.size(); j++) {
				if(numList.get(i) > numList.get(j)) {
					int tmp = numList.get(i);
					numList.set(i, numList.get(j));
					numList.set(j, tmp);
				}
			}
		}
		
		System.out.println(numList);
	}
}
