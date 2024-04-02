
public class MySimpleLinkedList<T> {
	
	private Node<T> first;
	
	public MySimpleLinkedList() {
		this.first = null;
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
		return null;
	}

	public boolean isEmpty() {
		if (this.first != null)
			return false;
		else 
			return true;
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
	
	public int size() {
		int pos = 0;
		Node<T> aux = this.first;
		while(aux.getNext()!=null) {
			aux = aux.getNext();
			pos++;
		}
		return pos;
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
	
	@Override
	public String toString() {
		if (this.isEmpty()) {
			return "[]";
		}			
		String txt = new String("[");
		Node<T> aux = this.first;
		while (aux!=null) {
			txt+=aux.getInfo() + ", ";
			aux = aux.getNext();
		}
		txt+="]";
		return txt;
	}
	
}