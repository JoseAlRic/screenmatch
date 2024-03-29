package com.screenmatch.calculos;

import com.screenmatch.modelos.Titulo;

public class CalculadoraDeTiempo {
    private int tiempoTotal;

    public int getTiempoTotal() {
        return tiempoTotal;
    }

    public void incluido(Titulo titulo){
        System.out.println("Agregando duracion de minutos de " + titulo);
        this.tiempoTotal += titulo.getDuracionEnMinutos();
    }
}
