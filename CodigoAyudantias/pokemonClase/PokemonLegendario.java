package pokemonClase;

public class PokemonLegendario extends Pokemon {
    String rareza = "";

    
    public PokemonLegendario() {
        super();
    }

    public PokemonLegendario(int id2, String tipo2, String nombre2, 
                            String descripcion2, int nivel2, String rareza2) {
        super(id2, tipo2, nombre2, descripcion2, nivel2);
        this.rareza = rareza2;
    }

    public void mostrarPokemon() {
        System.out.println("El id del pokemon es: " + id);
        System.out.println("El tipo del pokemon es: " + tipo);
        System.out.println("El nombre del pokemon es: " + nombre);
        System.out.println("La descripcion del pokemon es: " + descripcion);
        System.out.println("El nivel del pokemon es: " + nivel);
        System.out.println("La rareza del pokemon es: " + rareza);

    }
}
    
