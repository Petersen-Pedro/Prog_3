package Tp1_Intento2;

import java.util.Iterator;

public class MyIterator<T> implements Iterator<T> {

	private Node<T> cursor;
	
	public MyIterator(Node<T> nodo) {
		this.cursor = nodo;
	}
	
	@Override
	public boolean hasNext() {
		// ESTE METODO NOS DEVUELVE SI HAY O NO UN NODO SIGUIENTE. 
		return cursor!=null;
	}

	@Override
	public T next() {
		T info = this.cursor.getInfo();
		this.cursor = this.cursor.getNext();
		return info;
	}
	
}
