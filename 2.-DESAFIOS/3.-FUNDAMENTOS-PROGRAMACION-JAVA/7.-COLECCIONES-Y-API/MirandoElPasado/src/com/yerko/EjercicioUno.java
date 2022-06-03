package com.yerko;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EjercicioUno {
    public static void main(String[] args) {

        //1. Instanciar un ArrayList<>() del tipo String llamado “marcas” para generar un listado de marcas.
        List<String> marcas = new ArrayList<>();

        //2. Agregar 10 marcas que usted haya conocido e imprimirlas en consola mediante System.out.println.
        marcas.add("Free");
        marcas.add("Negrita");
        marcas.add("Sony Ericsson");
        marcas.add("Puerto Cristo");
        marcas.add("Nextel");
        marcas.add("Calpany");
        marcas.add("Hilton");
        marcas.add("Barclay");
        marcas.add("Pie Chiquito");
        marcas.add("Lomiton");

        //3. Su amiga le dice que recordó 3 marcas y le pregunta si puede agregarlas al listado. Los elementos a agregar son “Blokbaster”, “Carrefour” y “Jetix”. Imprimir el nuevo listado en consola.
        marcas.add("Blokbaster");
        marcas.add("Carrefour");
        marcas.add("Jetix");

        //4. Se dan cuenta que “Blokbaster” en realidad se escribe “Blockbuster” y deciden cambiar la palabra en el listado.
        marcas.set(marcas.indexOf("Blokbaster"), "Blockbuster");

        //5. Lamentablemente, usted se da cuenta que “Carrefour” aún existe y decide borrarlo del listado. Para ello, usted debe remover el elemento número 11 e imprimir el nuevo listado en pantalla. Puede usar la función .remove("Carrefour") para ver si el elemento se borró correctamente, ya que arrojará true si se eliminó de manera correcta.
        marcas.remove("Carrefour");

        //6. Usted se inspira y decide hacer una colección aparte de marcas que podrían estar fuera del mercado. Para ello, usted debe agregar marcas (las que quiera) en una nueva ArrayList<>() llamada “posiblesMarcas” e incorporarlas a la lista de ”marcas”.
        ArrayList<String> posiblesMarcas = new ArrayList<>(Arrays.asList("Sony Ericsson", "Metropolis", "Telcel", "Telefonica", "Telmex"));
        marcas.addAll(posiblesMarcas);

        //7. A eso de las 11 de la noche, deciden ver cuántos elementos tiene este listado. Es por eso que usted utiliza sus conocimientos y cuenta la cantidad de elementos que contiene la lista para imprimir en pantalla.
        System.out.println(marcas);
        System.out.println(marcas.size());

    }
}
