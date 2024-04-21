package Tp1_Ejercicio5;

public abstract class AbstractLinkedList<T> {

	private Node<T> first;
	private int size;
	
	
	public int getSize() {
		return size;
	}
	
	public void incrementSize() {
		size++;
	}
	public void decrementSize() {
		size--;
	}
	
	public boolean isEmpty() {
		if (this.first != null)
			return false;
		else 
			return true;
	}
	
	public abstract void insertFront(T info);
	
	
	
}
