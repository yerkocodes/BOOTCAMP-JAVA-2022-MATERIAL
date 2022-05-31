import java.util.ArrayList;

public class MultiplosDeTres {
    public static void main(String[] args) {

        ArrayList<Integer> userNumbers = new ArrayList<Integer>();

        for (int i = 0; i < args.length; i++) {
            userNumbers.add(Integer.parseInt(args[i]));
        }

        System.out.printf(sumaImpares(userNumbers) + "\n");
        System.out.print(promImpares(userNumbers));

    }

    public static int sumaImpares(ArrayList<Integer> arrayNumbers) {
        int suma = 0;

        for (int i = 0; i < arrayNumbers.size(); i++) {
            if ( arrayNumbers.get(i)%3 == 0 ) {
                suma = suma + arrayNumbers.get(i);
            }
        }

        return suma;

    }

    public static float promImpares(ArrayList<Integer> arrayNumbers) {
        float sum = 0f;
        int count = 0;

        for (int i = 0; i < arrayNumbers.size(); i++) {
            if ( arrayNumbers.get(i)%3 == 0 ) {
                sum = sum + arrayNumbers.get(i);
                count++;
            }
        }

        return sum / count;
    }

}
