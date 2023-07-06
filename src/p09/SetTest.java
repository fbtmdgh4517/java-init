package p09;

import java.util.HashSet;
import java.util.Set;

public class SetTest {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		System.out.println(set.size());
		set.add(1);
		set.add(1);
		set.add(1);		// 같은 값은 중복 안되서 안들어감, 그래서 중복제거는 set을 이용?
		System.out.println(set.size());
	}
}
