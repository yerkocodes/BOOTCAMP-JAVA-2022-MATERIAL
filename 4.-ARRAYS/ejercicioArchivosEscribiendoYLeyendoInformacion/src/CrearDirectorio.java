import java.io.File;
import java.util.Objects;
import java.util.Scanner;

public class CrearDirectorio {
    public static void main(String[] args) {
        Scanner scString = new Scanner(System.in);
        String userOption;

        System.out.printf("Ingrese el nombre del directorio a crear: \n");
        userOption = scString.nextLine();

        crearDirectorio(userOption);
    }

    public static void crearDirectorio(String nombre) {
        File directorio = new File("src/" + nombre);
        Scanner scString = new Scanner(System.in);
        String userOption;

        System.out.print(nombre);

        if (!Objects.equals(nombre, "")) {
            if ( !directorio.exists() ) {
                directorio.mkdir();
            } else {
                System.out.printf("El directorio con nombre " + nombre + " ya existe. \n Desea sobreescribirlo? S/N: ");
                userOption = scString.nextLine();

                if ( userOption == "S" || userOption == "s" ) {
                    directorio.mkdir();
                } else {
                    System.out.printf("El directorio no ha sido creado. Utilice otro nombre distinto de " + nombre + "\n");
                }
            }
        } else {
            System.out.printf("Debe ingresar un nombre para crear el directorio. \n");
        }

    }

}
