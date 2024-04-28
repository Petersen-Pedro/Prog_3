package Tp1_Intento2;

public class Node<T> implements Comparable<Node<T>>{

	private T info;
	private Node<T> next;

	public Node() {
		this.info = null;
		this.next = null;
	}
	
	public Node(T info, Node<T> next) {
		this.setInfo(info);
		this.setNext(next);
	}
	
	public Node<T> getNext() {
		return next;
	}

	public void setNext(Node<T> next) {
		this.next = next;
	}

	public T getInfo() {
		return info;
	}

	public void setInfo(T info) {
		this.info = info;
	}
	
	@Override
	public String toString() {
		String txt = (String) this.getInfo() + ", ";
		return txt;
	}

	@Override
	public int compareTo(Node<T> element) {
		int val1 = (int) this.info;
		int val2 = (int) element.info;		
		return val1-val2;
	}

}