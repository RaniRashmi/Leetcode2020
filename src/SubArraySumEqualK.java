import java.util.HashMap;

public class SubArraySumEqualK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int [] nums = {1, 0, 1, 2, -1};
       int k =2;
       System.out.println(subarraySum(nums,k));
	}
	
	public static int subarraySum(int[] nums, int k) {
		if(nums.length ==0) return 0;
		int count =0; int currentSum =0;
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i=0;i<nums.length;i++) {
			currentSum += nums[i];
			
			if(currentSum == k) count++;
			
			//there is an array from 0 to ...(0,1,2,-1)
			if(map.containsKey(currentSum-k)) {
				count += map.get(currentSum-k);
			}
			if(map.containsKey(currentSum)) {
				map.replace(currentSum, map.get(currentSum)+1);
			} else {
				map.put(currentSum, 1);
			}
		}
		return count;
	}

}
