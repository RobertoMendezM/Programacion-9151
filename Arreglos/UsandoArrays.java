/**
 * Curso: Programación Ciclo 2022-2
 *
 * Grupo 9151
 *
 * Temas: Uso de Arrays, IntStream y OptionalInt
 *        Además manejo de Exception
 *
 * @author Roberto Méndez Méndez
 *
 * Fecha: 16/ Marzo/ 22
 */

import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class UsandoArrays {

    public static void main(String[] algo){

        int[] defunciones = {155538, 218885, 150303};

        //Ordena el arreglo
        Arrays.sort(defunciones);

        System.out.println("El arreglo ordenado es: ");
        for (int k:defunciones
             ) {
            System.out.print(k + ", ");
        }
        System.out.print("\n");

        // Declaro un objeto de tipo UsandoArrays
        UsandoArrays ua = new UsandoArrays();
        int max;
        max = ua.maximo(defunciones);
        System.out.println("El máximo valor del arreglo fue: " + max);

    }

    /**
     * Obtengo el máximo valor en el arreglo
     * @param datos
     * @return el máxino valor en el arroglo
     */
    public int maximo(int[] datos){
        int max = 0;
        IntStream myIntSetram = Arrays.stream(datos);
        OptionalInt seraEntero = myIntSetram.max();
        try {
            max = seraEntero.getAsInt();
        }
        catch (NoSuchElementException e){
            System.err.println("Ni modo, no era un entero");
        }
        return max;
    }
}
