package q232;

import java.util.Stack;

class MyQueue {

	private Stack<Integer> s1 = new Stack<Integer>();
	private Stack<Integer> s2 = new Stack<Integer>();

	// Push element x to the back of queue.
	public void push(int x) {
		if (s2.isEmpty())
			s1.push(x);
		else {
			if (s1.isEmpty())
				s1.push(x);
			else
				s2.push(x);
		}
	}

	// Removes the element from in front of queue.
	public void pop() {
		if (s1.isEmpty()) {
			changeS1S2();
			s1.pop();
			changeS1S2();
		} else {
			changeS1S2();
			s2.pop();
			changeS1S2();
		}
	}

	// Get the front element.
	public int peek() {
		int tmp;
		if (s1.isEmpty()) {
			changeS1S2();
			tmp = s1.peek();
			changeS1S2();
		} else {
			changeS1S2();
			tmp = s2.peek();
			changeS1S2();
		}

		return tmp;
	}

	// Return whether the queue is empty.
	public boolean empty() {
		return s1.isEmpty() && s2.isEmpty();
	}

	private void changeS1S2() {
		int tmp;
		if (!s1.isEmpty()) {
			while (!s1.isEmpty()) {
				tmp = s1.pop();
				s2.push(tmp);
			}
		} else {
			while (!s2.isEmpty()) {
				tmp = s2.pop();
				s1.push(tmp);
			}
		}

	}
}