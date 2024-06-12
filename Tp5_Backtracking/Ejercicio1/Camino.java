package Ejercicio1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Camino {
    private ArrayList<Casillero> camino;
    private Set<Casillero> visitados;
    private int valor;

    public Camino() {
        this.camino = new ArrayList<>();
        this.visitados = new HashSet<>();
        this.valor = 0;
    }

    public void agregarAlCamino(Casillero c) {
        camino.add(c);
    }

    public ArrayList<Casillero> getCamino() {
        return camino;
    }

    public void quitarUltimo() {
        if (!camino.isEmpty()) {
            camino.remove(camino.size() - 1);
        }
    }

    public void marcarVisitado(Casillero c) {
        visitados.add(c);
    }

    public void quitarVisitado(Casillero c) {
        visitados.remove(c);
    }

    public boolean estaVisitado(Casillero c) {
        return visitados.contains(c);
    }

    public void incrementar(int valor) {
        this.valor += valor;
    }

    public void decrementar(int valor) {
        this.valor -= valor;
    }

    public int getValor() {
        return valor;
    }

    public Set<Casillero> getVisitados() {
        return visitados;
    }
}
