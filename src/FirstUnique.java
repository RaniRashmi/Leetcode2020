import java.util.HashMap;
import java.util.Map;

public class FirstUnique {

	 public class Node{
	        int value;
	        Node next, prev;
	        public Node(int value){
	            this.value = value;
	            next = prev = null;
	        }
	    }
	    
	    public class MyDoublyLinkedList{
	        private Node head;
	        private Node tail;
	        public MyDoublyLinkedList(){
	            head = new Node(-1);
	            tail = new Node(-1);
	            
	            head.next = tail;
	            tail.prev = head;
	        }
	        
	        public Node getFirst(){
	            return head.next;
	        }
	        
	        public boolean isEmpty(){
	            return head.next == tail;
	        }
	        
	        public void remove(Node node){
	            Node _prev = node.prev;
	            Node _next = node.next;
	            _prev.next = _next;
	            _next.prev = _prev;
	        }
	        
	        public void append(int value){
	            Node node = new Node(value);
	            Node _prev = tail.prev;
	            _prev.next = node;
	            node.next = tail;
	            tail.prev = node;
	            _prev.prev = _prev;
	        }
	    }
	    
	    private MyDoublyLinkedList key;
	    private Map<Integer, Node> map;
	    
	    public FirstUnique(int[] nums) {
	        map = new HashMap<>();
	        key = new MyDoublyLinkedList();
	        for(int n : nums){
	            add(n);
	        }
	    }
	    
	    public int showFirstUnique() {
	        if(key.isEmpty()){
	            return -1;
	        }
	        return key.getFirst();
	    }
	    
	    public void add(int value) {
	        if(map.containsKey(value)){
	            if(map.get(value) != null){
	                key.remove(map.get(value));
	                map.put(value, null);
	            }
	        } else{
	            Node node = new Node(value);
	            map.put(value, node);
	        }
	    }
}
