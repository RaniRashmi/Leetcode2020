
public class ProductExceptSelf {

	public static void main(String[] args) {
		int [] nums = {1, 2, 3,4};
		int [] arr = productExceptSelf(nums);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

	//without extra space
	private static int[] productExceptSelf(int[] nums) {
		int n = nums.length;
		int [] result = new int[n];
		result[0] = 1;
		for(int i=1;i<n;i++) {
			result[i] = nums[i-1] * result[i-1] ;
		}
		int temp=1;
		for(int i=n-1;i>=0;i--) {
			result[i] = result[i] * temp;
			temp = temp* nums[i];
		}
		return result;
	}
	
	// with extra space
//	private static int[] productExceptSelf(int[] nums) {
//		int n = nums.length;
//		int [] result = new int[n];
//		int [] left = new int[n];
//		int [] right = new int[n];
//		left[0] = 1;
//		right[n-1] = 1;
//		for(int i=1;i<n;i++) {
//			left[i] = nums[i-1] * left[i-1] ;
//		}
//		int temp=1;
//		for(int i=n-2;i>=0;i--) {
//			right[i] = nums[i+1] * right[i+1];
//		}
//		
//		for(int i=0;i<n;i++) {
//			result[i] = left[i]*right[i];
//		}
//		return result;
//	}

}
