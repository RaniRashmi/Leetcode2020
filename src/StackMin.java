import java.util.Stack;

//public class StackMin {
//	 Stack<Integer> stack;
//	    int minEle;
//	    public StackMin() {
//	        stack = new Stack<Integer>();
//	        minEle = Integer.MAX_VALUE;
//	    }
//	    
//	    public void push(int x) {
//	       if(x <= minEle){
//	           stack.push(minEle);
//	           minEle = x;
//	       } 
//	        
//	        stack.push(x);
//	    }
//	    
//	    public void pop() {
//	        if(stack.pop() == minEle){
//	            minEle = stack.pop();
//	        }
//	    }
//	    
//	    public int top() {
//	        return stack.peek();
//	    }
//	    
//	    public int getMin() {
//	        return minEle;
//	    }
//}


// using two stack 

public class StackMin {
	 Stack<Integer> stack;
	 Stack<Integer> minStack;
	    public StackMin() {
	        stack = new Stack<Integer>();
	        minStack =  new Stack<Integer>();
	    }
	    
	    public void push(int x) {
	        if(minStack.isEmpty() || x<= minStack.peek()) {
	        	minStack.push(x);
	        }
	        stack.push(x);
	    }
	    
	    public void pop() {
	       if(stack.peek().equals(minStack.peek())) {
	    	   minStack.pop();
	       }
	       stack.pop();
	    }
	    
	    public int top() {
	        return stack.peek();
	    }
	    
	    public int getMin() {
	        return minStack.peek();
	    }
}
