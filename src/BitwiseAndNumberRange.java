/*
 * 
 */
public class BitwiseAndNumberRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int rangeBitwiseAnd(int m, int n) {
		int result =0;
		while(m>0 && n>0) {
			int msb_m = getMSB(m);
			int msb_n = getMSB(n);
			
			if(msb_m != msb_n) {
				break;
			}
			
			int msb_value = 1<<msb_m;
			result = result+msb_value;
			
			m = m- msb_value;
			n = n- msb_value;
		}
		return result;
	}

	private int getMSB(int m) {
		int msbPosition =-1;
		while(m > 0) {
			m = m >>1;
			msbPosition++;
		}
		return msbPosition;
	}
	
	

}
