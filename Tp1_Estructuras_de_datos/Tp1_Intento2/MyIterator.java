package Tp1_Intento2;

import java.util.Iterator;

public class MyIterator<T> implements Iterator<T> {

	private Node<T> cursor;
	
	public MyIterator(Node<T> first) {
		this.cursor = first;
	}
	
	@Override
	public boolean hasNext() {
		// ESTE METODO NOS DEVUELVE SI HAY O NO UN NODO SIGUIENTE. 
		return getCursor()!=null;
	}

	@Override
	public T next() {
		T info = this.getCursor().getInfo();
		this.cursor = this.getCursor().getNext();
		return info;
	}

	public Node<T> getCursor() {
		return cursor;
	}
	
}
