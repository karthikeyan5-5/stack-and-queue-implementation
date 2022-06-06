package demo3;

import java.util.EmptyStackException;

public class Stack<T> {
		
		private  Node top;
        private int size;
		
public class Node{
			
			public T data;
			public Node next;
			public Node(T data) {
				this.data =  data;
				this.next = null;
			}
		}
		
		public void push(T data) {
			
			Node tempNode = new Node(data);
 			tempNode.next = top;
			top  = tempNode;   
			size++;
			
		}
		
		public T pop() {
			if(isEmpty()) {
				try {
				throw new EmptyStackException();
				}catch(Exception e){
					System.out.println("stack is empty");
				}
			} 
				
			
			
			T result = (T) top.data;
			top = top.next;
			size--;
			return result;
		}
		
		public T peek() {
			if(isEmpty()) {
				throw new EmptyStackException();
			}
			return (T) top.data;
		}
		public int size(){
			return size;
		}
		
		public boolean isEmpty() {
			return size == 0;
		}
		
		public void displayStack() {
			Node current = top;
			while (current != null) {
				System.out.println(current.data+" ");
				
				current = current.next;
			}
			
		}
	}
	 
  