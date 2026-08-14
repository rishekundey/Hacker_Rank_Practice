package hacker_Rank_Pacakge3;

import java.util.HashSet;

/*
 * A linked list is said to contain a cycle if any node is visited more than once while traversing the list.
 * 
 * Example:
 * 
 * Input: head 1->2->3->4->5->2 (cycle)
 * Output: true
 * Explanation: There is a cycle in the linked list, where the tail connects to the second node.
 * 
 * Constraints:
 * The number of the nodes in the list is in the range [0, 10^4].
 * -10^5 <= Node.val <= 10^5
 * 
 * Explanation Video: https://www.youtube.com/watch?v=G0_I-ZF0S38
 * 
 * Time Complexity: O(n), where n is the number of nodes in the linked list. In the worst case, we may need 
 * to traverse all nodes to determine if there is a cycle.
 * Space Complexity: O(1) for the two-pointer approach (Floyd's Cycle Detection Algorithm), as we only use 
 * a constant amount of extra space. O(n) for the HashSet approach, as we may need to store all nodes in 
 * the worst case.
 * 
 * Data Structures Used: The algorithm uses a linked list data structure to represent the nodes and their 
 * connections. In the HashSet approach, a HashSet is used to keep track of visited nodes.
 * Algorithm: The algorithm uses two approaches to detect cycles in a linked list. The first approach is 
 * Floyd's Cycle Detection Algorithm (Tortoise and Hare), which uses two pointers moving at different 
 * speeds to detect a cycle. The second approach uses a HashSet to store visited nodes and checks for 
 * duplicates during traversal.
 * 
 */

public class CycleDetection {

	static class SinglyLinkedListNode {
		public int data;
		public SinglyLinkedListNode next;

		public SinglyLinkedListNode(int nodeData) {
			this.data = nodeData;
			this.next = null;
		}
	}

	static class SinglyLinkedList {
		public SinglyLinkedListNode head;
		public SinglyLinkedListNode tail;

		public SinglyLinkedList() {
			this.head = null;
			this.tail = null;
		}

		/**
		 * Inserts a new node with the given data at the end of the linked list.
		 *
		 * @param nodeData The data for the new node to be inserted.
		 */
		public void insertNode(int nodeData) {
			SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);

			if (this.head == null) {
				this.head = node;
			} else {
				this.tail.next = node;
			}

			this.tail = node;
		}
	}

	/**
	 * Prints the elements of the singly linked list starting from the given node.
	 *
	 * @param node The starting node of the linked list to be printed.
	 */
	public static void printSinglyLinkedList(SinglyLinkedListNode node){
		while (node != null) {
			System.out.println(node.data);
			node = node.next;
			if (node != null) {
				System.out.println("-->");
			}
		}
	}

	/*
	 * Detects if there is a cycle in the linked list using Floyd's Cycle Detection
	 * Algorithm (Tortoise and Hare).
	 *
	 * @param head The head node of the linked list.
	 * 
	 * @return true if there is a cycle, false otherwise.
	 */
	static boolean hasCycle(SinglyLinkedListNode head) {
		SinglyLinkedListNode slow = head;
		SinglyLinkedListNode fast = head;
		
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;

			if (slow == fast) {
				return true; // Cycle detected
			}
		}
		return false; // No cycle
	}
	
	/*
	 * Detects if there is a cycle in the linked list using a HashSet to track
	 * visited nodes.
	 *
	 * @param head The head node of the linked list.
	 * 
	 * @return true if there is a cycle, false otherwise.
	 */
	static boolean hasCycleUsingHashSet(SinglyLinkedListNode head) {
        HashSet<SinglyLinkedListNode> visitedNodes = new HashSet<>();
        SinglyLinkedListNode current = head;

        while (current != null) {
            if (visitedNodes.contains(current)) {
                return true; // Cycle detected
            }
            visitedNodes.add(current);
            current = current.next;
        }
        return false; // No cycle
	}
       
	public static void main(String[] args) {
		
		// Create a linked list with a cycle for testing
		SinglyLinkedList list = new SinglyLinkedList();
		list.insertNode(1);
		list.insertNode(2);
		list.insertNode(3);
		list.insertNode(4);
		list.insertNode(5);

		// Creating a cycle for testing
		list.tail.next = list.head.next; // Creating a cycle (5 -> 2)

		boolean result = hasCycle(list.head);
		System.out.println("Does the linked list have a cycle? " + result);
		
		result = hasCycleUsingHashSet(list.head);
		System.out.println("Does the linked list have a cycle? " + result);
		
	}

}
