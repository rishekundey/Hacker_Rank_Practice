package hacker_Rank_Pacakge3;

/*
 * Given a singly linked list, reverse the list and return the reversed list.
 * 
 * For example, if the linked list is
 *  1 -> 2 -> 3 -> 4 -> 5, the reversed linked list will be
 *  5 -> 4 -> 3 -> 2 -> 1.
 * 
 * Explanation Video: https://www.youtube.com/watch?v=G0_I-ZF0S38
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 * 
 * Data Structure used: Singly Linked List
 * Algorithm used: Iterative approach to reverse the linked list
 * 
 */

public class ReverseALinkedList {

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

        /*
         *  * Insert a new node with the given data at the end of the linked list.
         *  @param nodeData The data for the new node.
         *  @return void
         *  
         */
        public void insertNode(int nodeData) {
            SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);

            if (this.head == null) {
                this.head = node; // If the list is empty, set the new node as the head
            } else {
                this.tail.next = node; // If the list is not empty, link the new node to the current tail
            }

            this.tail = node; // Update the tail to point to the new node
        }
    }
	
	/*
	 * * Print the elements of a singly linked list starting from the given node.
	 * @param node The starting node of the linked list.
	 * @return void
	 * 
	 */
	public static void printSinglyLinkedList(SinglyLinkedListNode node){
		while (node != null) {
			System.out.println(node.data); // Print the data of the current node
			node = node.next; // Move to the next node in the list
		}
    }
	
	/*
	 * * Reverse a singly linked list.
	 * @param llist The head of the linked list to be reversed.
	 * @return The new head of the reversed linked list.
	 * 
	 */
	public static SinglyLinkedListNode reverse(SinglyLinkedListNode llist) {
	    // Write your code here
		SinglyLinkedListNode prev = null; // Initialize previous node as null
		SinglyLinkedListNode current = llist; // Start with the head of the list
		SinglyLinkedListNode next = null; // Initialize next node as null

		while (current != null) {
			next = current.next; // Store the next node
			current.next = prev; // Reverse the link
			prev = current; // Move prev to current
			current = next; // Move to the next node
		}

		return prev; // Return the new head of the reversed list
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SinglyLinkedList llist = new SinglyLinkedList();

		llist.insertNode(1);
		llist.insertNode(2);
		llist.insertNode(3);
		llist.insertNode(4);
		llist.insertNode(5);

		System.out.println("Original Linked List:");
		printSinglyLinkedList(llist.head);

		SinglyLinkedListNode reversedHead = reverse(llist.head);

		System.out.println("Reversed Linked List:");
		printSinglyLinkedList(reversedHead);
	}

}
