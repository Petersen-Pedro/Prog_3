package Tp1_Ejercicio5;

import java.util.Iterator;


public class MyLinkedList<T> extends AbstractLinkedList<T> implements Iterable<T> {
	
	private Node<T> first;
	private int size;
	
	public MyLinkedList() {
		this.first = null;
	}
	
	public MyLinkedList(Node<T> element) {
		this.first = element;
	}
	
	public void insertFront(T info) {
		Node<T> tmp = new Node<T>(info,null);
		tmp.setNext(this.first);
		this.first = tmp;
	}
	
	public T extractFront() {		
		Node<T> aux = this.first;
		this.first = this.first.getNext();
		aux.setNext(null);
		incrementSize();
		return null;
	}
	
	public T get(int index) {
		if (!this.isEmpty()){
			int pos = 0;
			Node<T> aux = this.first;
			while(pos!=index && aux.getNext()!=null) {
				aux = aux.getNext();
				pos++;
			}
			if(pos==index) {				
				return aux.getInfo();
			} else {
				return null;
			}
		}
		return null;
	}
	
	public int indexOf(T info) {
		if (this.isEmpty()) {
			return -1;
		}	
		int pos = 0;
		Node<T> aux = this.first;
		while (aux!=null && aux.getInfo()!=info) {
			aux = aux.getNext();
		}
		if (aux.getInfo()==info)
			return pos;
		else
			return -1;
	}
	
	
	//EJERCICIO 5
	//public static <T extends Comparable<T>> MyLinkedList<T> listaElementosComunes(MyIterator<T> list1, MyIterator<T> list2){
	public static <T extends Comparable<T>> MyLinkedList<T> listaElementosComunes(MyLinkedList<T> list1, MyLinkedList<T> list2){
		MyLinkedList<T> result = new MyLinkedList<T>();
		MyIterator<T> cursor1 = (MyIterator<T>) list1.iterator();
		
		
		while(cursor1.getCursor() != null) {
			MyIterator<T> cursor2 = (MyIterator<T>) list2.iterator();
			while(cursor2.getCursor() != null) {
				if (cursor1.getCursor().getInfo().compareTo(cursor2.getCursor().getInfo()) == 0) {
					inserteOrdenado(result, cursor1.getCursor().getInfo());
				}
				cursor2.next();
			}
			cursor1.next();
		}
		return result;
	}
	
	public static <T extends Comparable<T>> void inserteOrdenado(MyLinkedList<T> lista, T info) {
		//INSERTAMOS DE MANERA ASCENDENTE
		if (lista.isEmpty() || lista.first.getInfo().compareTo(info)>=0) {
			lista.insertFront(info);
			lista.incrementSize();
			return;
		}
		
		Node<T> cursorAux = lista.first;
		while(	cursorAux.getNext()!=null && 
				cursorAux.getNext().getInfo().compareTo(info) < 0) {
			cursorAux = cursorAux.getNext();
		}
		
		if(cursorAux.getNext()==null) {
			Node<T> newNode = new Node<T>(info, null);
			cursorAux.setNext(newNode);	
		} else {
			Node<T> auxNode = cursorAux.getNext();
			Node<T> newNode = new Node<T>(info, auxNode);
			cursorAux.setNext(newNode);		
		}
		lista.incrementSize();
	}

	@Override
	public Iterator<T> iterator() {
		// A LA LISTA LE VAMOS A ESTAR PIDIENDO 
		// EL ITERADOR PARA PODER ITERAR SOBRE ELLA
		return new MyIterator<>(this.first);
	}

	
	
	public int getSize() {
		return size;
	}
	
	public void incrementSize() {
		size++;
	}
	public void decrementSize() {
		size--;
	}
	
}