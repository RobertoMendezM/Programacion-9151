import java.util.Scanner;
import java.io.File;

public class LEctor {

    public static void main(String[] args) {

        try {
            Scanner escaner = new Scanner(System.in); // Creando un obj scanner
            File miArchivo = new File("AMZ0oN.csv"); // Creando un obj archivo o File

            escaner = new Scanner(miArchivo);

            while (escaner.hasNextLine()) {
                String linea = escaner.nextLine(); // Leemos la siguiente linea del archivo.
                //int numero = escaner.nextInt(); // Leemos el siguiente entero del archivo.
                System.out.println(linea);
            } 

        } catch (Exception miError) {
            System.out.println("Hola no encontre el archivo. :( ");
            miError.printStackTrace();

        }




        

    }
   


}
