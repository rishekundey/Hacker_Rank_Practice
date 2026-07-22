package hacker_Rank_Pacakge3;

/*
 * Given a singly linked list, insert a new node with the given data at the specified position in the linked list.
 * 
 * For example, if the linked list is
 *  16 -> 13 -> 7 and we want to insert a new node with data 1 at position 2, the modified linked list will be
 *  16 -> 13 -> 1 -> 7.
 * 
 * Explanation Video: https://www.youtube.com/watch?v=G0_I-ZF0S38
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 * 
 * Data Structure used: Singly Linked List
 * Algorithm used: Iterative approach to insert a new node at a specific position in the linked list
 * 
 */
class SinglyLinkedListNode {
	public int data;
	public SinglyLinkedListNode next;

	public SinglyLinkedListNode(int nodeData) {
		this.data = nodeData;
		this.next = null;
	}
}

class SinglyLinkedList {
	public SinglyLinkedListNode head;
	public SinglyLinkedListNode tail;

	public SinglyLinkedList() {
		this.head = null;
		this.tail = null;
	}

	/*
	 * * Insert a new node with the given data at the end of the linked list.
	 * 
	 * @param nodeData The data for the new node.
	 * 
	 * @return void
	 * 
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

class SinglyLinkedListPrintHelper {
	/*
	 * * Print the elements of a singly linked list starting from the given node.
	 * 
	 * @param node The starting node of the linked list.
	 * 
	 * @return void
	 * 
	 */
	public static void printList(SinglyLinkedListNode node) {
		while (node != null) {
			System.out.print(node.data);
			node = node.next;
			if (node != null)
				System.out.print(" -> ");
		}
		System.out.println(); // Print a newline after printing the entire list
	}
}

public class InsertNodeAtSpecPosInSinLinkedList {

	/*
	 * * Insert a new node with the given data at the specified position in the
	 * linked list.
	 * 
	 * @param llist The head of the linked list.
	 * 
	 * @param data The data for the new node.
	 * 
	 * @param position The position at which to insert the new node.
	 * 
	 * @return The head of the modified linked list.
	 * 
	 */
	public static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode llist, int data, int position) {
		// Write your code here
		SinglyLinkedListNode prev = llist;
		SinglyLinkedListNode current = llist;
		SinglyLinkedListNode targetNode = new SinglyLinkedListNode(data);

		while (position > 0) {
			prev = current;
			current = current.next;
			position--;
		}
		prev.next = targetNode;
		targetNode.next = current;
		return llist;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SinglyLinkedList llist = new SinglyLinkedList();
		llist.insertNode(16);
		llist.insertNode(13);
		llist.insertNode(7);

		int data = 1;
		int position = 2;

		System.out.println("Original Linked List:");
		SinglyLinkedListPrintHelper.printList(llist.head);

		SinglyLinkedListNode llist_head = insertNodeAtPosition(llist.head, data, position);

		System.out.println("Modified Linked List:");
		SinglyLinkedListPrintHelper.printList(llist_head);

	}

}
