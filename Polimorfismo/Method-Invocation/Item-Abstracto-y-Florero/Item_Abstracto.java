/**
 * Curso: Programación
 *
 * adaptado de:
 * Book: Sage, (2019).Concise Guide to Object-Oriented Programming An
 *       Accessible Approach Using Java, Springer.
 * Buchseite: pag. 81
 *
 * Temas: Herencia
 *        Clase Abstracta
 *        polymorphic method invocation.
 *
 * Editor: Roberto Méndez Méndez
 * @version 18/ May/ 22 v3
 */
public abstract class Item_Abstracto {
    protected double value;
    private String creator;
    private int inventario;
    protected boolean Condicion = true;

    public Item_Abstracto(double value, String creator)
    {
        this.value = value;
        this.creator = creator;
    }

    public Item_Abstracto() {
        value = 240;
        this.creator = "Yo mero";
    }


    public double valorReal(){
        double valorActual = value;
        if(!Condicion)
            valorActual= value*.8;

        return valorActual;
    }

    public double getValue() {
        return value;
    }
    public void setValue(double value) {
        this.value = value;
    }

    public String getCreator() {
        return creator;
    }

    public int getInventario() {
        return inventario;
    }

    public abstract String queSoy();
}
