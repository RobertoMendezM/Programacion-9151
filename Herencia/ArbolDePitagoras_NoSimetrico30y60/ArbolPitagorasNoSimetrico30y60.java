/**
 * Curso: Programación
 *
 *  Arbol de Pitágoras No Simétrico
 *
 * Editado de:
 * Buch: Gunter Saake Kai-Uwe Sattler (2021). Algorithmen and Datenstrukturen
 *       Eine Einführung mit Java
 * Buchseite: ---
 *
 * Temas: Herencia
 *        Recursividad
 *        Graficación
 *        Geometria Básica
 *
 * @version 9/ May/ 22
 * actualizado: 24/ May / 22
 */

import javax.swing.JFrame;
import java.awt.Graphics;

public class ArbolPitagorasNoSimetrico30y60 extends JFrame {
    public void paint(Graphics g) {
        g.clearRect(10, 10, 640, 510);
        paintTree(g, 360, 420, 440, 420);
    }

    void paintTree(Graphics g, double x1, double y1,
                   double x2, double y2 ) {

        // Se calculan los puntos x3 y x4 del cuadrado
        double dx = x2 - x1; double dy = y1 - y2;
        double x3 = x1 - dy; double y3 = y1 - dx;
        double x4 = x2 - dy; double y4 = y2 - dx;


        // Se pinta el cuadrado
        g.drawLine((int)x1, (int)y1, (int)x2, (int)y2);
        g.drawLine((int)x2, (int)y2, (int)x4, (int)y4);
        g.drawLine((int)x4, (int)y4, (int)x3, (int)y3);
        g.drawLine((int)x3, (int)y3, (int)x1, (int)y1);

        /**
         * Se calcula el vértice del triángulo rectángulo
         * Nota: Primero encuentra las coordenadas del punto
         * P  que parte al segmento P3-P4 en razón 3
         * y después se le agregan los desplazamientos
         */

        double v = (x3 + 3*x4) / 4 - Math.sqrt(3)*dy/4 ;
        double w = (y3 + 3*y4) / 4 - Math.sqrt(3)*dx/4 ;

        /**
         * Se establece una condición de paro
         *  que geométricamente equivale a que la hipotenusa
         *  del triangulo rectángulo de catetos dx y dy
         *  sea mayor a raíz de 2
         */
        if (dx * dx + dy * dy > 2) {
            paintTree(g, x3, y3, v, w);
            paintTree(g, v, w, x4, y4);
        }
    }
}
