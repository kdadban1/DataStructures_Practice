package westview.ds;

import java.util.ArrayList;

public class Stack<T> {

	// implement storing the data using a 1D array
	private ArrayList<T> data;

	// add a constructor
	public Stack() {

		// the initial size of our array is 20
		data = new ArrayList<T>();

	}

	// add a getter called pop
	// that will remove from the top of the stack

	public T pop() {
		// what to return?
		// return the top of stack (remove the element)

		// return null if empty
		if (data.size() == 0) {
			return null;
		}
		return data.remove(data.size() - 1);
	}

	// preview what is at the top of the stack
	public T peek() {

		if (data.size() == 0) {
			return null;
		}
		// return the value at the top of the stack
		// don't remove it
		return data.get(data.size() - 1);
	}

	// add a size method that return # of elements in the Stack
	public int size() {
		return data.size();
	}

	// add a setter called push
	// that will push
	public void push(T element) {
		// add the element to the top of the stack
		data.add(element);
	}
}
