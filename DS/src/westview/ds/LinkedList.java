package westview.ds;


public class LinkedList {

	Node head;
	private int size;
	

	public LinkedList() {
		head = null;
		size = 0;
	}
	

	public int size() {
		return size;
	}
	

	public String toString() {
	/* to be completed */
		return "";
	}
	

	public Node remove(int n) {
		if (head == null) {
		 return null;
		} else {
			Node removed = head;
			head.setData(null);
			return removed;
		}
	}
	

	public void add(Node n) {
		if (head == null) { 
	        head = n;
	    } else {
	    	Node curr = head;
	    	while (curr.getNext() != null) {
	    		curr = curr.getNext();
	    	}
	    	curr.setNext(n);
	    }
	}
	
	public Node get(int index){
		if (head.getData() == null) {
			return null;
		}
		else {
			return head.getNext();
		}
	}
	
}

