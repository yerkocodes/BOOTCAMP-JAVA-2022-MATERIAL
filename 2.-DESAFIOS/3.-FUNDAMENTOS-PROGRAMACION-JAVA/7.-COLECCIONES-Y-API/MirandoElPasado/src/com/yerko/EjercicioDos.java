package com.yerko;

import java.util.Set;
import java.util.TreeSet;

public class EjercicioDos {
    public static void main(String[] args) {
        /*
            Dado que la fiesta no terminó ahí, y luego de un montón de risas, se acuerdan de algunos ex
            compañeros/as del colegio y deciden anotarlos en un listado con la idea de contactarlos e
            invitarlos a una fiesta post-pandemia. Aburrido de usar ArrayList<>(), decide usar
        Set<>(). Para ello, usted hace lo siguiente:
        */

        //1. Instanciar un Set<>() del tipo String llamado “invitados” para generar un listado de compañeros/as. Usted le comenta a su amiga que pueden usar algo llamado TreeSet<>() para listarlos ordenadamente.
        Set<String> invitados = new TreeSet<>(); // Insercion ordenada y no se repiten

        //2. Luego de muchos recuerdos, deciden agregar los siguientes nombres: “Daniel”, “Paola”, “Facundo”, “Pedro”, ”Jacinta”, “Florencia” y “Juan Pablo”.
        invitados.add("Daniel");
        invitados.add("Paola");
        invitados.add("Facundo");
        invitados.add("Pedro");
        invitados.add("Jacinta");
        invitados.add("Florencia");
        invitados.add("Juan Pablo");

        //3. Su amiga le dice que se acaba de acordar de 3 ex compañeros adicionales y le pregunta si puede agregarlos en un listado aparte de “posibles invitados”, ya que no les caía muy bien. Los “posibles invitados” son “Jorge”, “Francisco” y “Marcos”. Genere este nuevo listado, únalo con el otro e imprima en pantalla.
        Set<String> posiblesInvitados = new TreeSet<>();
        posiblesInvitados.add("Jorge");
        posiblesInvitados.add("Francisco");
        posiblesInvitados.add("Marcos");

        invitados.addAll(posiblesInvitados);
        System.out.println(invitados);

        //4. Lamentablemente, usted se da cuenta que es mejor no invitar a “Jorge” y decide eliminarlo del listado. Imprima el listado final de invitados para que comiencen a contactarlos lo antes posible.
        invitados.remove("Jorge");
        System.out.println(invitados);
    }
}
