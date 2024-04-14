import java.util.Iterator;

public class Main {
	
	public static <T> void main(String[] args) {
	
		MySimpleLinkedList<Integer> myList = new MySimpleLinkedList<Integer>();
		
		myList.insertFront(7);
		myList.insertFront(5);
		myList.insertFront(2);
		myList.insertFront(4);
		myList.insertFront(1);
		
		Iterator<Integer> it = myList.iterator();
		while(it.hasNext()) {
			Integer i = it.next();
			System.out.print(i + " ");
		}		
	}
}
