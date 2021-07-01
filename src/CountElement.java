import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class CountElement {

	public static void main(String[] args) {
		int [] arr = {1,1,2,3};
		int count = countElements(arr);
		System.out.println(count);
	}

	private static int countElements(int[] arr) {
		Set<Integer> set = new HashSet<>();
		for(int num : arr) {
			set.add(num);
		}
		int count =0;
		for(int i=0;i<arr.length;i++) {
			if(set.contains(arr[i]+1)) {
				count++;
			}
		}
		return count;
	}

}
