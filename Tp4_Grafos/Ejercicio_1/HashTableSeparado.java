package Ejercicio_1;

import java.util.LinkedList;

public class HashTableSeparado {
	private LinkedList<Integer>[] table;
	private int mTamanio;//M
	// M: Es el tamaño de la tabla de hash. 
	// Es el número de posiciones disponibles
	// en la tabla de hash.

	public HashTableSeparado(int m) {
		this.mTamanio = m;
		
		table = new LinkedList[mTamanio];
		for (int i = 0; i < mTamanio; i++) {
			table[i] = new LinkedList<>();
		}
	}
	
	private int hash(int key) {
		return key % mTamanio;
	}

	public void insert(int key) {
		int hashValue = hash(key);
        table[hashValue].add(key);
	}
	
	public void printTable() {
        for (int i = 0; i < mTamanio; i++) {
            System.out.print(i + ": ");
            for (int key : table[i]) {
                System.out.print(key + " -> ");
            }
            System.out.println("null");
        }
    }
	
	
	
	
	


}
