package hacker_Rank_Pacakge3;

/*
 * Given a doubly linked list, reverse the list and return the reversed list.
 * For example, if the linked list is
 * 1 <-> 2 <-> 3 <-> 4 <-> 5, the reversed linked list will be
 * 5 <-> 4 <-> 3 <-> 2 <-> 1.
 * 
 * Explanation Video: https://www.youtube.com/watch?v=G0_I-ZF0S38
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 * 
 * Data Structure used: Doubly Linked List
 * Algorithm used: Iterative approach to reverse the linked list
 * 
 */

class DoublyLinkedListNode {
	public int data;
	public DoublyLinkedListNode next;
	public DoublyLinkedListNode prev;

	public DoublyLinkedListNode(int nodeData) {
		this.data = nodeData;
		this.next = null;
		this.prev = null;
	}
}

class DoublyLinkedList {
	public DoublyLinkedListNode head;
	public DoublyLinkedListNode tail;

	public DoublyLinkedList() {
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
		DoublyLinkedListNode node = new DoublyLinkedListNode(nodeData);

		if (this.head == null) {
			this.head = node;
		} else {
			this.tail.next = node;
			node.prev = this.tail;
		}

		this.tail = node;
	}
}

class DoublyLinkedListPrintHelper {
	/*
	 * * Print the elements of a doubly linked list starting from the given node.
	 * 
	 * @param node The starting node of the linked list.
	 * 
	 * @return void
	 * 
	 */
	public static void printList(DoublyLinkedListNode node) {
		while (node != null) {
			System.out.println(node.data);
			node = node.next;
			if (node != null) 
				System.out.print(" -> ");
		}
		System.out.println(); // Print a newline after printing the entire list
	}
}

public class ReverseDoublyLinkedList {

	/*
	 * * Reverse a doubly linked list.
	 * 
	 * @param llist The head of the linked list to be reversed.
	 * 
	 * @return The new head of the reversed linked list.
	 * 
	 */
	public static DoublyLinkedListNode reverse(DoublyLinkedListNode llist) {
		DoublyLinkedListNode prevNode = null;
		DoublyLinkedListNode nextNode = null;
		DoublyLinkedListNode currentNode = llist;

		while (currentNode != null) {
			nextNode = currentNode.next;
			currentNode.next = prevNode;
			prevNode = currentNode;
			currentNode = nextNode;
		}
		return prevNode;
	}

	public static void main(String[] args) {
		DoublyLinkedList list = new DoublyLinkedList();
		list.insertNode(1);
		list.insertNode(2);
		list.insertNode(3);
		list.insertNode(4);
		list.insertNode(5);

		System.out.println("Original List:");
		DoublyLinkedListPrintHelper.printList(list.head);

		DoublyLinkedListNode reversedHead = reverse(list.head);

		System.out.println("Reversed List:");
		DoublyLinkedListPrintHelper.printList(reversedHead);
	}

}
