
/**
 * // This is the BinaryMatrix's API interface.
 * // You should not implement it, or speculate about its implementation
 * 
 * interface BinaryMatrix {
 *     public int get(int x, int y) {}
 *     public List<Integer> dimensions {}
 * };
 */
public class LeftMostColumnWithOne {

	public static void main(String[] args) {
		
	}
	
	public static int leftMostColumnWithOne(BinaryMatrix binaryMatrix) {
		List<Integer>  dimension = binaryMatrix.dimensions();
        int row = dimension.get(0);
        int col = dimension.get(1);
        
        if(row == 0 || col ==0) return -1;
        
        int output = -1;
        int r = 0, c = col-1;
        
        while(r < row && c >=0){
            if(binaryMatrix.get(r,c) ==1){
                output = c;
                c--;
            } else{
                r++;
            }
        }
        return output;
	}

}
