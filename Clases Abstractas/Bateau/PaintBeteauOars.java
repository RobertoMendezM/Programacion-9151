/**
 * Curso: Programación
 *
 * Clase que crea un objeto de la clase BateauOars
 * y lo pinta
 *
 * Temas: JFrame
 *        Graficaciòn
 *
 * @author Roberto Méndez Méndez
 * @version 9/ May/ 22
 */


import javax.swing.JFrame;
import javax.swing.WindowConstants;
import java.awt.Color;

public class PaintBeteauOars {
    public static void main(String[] args){
        JFrame avirons = new BateauOars(40, 200, 400, Color.CYAN, 1);
        avirons.setLocation(20,20);
        avirons.setSize(500,500);
        avirons.setTitle("Mon Avirons");
        avirons.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        avirons.setVisible(true);
    }
}
