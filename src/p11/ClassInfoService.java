package p11;

import java.util.List;
import java.util.Map;

public class ClassInfoService {

	public List<Map<String, String>> getClassInfo(Map<String, String> param) {
		ClassInfoRepository ciRepo = new ClassInfoRepository();
		return ciRepo.getClassInfos(param);
	}
	
	public int insertClassInfo(Map<String, String> param) {
		ClassInfoRepository ciRepo = new ClassInfoRepository();
		return ciRepo.insertClassInfos(param);
	}
	
	public int deleteClassInfo(Map<String, String> param) {
		ClassInfoRepository ciRepo = new ClassInfoRepository();
		return ciRepo.deleteClassInfos(param);
	}
}
