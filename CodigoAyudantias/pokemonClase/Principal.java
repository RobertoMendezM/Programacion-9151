package pokemonClase;

public class Principal {
    public static void main(String[] args) {
        Pokemon poke1 = new Pokemon();
        System.out.println("El id del pokemon es: " + poke1.getId());
        poke1.setId(1);
        System.out.println("El nuevo id del pokemon es: " + poke1.getId());
        System.out.println("#######################");
        
        poke1.setTipo("Planta");
        poke1.setNombre("Bulbasaur");
        poke1.setDescripcion("Bulbasaur es un Pokemon primario de tipo planta. Es el primer Pokemon de la generacion I.");
        poke1.setNivel(1);
        
        poke1.mostrarPokemon();
        
        Pokemon poke2 = new Pokemon(4, "Fuego", "Charmander", "Es el cuarto cuerto pokemon. Tipo fuego", 2);
        
        System.out.println("#######################");
        poke2.mostrarPokemon();

    }
}
