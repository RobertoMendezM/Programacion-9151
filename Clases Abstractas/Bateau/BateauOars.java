/**
 * Curso: Programación
 *
 * Adaptación de:
 * Buch: Programming Fundamentals Using Java
 *       A Game Application Approach   2nd edition
 * Buchseite: pag. 380
 *
 * Temas: ClaseAbstracta
 *        Herencia
 *        Graficación
 *
 * editor Roberto Méndez Méndez
 * @version 9/ May/ 22
 */

import java.awt.*;

public class BateauOars extends  Bateau{

    private int oars;

    public BateauOars(int x, int y, int length, Color c, int oars){
        super(x, y, length, c);
        this.oars = oars;
    }

    @Override
    public int calculatePrice()
    {
        int hullPrice = super.calculatePrice();
        return hullPrice + oars * 10;
    }

    @Override
    public void show(Graphics g)
    {
        super.show(g);
        g.setColor(Color.BLACK);
        for (int i = 1; i <= oars; i++) {
            g.fillRect(getX() + i * 10, getY() - 20, 2, 20); //handle
            g.fillOval(getX() + i * 10 - 2, getY() - 30, 6, 10); //paddle
        }
    }
    public String toString(){
        return super.toString() + ", Oars: " + oars;
    }
}
