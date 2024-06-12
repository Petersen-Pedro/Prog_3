package Ejercicio1;

import java.util.ArrayList;

public class Casillero {
    int valor;
    boolean norte;
    boolean sur;
    boolean este;
    boolean oeste;
    int fila;
    int columna;

    public Casillero(int valor, boolean norte, boolean sur, boolean este, boolean oeste, int fila, int columna) {
        this.valor = valor;
        this.norte = norte;
        this.sur = sur;
        this.este = este;
        this.oeste = oeste;
        this.fila = fila;
        this.columna = columna;
    }

    public ArrayList<Casillero> getVecinos(Casillero[][] laberinto) {
        ArrayList<Casillero> vecinos = new ArrayList<>();
        int n = laberinto.length;

        if (norte && fila > 0) {
            vecinos.add(laberinto[fila - 1][columna]);
        }
        if (este && columna < n - 1) {
            vecinos.add(laberinto[fila][columna + 1]);
        }
        if (sur && fila < n - 1) {
            vecinos.add(laberinto[fila + 1][columna]);
        }
        if (oeste && columna > 0) {
            vecinos.add(laberinto[fila][columna - 1]);
        }

        return vecinos;
    }

    public int getFila() {
        return fila;
    }

    public int getColumna() {
        return columna;
    }

    public int getValor() {
        return valor;
    }

    public boolean isNorte() {
        return norte;
    }

    public boolean isSur() {
        return sur;
    }

    public boolean isEste() {
        return este;
    }

    public boolean isOeste() {
        return oeste;
    }
}
