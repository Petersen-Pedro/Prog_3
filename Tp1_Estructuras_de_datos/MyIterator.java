import java.util.Iterator;

public class MyIterator<T> implements Iterator<T> {

	private Node<T> cursor; //PRIMER NODO DE LA LISTA
	
	public MyIterator(Node<T> cursor){
		this.cursor = cursor;
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
