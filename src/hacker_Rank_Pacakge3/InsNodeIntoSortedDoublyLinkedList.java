package hacker_Rank_Pacakge3;

/*
 * Given a reference to the head of a doubly-linked list and an integer, data, create a new DoublyLinkedListNode object having data value and insert it into a sorted linked list while maintaining the sort.
 * 
 * Example:
 * 
 * head refers to the first node in the list 1 <-> 3 <-> 4 <-> 10 and data = 5.
 * return a reference to the head of the updated list: 1 <-> 3 <-> 4 <-> 5 <-> 10.
 * 
 * Constraints:
 * 
 * 1 <= list size <= 1000
 * 1 <= data <= 1000
 * 1 <= node value <= 1000
 * 
 * Explanation Video: https://www.youtube.com/watch?v=4tX8u2kZz5g
 * 
 * Time Complexity: O(n) where n is the number of nodes in the list.
 * Space Complexity: O(1) since we are not using any extra space.
 * 
 * Data Structure: Doubly Linked List
 * Algorithm: Insertion in a Sorted Doubly Linked List
 * 
 */

public class InsNodeIntoSortedDoublyLinkedList {

	static class DoublyLinkedListNode {
		public int data;
		public DoublyLinkedListNode next;
		public DoublyLinkedListNode prev;

		public DoublyLinkedListNode(int nodeData) {
			this.data = nodeData;
			this.next = null;
			this.prev = null;
		}
	}

	static class DoublyLinkedList {
		public DoublyLinkedListNode head;
		public DoublyLinkedListNode tail;

		public DoublyLinkedList() {
			this.head = null;
			this.tail = null;
		}

		/*
		 * Inserts a new node with the given data at the end of the doubly linked list.
		 * 
		 * @param nodeData The data value for the new node to be inserted.
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

	/*
	 * Prints the elements of a doubly linked list starting from the given node.
	 * 
	 * @param node The starting node of the doubly linked list to be printed.
	 */
	public static void printDoublyLinkedList(DoublyLinkedListNode node) {
		while (node != null) {
			System.out.print(String.valueOf(node.data));

			node = node.next;

			if (node != null) {
				System.out.print(" --> ");
			}
		}
		System.out.println();
	}

	/*
	 * Inserts a new node with the given data into a sorted doubly linked list while
	 * maintaining the sort order.
	 * 
	 * @param llist The head of the sorted doubly linked list.
	 * 
	 * @param data The data value for the new node to be inserted.
	 * 
	 * @return The head of the updated doubly linked list after insertion.
	 */
	public static DoublyLinkedListNode sortedInsert(DoublyLinkedListNode llist, int data) {
		DoublyLinkedListNode newNode = new DoublyLinkedListNode(data);
		DoublyLinkedListNode head = llist;
		while (llist != null) {
			if (data < llist.data) {
				newNode.next = llist;
				newNode.prev = llist.prev;
				if (llist.prev != null) {
					llist.prev.next = newNode;
				}
				llist.prev = newNode;
				if (newNode.prev == null) {
					return newNode; // Return the new head of the list if the new node is inserted at the beginning
				}
				return head; // Return the original head of the list;
			} else if (llist.next == null) {
				llist.next = newNode;
				newNode.prev = llist;
				return head; // Return the original head of the list
			}
			llist = llist.next;
		}
		return newNode; // Return the new head of the list if the list was empty
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoublyLinkedList llist = new DoublyLinkedList();
		llist.insertNode(2);
		llist.insertNode(3);
		llist.insertNode(4);
		llist.insertNode(10);
		
		System.out.println("Original list:");
		printDoublyLinkedList(llist.head);
		
		int dataToInsert = 1;
		llist.head = sortedInsert(llist.head, dataToInsert);
		
		System.out.println("\nList after inserting " + dataToInsert + ":");
		printDoublyLinkedList(llist.head);
		

	}

}
