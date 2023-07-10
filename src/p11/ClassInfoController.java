package p11;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ClassInfoController {

	public List<Map<String, String>> getClassInfo(Map<String, String> param) {
		ClassInfoService ciService = new ClassInfoService();
		return ciService.getClassInfo(param);
	}
	
	public int insertClassInfo(Map<String, String> param) {
		ClassInfoService ciService = new ClassInfoService();
		return ciService.insertClassInfo(param);
	}
	
	public int deleteClassInfo(Map<String, String> param) {
		ClassInfoService ciService = new ClassInfoService();
		return ciService.deleteClassInfo(param);
	}
	
	public static void main(String[] args) {
		ClassInfoController ciCon = new ClassInfoController();
		Map<String, String> param = new HashMap<>();
/**		SELECT		**/
//		param.put("ciName", "학");
//		List<Map<String, String>> classInfos = ciCon.getClassInfo(param);
//		
//		System.out.println("번호\t과목명\tDESC");
//		for(Map<String, String> classInfo : classInfos) {
//			System.out.print(classInfo.get("ciNum") + "\t");
//			System.out.print(classInfo.get("ciName") + "\t");
//			System.out.print(classInfo.get("ciDesc") + "\t");
//			System.out.println();
//		}
		
/**		INSERT		**/
//		param.put("ciName", "사회");
//		param.put("ciDesc", "어려움");
//		System.out.println("결과 : " + ciCon.insertClassInfo(param));
//		
////		int result = ciCon.insertClassInfo(param);
////		System.out.println("결과 : " + result);
		
/**		DELETE		**/
//		param.put("ciNum", "5");
//		
//		int result = ciCon.deleteClassInfo(param);
//		System.out.println("결과 : " + result);
	}
}
