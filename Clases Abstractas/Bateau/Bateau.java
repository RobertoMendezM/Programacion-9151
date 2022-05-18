/**
 * Curso: Programación
 *
 * Adaptación de:
 * Buch: Programming Fundamentals Using Java
 *       A Game Application Approach   2nd edition
 * Buchseite: pag. 380
 *
 * Temas: Clase Abstracta
 *        Herencia
 *        Graficación
 *
 * editor Roberto Méndez Méndez
 * @version 9/ May/ 22
 */

import javax.swing.JFrame;
import java.io.Serializable;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Font;

public abstract class  Bateau  extends JFrame implements Serializable {

    private static int PRICE_PER_FOOT = 10;
    private int x, y, length;
    private Color color;

    public Bateau(int x, int y, int length, Color color) {
        this.x = x;
        this.y = y;
        this.length = length;
        this.color = color;
    }

    public void paint(Graphics g){
        //g.clearRect(0, 0, 500, 500);
        show(g);
    }

    public int calculatePrice(){
        return length * PRICE_PER_FOOT;
    }

    public void show(Graphics g){
        int[] xBoat = {getX() , getX() + length, getX() + 6*length/7,
                getX() + length/14};
        int[] yBoat = {getY(), getY(), getY() + length/7,
                getY() + length/7};
        int price = calculatePrice();
        g.setColor(color);
        g.fillPolygon(xBoat, yBoat, xBoat.length);
        g.setColor(Color.BLACK);
        g.setFont(new Font("Arial", Font.BOLD, 16));
        g.drawString("$" + String.valueOf(price), x + 10, y + 16);
    }
    public String toString(){
        return "Location: (" + x + ", " + y +"), length: " + length +
                ",Color: " + color;
    }
    public int getX(){ return x; }
    public int getY(){ return y; }
    public int getLength(){ return length; }
    public Color getColor(){ return color; }

    public void setX(int x){ this.x = x; }
    public void setY(int y){ this.y = y; }
}

