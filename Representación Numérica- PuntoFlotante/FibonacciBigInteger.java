/**
 * Curso: Programación
 *
 * Tomado de:
 * Buch: McAllister & Fritz (2021). Programming Fundamentals Using Java
 * A Game Application Approach, 2nd edition, Mercury Learning and Information pág. 347
 * Buchseite: ---
 * Fig 7.30
 *
 * Temas: BigInteger
 *        Swing -Petición de un dato
 *        Fibonacci
 *
 * Editor: Roberto Méndez Méndez
 * Fecha: 9/ May/ 22
 *
 */

import javax.swing.JOptionPane;
import java.math.BigInteger;

public class FibonacciBigInteger {
    public static void main(String[] args)
    {
        int n;
        BigInteger temp;
        BigInteger fnAnterior = BigInteger.ONE;
        BigInteger fn = BigInteger.ONE;
        BigInteger longMaxValue = BigInteger.valueOf(Long.MAX_VALUE);

        String s = JOptionPane.showInputDialog("Положение для вычисления");
        n = Integer.parseInt(s);
        for(int i = 3; i <= n; i++){
            temp = fn;
            fn = fnAnterior.add(fn);
            fnAnterior = temp;
        }
        System.out.println("f" + n + " = " + fn.toString());
        if(fn.compareTo(longMaxValue) > 0) {
            System.out.println("überschreitet den Maximalwert des Typs Long ");
        } else {
            System.out.println("No excede el máximo valor de tipo Long");
        }
    }
}
