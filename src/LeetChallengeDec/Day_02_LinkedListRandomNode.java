/*
 * Given a singly linked list, return a random node's value from the linked list. Each node must have the same probability of being chosen.

Follow up:
What if the linked list is extremely large and its length is unknown to you? Could you solve this efficiently without using extra space?

Example:

// Init a singly linked list [1,2,3].
ListNode head = new ListNode(1);
head.next = new ListNode(2);
head.next.next = new ListNode(3);
Solution solution = new Solution(head);

// getRandom() should return either 1, 2, or 3 randomly. Each element should have equal probability of returning.
solution.getRandom();

 */
package LeetChallengeDec;

import java.util.Random;

public class Day_02_LinkedListRandomNode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	  /** @param head The linked list's head.
    Note that the head is guaranteed to be not null, so it contains at least one node. */
	ListNode head;
	Random random;
	public Day_02_LinkedListRandomNode(ListNode head) {
	    this.head = head;
	    this.random = new Random();
	}
	
	/** Returns a random node's value. */
	public int getRandom() {
	    int result = -1;
	    ListNode temp = head;
	    for(int i=1;temp != null;i++){
	        if(random.nextInt(i) == i-1){
	            result = temp.val;
	        }
	        temp = temp.next;
	    }
	    return result;
	}

}
