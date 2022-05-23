import java.util.ArrayList;

/**
 * clasearraylists
 * https://w3api.com/Java/ArrayList/
 */
public class clasearraylists {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();

        lista.add("Renault");
        lista.add("Mercedes");
        lista.add("Citroen");
        System.out.println(lista.size());
        lista.add("Nissan");
        System.out.println(lista.size());

        System.out.println(lista.get(1));
        System.out.println(lista.indexOf("Mercedes"));






    }
    
}
