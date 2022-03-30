public class funciones {
    static int fija = 1;

    public static String miFuncion() {
        return ("Hola mundo");
    }
    
    public static void miFuncion2() {
        System.out.println("Le sume 1 a Fija");
        fija = fija + 1;
    }

    public static int cuadrado(int numero) {
        return numero * numero;
    } 

    public static int division(int numero, int divisor) {
        return numero / divisor ;
    }
    
    public static int division2(int numero, int divisor) {
        return (numero / divisor) + fija ;
    }

    public static void main(String[] args) {
        System.out.println("Este es el main");
        String aux = miFuncion();
        System.out.println(aux);
        System.out.println(miFuncion());
        miFuncion2();
        int cuadradoAUX = cuadrado(5);
        System.out.println(cuadradoAUX + 1);
        System.out.println(division(10, 2));
        System.out.println(cuadrado(division2(10, 2)));
        miFuncion2();
        System.out.println(cuadrado(division2(10, 2)));
        int a = 5;
        Integer b = 5;
        
        Double c = Math.pow(5, 2);
        System.out.println(b.getClass());

        
    }
}
