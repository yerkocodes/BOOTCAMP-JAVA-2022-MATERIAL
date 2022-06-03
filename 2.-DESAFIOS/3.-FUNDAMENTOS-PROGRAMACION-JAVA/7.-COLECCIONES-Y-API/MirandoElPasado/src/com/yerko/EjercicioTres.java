package com.yerko;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class EjercicioTres {
    public static void main(String[] args) {
        /*
          Sin embargo, la fiesta no terminó ahí. Usted encontró en internet un listado con los precios
          antiguos de algunas golosinas de la infancia y decide crear un Map<>() para ir terminando la
          fiesta.
        */

        //1. Instanciar un Map<>() del tipo <String, Integer> llamado “golosinas” para generar un listado de estas. Usted le comenta a su amiga que le gustaría probar algo llamado TreeMap() para listarlos por claves.
        Map<String, Integer> golosinas = new TreeMap<>();

        //2. Deciden agregar las siguientes golosinas:
        //    ●Chocman a 100 pesos
        //    ●Trululú a 100 pesos
        //    ●Centella a 100 pesos
        //    ●Kilate a 50 pesos
        //    ●Miti-miti a 30 pesos
        //    ●Traga Traga a 150 pesos
        //    ●Tabletón a 5 pesos

        golosinas.put("Chocman", 100);
        golosinas.put("Trululu", 100);
        golosinas.put("Centella", 100);
        golosinas.put("Kilate", 50);
        golosinas.put("Miti-miti", 30);
        golosinas.put("Traga Traga", 150);
        golosinas.put("Tableton", 5);

        //3. Su amiga le dice que si es posible filtrar aquellas golosinas que costaban menos de 100 pesos para mostrar en sus redes sociales el valor del dinero en el tiempo.
        Map<String, Integer> filtrados = new TreeMap<>();
        golosinas.entrySet().stream().filter(g -> g.getValue() < 100).forEach(g -> filtrados.put(g.getKey(), g.getValue()));

        golosinas.putAll(filtrados);
        List<Map.Entry<String, Integer>> filtrado = golosinas.entrySet().stream().filter(g -> g.getValue() < 100).collect(Collectors.toList());
        System.out.println(filtrado);

        filtrado.stream().forEach(System.out::println);
        filtrado.stream().forEach(g -> System.out.println(g.getKey()));

        Map<String, Integer> golosinasFiltradas = new TreeMap<>();
        filtrado.stream().forEach(g -> golosinasFiltradas.put(g.getKey(), g.getValue()));
        System.out.println(golosinasFiltradas);

    }
}
