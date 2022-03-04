import java.util.Scanner; // Mandamos llamas al objeto SCanner para leer entrada del usuario

public class sumas {
    public static void main(String[] args) {
        int x = 0;        
        int y = 0; 
        int suma = x + y;
        System.out.println(suma);
        
        Scanner escaner = new Scanner(System.in); // Creando un obj scanner
        System.out.println("Dame un numero:");
        String numero1 = escaner.nextLine(); // Leemos la siguiente linea que nos de el user.
        System.out.println("Recibi " + numero1);
        
        int numEntero1 = Integer.parseInt(numero1);
        suma = suma + numEntero1;
        
        
        System.out.println("Dame otro numero:");
        int numEntero2 = escaner.nextInt();
        System.out.println("Recibi " + numEntero2);
        suma = suma + numEntero2;

        System.out.println("El resultado de la suma es " + suma);
        






    }
}
