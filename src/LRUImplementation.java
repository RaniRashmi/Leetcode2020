

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUImplementation {
	
	Map<Integer,Integer> map;
    int capacity;
    
    public LRUImplementation(int capacity) {
    	this.capacity = capacity;
    	map = new LinkedHashMap<>();
    }
    
    public int get(int x) {
    	if(map.containsKey(x)) {
    		int value = map.get(x);
    		map.remove(x);
    		map.put(x, value);
    		return value;
    	}
    	return -1;
    }
    
    public void set(int x, int y) {
    	if(map.containsKey(x)) {
    		map.remove(x);
    		map.put(x, y);
    		return;
    	}
    	if(map.size() == capacity) {
    		int leastRecent = map.entrySet().iterator().next().getKey();
    		map.remove(leastRecent);
    	}
    	map.put(x, y);
    }
	public static void main(String[] args) {
		
	}
	
	

}
