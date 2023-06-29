package p03;

public class TwoDArray {

	public static void main(String[] args) {
		int[][] numsArray = new int[3][3];
		int count = 0;
		
//		for(int i=0; i<numsArray.length; i++) { 
////			System.out.println(numsArray[i].length);
//			for(int j=0; j<numsArray[i].length; j++) {
////				count++;
////				numsArray[i][j] = count; 
//			}
//			
//			for(int j=0; j<numsArray[i].length; j++) {
//				System.out.println("numsArray[" + i + "][" + j + "] = " + numsArray[i][j]);
//			}
//		}
		// 0 * 3 + 0 + 1 = 1
		// 1 * 3 + 0 + 1 = 4
		// 2 * 3 + 0 + 1 = 7
		// 0 * 3 + 1 + 1 = 2
		// 1 * 3 + 1 + 1 = 5
		// 2 * 3 + 1 + 1 = 8
		// 0 * 3 + 2 + 1 = 3
		// 1 * 3 + 2 + 1 = 6
		// 2 * 3 + 2 + 1 = 9

		for(int i=0; i<numsArray[0].length; i++) { 
			for(int j=0; j<numsArray.length; j++) {
				numsArray[j][i] = j * numsArray[i].length + i + 1;
			}
			
//			for(int j=0; j<numsArray.length; j++) {
//				System.out.println("numsArray[" + j + "][" + i + "] = " + numsArray[j][i]);
//			}
		}
		
		for(int i=0; i<numsArray.length; i++) {	
			for(int j=0; j<numsArray[i].length; j++) {
				System.out.println("numsArray[" + i + "][" + j + "] = " + numsArray[i][j]);
			}
		}
	}

}
