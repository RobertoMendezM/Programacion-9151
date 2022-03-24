import java.util.Scanner;
import java.io.File;
import java.util.Arrays;

public class LEctor {

    public static void main(String[] args) {

        try {
            Scanner escaner = new Scanner(System.in); // Creando un obj scanner
            File miArchivo = new File("AMZN.csv"); // Creando un obj archivo o File

            escaner = new Scanner(miArchivo);

            while (escaner.hasNextLine()) {
                String linea = escaner.nextLine(); // Leemos la siguiente linea del archivo.
                //int numero = escaner.nextInt(); // Leemos el siguiente entero del archivo.
                System.out.println(linea);
            } 

            escaner = new Scanner(miArchivo);

            String[] valores = new String[7];
            int contadorLinea= 0;
            while (escaner.hasNextLine()) {
                contadorLinea++;
                String linea = escaner.nextLine(); // Leemos la siguiente linea del archivo.
                if (contadorLinea > 1) {
                    valores = linea.split(",");
                    //System.out.println(Arrays.toString(valores));
                    System.out.println(Double.parseDouble(valores[5]) + 20);
                }
            }

            




        } catch (Exception miError) {
            System.out.println("Hola no encontre el archivo. :( ");
            miError.printStackTrace();

        }




        

    }
   


}
