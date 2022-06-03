import javax.swing.*;
import java.util.Objects;

public class EjecutaPrograma {

    public static void main(String[]args){

        Contabilidad_Practica3 contabilidad = new Contabilidad_Practica3();

        EjecutaPrograma.menu(contabilidad);


    }


    public static void menu(Contabilidad_Practica3 contabilidad) {
        String opcion;
        do {
            opcion = JOptionPane.showInputDialog(null,
                    """ 
                            Qué operación quieres realizar \s
                            1.- Ganancia por Producto\s
                            2.- Inventario Completo\s
                            3.- SALIR DEL PROGRAMA""");


            switch (opcion) {
                case "1":
                    contabilidad.gananciaPorProducto();
                    break;
                case "2":
                    contabilidad.inventarioCompleto();
                    break;
                case "3":
                    JOptionPane.showMessageDialog(null, "Programa Terminado. \n Hasta la próxima");
                    break;
                default:
                    System.out.println("OPTION NOT FOUND");
            }
        } while (!Objects.equals(opcion, "3"));

    }

}
