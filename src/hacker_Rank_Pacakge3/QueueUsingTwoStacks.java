package hacker_Rank_Pacakge3;

import java.util.Scanner;
import java.util.Stack;

/*
 * Implement a queue using two stacks. The queue should support the following operations:
 * 
 * 1. Enqueue: Add an element to the end of the queue.
 * 2. Dequeue: Remove and return the element at the front of the queue.
 * 3. Peek: Return the element at the front of the queue without removing it.
 * 
 * Example:
 * 
 * Input:
 * 1 42
 * 2
 * 1 14
 * 3
 * 1 28
 * 3
 * 
 * Output:
 * 14
 * 14
 * 
 * Constraints:
 * 
 * 1 <= number of queries <= 10^5
 * 1 <= value <= 10^9
 * 
 * Explanation Video: https://www.youtube.com/watch?v=4tX8u2kZz5g
 * 
 * Time Complexity: O(1) for enqueue operation and O(n) for dequeue and peek operations in 
 * the worst case, where n is the number of elements in the queue.
 * Space Complexity: O(n) for storing the elements in the two stacks.
 * 
 * Data Structure: Stack
 * Algorithm: Queue using Two Stacks
 * 
 */
public class QueueUsingTwoStacks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> inQueue = new Stack<Integer>();
		Stack<Integer> outQueue = new Stack<Integer>();
		
		Scanner sc = new Scanner(System.in);
		int queries = sc.nextInt();
		while (queries-- > 0) {
			int queryType = sc.nextInt();
			if (queryType == 1) {
				int value = sc.nextInt();
				inQueue.push(value);
			} else if (queryType == 2) {
				if (outQueue.isEmpty()) {
					while (!inQueue.isEmpty()) {
						outQueue.push(inQueue.pop());
					}
				}
				outQueue.pop();
			} else if (queryType == 3) {
				if (outQueue.isEmpty()) {
					while (!inQueue.isEmpty()) {
						outQueue.push(inQueue.pop());
					}
				}
				System.out.println(outQueue.peek());
			}
		}
		System.out.println("Final state of the queue: \noutQueue: ");
		while (!outQueue.isEmpty()) {
			System.out.print(outQueue.pop() + " ");
		}
		System.out.println("\ninQueue: ");
		while (!inQueue.isEmpty()) {
			outQueue.push(inQueue.pop());
		}
		sc.close();
	}

}
