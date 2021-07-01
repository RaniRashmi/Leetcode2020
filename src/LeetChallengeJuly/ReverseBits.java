package LeetChallengeJuly;

public class ReverseBits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	  public int reverseBits(int n) {
	        int result =0;
	        for(int i=0;i<32;i++){
	            result <<=1;
	            if((n&1) >0) result++;
	            n >>=1;
	        }
	        return result;
	    }

}
