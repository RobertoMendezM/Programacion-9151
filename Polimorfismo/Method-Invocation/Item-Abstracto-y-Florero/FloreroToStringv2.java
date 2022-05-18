/**
 * Curso: Programación
 *
 * Adaptado de:
 * Book: Sage, (2019).Concise Guide to Object-Oriented Programming An
 *       Accessible Approach Using Java, Springer.
 * Buchseite: pág 81
 *
 * Temas: Herencia
 *        Polimorfismo
 *
 * Editor: Roberto Méndez Méndez
 * @version 18/ May/ 22 v3
 */
public class FloreroToStringv2 extends Item_Abstracto{

    private int capacity;
    private String material;
    private String marca;

    public FloreroToStringv2(double value, String creator,
                           int capacity, String material)
    {
        // llama al constructor de la clase padre
        super(value, creator);
        this.capacity = capacity;
        this.material = material;
    }

    @Override
    public double valorReal() {
        double valorActual = value;
        if(!Condicion)
            valorActual= value*.9;

        return valorActual;
    }

    @Override
    public String toString() {
        return "modelo: " + getCreator() + "\n" +
                "capacidad: " + capacity + "\n" +
                "material: " + material + '\n' +
                "En existencia: " + getInventario();
    }

    @Override
    public String queSoy() {
        return "Florero";
    }
}
