package Tp1_Intento2;

import java.util.Iterator;

public class MySimpleLinkedList<T> implements Iterable<T> {
	private Node<T> first;
	private int size;
	
	public MySimpleLinkedList() {
		this.first = null;
	}
	
	public void insertFront(T info) {
		Node<T> tmp = new Node<T>(info,null);
		tmp.setNext(this.first);
		this.first = tmp;
		incrementSize();
	}
	
	public T extractFront() {		
		Node<T> tmp = this.first;
		this.first = this.first.getNext();
		tmp.setNext(null);
		decrementSize();
		return null;
	}

	public boolean isEmpty() {
		return this.size==0;
	}
	
	public T get(int index) {
		// TODO
		return null;
	}
	
	public int size() {
		return size;
	}
	
	public void incrementSize() {
		size++;
	}
	
	public void decrementSize() {
		size--;
	}
	
	@Override
	public String toString() {
		// TODO
		return "["+ this.first.toString()+"]";
	}

	@Override
	public Iterator<T> iterator() {
		return new MyIterator<>(this.first);
	}
	
	//EJERCICIO 5
	
	
	
	
}
