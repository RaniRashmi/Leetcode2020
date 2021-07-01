/*
 * 136. Single Number
Easy

4100

152

Add to List

Share
Given a non-empty array of integers, every element appears twice except for one. Find that single one.

Note:

Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

Example 1:

Input: [2,2,1]
Output: 1
Example 2:

Input: [4,1,2,1,2]
Output: 4
 */
import java.util.Scanner;

/*
 * Given a non-empty array of integers, every element appears twice except for one. Find that single one.
 */
public class SingleNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int [] arr = new int[size];
		for(int i=0;i<size;i++) {
			arr[i] = sc.nextInt();
		}
		int SingleNum = singleNumber(arr);
		System.out.println(SingleNum);
	}
	
	public static int singleNumber(int[] nums) {
		
		/* o(n) extra space
		 * *
		 */
//      HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
//      for(int i=0;i<nums.length;i++){
//          if(!map.containsKey(nums[i])){
//              map.put(nums[i], 1);
//          } else{
//              map.put(nums[i], map.get(nums[i])+1);
//          }
//      }
     
//      for(int i=0;i<nums.length;i++){
//          if(map.get(nums[i]) == 1){
//              return nums[i];
//          }
//      }
//      return -1;
     
		
	/*
	 *  o(1) extra space
	 */
//     int num = nums[0];
//     for(int i=1;i<nums.length;i++){
//         num = num^nums[i];
//     }
//     return num;
//     
     /*
      * what if other number appear trice then xor will not work
      * 
      */
		
		int firstOccurence = 0;
		int secondOccurence =0;
		int common;
		
		for(int i=0;i<nums.length;i++) {
			secondOccurence = secondOccurence | (firstOccurence & nums[i]);
			firstOccurence  = firstOccurence ^ nums[i];
			
			common = ~(firstOccurence & secondOccurence);
			firstOccurence  = common&firstOccurence;
			secondOccurence = common&secondOccurence;
			
			System.out.println(" common : "+ common+" firstOccurence : "+firstOccurence+  " secondOccurence : "+secondOccurence);
		}
		
		return firstOccurence;
 }

}
