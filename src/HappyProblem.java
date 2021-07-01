

import java.util.Scanner;

public class HappyProblem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
        boolean flag = isHappy(x);
        System.out.println(flag);
	}
	
    public static boolean isHappy(int n) {
    	
    	
    	int slow, fast;
        slow = fast = n; 
        do
        { 
            slow = findSquareOfDigit(slow); 
      
            fast = findSquareOfDigit(findSquareOfDigit(fast)); 
       
        } 
        while (slow != fast); 
        return (slow == 1); 
    }

	private static int findSquareOfDigit(int n) {
		 int sum = 0; 
	        while (n != 0)  
	        { 
	            int digit = n % 10; 
	            sum += digit * digit; 
	            n = n / 10; 
	        } 
	        return sum;
	}

}
