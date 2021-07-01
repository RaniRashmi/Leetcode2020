import java.util.HashMap;
import java.util.Scanner;

public class MaxLengthContigousArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] nums = {0,0,1,0,0,0,1,1};
		System.out.println(findMaxLength(nums));
	}

	private static int findMaxLength(int[] nums) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(0, -1);
		int maxLength =0;int count =0;
		for(int i=0;i<nums.length;i++) {
			if(nums[i] ==0) {
				count = count - 1;
			}else {
				count = count + 1;
			}
			
			if(map.containsKey(count)) {
				maxLength = Math.max(maxLength, i- map.get(count));
			} else {
				map.put(count, i);
			}
		}
		return maxLength;
	}

}
