package org.matiasjimenez.pooclasesabstractas.animales;

import org.matiasjimenez.pooclasesabstractas.mamiferos.Felino;

public class Guepardo extends Felino {


    public Guepardo(String habitat, float altura, float largo, float peso, String nombreCientifico) {
        super(habitat, altura, largo, peso, nombreCientifico);
    }

    @Override
    public String comer() {
        return "Los guepardos son carnívoros especializados en presas medianas";
    }

    @Override
    public String dormir() {
        return "El Guepardo duerme en las estepas africanas";
    }

    @Override
    public String correr() {
        return "El guerpardo corre a una velocidad de " +this.getVelocidad();
    }

    @Override
    public String comunicarse() {
        return "El guepardo no puede rugir, a diferencia de las especies del género Panthera: emite un sonido agudo, llamado gañido, muy parecido al de algunas aves,";
    }
}
