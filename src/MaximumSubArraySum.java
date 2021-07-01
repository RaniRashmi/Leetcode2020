import java.util.Scanner;

public class MaximumSubArraySum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int [] arr = new int[size];
		for(int i=0;i<size;i++) {
			arr[i] = sc.nextInt();
		}
		int maxSubArraySum = maxSubArray(arr);
		System.out.println(maxSubArraySum);
	}

	//using kanade algorithm O(n)
	private static int maxSubArray(int[] nums) {
//		int finalSum = nums[0],sum = 0;
//		// check if all are negative
//		for(int i = 1;i < nums.length; ++i)	
//			finalSum = Math.max(finalSum,nums[i]);	
//		if(finalSum<0)					
//			return finalSum;
//		finalSum = 0;
//		for(int i = 0 ;i < nums.length; ++i)
//		{
//			if(sum + nums[i] > 0)
//				sum+=nums[i];
//			else
//				sum  = 0;
//			finalSum = Math.max(finalSum,sum);	
//		}
//		return finalSum;
		int max = Integer.MIN_VALUE, sum = 0;
	    for (int i = 0; i < nums.length; i++) {
	        if (sum < 0) 
	            sum = nums[i];
	        else 
	            sum += nums[i];
	        if (sum > max)
	            max = sum;
	    }
	    return max;
	}
	
	//using divide and conquer problem o(nlogn)
//	private static int maxSubArray(int[] nums) {
//		return maxSubArray(nums, nums.length);
//	}
//
//	private static int maxSubArray(int[] nums, int n) {
//		if(n==1)
//		{
//			return nums[0];
//		}
//		int m = n/2;
//		int leftMaxSubArray = maxSubArray(nums, m);
//		int rightMaxSubArray = maxSubArray(nums,n-m);
//		
//		int leftsum = Integer.MIN_VALUE;
//		int rightsum = Integer.MIN_VALUE;
//		int sum = 0;
//		for (int i = m;i < n; i++)
//		{
//			sum += nums[i];
//			rightsum = Math.max(rightsum,sum);
//		}
//		sum = 0;
//		for (int i = (m - 1);i >= 0; i--)
//		{
//			sum += nums[i];
//			leftsum = Math.max(leftsum,sum);
//		}
//		int ans = Math.max(leftMaxSubArray,rightMaxSubArray);
//		return Math.max(ans,leftsum + rightsum);
//	}
}
