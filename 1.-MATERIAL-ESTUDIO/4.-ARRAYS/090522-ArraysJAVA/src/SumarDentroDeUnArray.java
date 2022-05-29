public class SumarDentroDeUnArray {
    public static void main(String[] args) {
        System.out.printf("La suma es: %d", suma());
    }

    public static int suma() {
        int suma = 0;
        int[] arreglo = { 1, 5, 11, 33, 4, 6, 7, 44, 6, 1, -1 };

        for ( int i = 0; i < arreglo.length; i++ ) {
            if ( arreglo[i] >= 1 && arreglo[i] <= 10 ) {
                suma = suma + arreglo[i];
            }
        }
        return suma;
    }

}
