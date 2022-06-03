import java.io.*;
import java.util.Scanner;

public class LectorDeArchivo {

    public static Scanner leeScanner(File archivo) throws FileNotFoundException {

        return new Scanner(archivo);
    }

    public static BufferedReader leeBufferedReader(File archivo) throws FileNotFoundException {

        Reader in = new InputStreamReader(
                        new FileInputStream(archivo));

        return new BufferedReader(in);

    }
}
