package Tp1_Intento2;

public class Main {

	public static void main(String[] args) {
		
		MySimpleLinkedList<Integer> myList = new MySimpleLinkedList<Integer>();

		myList.insertFront(22);
		myList.insertFront(12);
		myList.insertFront(1);
		myList.insertFront(8);
		myList.insertFront(7);
		myList.insertFront(63);
		myList.insertFront(6);
		myList.insertFront(24);
		myList.insertFront(42);
		
		/*
		MyIterator<Integer> it = (MyIterator<Integer>) myList.iterator();
		while (it.hasNext()) {
			Integer i = it.next();
			System.out.print(i);
		}
		*/
		
		for(int i : myList) {
			System.out.print(i + " ");			
		}

		System.out.print("test: extractFront");	
		myList.extractFront();
		for(int i : myList) {
			System.out.print(i + " ");			
		}

	}

}
