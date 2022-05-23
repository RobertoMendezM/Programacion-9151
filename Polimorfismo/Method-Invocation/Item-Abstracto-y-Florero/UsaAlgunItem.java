/**
 * Curso: Programación
 *
 * Se crea un objeto de la clase FloreroToStringv2
 * asignandolo a una variable de la clase (padre) abstracta
 * Item_Abstracto  y se llama a un método de la clase
 * FloreroToStringv2
 *
 * Temas: polymorphic method invocation
 *
 * @author Roberto Méndez Méndez
 * @version 18/ May/ 22
 *
 */

public class UsaAlgunItem {
    public static void main(String[] args) {

         Item_Abstracto ia = new FloreroToStringv2(23,"yo", 23,"wood");

         System.out.println(ia.queSoy());



    }
}
