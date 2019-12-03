package a32JavaDoc;

/**
 * Esta clase permite realizar operaciones de aritmetica como sumar, restar, etc
 *
 * @author: Panzer00
 * @version: 1.0
 */
public class A100Aritmetica{
    /**
     * Primer Operando
     */
    int operandoA;

    /**
     * Segundo operando
     */
    int operandoB;

    /**
     * Constructor de la clase
     * @param a Recibe el valor para el operando A
     * @param b Reciboe el valor para el operando B
     */
    public A100Aritmetica(int a, int b) {
        this.operandoA = a;
        this.operandoB = b;
    }

    /**
     * Este metodo realiza la suma de dos operandos enteros
     * @return int resultado de la suma 
     */
    public int sumar(){
        return operandoA + operandoB;
    }
}