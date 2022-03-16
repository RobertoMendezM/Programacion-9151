/**
 * Programa para mostrar un menú básico
 *
 * Ejemplo de menú con ciclo infinito
 * Toma un String de teclado
 *
 * Curso: programacion 2022-2
 * @author Roberto Méndez Méndez
 * @version 4/Oct/21
 * Actualizado 16/Mar/21
 */
import java.util.Objects;
import java.util.Scanner;

public class Menu2_Infinito {
    public static void main(String [] args) {
        Scanner teclado = new Scanner(System.in);

        String seleccion;
        do {
            System.out.println("Qué medida de tendencia central requieres: ");
            System.out.println("""
                    1.- Moda\s
                    2.- Mediana\s
                    3.- Media Aritmética\s
                    4.- Media Geométrica\s
                    5.- Media Armónica
                    6.- TERMINAR EL PROGRAMA""");

            System.out.print("Selecciona el número de operación que quieras: ");
            seleccion = teclado.next();

            System.out.println("Tu selección fue: " + seleccion);

            if ("1".equals(seleccion)) {
                System.out.println("Tu selección fue \"moda\" ");
            } else if ("2".equals(seleccion)) {
                System.out.println("Tu selección fue \"mediana\" ");
            } else if ("3".equals(seleccion)) {
                System.out.println("Tu selección fue \"media arithmetical\" ");
            } else if ("4".equals(seleccion)) {
                System.out.println("Tu selección fue \"media gemétrica\" ");
            } else if ("5".equals(seleccion)) {
                System.out.println("Tu selección fue \"media armónica\", te gusta la física ¿verdad? ");
            }
        }while (!Objects.equals(seleccion, "6"));   // while (seleccion != 6); lo acepta pero genera un ciclo infinito

        System.out.println("Hasta la próxima");
    }
}
