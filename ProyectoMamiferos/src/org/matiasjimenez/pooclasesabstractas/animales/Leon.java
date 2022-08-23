package org.matiasjimenez.pooclasesabstractas.animales;

import org.matiasjimenez.pooclasesabstractas.mamiferos.Felino;

public class Leon extends Felino {
    private int numeroManada;
    private String potenciaRugidoDecibel;

    public Leon(String habitat, float altura, float largo, float peso, String nombreCientifico) {
        super(habitat, altura, largo, peso, nombreCientifico);
    }

    public void setNumeroManada(int numeroManada) {
        this.numeroManada = numeroManada;
    }

    public void setPotenciaRugidoDecibel(String potenciaRugidoDecibel) {
        this.potenciaRugidoDecibel = potenciaRugidoDecibel;
    }

    public int getNumeroManada() {
        return numeroManada;
    }

    public String getPotenciaRugidoDecibel() {
        return potenciaRugidoDecibel;
    }

    @Override
    public String comer() {
        return "El Leon caza junto a su grupo de " + this.getNumeroManada() + " individuos en las llanuras africanas";
    }

    @Override
    public String dormir() {
        return "El leon duerme en las sabanas africanas ";
    }

    @Override
    public String correr() {
        return "El leon corre a una velocidad de " + this.getVelocidad();
    }

    @Override
    public String comunicarse() {
        return "El rugido del leon puede alcanzar " +this.getPotenciaRugidoDecibel() + "decibeles";
    }
}
