package westview.ds;

import java.util.ArrayList;

public class Queue<T> {

	// implement storing the data using a 1D array
	private ArrayList<T> data;

	// add a constructor
	public Queue() {

		// the initial size of our array is 20
		data = new ArrayList<T>();

	}

	public T removeQ() {

		// return null if empty
		if (data.size() == 0) {
			return null;
		}
		return data.remove(0);
	}

	public void addQ(T element) {
		// add the element
		data.add(0, element);
	}

	// preview what is at the top
	public T peek() {

		if (data.size() == 0) {
			return null;
		}

		return data.get(data.size() - 1);
	}

	// add a size method
	public int size() {
		return data.size();
	}

}
