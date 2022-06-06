package demo3;

public class queue<T> {
	public Node front;
	public Node rear;
	public int length;

private class Node {
		private T data;
		private Node next;

public Node(T data) {
        	this. data = data;
			this.next = null;
		}
	}

public void enQueue(T item) {
		if (front == null) {
			rear = new Node(item);
			front = rear;
		} else {
			rear.next = new Node(item);
			rear = rear.next;
		}
		length++;
	}

public T deQueue() {
		if (front != null) {
			T item = front.data;
			front = front.next;
		   length--;
			return item;
		}
		return null;
	}

public int size() {
		return length;
	}
public T peek() {
	return front.data;
}
public void displayQueue() {
		Node currentNode = front;
		while (currentNode != null) {
			System.out.print(currentNode.data + " ");
			currentNode = currentNode.next;
		}
		System.out.println();
	}
}
