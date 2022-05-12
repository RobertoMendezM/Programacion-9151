/**
 * Curso: Programación
 *
 *  Fibonacci con BigInteger
 * Tomado de:
 * Buch: Gunter Saake Kai-Uwe Sattler (2021). Algorithmen and Datenstrukturen Eine Einführung mit Java
 * Buchseite: ---
 * Pogramm 9.4
 *
 * Temas: Runnable-Threads
 *        llamadas recursivas
 *        Ciclos
 *        BigInteger
 *
 * editor Roberto Méndez Méndez
 * Fecha: 14/ Dic/ 21
 * Actualizado: 12/ May /22
 */

import java.math.BigInteger;
public class FibonacciRunnableBigInteger implements Runnable{

    BigInteger fi;
    int num;

    public FibonacciRunnableBigInteger(int n, BigInteger f){
        num = n;
        fi = f;
    }

    @Override
    public void run() {
        System.out.println("Starte #" + num);
        BigInteger res = fibonacci(fi);
        System.out.println("Abschlussverfahren: " + num + " - "+"fibonacci(" + fi + ") =" + res);
    }

    public BigInteger fibonacci(BigInteger f) {

        if (f.compareTo(BigInteger.TWO) == -1)
            return BigInteger.ONE;
        else
            return fibonacci(f.add(BigInteger.ONE.negate())).add(fibonacci(f.add(BigInteger.TWO.negate())));
    }

    public  static void main(String[] anfangsbedingung){

        Thread[] threads = new Thread[10];

        for (int i = 0; i < 10; i++) {
            long algo = (long)(Math.random()*50) + 1;
            BigInteger valor = BigInteger.valueOf(algo);
            threads[i] = new Thread(new FibonacciRunnableBigInteger(i, valor));
        }
        for(int i = 0; i < 10; i++)
            threads[i].start();

              /** Esto se hizo para ver el error
               *
               * long algo = (long)(Math.random()*50) + 1;
                System.out.println(algo);
                BigInteger valor = BigInteger.valueOf(algo);
                System.out.println(valor);
                Thread prueba = new Thread(new FibonacciRunnableBigInteger(1, valor));
                prueba.start(); **/
    }



}
