import java.util.Scanner;
/*
 * check for non-zeros and move then towards start. and after that add all zero
 */
public class MoveZerosToEnd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int [] arr = new int[size];
		for(int i=0;i<size;i++) {
			arr[i] = sc.nextInt();
		}
		moveZeroes(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	private static void moveZeroes(int[] nums) {
		int countNonZeros = 0;
		for(int i=0;i<nums.length;i++) {
			if(nums[i] != 0) {
				nums[countNonZeros++] = nums[i];
			}
		}
		
		for(int i=countNonZeros;i<nums.length;i++) {
			nums[i] = 0;
		}
	}

}
