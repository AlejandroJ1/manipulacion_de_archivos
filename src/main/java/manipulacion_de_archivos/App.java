package manipulacion_de_archivos;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.IOException;

public class App {
    public static void main(String[] args) {

        // Crear un archivo
        File archivo = new File("chistes.txt");

        try {
            if (archivo.createNewFile()) {
                System.out.println("Se ha creado el archivo " + archivo.getName());
            } else {
                System.out.println("El archivo ya existe");
            }
        } catch (IOException e) {
            System.out.println("Error");
            e.printStackTrace();
        }

        // Escribir en un archivo
        try {
            FileWriter escribir_chiste = new FileWriter("chistes.txt");
            escribir_chiste.write("¿Cómo se llama el campeón de apnea japonés? Tokofondo.\n");
            escribir_chiste.close();
        } catch (IOException e) {
            System.out.println("Error");
            e.printStackTrace();
        }

        // Leer archivos
        try {
            Scanner lector_chiste = new Scanner(archivo);
            while (lector_chiste.hasNextLine()) {
                String linea = lector_chiste.nextLine();
                System.out.println(linea);
            }
            lector_chiste.close();
        } catch (IOException e) {
            System.out.println("Error");
            e.printStackTrace();
        }

        // Crear un archivo
        File archivo = new File("chistes.txt");

        try {
            if (archivo.createNewFile()) {
                System.out.println("Se ha creado el archivo " + archivo.getName());
            } else {
                System.out.println("El archivo ya existe");
            }
        } catch (IOException e) {
            System.out.println("Error");
            e.printStackTrace();
        }

        // Escribir en un archivo
        try {
            FileWriter escribir_chiste = new FileWriter("chistes.txt", true);
            escribir_chiste.write(
                    "Un hombre todo borracho llega a alcohólicos anónimos y allá le preguntan: ¿Vino sólo? El borracho saca la copa y dice: ¡No!, mejor con hielo.\n");
            escribir_chiste.close();
        } catch (IOException e) {
            System.out.println("Error");
            e.printStackTrace();
        }

        // Leer archivos
        try {
            Scanner lector_chiste = new Scanner(archivo);
            while (lector_chiste.hasNextLine()) {
                String linea = lector_chiste.nextLine();
                System.out.println(linea);
            }
            lector_chiste.close();
        } catch (IOException e) {
            System.out.println("Error");
            e.printStackTrace();
        }

        //

        // Crear un archivo sql

        File archivo_sql = new File("prueba.sql");
        System.out.println();

        try {
            if (archivo_sql.createNewFile()) {
                System.out.println("Se ha creado el archivo " + archivo_sql.getName());
            } else {
                System.out.println("El archivo ya existe");
            }
        } catch (IOException e) {
            System.out.println("Error");
            e.printStackTrace();
        }

        // Escribir en un archivo
        try {
            FileWriter archivo_sql_escribir = new FileWriter(archivo_sql);
            archivo_sql_escribir.write("CREATE DATABASE ejemplo;\n");
            archivo_sql_escribir.write("CREATE TABLE tabla_de_ejemplo(id INT PRIMARY KEY,nombre VARCHAR(20); \n");
            archivo_sql_escribir.write("INSERT INTO ejemplo VALUES (1,'nombre_de_ejemplo'\n");
            archivo_sql_escribir.close();
        } catch (IOException e) {
            System.out.println("Error");
            e.printStackTrace();
        }

    }
}
