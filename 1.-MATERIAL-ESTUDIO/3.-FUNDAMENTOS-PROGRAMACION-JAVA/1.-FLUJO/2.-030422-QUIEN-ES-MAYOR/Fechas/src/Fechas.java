import java.util.Scanner;

public class Fechas {
    public static void main(String[] args) {

        String firstDate;
        int firstDay;
        int firstMonth;
        int firstYear;

        String secondDate;
        int secondDay;
        int secondMonth;
        int secondYear;

        Scanner sc = new Scanner(System.in);

//        PRIMERA FECHA
        System.out.println("Ingrese la primera fecha como DD/MM/AAAA:");
        firstDate = sc.nextLine();
        firstDay = Integer.parseInt(firstDate.substring(0, 2));
        firstMonth = Integer.parseInt(firstDate.substring(3, 5));
        firstYear = Integer.parseInt(firstDate.substring(6, 10));

/*
        System.out.println(firstDay);
        System.out.println(firstMonth);
        System.out.println(firstYear);
*/

//        SEGUNDA FECHA
        System.out.println("Ingrese la segunda fecha como DD/MM/AAAA:");
        secondDate = sc.nextLine();
        secondDay = Integer.parseInt(secondDate.substring(0, 2));
        secondMonth = Integer.parseInt(secondDate.substring(3, 5));
        secondYear = Integer.parseInt(secondDate.substring(6, 10));

/*
        System.out.println(secondDay);
        System.out.println(secondMonth);
        System.out.println(secondYear);
*/

//        VALIDACION DE DIAS, MESES Y ANIOS
        if ( (firstDay > 0 && firstDay <= 31) && (firstMonth > 0 && firstMonth <= 12) && (firstYear > 1200 && firstYear <= 3000) && (secondDay > 0 && secondDay <= 31) && (secondMonth > 0 && secondMonth <= 12) && (secondYear > 1200 && secondYear <= 3000) ) {
            //POR ANIOS
            if ( firstYear > secondYear ) {
                System.out.println("Persona 2 es mayor.");
            } else if ( firstYear < secondYear ) {
                System.out.println("Persona 1 es mayor.");
            } else if ( firstYear == secondYear ) {
                //POR MESES
                if ( firstMonth > secondMonth ) {
                    System.out.println("Persona 2 es mayor.");
                } else if ( firstMonth < secondMonth ) {
                    System.out.println("Persona 1 es mayor.");
                } else if ( firstMonth == secondMonth ) {
                    //POR DIAS
                    if ( firstDay > secondDay ) {
                        System.out.println("Persona 2 es mayor.");
                    } else if ( firstDay < secondDay ) {
                        System.out.println("Persona 1 es mayor.");
                    } else if ( firstDay == secondDay ) {
                        System.out.println("Tienen la misma edad.");
                    }
                }
            }
        } else {
            System.out.println("Debe ingresar un rango de dias, meses y anios validos. \n Dias entre 1-30 \n Meses entre 1-12 \n Anios entre 1200-3000");
        }

    }
}
