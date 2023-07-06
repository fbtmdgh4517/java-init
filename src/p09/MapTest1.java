package p09;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class MapTest1 {
	public static void putData(Map<String, String> map, String id, String campus, String name, String dept) {
		map.put("학번", id);
		map.put("캠퍼스", campus);
		map.put("성명", name);
		map.put("학과", dept);
	}

	public static void main(String[] args) {
		Map<String, String> m1 = new HashMap<>();
//		m1.put("학번", "2024129");
//		m1.put("캠퍼스", "메트로폴");
//		m1.put("성명", "류승호");
//		m1.put("학과","컴퓨터공학과");
		putData(m1, "2024129", "메트로폴", "류승호", "컴퓨터공학과");
		
		Map<String, String> m2 = new HashMap<>();
//		m2.put("학번", "2024000");
//		m2.put("캠퍼스", "메트로폴");
//		m2.put("성명", "김승호");
//		m2.put("학과","컴퓨터공학과");
		putData(m2, "2024000", "메트로폴", "김승호", "컴퓨터공학과");
		
		
		Map<String, String> m3 = new HashMap<>();
//		m3.put("학번", "2024001");
//		m3.put("캠퍼스", "메트로폴");
//		m3.put("성명", "이승호");
//		m3.put("학과","컴퓨터공학과");
		putData(m3, "2024001", "메트로폴" , "이승호", "컴퓨터공학과");
		
		Map<String, String> m4 = new HashMap<>();
//		m4.put("학번", "2024002");
//		m4.put("캠퍼스", "메트로폴");
//		m4.put("성명", "박승호");
//		m4.put("학과","컴퓨터공학과");
		putData(m4, "2024002", "메트로폴", "박승호", "컴퓨터공학과");
		
		Map<String, String> m5 = new HashMap<>();
//		m5.put("학번", "2024003");
//		m5.put("캠퍼스", "메트로폴");
//		m5.put("성명", "최승호");
//		m5.put("학과","컴퓨터공학과");
		putData(m5, "2024003", "메트로폴", "최승호", "컴퓨터공학과");
		
		List<Map<String, String>> mapList = new ArrayList<>();
		mapList.add(m1);
		mapList.add(m2);
		mapList.add(m3);
		mapList.add(m4);
		mapList.add(m5);
		// i를 데이터 가져올때만 쓴다면 향상된 for문 사용, 향상된 for문은 배열이나 리스트같이 인덱스가 있는 것만 사용가능
		for(Map<String, String> map : mapList) {
			Iterator<String> it = map.keySet().iterator();
			while(it.hasNext()) {
				String key = it.next();
				System.out.println(key + " : " + map.get(key) + ",");
			}
			System.out.println();
		}
		
//		for(int i=0; i<mapList.size(); i++) {
//			Map<String, String> map = mapList.get(i);
//			Iterator<String> it = map.keySet().iterator();
//			while(it.hasNext()) {
//				String key = it.next();
//				System.out.println(key + " : " + map.get(key) + ",");
//			}
//			System.out.println();
//		}
	}
}
