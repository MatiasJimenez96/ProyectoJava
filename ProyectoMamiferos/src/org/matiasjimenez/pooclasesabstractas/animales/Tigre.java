package org.matiasjimenez.pooclasesabstractas.animales;

import org.matiasjimenez.pooclasesabstractas.mamiferos.Felino;

public class Tigre extends Felino {
    private String especieDeTigre;

    public Tigre(String habitat, float altura, float largo, float peso, String nombreCientifico) {
        super(habitat, altura, largo, peso, nombreCientifico);
    }


    public void setEspecieDeTigre(String especieDeTigre) {
        this.especieDeTigre = especieDeTigre;
    }

    public String getEspecieDeTigre() {
        return especieDeTigre;
    }

    @Override
    public String comer() {

        return "El " + especieDeTigre + " se alimenta de ungulados de gran tamaño en " + this.getHabitat();
    }

    @Override
    public String dormir() {
        return "Los tigre suelen dormir en selvas tropicales, pastizales, sabanas e incluso manglares."
        + "Desafortunadamente, el 93% de las zonas históricas de su distribución han desaparecido principalmente debido a la expansión de la actividad humana";
    }

    @Override
    public String correr() {
        return "El " + especieDeTigre + " corre a una velocidad de " + this.getVelocidad();
    }

    @Override
    public String comunicarse() {
        return "El tigre se comunica con señales olfativas y visuales como orina, heces fecales y marcas de expresión del estado anímico";
    }
}
