/**
 * Curso: Programación
 *
 * Tomado de:
 * Book: Sage, (2019).Concise Guide to Object-Oriented Programming An
 *       Accessible Approach Using Java, Springer. pág 81
 *
 * Temas: Herencia
 *
 * Editor: Roberto Méndez Méndez
 * @version 7/ Abr/ 22
 */

public class Florero extends Item{

    private int capacity;
    private String material;
    private String marca;

    public Florero(double value, String creator,
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
        if(!Condición)
            valorActual= value*.9;

        return valorActual;
    }
}
