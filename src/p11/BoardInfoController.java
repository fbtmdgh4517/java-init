package p11;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BoardInfoController {

	public List<Map<String, String>> getBoardInfoList(Map<String, String> param) {
		BoardInfoService biService = new BoardInfoService();
		return biService.getBoardInfoList(param);
	}
	
	public int insertBoardInfo(Map<String, String> param) {
		BoardInfoService biService = new BoardInfoService();
		return biService.insertBoardInfoList(param);
	}
	
	public int deleteBoardInfo(Map<String, String> param) {
		BoardInfoService biService = new BoardInfoService();
		return biService.deleteBoardInfoList(param);
	}
	
	public int updateBoardInfo(Map<String, String> param) {
		BoardInfoService biService = new BoardInfoService();
		return biService.updateBoardInfoList(param);
	}
	
	public static void main(String[] args) {
		BoardInfoController biCon = new BoardInfoController();
		Map<String, String> param = new HashMap<>();
/**		SELECT		**/
////		param.put(null, null);
//		List<Map<String, String>> boardInfos = biCon.getBoardInfoList(param);
//		
//		System.out.println("게시물번호\t제목\t내용\t작성자\t시간\t카운트");
//		for(Map<String, String> boardInfo : boardInfos) {
//			System.out.print(boardInfo.get("biNum") + "\t");
//			System.out.print(boardInfo.get("biTitle") + "\t");
//			System.out.print(boardInfo.get("biContent") + "\t");
//			System.out.print(boardInfo.get("biWriter") + "\t");
//			System.out.print(boardInfo.get("biCredat") + "\t");
//			System.out.print(boardInfo.get("biCnt") + "\t");
//			System.out.println();
//		}
		
/**		INSERT		**/
//		param.put("biTitle", "제목1");
//		param.put("biContent", "내용1");
//		param.put("biWriter", "글쓴이1");
//		param.put("biCnt", "0");
//		
//		System.out.println("반영 행 개수 : " + biCon.insertBoardInfo(param));
		
/**		DELETE		**/
//		param.put("biNum", "2");
//		
//		System.out.println("반영 행 개수 : " + biCon.deleteBoardInfo(param));

/**		UPDATE		**/
		param.put("biNum", "1");
		param.put("biCnt", "1");
		int result = biCon.updateBoardInfo(param);
		System.out.println("결과 : " + result);
	}
}
