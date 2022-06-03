import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Contabilidad_Practica3 {
File registros;
Scanner lectorArchivoS;

    public Contabilidad_Practica3(){

        registros = SelectorGraficoArchivo1.seleccionaArchivo1();
        try {
            lectorArchivoS = LectorDeArchivo.leeScanner(registros);
        }catch (FileNotFoundException e){
            System.err.println("Error de lectura");
        }
    }

    public Contabilidad_Practica3(File registros){
        this.registros = registros;
        try {
            lectorArchivoS = LectorDeArchivo.leeScanner(registros);
        }catch (FileNotFoundException e){
            System.err.println("Error de lectura");
        }
    }

    public void gananciaPorProducto(){

        JOptionPane.showMessageDialog(null, "Módulo en construcción");

    }


    public void inventarioCompleto(){

        JOptionPane.showMessageDialog(null, "Módulo en construcción");
    }




}
