package ayudaDesafio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class Archivo {

	public static void main(String[] args) {
//		crearFile();
//	    lectura();
//		crearArchivo("carpetita", "archivito");
		buscarTexto("archivoSrc", "Hola");
	}

	public static void crearFile() {

		File directorio = new File("src/carpeta");  
		File archivo = new File("src/carpeta/texto.txt");  

		if (!directorio.exists()) {
			if (directorio.mkdirs()) {
				System.out.println("Directorio creado");
				try {
					archivo.createNewFile();
					FileWriter fileW = new FileWriter(archivo);
					BufferedWriter bufferedWriter = new BufferedWriter(fileW);

					bufferedWriter.write("texto 1");
					bufferedWriter.write("texto 2");
					bufferedWriter.newLine();

					bufferedWriter.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			} else {
				System.out.println("Error al crear directorio");
			}
		} else {
			System.out.println("Directorio ya esta creado");

		}
	}

	public static void lectura() { 
		try {
			File archivo = new File("src/carpeta/fichero.txt");
			if (archivo.exists()) {
				FileReader fr = new FileReader(archivo);
				BufferedReader br = new BufferedReader(fr);
				String data = br.readLine();
				while (data != null) {
					System.out.println(data);  	 
					data = br.readLine();
				}
				br.close(); 
			} else {
				System.out.println("El fichero ingresado no existe");
			}

		} catch (Exception e) {
			System.out.println("Excepcion leyendo fichero : " + e);
		}

	}

	public static void crearArchivo (String directorio, String fichero) {
			File directory = new File("src/" + directorio);
			File file = new File("src/" + directorio + "/" + fichero + ".txt" );

			ArrayList<String> lista = new ArrayList<String>();
			lista.add("Perro");
			lista.add("Gato");
			lista.add("Juan");
			lista.add("Daniel");
			lista.add("Juan");
			lista.add("Gato");
			lista.add("Perro");
			lista.add("Camila");
			lista.add("Daniel");
			lista.add("Camila");

			if ( !directory.exists() ) {
				if ( directory.mkdirs() ) {
					System.out.println("Directorio " + directorio + " creado con exito!");
					try	{
						file.createNewFile();
						FileWriter fileW = new FileWriter(file);
						BufferedWriter fileBW = new BufferedWriter(fileW);

						for (int i = 0; i < lista.size(); i++) {
							fileBW.write(lista.get(i));
							fileBW.newLine();
						}
						fileBW.close();

					} catch (IOException e) {
						e.printStackTrace();
					}
				} else {
					System.out.println("Ocurrio un error al crear el directorio " + directorio);
				}
			}
	}

	public static void buscarTexto (String nombreFichero, String texto) {
		File file = new File("src/" + nombreFichero + ".txt");
		if ( file.exists() ) {
			try	{
				FileReader fileR = new FileReader(file);
				BufferedReader fileBR = new BufferedReader(fileR);

//				String data = fileBR.readLine();
//
//				while ( data != null ) {
//					System.out.println(data);
//					data = fileBR.readLine();
//				}
				// FALTA BUSCAR UNA PALABRA EN ESPECIFICO DEL CONTENIDO DEL ARCHIVO.
				fileBR.close();

			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("El fichero ingresado no existe.");
		}
	}

}
