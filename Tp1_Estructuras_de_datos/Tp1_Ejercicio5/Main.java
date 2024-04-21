package Tp1_Ejercicio5;

public class Main {
    public static void main(String[] args) {
        // Crear dos listas vinculadas para probar
        MyLinkedList<Integer> lista1 = new MyLinkedList<>();
        lista1.insertFront(1);
        lista1.insertFront(3);
        lista1.insertFront(5);
        lista1.insertFront(9);
        lista1.insertFront(10);
        lista1.insertFront(3);
        System.out.println("Lista 1: " + lista1);
        System.out.println(lista1.isEmpty());

        MyLinkedList<Integer> lista2 = new MyLinkedList<>();
        lista2.insertFront(2);
        lista2.insertFront(3);
        lista2.insertFront(5);
        lista2.insertFront(3);
        lista2.insertFront(7);
        lista2.insertFront(0);
        System.out.println("Lista 2: " + lista2);
        
        //System.out.print(lista1);
        
        //MyIterator<T> l1 = new MyIterator<>(lista1.getCursor());
        
        // Probar la función listaElementosComunes
        MyLinkedList<Integer> elementosComunes = MyLinkedList.listaElementosComunes(lista1, lista2);
        MyLinkedList.listaElementosComunes(lista1, lista2);
        System.out.println("Elementos comunes: " + elementosComunes);

        // Probar la función inserteOrdenado
        MyLinkedList<Integer> listaOrdenada = new MyLinkedList<>();
        listaOrdenada.insertFront(3);
        listaOrdenada.insertFront(7);
        listaOrdenada.insertFront(9);
        System.out.println("Lista antes de insertar ordenadamente: " + listaOrdenada);
        MyLinkedList.inserteOrdenado(listaOrdenada, 5);
        System.out.println("Lista después de insertar ordenadamente: " + listaOrdenada);
    
        Node<Integer> EjNodo = new Node<>(5); 
        MyLinkedList<Integer> EjLista = new MyLinkedList<>(EjNodo);
        System.out.println("Ejemplo: "+EjLista.get(0));
        
    }
}

