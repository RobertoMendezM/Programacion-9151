/**
 * Forma elemental de poner un mensaje grafico en pantalla
 *
 * @author Roberto Méndez Méndez
 * @version 11-May-22
 */

import javax.swing.JOptionPane;

public class Ventana_Mensaje1 {

    public static  void main(String[] args){
        int Alumnos = 27;
        JOptionPane.showMessageDialog(null, "Algo gráfico por fin \n Hola");
        JOptionPane.showMessageDialog(null,"Somos "+ Alumnos + " alumnos");
    }

}
