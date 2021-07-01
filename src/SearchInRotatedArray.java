
public class SearchInRotatedArray {

	public static void main(String[] args) {
		int [] nums = {4, 5, 6,7, 0,1, 2};
		int target = 0;
		System.out.println(search(nums, target));
	}

//	//o(n) time
//	private static int search(int[] nums, int target) {
//		int index = -1;
//		for(int i=0;i<nums.length;i++) {
//			if(nums[i] == target) {
//				index = i;
//			}
//		}
//		return index;
//	}
	//o(log n)
	private static int search(int[] nums, int target) {
		 if (nums == null || nums.length == 0) return -1;
		int left = 0, right = nums.length-1;
		while(left <= right) {
			int mid = left +(right - left)/2;
			if(nums[mid] == target) {
				return mid;
			}
			if(nums[mid] < nums[right]) {
				if(nums[mid] < target && target <= nums[right]) {
					left = mid+1;
				} else {
					right = mid-1;
				}
			} else if(nums[mid] > nums[right]) {
				if(nums[mid] > target && nums[left] <= target) {
					right = mid-1;
				} else {
					left = mid+1;
				}
			} else {
				 return -1;
			}
		}
		return -1;
	}

}
