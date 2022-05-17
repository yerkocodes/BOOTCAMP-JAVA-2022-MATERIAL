import java.util.ArrayList;

public class Visitas {
    public static void main(String[] args) {
        ArrayList<Integer> visitas = new ArrayList<Integer>();

        for ( int i = 0; i < args.length; i++) {
            visitas.add(Integer.parseInt(args[i]));
        }

        System.out.printf("Para la entrada anterior, el resultado es: " + promedio(visitas));
    }

    public static int promedio(ArrayList<Integer> visitas) {

        int suma = 0;
        int result;

        for (int i = 0; i < visitas.size(); i++) {
             suma = suma + visitas.get(i);
        }

        result = suma / visitas.size();

        return result;

    }
}
