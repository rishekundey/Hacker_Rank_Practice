package hacker_Rank_Pacakge3;

/*
 * This class provides methods to merge two sorted singly linked lists into a single sorted linked list.
 * It includes both recursive and iterative approaches for merging the lists.
 * 
 * The SinglyLinkedListNode class represents a node in the singly linked list, containing data and a reference to the next node.
 * The SinglyLinkedList class provides methods to create and manipulate the linked list, including inserting nodes at the end.
 * 
 * The mergeLists method implements the recursive approach to merge two sorted linked lists.
 * The mergeListsIterative method implements the iterative approach to merge two sorted linked lists.
 * 
 * The printSinglyLinkedList method prints the elements of a singly linked list in order, separated by "-->".
 */

/*
 * Given the heads of two sorted linked lists, merge them into a single sorted linked list.
 * Either head1 or head2 can be null, in which case the other list is returned as the merged result.
 * 
 * Example:
 * 
 * Input: head1 = [1,2,4], head2 = [1,3,4]
 * Output: [1,1,2,3,4,4]
 * 
 * Explanation video: https://www.youtube.com/watch?v=9Y8oWZxJ0pE
 * 
 * Time Complexity: O(n + m), where n and m are the lengths of the two linked lists.
 * Space Complexity: O(n + m) for the recursive approach due to the call stack, and O(1) for the iterative approach.
 * 
 * Data Structures Used: Singly Linked List
 * Algorithm: Merging two sorted linked lists
 * 
 */

public class MergeTwoSortedLinkedLists {

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
		 * Inserts a new node with the given data at the end of the linked list.
		 * 
		 * @param nodeData The data for the new node to be inserted.
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

	/*
	 * Prints the elements of a singly linked list in order, separated by "-->".
	 * 
	 * @param node The head of the singly linked list to be printed.
	 * 
	 */
	public static void printSinglyLinkedList(SinglyLinkedListNode node){
		while (node != null) {
			System.out.print(node.data);
			node = node.next;
			if (node == null) 
				System.out.println();
			else
				System.out.print("-->");
		}
	}
	
	/*
	 * Recursive method to merge two sorted linked lists 
	 * Time Complexity: O(n + m), where n and m are the lengths of the two linked lists. 
	 * Space Complexity: O(n + m), due to the recursive call stack.
	 */
	
	/*
	 * Recursive method to merge two sorted linked lists
	 * 
	 * @param head1 The head of the first sorted linked list
	 * 
	 * @param head2 The head of the second sorted linked list
	 * 
	 * @return The head of the merged sorted linked list
	 * 
	 */

	static SinglyLinkedListNode mergeLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {

		if (head1 == null) {
			return head2;
		}
		if (head2 == null) {
			return head1;
		}
		
		SinglyLinkedListNode mergedHead = null;

		if (head1.data <= head2.data) {
			mergedHead = head1;
			mergedHead.next = mergeLists(head1.next, head2);
		} else {
			mergedHead = head2;
			mergedHead.next = mergeLists(head1, head2.next);
		}

		return mergedHead;
	}

	/*
	 * Iterative method to merge two sorted linked lists 
	 * Time Complexity: O(n + m), where n and m are the lengths of the two linked lists. 
	 * Space Complexity: O(1), as we are using a constant amount of extra space.
	 */
	
	/*
	 * Iterative method to merge two sorted linked lists
	 * 
	 * @param head1 The head of the first sorted linked list
	 * 
	 * @param head2 The head of the second sorted linked list
	 * 
	 * @return The head of the merged sorted linked list
	 * 
	 */
	static SinglyLinkedListNode mergeListsIterative(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
		SinglyLinkedListNode dummy = new SinglyLinkedListNode(0);
		SinglyLinkedListNode tail = dummy;

		while (head1 != null && head2 != null) {
			if (head1.data <= head2.data) {
				tail.next = head1;
				head1 = head1.next;
			} else {
				tail.next = head2;
				head2 = head2.next;
			}
			tail = tail.next;
		}

		if (head1 != null) {
			tail.next = head1;
		} else {
			tail.next = head2;
		}

		return dummy.next;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SinglyLinkedList list1 = new SinglyLinkedList();
		list1.insertNode(1);
		list1.insertNode(2);
		list1.insertNode(4);
		
		SinglyLinkedList list2 = new SinglyLinkedList();
		list2.insertNode(1);
		list2.insertNode(3);
		list2.insertNode(4);
		list2.insertNode(5);
		
		//SinglyLinkedListNode mergedHeadRecursive = mergeLists(list1.head, list2.head);
		SinglyLinkedListNode mergedHeadIterative = mergeListsIterative(list1.head, list2.head);
		//printSinglyLinkedList(mergedHeadRecursive);
		printSinglyLinkedList(mergedHeadIterative);
		
	}

}
