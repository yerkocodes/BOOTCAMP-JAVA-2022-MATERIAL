import java.util.Scanner;

public class MiCalculadora {
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
        float resultado = 0; //Resultado Final de las operaciones

        String ingreso;
        int ascii;

        int contador = 0;

        do {
            //Si contador es par el usuario debe ingresar un número de lo contrario debe ingresar un operador
            if((contador % 2) == 0) { // contador es par ingresa numero
                System.out.println("Ingrese un número: ");
            }else { // contador es inpar ingresa un operador
                System.out.println("Ingrese un operador (+, -, =): ");
                contador++; // Si se ingresa un operador se incrementa el contador.
            }
            //Se lee por pantalla el ingreso del usuario, operador o número
            ingreso = sc.next(); // Se almacena en la variable el dato String ingresado por el usuario

             /*
             * Códigos ascii para operadores
             * + --> 43
             * - --> 45
             * = --> 61
             */

            ascii = ingreso.charAt(0); // Se almacena en una variable tipo INT el primer digito del String guardado como codigo ASCII
            /*
            *Si el programa inicio, es decir el contador esta en cero y el usuario no ingreso un operador (+, -, =)
            * Esto ocurre solo la primera vez iniciado el programa cuando el contador aun no se ha cambiado de 0
            */
            if(contador == 0 && ascii != 43 && ascii != 45 && ascii != 61) { // si contador es igual a 0 y distinto de 43(+), 45(-) y 61(=).
                //Se hace un cast de ingreso (String) a float
                numero = Float.parseFloat(ingreso); // Se castea el string a float ya que necesitamos que sea un numero
                //Se asigna a resultado el primer numero ingresado
                resultado = numero;
                contador++; // Aqui se incrementa el contador de ser un numero el ingresado no en el primer if
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
