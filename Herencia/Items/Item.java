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
 * @version 1/ Abr/ 22
 */

public class Item {

    protected double value;
    private String creator;
    private int inventario;
    protected boolean Condición = true;

    public Item(double value, String creator)
    {
        this.value = value;
        this.creator = creator;
    }

    public double valorReal(){
        double valorActual = value;
        if(!Condición)
            valorActual= value*.8;

        return valorActual;
    }

    public double getValue() {
        return value;
    }
    public void setValue(double value) {
        this.value = value;
    }

}
