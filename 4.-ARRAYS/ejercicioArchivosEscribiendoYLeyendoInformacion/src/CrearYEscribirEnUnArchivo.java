import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;

public class CrearYEscribirEnUnArchivo {
    public static void main(String[] args) {
        Scanner scString = new Scanner(System.in);
        scString.useDelimiter("\n");
        String folderName, fileName, content;

        try {
            System.out.printf("Ingrese el nombre de directorio: \n");
            folderName = scString.nextLine();

            System.out.printf("Ingrese el nombre de archivo con la extension: \n");
            fileName = scString.nextLine();

            System.out.printf("Ingrese el contenido que se escribira en el archivo: \n");
            content = scString.next();
            System.out.printf("Contenido >>> " + content + "\n");

            createFile(folderName, fileName, content);
        } catch ( IOException ignored) {
            System.out.println("Something went wrong 111. \n");
            System.out.print(ignored.getMessage());
        }
    }

    public static void createFile(String folderName, String fileName, String content) throws IOException {
        Scanner scString = new Scanner(System.in);
        String userOption;



        try {
            File directorio = new File("./src/%s", folderName); // Ruta donde se creara el directorio.
            File archivo = new File("./src/" + folderName + "/" + fileName); // Ruta donde se creara el archivo.
            if ( !directorio.exists() ) {
                directorio.mkdir(); // Se crea el directorio.
                archivo.createNewFile(); // Se crea el archivo.

                // ● Creamos el objeto FileWriter con un Archivo File.
                // ● Creamos el objeto BufferedWriter con un Archivo FileWriter .
                FileWriter fileW = new FileWriter(archivo);
                BufferedWriter bufferedWriter = new BufferedWriter(fileW);

                // ● Utilizamos el método write para escribir en el archivo.
                // ● Hacemos un salto de línea con el método newLine().
                // ● Cerramos el archivo con el método close().
                bufferedWriter.write(content);
                bufferedWriter.close();
            } else {
                System.out.printf("El directorio con nombre " + folderName + " ya existe. \n Desea sobreescribirlo? S/N");
                userOption = scString.nextLine();

/*
                if (Objects.equals(userOption, "S") || Objects.equals(userOption, "s")) {
                    directorio.mkdir(); // Se crea el directorio.
                    archivo.createNewFile(); // Se crea el archivo.

                    // ● Utilizamos el método write para escribir en el archivo.
                    // ● Hacemos un salto de línea con el método newLine().
                    // ● Cerramos el archivo con el método close().
                    bufferedWriter.write(content);
                    bufferedWriter.close();
                } else {
                    System.out.printf("Cambie el nombre del directorio.");
                }
*/
            }

        } catch ( Exception ignored) {
            System.out.printf("Something went wrong.");
        }

    }

}
