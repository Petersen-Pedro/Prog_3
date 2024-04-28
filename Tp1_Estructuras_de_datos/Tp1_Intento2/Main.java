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
		System.out.print("test: extractFront");	
		myList.extractFront();
		for(int i : myList) {
			System.out.print(i + " ");			
		}
		*/

		System.out.print("Lista 1: ");	
		for(int i : myList) {
			System.out.print(i + " ");			
		}

		
		//EJERCICIO 5

		MySimpleLinkedList<Integer> myList2 = new MySimpleLinkedList<Integer>();

		myList2.insertFront(22);
		myList2.insertFront(15);
		myList2.insertFront(22);
		myList2.insertFront(8);
		myList2.insertFront(7);
		myList2.insertFront(43);
		myList2.insertFront(5);
		myList2.insertFront(24);
		myList2.insertFront(32);

		System.out.println("\n");
		System.out.print("Lista 2: ");	
		for(int i : myList2) {
			System.out.print(i + " ");			
		}
		
		MySimpleLinkedList<Integer> newList = myList.listaElementosComunes(myList2);
		
		System.out.println("\n");
		System.out.print("Lista Nueva: ");
		for(int i : newList) {
			System.out.print(i + " ");			
		}

	}

}
