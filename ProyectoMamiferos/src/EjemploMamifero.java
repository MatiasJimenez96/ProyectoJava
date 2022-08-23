import org.matiasjimenez.pooclasesabstractas.animales.*;
import org.matiasjimenez.pooclasesabstractas.mamiferos.*;



public class EjemploMamifero {

    public static void main(String[] args) {

        Mamifero[] mamiferos = new Mamifero[5];


        Guepardo guepardo = new Guepardo("Africa", 94, 1.5f, 72, "Acinonyx jubatus");
        guepardo.setTamanoGarras(15);
        guepardo.setVelocidad(120);

        Leon leon = new Leon("Africa", 150, 210, 190, "Panthera leo");
        leon.setNumeroManada(7);
        leon.setPotenciaRugidoDecibel("114 decibeles");
        leon.setTamanoGarras(20);
        leon.setVelocidad(80);

        Lobo lobo = new Lobo("Este de América del Norte, Pensilvania, Florida, Texas", 80, 140, 30, "Canis rufus");
        lobo.setEspecieLobo("Lobo Rojo");
        lobo.setNumCamada(12);
        lobo.setColor("Rojo y/o marron");
        lobo.setTamanoColmillos(5.8f);


        Perro perro = new Perro("Africa", 75, 92, 22, "Lycaon pictus");
        perro.setColor("negro y marron");
        perro.setTamanoColmillos(4.6f);
        perro.setFuerzaMordida(137);

        Tigre tigre = new Tigre("bosques tropicales, subtropicales y sabanas en Nepal, la India, Birmania, Bangladesh y el Tibet", 105, 270, 260, "Panthera tigris tigris");
        tigre.setEspecieDeTigre("Tigre de bengala");
        tigre.setTamanoGarras(17);
        tigre.setVelocidad(90);

        mamiferos[0] = leon;
        mamiferos[1] = lobo;
        mamiferos[2] = perro;
        mamiferos[3] = tigre;
        mamiferos[4] = guepardo;

        for (Mamifero m : mamiferos) {
            System.out.println(" =============== " + m.getClass().getSimpleName() + " =============== ");
            System.out.println("Nombre cientifico: " + m.getNombreCientifico());
            System.out.println("Habitat: " + m.getHabitat());
            System.out.println("Altura: "+ m.getAltura());
            System.out.println("Largo: " + m.getLargo());
            System.out.println("Peso: " + m.getPeso());
            if(m instanceof Felino){
                System.out.println("Velocidad aprox: " + ((Felino) m).getVelocidad());
                System.out.println("Tamaño de las garras: " + ((Felino) m).getTamanoGarras());
                if(m instanceof Leon ){
                    System.out.println("Numero de manada: " + ((Leon) m).getNumeroManada());
                    System.out.println("Potencia de rugido en decibeles: " + ((Leon) m).getPotenciaRugidoDecibel());
                }
                if(m instanceof Tigre){
                    System.out.println("Especie de tigre: " + ((Tigre) m).getEspecieDeTigre());
                }
            }
            if(m instanceof Canino){
                System.out.println("Color: " + ((Canino) m).getColor());
                System.out.println("Tamaño de los colmillos: " + ((Canino) m).getTamanoColmillos());
                if(m instanceof Lobo){
                    System.out.println("Numero de camada: " + ((Lobo) m).getNumCamada());
                    System.out.println("Especie: " + ((Lobo) m).getEspecieLobo());
                }
                if(m  instanceof Perro){
                    System.out.println("Fuerza de mordida: " + ((Perro) m).getFuerzaMordida());
                }
            }

            System.out.println(m.comer());
            System.out.println(m.correr());
            System.out.println(m.dormir());
            System.out.println(m.comunicarse());
            System.out.println();
            System.out.println();
        }
    }
}
