public class TablasDeMultiplicar {
    public static void main(String[] args) {
        for ( int i = 1; i <= 10; i++) {
            //System.out.printf("5 * %d = %d \n", i, i*5);
            for ( int j = 1; j <= 10; j++) {
                System.out.printf("%d * %d = %d \n", i, j, i*j);
            }
            System.out.printf("----------- \n");
        }
    }
}
