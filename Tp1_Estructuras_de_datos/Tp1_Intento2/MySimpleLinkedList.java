package Tp1_Intento2;

import java.awt.Cursor;
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
	
	/*
	public void insertBack(T info) {
		if(this.isEmpty()) {
			this.insertFront(info);
		} else {
			Node<T> tmp = new Node<T>(info, null);
			Node<T> lastNode = Node<T>(this.get(size));			
		}		
	}
	*/
	
	public boolean isEmpty() {
		return this.size==0;
	}
	
	public T get(int index) {
		if(this.isEmpty() && index>0 && index<=this.size) {
			int pos = 0;
			Node<T> cursor = this.first;
			while(pos<index) {
				cursor = cursor.getNext();
			}
			return cursor.getInfo();
		} else {
			return null;
		}
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
	/*
	public MySimpleLinkedList<T> listaElementosComunes(MySimpleLinkedList<T> lista1, MySimpleLinkedList<T> lista2){
		MySimpleLinkedList<T> auxList = new MySimpleLinkedList<>();
		MyIterator<T> cursor1 = (MyIterator<T>) lista1.iterator();
		
		while(cursor1.getCursor() != null) {
			MyIterator<T> cursor2 = (MyIterator<T>) lista2.iterator();
			while(cursor2.getCursor() !=null) {
				Node<T> info1 = cursor2.getCursor();
				Node<T> info2 = cursor2.getCursor();
				if(info1.compareTo(info2) == 0) {
					auxList.insertFront(info1.getInfo());
				}
				cursor2.next();				
			}
			cursor1.next();
		}
		MySimpleLinkedList<T> result = new MySimpleLinkedList<>();
		MyIterator<T> cursorResult = (MyIterator<T>) auxList.iterator();
		while(cursorResult.getCursor() != null) {
			result.insertFront(cursorResult.getCursor().getInfo());
		}
		return result;
	}
	*/
	public MySimpleLinkedList<T> listaElementosComunes(MySimpleLinkedList<T> lista2){
		MySimpleLinkedList<T> resultAux = new MySimpleLinkedList<>();
		MyIterator<T> cursor1 = (MyIterator<T>) this.iterator();
		int pos1 = 0;
		while(cursor1.getCursor() != null && pos1 < 10) {
			MyIterator<T> cursor2 = (MyIterator<T>) lista2.iterator();
			int pos2 = 0;
			while(cursor2.getCursor() !=null && pos2 < 10) {
				Node<T> info1 = cursor1.getCursor();
				Node<T> info2 = cursor2.getCursor();
				if(info1.compareTo(info2) == 0) {
					resultAux.insertFront(info1.getInfo());
				}
				cursor2.next();	
				pos2++;			
			}
			cursor1.next();
			pos1++;
		}
		return this.darVueltaLista(resultAux);
	}
	
	public MySimpleLinkedList<T> darVueltaLista(MySimpleLinkedList<T> lista){
		MyIterator<T> cursor = (MyIterator<T>) lista.iterator();
		MySimpleLinkedList<T> result = new MySimpleLinkedList<>();
		
		while(cursor.getCursor() != null) {
			result.insertFront(cursor.getCursor().getInfo());
			cursor.next();	
		}
		return result;
	}
	
	
	
}
