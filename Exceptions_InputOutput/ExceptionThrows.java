/**
 * Programa que ejemplifica el lanzamiento (throws) una exception
 *
 * Curso: programación 2022-2
 * Clase: 25/Mar/2022
 * @author Roberto Mèndez Mèndez
 * @version 1
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionThrows {

    public static void main(String[] args) {

        try {
            int l = ExceptionThrows.leeDato();
            System.out.println("El dato que distes es: " + l);
        }catch (InputMismatchException e) {
            System.err.println("Bien cachada la excepción");
        }
    }


    static int leeDato() throws InputMismatchException{

        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce un número entero: ");

        return teclado.nextInt();
    }

}
