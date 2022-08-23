package org.matiasjimenez.pooclasesabstractas.mamiferos;

public abstract class Canino extends Mamifero {

    protected String color;
    protected float tamanoColmillos;

    public Canino(String habitat, float altura, float largo, float peso, String nombreCientifico) {
        super(habitat, altura, largo, peso, nombreCientifico);
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setTamanoColmillos(float tamanoColmillos) {
        this.tamanoColmillos = tamanoColmillos;
    }

    public String getColor() {
        return color;
    }

    public float getTamanoColmillos() {
        return tamanoColmillos;
    }
}
