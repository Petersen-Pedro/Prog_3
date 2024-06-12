package Ejercicio1;

import java.util.ArrayList;

public class Backtracking {
	private Casillero destino;
	private Camino mejorCamino;
	private Casillero[][] laberinto;
	
	public Backtracking(Casillero destino, Casillero[][] laberinto) {
		this.destino = destino;
        this.laberinto = laberinto;
	}
	
	 public Camino back(Casillero origen) {
	        Camino camino = new Camino();
	        camino.agregarAlCamino(origen);
	        camino.marcarVisitado(origen);
	        camino.incrementar(origen.getValor());
	        this.back(origen, camino);
	        return mejorCamino;
	 }
	
	 private void back(Casillero actual, Camino caminoActual) {
	        if (actual.equals(this.destino)) {
	            if (mejorCamino == null || mejorCamino.getValor() > caminoActual.getValor()) {
	                mejorCamino = new Camino();
	                mejorCamino.getCamino().addAll(caminoActual.getCamino());
	                for (Casillero c : caminoActual.getCamino()) {
	                    mejorCamino.marcarVisitado(c);
	                }
	                mejorCamino.incrementar(caminoActual.getValor());
	            }
	        } else {
	            ArrayList<Casillero> vecinos = actual.getVecinos(laberinto);
	            for (Casillero vecino : vecinos) {
	                if (!caminoActual.estaVisitado(vecino)) {
	                    caminoActual.agregarAlCamino(vecino);
	                    caminoActual.marcarVisitado(vecino);
	                    caminoActual.incrementar(vecino.getValor());
	                    if (mejorCamino == null || caminoActual.getValor() <= mejorCamino.getValor()) {
	                        back(vecino, caminoActual);
	                    }
	                    caminoActual.quitarUltimo();
	                    caminoActual.quitarVisitado(vecino);
	                    caminoActual.decrementar(vecino.getValor());
	                }
	            }
	        }
	    }

	    public Casillero getDestino() {
	        return destino;
	    }

	    public Camino getMejorCamino() {
	        return mejorCamino;
	    }

	    public Casillero[][] getLaberinto() {
	        return laberinto;
	    }
	}
