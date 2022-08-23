package org.matiasjimenez.pooclasesabstractas.mamiferos;

public abstract class Felino extends Mamifero {

    protected float tamanoGarras;
    protected int velocidad;

    public Felino(String habitat, float altura, float largo, float peso, String nombreCientifico) {
        super.habitat = habitat;
        super.altura = altura;
        super.largo = largo;
        super.peso = peso;
        super.nombreCientifico = nombreCientifico;
    }



    public void setTamanoGarras(float tamanoGarras) {
        this.tamanoGarras = tamanoGarras;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public float getTamanoGarras() {
        return tamanoGarras;
    }
}
