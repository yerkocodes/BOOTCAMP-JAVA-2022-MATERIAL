import java.util.ArrayList;

public class SmartWatch {
    public static void main(String[] args) {
        ArrayList<Integer> steps = new ArrayList<Integer>();

        for (int i = 0; i < args.length; i++) {
            steps.add(Integer.parseInt(args[i]));
        }

        System.out.printf(clearSteps(steps) + "\n");
        System.out.print(promedio(clearSteps(steps)));

    }

    public static ArrayList<Integer> clearSteps(ArrayList<Integer> arraySteps){

        ArrayList<Integer> newArray = new ArrayList<Integer>();

        for (int i = 0; i < arraySteps.size(); i++) {
            if ( arraySteps.get(i) >= 200 && arraySteps.get(i) < 100000 ) {
                newArray.add(arraySteps.get(i));
            }
        }

        return newArray;
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
