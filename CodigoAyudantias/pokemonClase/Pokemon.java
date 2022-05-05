package pokemonClase;

public class Pokemon {
    int id ;
    String tipo = "";
    //String tipo2 = "";
    String nombre = "";
    String descripcion = "";
    int nivel = 0;

    public Pokemon(){
        
    }

    public Pokemon(int id2, String tipo2, String nombre2, String descripcion2, int nivel2) {
        this.id = id2;
        this.tipo = tipo2;
        this.nombre = nombre2;
        this.descripcion = descripcion2;
        this.nivel = nivel2;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
        return ;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public void mostrarPokemon() {
        System.out.println("El id del pokemon es: " + id);
        System.out.println("El tipo del pokemon es: " + tipo);
        System.out.println("El nombre del pokemon es: " + nombre);
        System.out.println("La descripcion del pokemon es: " + descripcion);
        System.out.println("El nivel del pokemon es: " + nivel);
        System.out.println("#######################");
    }

}
