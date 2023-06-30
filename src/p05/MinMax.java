package p05;

public class MinMax {

	public static void main(String[] args) {
		int[] nums = new int[] {10, 22, 5, 8, 25};
		
		int max = nums[0];
		int min = nums[0];
		int maxIdx = 0;
		int minIdx = 0;
		
		for(int i=1; i<nums.length; i++) { 
			if(max < nums[i]) {
				max = nums[i];
				maxIdx = i;
			} else if(min > nums[i]) {
				min = nums[i];
				minIdx = i;
			}
		}
		
		System.out.println("배열 중에서 최대값 : " + max + ", index : " + maxIdx);
		System.out.println("배열 중에서 최소값 : " + min + ", index : " + minIdx);
	}

}
