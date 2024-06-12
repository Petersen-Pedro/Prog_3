package Ejercicio1;

public class Main {

    public static void main(String[] args) {
        int n = 3; // Tamaño del laberinto (n x n)
        Casillero[][] laberinto = new Casillero[n][n];

        // Inicializar los casilleros con sus valores y posibles movimientos
        laberinto[0][0] = new Casillero(1, false, true, true, false, 0, 0);
        laberinto[0][1] = new Casillero(2, false, true, false, true, 0, 1);
        laberinto[0][2] = new Casillero(3, false, false, true, true, 0, 2);
        laberinto[1][0] = new Casillero(4, true, true, true, false, 1, 0);
        laberinto[1][1] = new Casillero(5, true, true, true, true, 1, 1);
        laberinto[1][2] = new Casillero(6, false, true, true, true, 1, 2);
        laberinto[2][0] = new Casillero(7, true, false, false, false, 2, 0);
        laberinto[2][1] = new Casillero(8, true, false, false, true, 2, 1);
        laberinto[2][2] = new Casillero(9, true, false, false, true, 2, 2);

        // Imprimir el laberinto
        imprimirLaberinto(laberinto);

        // Definir origen y destino
        Casillero origen = laberinto[0][0];
        Casillero destino = laberinto[2][2];

        // Ejecutar el algoritmo de backtracking
        Backtracking backtracking = new Backtracking(destino, laberinto);
        Camino mejorCamino = backtracking.back(origen);

        // Verificar si se encontró un camino
        if (mejorCamino == null) {
            System.out.println("No se encontró un camino desde el origen hasta el destino.");
        } else {
            // Imprimir el valor del mejor camino encontrado
            System.out.println("El valor del camino de longitud mínima es: " + mejorCamino.getValor());

            // Imprimir el camino
            for (Casillero casillero : mejorCamino.getCamino()) {
                System.out.print("(" + casillero.getFila() + "," + casillero.getColumna() + ") ");
            }
        }
    }

    public static void imprimirLaberinto(Casillero[][] laberinto) {
        for (int i = 0; i < laberinto.length; i++) {
            for (int j = 0; j < laberinto[i].length; j++) {
                Casillero casillero = laberinto[i][j];
                System.out.print("[" + casillero.getValor() + " N:" + casillero.isNorte() + " E:" + casillero.isEste() + " S:" + casillero.isSur() + " O:" + casillero.isOeste() + "] ");
            }
            System.out.println();
        }
    }
}
