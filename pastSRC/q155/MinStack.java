package q155;

import java.util.Stack;

public class MinStack {

	private static Stack<Long> s;

	public MinStack() {
		s = new Stack<Long>();
	}

	private static long min = (long) Integer.MIN_VALUE;

	public static void push(int x) {
		if (s.isEmpty()) {
			min = (long) x;
			s.push(0L);
		} else {
			if (min >= x) { 
				s.push(x - min);
				min = (long) x;
			} else {
				s.push(x - min);
			}
		}
	}

	public static void pop() {
		if (!s.isEmpty()) {
			long tmp = s.pop();
			if (tmp < 0)
				min = min - tmp;
		}

	}

	public static int top() {
		if (!s.isEmpty()) {
			long tmp = s.peek();
			if (tmp > 0)
				return (int) (min + tmp);
			else
				return (int) (min);
		}
		return -1;
	}

	public static int getMin() {
		return (int) min;
	}

//	public static void main(String[] args) {
//
//		MinStack.push(-1);
//		System.out.print(MinStack.top());
//		System.out.print(MinStack.getMin());
//	}

}
