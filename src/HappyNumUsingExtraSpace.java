

import java.util.HashSet;
import java.util.Scanner;

public class HappyNumUsingExtraSpace {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
        boolean flag = isHappy(x);
        System.out.println(flag);
	}

	private static boolean isHappy(int n) {
		HashSet<Integer> set = new HashSet<Integer>();
		while(n != 1) {
			int current = n;
			int sum =0;
			while(current != 0) {
				sum += (current%10) *(current%10);
				current /=10;
			}
			
			if(set.contains(sum)) {
				return false;
			}
			
			set.add(sum);
			n = sum;
		}
		return true;
	}

}
