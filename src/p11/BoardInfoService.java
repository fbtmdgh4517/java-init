package p11;

import java.util.List;
import java.util.Map;

public class BoardInfoService {

	public List<Map<String, String>> getBoardInfoList(Map<String, String> param) {
		BoardInfoRepository biRepo = new BoardInfoRepository();
		return biRepo.getBoardInfoList(param);
	}
	
	public int insertBoardInfoList(Map<String, String> param) {
		BoardInfoRepository biRepo = new BoardInfoRepository();
		return biRepo.insertBoardInfo(param);
	}
	
	public int deleteBoardInfoList(Map<String, String> param) {
		BoardInfoRepository biRepo = new BoardInfoRepository();
		return biRepo.deleteBoardInfo(param);
	}
	
	public int updateBoardInfoList(Map<String, String> param) {
		BoardInfoRepository biRepo = new BoardInfoRepository();
		return biRepo.updateBoardInfo(param);
	}
}
