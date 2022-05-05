package pokemonClase;


public class Entrenador {
    String nombre;
    Pokemon[] pokemones = new Pokemon[6];
    String[] insignias = new String[8];


    public Entrenador(){

    }

    public Entrenador(String nombre, Pokemon[] listaPokemones){
        this.nombre = nombre;
        this.pokemones = listaPokemones;

    }

    //Imprime el entranador con todos los pokemones
    public void imprimeEntrenador(){
        System.out.println(".-.-.-.-. "+ nombre + " .-.-.-.-.");
        for (Pokemon poke : pokemones) {
            if (poke != null) {
                poke.mostrarPokemon();
            }
        }
    }

    // Imprime el entranador con i pokemones
    public void imprimeEntrenador(int i) {
        System.out.println(".-.-.-.-. " + nombre + " .-.-.-.-.");
        for (int j = 0; j < i; j++) {
            if(pokemones[j] != null){
                pokemones[j].mostrarPokemon();

            }
        }
    }




}
