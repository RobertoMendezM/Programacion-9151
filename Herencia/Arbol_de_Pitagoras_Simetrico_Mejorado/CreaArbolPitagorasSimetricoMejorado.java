/**
 * Curso: Programación
 *
 * Adaptado de:
 * Buch: Gunter Saake Kai-Uwe Sattler (2021). Algorithmen and Datenstrukturen Eine Einführung mit Java
 * Buchseite: 115
 *
 * Temas: JFrame Básico
 *
 * Editor: Roberto Méndez Méndez
 * @version  7 Abril 22
 * editado: 24 May 22
 */

import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class CreaArbolPitagorasSimetricoMejorado {
    public static void main(String[] algo){
        JFrame frame = new ArbolDePitagorasSimetricoMejorado();
        // Posición inicial del Frame
        frame.setLocation(10,10);
        //Tamaño del Frame
        frame.setSize(500,500);

        frame.setTitle("Fractal. Árbol de Pitágoras");

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        frame.setVisible(true);

    }

}
