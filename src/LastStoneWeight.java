import java.util.PriorityQueue;

public class LastStoneWeight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] stones = {2, 7, 4, 1,8,1};
		System.out.println(lastStoneWeight(stones));

	}

	  public static int lastStoneWeight(int[] stones) {
	        PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>();
	        for(int stone : stones){
	            maxHeap.add(-stone);
	        }
	        
	     
	        System.out.print(maxHeap);
	       
	        
	        while(maxHeap.size() > 1){
	            int firstStone = -maxHeap.remove();
	            int secondStone = -maxHeap.remove();
	            
	            if(firstStone != secondStone){
	                maxHeap.add(-(firstStone-secondStone));
	            }
	        }
	        
	        return maxHeap.isEmpty() ? 0 : -maxHeap.remove();
	    }
}
