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
}
    
}
