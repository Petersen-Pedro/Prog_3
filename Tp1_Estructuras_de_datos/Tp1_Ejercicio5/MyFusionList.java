package Tp1_Ejercicio5;

import java.util.Iterator;

public class MyFusionList<T extends Comparable<T>> implements Iterable<T>  {

	private MyLinkedList<T> lista = new MyLinkedList<>();
	
	public MyLinkedList<T> getLista() {
		return lista;
	}

	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

}

