package hacker_Rank_Pacakge3;

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
