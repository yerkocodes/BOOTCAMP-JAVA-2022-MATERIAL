import java.util.Scanner;

public class CalculadoraSumaYResta {
    public static void main(String[] args) {
/*
        Contexto
        Se necesita crear una calculadora que pida números al usuario de forma infinita hasta que el
        usuario ingrese el operador igual.

        Requerimientos
        1. Los números a sumar o restar deben ser de tipo float.
        2. Se debe indicar al usuario que debe ingresar, si un número, o un operador.
        3. Como operador solo se debe admitir el ingreso del signo más (+) o menos (-).
        4. Cuando el usuario ingrese el signo igual (=), se mostrará el resultado.
*/
        Scanner sc = new Scanner(System.in);

        float numero;
        float resultado = 0;

        String ingreso;
        int ascii;

        int contador = 0;

        do {
            //Si contador es par el usuario debe ingresar un número de lo contrario debe ingresar un operador
            if((contador % 2) == 0) {
                System.out.println("Ingrese un número: ");
            }else {
                System.out.println("Ingrese un operador (+, -, =): ");
                contador++;
            }
            //Se lee por pantalla el ingreso del usuario, operador o número
                ingreso = sc.next();
            /*
             * Códigos ascii para operadores
             * + --> 43
             * - --> 45
             * = --> 61
             */
            ascii = ingreso.charAt(0);
            /*
            *Si el programa inicio, es decir el contador esta en
            cero y el usuario
            * no ingreso un operador (+, -, =)
            */
            if(contador == 0 && ascii != 43 && ascii != 45 && ascii != 61) {
            //Se hace un cast de ingreso (String) a float
            /*
            * Todas las clases tienen un parse,
            Integer.parseInteger,
            * Double.parseDouble etc. SE hace de esta manera,
            porque un
            * String no se puede transformar en un número, sin
            embargo si
            * el String no es un número, el programa dará un
            error.
            */
                numero = Float.parseFloat(ingreso);
                //Se asigna a resultado el primer numero ingresado
                resultado = numero;
                contador++;
            }else { // De lo contrario, es el segundo ingreso de usuario
                //Suma
                if(ascii == 43) {
                    System.out.println("Ingrese un número: ");
                    ingreso = sc.next(); //Debiese ser un número o si no error
                    numero = Float.parseFloat(ingreso);
                    resultado = resultado + numero;
                    contador++;
                }
                //Resta
                if(ascii == 45) {
                    System.out.println("Ingrese un número: ");
                    ingreso = sc.next(); //Debiese ser un número o si no error
                    numero = Float.parseFloat(ingreso);
                    resultado = resultado - numero;
                    contador++;
                }
            }
        //Repite mientras el ingreso no sea =
        }while((int)ingreso.charAt(0) != 61);
        System.out.printf("El Resultado es: %f", resultado);
    }
}



