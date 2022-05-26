/**
 * Curso: Programación
 *
 * Operador Ternario
 *
 * Temas: Control de Flujo
 *          Operador Ternario
 *
 * @author Roberto Méndez Méndez
 * @version 20/ May/ 22
 *
 */
public class OperadorCondicionalTernario1 {

    public static void main(String[] quelqueChoose){
        int ventas = 10000;
        double compras ;

        if( ventas > 8000)
            compras = (ventas-8000)*2;
        else
            compras = (ventas-8000)*2/3;


        // Con operador ternario
        // resultado = (condición)? ValorSiCumpleCondición : ValorSiNoCumple;
        compras = ventas > 8000?(ventas-8000)*2:(ventas-8000)*2/3;

    }
}
