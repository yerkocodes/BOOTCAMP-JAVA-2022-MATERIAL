package cl.yerko;

import cl.yerko.model.BookDetails;
import cl.yerko.model.Books;
import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.client.WebTarget;
import jakarta.ws.rs.core.GenericType;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main( String[] args ) {
        Scanner sc = new Scanner(System.in);
        String userOption = null;

        System.out.println("+------------------------------------------------------+");
        System.out.println("|               Bienvenido a AnchorBooks               |");

        do {
            System.out.println("+------------------------------------------------------+");
            System.out.println("|  1 Listar todos los Libros y sus caracteristicas.    |");
            System.out.println("|  2 Listar los Autores con el titulo del libro.       |");
            System.out.println("|  3 Buscar libro por ubicacion.                       |");
            System.out.println("|  4 Mostrar el detalle completo de todos los Libros.  |");
            System.out.println("|  5 Listar libros con autores anonimos                |");
            System.out.println("|  6 Listar libros con delivery disponible             |");
            System.out.println("|                                                      |");
            System.out.println("|  0 Salir del programa                                |");
            System.out.println("+------------------------------------------------------+");
            System.out.println("Ingrese una opcion: ");
            userOption = sc.next();
            switch (userOption) {
                case "1":
                    System.out.println("Cargando datos...");
                    List<Books> listAllBooks = getAllBooks();
                    for (Books book : listAllBooks) {
                        System.out.println(book);
                    }
                    break;
                case "2":
                    List<String> listBooksAndAuthors = listOfBooksAndAuthors(getAllBooks());
                    for (String item : listBooksAndAuthors) {
                        System.out.println(item);
                    }
                    break;
                case "3":
                    System.out.println("Ingrese la posicion del libro a buscar: ");
                    String subUserOption = sc.next();
                    System.out.println("Buscando libro...");
                    System.out.println(getBookByPosition(Integer.parseInt(subUserOption), getAllBooks()));
                    break;
                case "4":
                    System.out.println("Cargando datos...");
                    List<BookDetails> listAllDetailsBooks = getAllBookDetails();
                    for (BookDetails book : listAllDetailsBooks) {
                        System.out.println(book);
                    }
                    break;
                case "5":
                    System.out.println("Cargando datos... \n");
                    List<String> listUnknownsAuthors = getBooksByUnknowsAuthors(getAllBooks());
                    System.out.println("Autores anónimos: ");
                    for (String book : listUnknownsAuthors) {
                        System.out.println(book);
                    }
                    break;
                case "6":
                    System.out.println("Cargando datos... \n");
                    System.out.println("Libros con delivery disponibles:");
                    List<String> booksByStatusDelivery = deliveryBooks(getAllBookDetails(), true);
                    for (String book : booksByStatusDelivery) {
                        System.out.println(book);
                    }
                    break;
                case "0":
                    System.out.println("+------------------------------------------------------+");
                    System.out.println("|    Gracias por usar el programa! Nos vemos pronto!   |");
                    System.out.println("+------------------------------------------------------+");
                    break;
                default:
                    System.out.println("Debe ingresar una opcion valida");
                    break;
            }
        } while (!userOption.equals("0"));

    }

//    6. Crear el método para obtener la lista de todos los libros desde la primera API e
//    imprimirlos en pantalla. Debiese quedar como en el ejemplo a continuación donde
//    solamente estamos obteniendo el primero de la lista.
//    Book [id=1, author=Chinua Achebe, country=Nigeria, imageLink=https://user-images.githubusercontent.com/22780253/103938792-90279200-5109-11eb-906a-50ac3b73e40d.jpg, language=English, title=Things Fall Apart]
    public static List<Books> getAllBooks() {
        Client client = ClientBuilder.newClient();
        WebTarget target = client.target("https://my-json-server.typicode.com").path("Himuravidal").path("anchorBooks").path("books");
        Invocation.Builder invocationBuilder = target.request(MediaType.APPLICATION_JSON);
        Response response = invocationBuilder.get();
        return response.readEntity(new GenericType<List<Books>>() {});
    }

//    7. Crear el método para obtener la lista de libros desde la API e imprimirlos en pantalla
//    con el siguiente formato (Autor + Título).
//      Chinua Achebe: Things Fall Apart
//      Hans Christian Andersen: Fairy tales
//      Dante Alighieri: The Divine Comedy
    public static List<String> listOfBooksAndAuthors(List<Books> list) {
        List<String> authorsWithBooksList = new ArrayList<>();
        for (Books book : list) {
            authorsWithBooksList.add(book.getAuthor() + ": " + book.getTitle());
        }
        return authorsWithBooksList;
    }

//    8. Crear el método para obtener la lista de los libros ubicados en la posición 3 y 8 e
//    imprimirlos en pantalla con el siguiente formato.
//      Libro número 3: Unknown, The Epic Of Gilgamesh, Sumer and Akkadian Empire
//      Libro número 8: Honoré de Balzac, Le Père Goriot, France
    public static String getBookByPosition(Integer position, List<Books> listOfBooks) {
        Books book = listOfBooks.get(position);
        return "Libro numero " + position + ": " + book.getAuthor() + ", " + book.getTitle() + ", " + book.getCountry();
    }

//    9. Crear el método para obtener el detalle de todos los libros directamente desde la API
//    detalles. Debiese quedar como en el ejemplo a continuación donde solamente
//    estamos obteniendo el primero de la lista.
     public static List<BookDetails> getAllBookDetails(){
         Client client = ClientBuilder.newClient();
         WebTarget target = client.target("https://my-json-server.typicode.com").path("Himuravidal").path("anchorBooks").path("bookDetail");
         Invocation.Builder invocationBuilder = target.request(MediaType.APPLICATION_JSON);
         Response response = invocationBuilder.get();
         return response.readEntity(new GenericType<List<BookDetails>>() {});
     }

//    10. Crear el método para obtener aquellos libros cuyo autor sean anónimos o
//    “Unknown”. el cual debería arrojar la siguiente información:
//    Autores anónimos:
//    Autor: Unknown - libro: The Epic Of Gilgamesh
//    Autor: Unknown - libro: The Book Of Job
//    Autor: Unknown - libro: One Thousand and One Nights
//    Autor: Unknown - libro: Njál's Saga
    public static List<String> getBooksByUnknowsAuthors(List<Books> allBooksList) {
        List<String> unknownsBooks = new ArrayList<>();
        for (Books book : allBooksList) {
            if (book.getAuthor().equals("Unknown")) {
                unknownsBooks.add("Autor: " + book.getAuthor() + " - " + "libro: " + book.getTitle());
            }
        }
        return unknownsBooks;
    }

//    11. Crear el método para obtener aquellos libros cuyo delivery sea true, el cual debería arrojar la siguiente información.
//      Libros con delivery disponibles:
//          Libro: Things Fall Apart
//          Libro: Fairy tales
//          Libro: The Divine Comedy
//          Libro: One Thousand and One Nights
    public static List<String> deliveryBooks(List<BookDetails> listOfBooks, Boolean statusOfDelivery) {
        List<String> deliveryBooksList = new ArrayList<>();
        for (BookDetails book : listOfBooks) {
            if ( book.getDelivery() == statusOfDelivery ) {
                deliveryBooksList.add("Libro: " + book.getTitle());
            }
        }
        return deliveryBooksList;
    }
}
