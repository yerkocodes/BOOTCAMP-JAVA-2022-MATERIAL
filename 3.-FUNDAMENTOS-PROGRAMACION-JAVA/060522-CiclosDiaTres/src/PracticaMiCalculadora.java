import java.util.Scanner;

public class PracticaMiCalculadora {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String inputUser; // Lo que ingrese el usuario
        float inputToNumber; // El dato ingresado de tipo string parseado a number
        float totalResult = 0; // Resultado total de las operaciones

        int count = 0; // Contador que servira para evaluar par e impares en la solicitud de numero o operador

        int ascii; // Esta variable servira para identificar los codigos ASCII de los operadores +(43), -(45) y =(61)

        do {

            if ( count%2 == 0 ) { // Contador par, solicita numero
                System.out.print("Ingrese un numero\n");
                inputUser = sc.nextLine();
            } else { // Contador impar, solicita operador
                System.out.print("Ingrese un operador ( + - = )\n");
                inputUser = sc.nextLine();
                count++;
            }

            ascii = inputUser.charAt(0); // Guardamos en la variable el codigo ASCII correspondiente al primer caracter del input
            //System.out.printf("Codigo ascii: " + ascii + "\n");

            // Evaluar el primer input si es distinto a los operadores ya que si o si debe comenzar entregandose un numero.
            if ( count == 0 && ascii != 43 && ascii != 45 && ascii != 61 ) { // Se ejecuta solo la primera vez
                inputToNumber = Float.parseFloat(inputUser);
                totalResult = inputToNumber;
                count++;
            } else { // Se ejecutara siempre despues de la primera entrada de datos

                switch( ascii ) {
                    case 43: // SUMA
                        System.out.print("Ingrese un numero a sumar: \n");
                        inputUser = sc.nextLine();
                        inputToNumber = Float.parseFloat(inputUser);
                        totalResult += inputToNumber;
                        count++;
                        break;
                    case 45: // RESTA
                        System.out.print("Ingrese un numero a restar: \n");
                        inputUser = sc.nextLine();
                        inputToNumber = Float.parseFloat(inputUser);
                        totalResult -= inputToNumber;
                        count++;
                        break;
                }

            }

        } while ( (int)inputUser.charAt(0) != 61 ); // (int) castea a numero entero el primer caracter obtenido del input transformandolo asi en codigo ASCII
        System.out.printf("Resultado total: " + totalResult);

    }
}
