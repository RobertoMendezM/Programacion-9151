import java.util.Scanner;
import java.io.File;
import java.util.Arrays;

public class ejemplos {
    public static void main(String[] args) {
        try {
            int mesNumerico = 0;
            Scanner escaner = new Scanner(System.in); // Creando un obj scanner
            File miArchivo = new File("GOOGL.csv"); // Creando un obj archivo o File
            
            escaner = new Scanner(miArchivo);
            int contadorLinea = 0;
            String[] valores = new String[7];
            int[] valoresColumna = new int[252];
            while (escaner.hasNextLine()) {
                String linea = escaner.nextLine(); // Leemos la siguiente linea del archivo.
                contadorLinea++;
                if (contadorLinea > 1) {
                    // int numero = escaner.nextInt(); // Leemos el siguiente entero del archivo.
                    //System.out.println(linea);
                    valores = linea.split(",");
                    valoresColumna[contadorLinea-2] = Integer.parseInt(valores[6]);
                    //System.out.println(Arrays.toString(valores[0].split("-")));
                    String mes = valores[0].split("-")[1];
                    mesNumerico = mesNumerico + Integer.parseInt(mes);
                    if(mes.equals("01") || mes.equals("2")){
                        System.out.println("enero");
                    }
                    if (mes.equals("12")) {
                        System.out.println("Diciembre");
                    }
                    
                    //System.out.println(valores[6]);
                    
                }

            }
            System.out.println(mesNumerico);
            //System.out.println(Arrays.toString(valoresColumna));
            Arrays.sort(valoresColumna);
            System.out.println("#########################");
            //System.out.println(Arrays.toString(valoresColumna));
            escaner.close();



        }catch(

    Exception miError)
    {
        System.out.println("Hola no encontre el archivo. :( ");
        miError.printStackTrace();
        
    }
    }
}
