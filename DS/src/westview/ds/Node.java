package westview.ds;

public class Node<T> {

	// A node has a next node reference
	private Node next;
	// A node stores data
	private T data;

	// constructor that takes in data element
	public Node(T val) {
		this.data = val;
	}

	// getters for the data and next reference
	public Node getNext() {
		return next;
	}
	
	public void setNext(Node n) {
		this.next = n;
	}

	public T getData() {
		return data;
	}
	
	public void setData(T t) {
        data = t;
    }
	// called getNext and getData
}
