package com.yerko;

import java.util.LinkedList;
import java.util.Queue;

public class EjercicioCuatro {
    public static void main(String[] args) {
        /*
          Por último, y no menos importante, se acordaron de aquellos juegos de infancia junto a su
          amiga. Usted mientras conversaba, se da cuenta que podría listarlos con un Queue. Es por
          esto que decide hacer lo siguiente:
        */

        //1. Instanciar un Queue<>() llamado “juegos” con algo llamado LinkedList() para encolar.
        Queue<String> juegos = new LinkedList<>();

        //2. Deciden agregar los siguientes juegos: Tombo, Congelado, Quemaditas, Cachipún, Pillarse.
        juegos.add("Tombo");
        juegos.add("Congelado");
        juegos.add("Quemaditas");
        juegos.add("Cachipun");
        juegos.add("Pillarse");

        //3. Dada la hora y lo tarde de la videollamada, deciden solamente contar la cantidad de juegos e imprimirlos en pantalla para algún día volver a jugarlos.
        int cantidadDeJuegos = juegos.size();
        juegos.stream().forEach(j -> System.out.println(j));
//        System.out.println("Cantidad de juegos: " +  cantidadDeJuegos);
        System.out.println("Cantidad de juegos: " + juegos.stream().count());

    }
}
