package p11;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserInfoController {
	public List<Map<String, String>> getUserInfoList(Map<String, String> param) {	// 기본형은 눌 대입 안되고 참조형은 null 대입 됨
		UserInfoService uiService = new UserInfoService();
		return uiService.getUserInfoList(param);
	}
	
	public int insertUserInfo(Map<String, String> userInfo) {
		UserInfoService uiService = new UserInfoService();
		return uiService.insertUserInfo(userInfo);
	}
	
	public int deleteUserInfo(Map<String, String> userInfo) {
		UserInfoService uiService = new UserInfoService();
		return uiService.deleteUserInfo(userInfo);
	}
	
	public static void main(String[] args) {	// 스태틱 안에서 논스태틱은 바로 못 쓰고 논스태틱 안에서는 스태틱 바로 쓸 수 있음
		UserInfoController uiController = new UserInfoController();
//		Scanner scan = new Scanner(System.in);
		Map<String, String> param = new HashMap<>();		// new로 만들은거는 아무 값도 없다고 null이 아님, 그런데 param.get()의 값은 null
		
//		SELECT
//		param.put("uiName", "A");
//		List<Map<String, String>> userInfoList = uiController.getUserInfoList(param);
//		System.out.println("번호\t이름\t아이디\t비밀번호");
//		for(Map<String, String> userInfo : userInfoList) {
//			System.out.print(userInfo.get("uiNum") + "\t");
//			System.out.print(userInfo.get("uiName") + "\t");
//			System.out.print(userInfo.get("uiId") + "\t");
//			System.out.print(userInfo.get("uiPwd") + "\t");
//		}
		
//		INSERT
//		param.put("uiName", "철수");
//		param.put("uiId", "cs");
//		param.put("uiPwd", "asd");
//		
//		int result = uiController.insertUserInfo(param);
//		System.out.println("결과 : " + result);
		
//		DELETE
		param.put("uiId", "cs");
		
		int result = uiController.deleteUserInfo(param);
		System.out.println("결과 : " + result);
	}
}
