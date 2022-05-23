/**
 * Forma elemental de tomar un dato desde
 * un ambiente gráfico
 *
 * @author Roberto Méndez Méndez
 * @version 11-May-22
 */

import javax.swing.JOptionPane;

public class Ventana_EntradaDato1 {

    public static  void main(String[] args){

       String num =  JOptionPane.showInputDialog(null,
                "Fiboniacci de:");
       String numAlumnosAviso =  JOptionPane.showInputDialog(null,
                "Cuántos alumnos vinieron", "Valor entero");

    }
}
