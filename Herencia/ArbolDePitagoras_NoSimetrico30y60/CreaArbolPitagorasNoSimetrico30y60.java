/**
 * Curso: Programación
 *
 * Programa: CreaArbolPitagorasNoSimetrico30y60
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

import javax.swing.*;

public class CreaArbolPitagorasNoSimetrico30y60 {

    public static void main(String[] algo){
        JFrame frame = new ArbolPitagorasNoSimetrico30y60();
        // Posición inicial del Frame
        frame.setLocation(50,10);
        //Tamaño del Frame
        frame.setSize(640,500);

        frame.setTitle("Fractal. Árbol de Pitágoras No Simétrico 30-60");

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        frame.setVisible(true);

    }

}
