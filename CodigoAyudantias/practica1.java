import java.util.Scanner;
import java.util.InputMismatchException;
import java.io.FileNotFoundException;

import java.io.File;

public class practica1 {
    public static void main(String[] args) {
        // #### Ejercicio 1 ###
        // leer un numero que tenga la opcion de la formula
        double a = 3;
        double b = 3.1;
        float flotante = 3.002f;
        double resultado = a + b;
        System.out.println(resultado);
        //String cadena= "HOLA";
        boolean flag = true;
        while (flag = true) {
        try {
            Scanner escaner = new Scanner(System.in);
            int numero1 = escaner.nextInt();
            int num= 23;
            resultado = 23 + numero1;
         

            System.out.println(resultado);  
            File miArchivo = new File("AMZoN.csv");
            escaner = new Scanner(miArchivo);

            flag = false;
        } catch (InputMismatchException miError) {
            System.out.println("El parametro no es valido");
            flag = true;
           // miError.printStackTrace();
        }
        catch(FileNotFoundException miError2){
            System.out.println("Nombre del archivo no valido. ");
        } 


        /**
        // (a * B)/ C + D
        while (C + D == 0) {
            //Print dame otro valor para C
            //Print dame otro valor para D

        }
        //Operaciones


        
        
        if (C + d != 0) {
            //Operaciones
        }
        else{
            System.out.println("Division entre cero. ");
        }
        */
    }
}
