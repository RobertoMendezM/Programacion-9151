package pokemonClase;

public class Principal {
    public static void main(String[] args) {
        Pokemon poke1 = new Pokemon();
        //System.out.println("El id del pokemon es: " + poke1.getId());
        poke1.setId(1);
        //System.out.println("El nuevo id del pokemon es: " + poke1.getId());
        System.out.println("#######################");
        
        poke1.setTipo("Planta");
        poke1.setNombre("Bulbasaur");
        poke1.setDescripcion("Bulbasaur es un Pokemon primario de tipo planta. Es el primer Pokemon de la generacion I.");
        poke1.setNivel(1);
        
        //poke1.mostrarPokemon();
        
        Pokemon poke2 = new Pokemon(4, "Fuego", "Charmander", "Es el cuarto cuerto pokemon. Tipo fuego", 2);
        
        System.out.println("#######################");
        //poke2.mostrarPokemon();
        
        
        
        System.out.println("#######################");
        PokemonLegendario Rayquaza = new PokemonLegendario(
                384, "Dragon", "Rayquaza",
                "Dicen que Rayquaza ha vivido durante millones de años. Las leyendas cuentan que puso fin al continuo enfrentamiento entre Groudon y Kyogre.", 100,
                "Nivel 4");
        //Rayquaza.mostrarPokemon();

        //System.out.println(Rayquaza.getClass());


        Pokemon[] pokes = new Pokemon[6];
        pokes[0]= poke1;
        pokes[3]= poke2;
  

        Entrenador trainer1 = new Entrenador("Catsup", pokes);
        trainer1.imprimeEntrenador();
        
        
        
        trainer1.imprimeEntrenador(4);




    }
}
