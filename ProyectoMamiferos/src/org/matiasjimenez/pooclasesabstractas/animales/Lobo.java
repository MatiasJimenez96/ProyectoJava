package org.matiasjimenez.pooclasesabstractas.animales;

import org.matiasjimenez.pooclasesabstractas.mamiferos.Canino;

public class Lobo extends Canino {
    private int numCamada;
    private String especieLobo;

    public Lobo(String habitat, float altura, float largo, float peso, String nombreCientifico) {
        super(habitat, altura, largo, peso, nombreCientifico);
    }

    public int getNumCamada() {
        return numCamada;
    }

    public void setNumCamada(int numCamada) {
        this.numCamada = numCamada;
    }

    public String getEspecieLobo() {
        return especieLobo;
    }

    public void setEspecieLobo(String especieLobo) {
        this.especieLobo = especieLobo;
    }

    @Override
    public String comer() {
        return "El " + especieLobo + " suele alimentarse de " + "grandes mamíferos, como ciervos, alces, focas, bisontes y bueyes";
    }

    @Override
    public String dormir() {
        return "El " + especieLobo + " habita y duerme por la zona de " + this.getHabitat();
    }

    @Override
    public String correr() {
        return "Los lobos suelen correr a una de entre 50 – 60 km/h ";
    }

    @Override
    public String comunicarse() {
        return "Los lobos se comunican con una gran variedad de sonidos, desde ladridos y gruñidos, hasta el famoso aullido";
    }
}
