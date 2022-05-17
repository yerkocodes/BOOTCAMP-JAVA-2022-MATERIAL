import java.util.concurrent.TimeUnit;

public class BombaDeTiempo {
    public static void main(String[] args) {
        //Crearemos un algoritmo sencillo que realice una cuenta regresiva de 5 segundos.
        int i = 5;
        while( i > 0 ){
            //System.out.printf("%d \n", i);
            System.out.printf("%d \n", i); // %d significa variable de digito es como la interpolación en JS y luegode la coma se especifica en el orden de la declaracion el valor al que hace referencia
            i--;

            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}