package org.matiasjimenez.pooclasesabstractas.animales;

import org.matiasjimenez.pooclasesabstractas.mamiferos.Canino;

public class Perro extends Canino {
    private int fuerzaMordida;

    public Perro(String habitat, float altura, float largo, float peso, String nombreCientifico) {
        super(habitat, altura, largo, peso, nombreCientifico);
    }

    public int getFuerzaMordida() {
        return fuerzaMordida;
    }

    public void setFuerzaMordida(int fuerzaMordida) {
        this.fuerzaMordida = fuerzaMordida;
    }

    @Override
    public String comer() {
        return "En la naturaleza un perro se alimenta fundamentalmente de carne, es su mayor fuente de energía y de aportación de proteínas.";
    }

    @Override
    public String dormir() {
        return "Los perros duermen en gran variedad de entornos, como praderas, selvas, bosques, desiertos...";
    }

    @Override
    public String correr() {
        return "Los perros suelen alcanzar una velocidad de 65 km/h";
    }

    @Override
    public String comunicarse() {
        return "se comunican entre sí a través de gestos, posturas, sonidos y olores. De esta manera, expresan su estado emocional, deseos, necesidades y status.";
    }
}
