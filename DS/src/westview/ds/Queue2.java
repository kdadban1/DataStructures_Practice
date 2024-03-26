package westview.ds;

import java.util.ArrayList;

public class Queue2<T> {

	// use stack(s) - you must use 2 Stacks
	// to implement the behavior of a queue using
	// only stacks
	Stack<T> a;
	Stack<T> b;

	public Queue2() {
		a = new Stack<T>();
		b = new Stack<T>();
	}

	public int size() {
		return a.size() + b.size();
	}

	public T dequeue() {
		// move all elements of a to b, then remove the elements from a
		for (int i = 0; i < a.size(); i++) {
			b.push(a.peek());
			a.pop();
		}
		// if there are elements in b, return the top one with pop
		if (b.peek() != null) {
			b.pop();
		}
		// if no elements to return, return null
		return null;
	}

	public void enqueue(T element) {
		// add the element
		a.push(element);
	}

}
