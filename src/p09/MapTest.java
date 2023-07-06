package p09;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTest {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("age", 33);
		map.put("age", 1);		// age가 하나 더 추가되는게 아니라 위에서 추가했던 age의 값이 1로 바뀜
		map.put("like", 7);
		map.put("rank", 11);	// map은 순서 없음
		
		Set<String> keySet = map.keySet();	// 키가 string이라서 String임
		Iterator<String> it = map.keySet().iterator();
		
		while(it.hasNext()) {	// 다음거 갖고 있냐
			String key = it.next();
			System.out.println("key : " + key + ", value : " + map.get(key));
		}
	}
}
