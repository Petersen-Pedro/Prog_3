package Ejercicio_1;

public class Main {

	public static void main(String[] args) {
		/*
		Ejercicio 1
		Dado el conjunto de elementos: 
		X= {68, 42, 47, 5, 76, 95, 23, 88, 90, 85, 3
			1, 71, 60, 10, 46, 61, 50, 92, 74, 6, 97, 
			66, 1, 56, 27, 7, 14, 92} 
		Realizar la inserción de los mismos en una 
		estructura de Hashing con la que se especiﬁca 
		en cada punto, con las siguientes técnicas de 
		tratamiento de desbordes, muestre gráﬁcamente 
		cómo se va armando la estructura y cómo queda 
		
		luego de insertar hasta el último elemento:
		a.- Hashing separado (con M=7 y rp=1, rs=1).
		b.- Hashing separado con crecimiento (con el 
		comportamiento de HashTable de JAVA) (con M=7, ρd=0,9).
		*/
		
        int[] elements = {68, 42, 47, 5, 76, 95, 23, 88, 90, 85, 31, 71, 60, 10, 46, 61, 50, 92, 74, 6, 97, 66, 1, 56, 27, 7, 14, 92};
        HashTableSeparado hashTable = new HashTableSeparado(7);
        
        for (int element : elements) {
            hashTable.insert(element);
        }
        
        hashTable.printTable();
		
	}

}
