public class tipos {
    public static void main(String[] args) {
        //Scanner
        int entero = 3; 
        String cadenaDeTexto = "Hola " ;
        float flotante = 50.25f;
        double doble = 20;
        

        // IF... ELSE
        if (entero > 5) {
            System.out.println("Entero es mayor que 5");
        }
        else {
            System.out.println("Entero NO es mayor que 5");
        }
        boolean bool = false;
        boolean bool2 = true;
        // Algunos operadores logicos
        // ! -> NEgacion
        // && -> and
        // || -> or
        if ( (bool2 && bool) || bool2  ) {
            System.out.println("Entro el if");
        } else {
            System.out.println("Entro el else");
        }

        System.out.println("###");
        // i++ <--> i = i + 1
        for (int i = 0; i <= 10 ; i++) {
            System.out.println(i);
        }

        //System.out.println("###");
        //for (int i = 0; i <= 10; i= i +1 ) {
        //    System.out.println(i);
        //}

        






    }
}
