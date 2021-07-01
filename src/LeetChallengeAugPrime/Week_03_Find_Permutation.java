package LeetChallengeAugPrime;

import java.util.Scanner;
import java.util.Stack;

public class Week_03_Find_Permutation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		int [] arr = findPerm(A);
	    for(int i=0;i<arr.length;i++) {
	    	System.out.print(arr[i]+" ");
	    }
		
		
	}
	// will fail for lexographical order DDIIIDD -> will print bigger one
//	public static int[] findPerm(String A) {
//        int [] listArr = new int[A.length()+1];
//        int max = A.length()+1, min =1;
//        for(int i=0;i<A.length();i++){
//        	char c = A.charAt(i);
//            if(c == 'D'){
//            	listArr[i] = max;
//                max --;
//            } else{
//            	listArr[i] = min;
//                min++;
//            }
//        }
//        listArr[A.length()] = min;
//        return listArr;
//    }
	
	
	public static int[] findPerm(String s) {
        
	      int[] per = new int[s.length()+1];
	       Stack<Integer> stack = new Stack();
	       int index = 0;
	       
	       for(int i=0;i<s.length();i++){
	           if(s.charAt(i)=='I'){
	                stack.add(i+1);
	                while(!stack.isEmpty()){
	                    per[index++] = stack.pop();
	                }
	           }else{
	                stack.add(i+1);
	           }
	       }
	       
	       stack.add(s.length()+1);
	       while(!stack.isEmpty()){
	                    per[index++] = stack.pop();
	                }
	     
	       return per;
	}

}
