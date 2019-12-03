package a38ModificadoresAcceso;

/**Modificadores de acceso:
 * Public: Pueden ser accedidas por cualquier clase o método.
 * Protected: Pueden ser accedidas por todas los métodos, clases y /o atributos mientras se encuentre en el mismo package 
 * o se hereden.
 * Private: Pueden ser accedidas solo en esa clase.
 * Default: Puede ser accedido solo en el mismo paquete.
 * @author Panzer01
 */
public class A113Clase1 {
    //Definicion de atributos
    public int atrPublico = 5;//publico
    protected int atrProtegido = 6;//protected
    int atrPaquete = 7;//default
    private int atrPrivado = 8;//private

    //Constructores
    public A113Clase1() {
    }
    //publico
    public A113Clase1(int i) {
        System.out.println("Constructor publico 1");

    }
    //protected
    protected A113Clase1(int i, int j) {
        System.out.println("Constructor protected 2");
    }
    //default
    A113Clase1(int i, int j, int k) {
        System.out.println("Constructor package 3");
    }
    //privado
    private A113Clase1(int i, int j, int k, int l) {
        System.out.println("Constructor privado 4");
    }

    //Definicion de metodos
    public int metodoPublico() {
        return 9;
    }

    protected int metodoProtegido() {
        return 10;
    }
    //default
    int metodoPaquete() {
        return 11;
    }

    private int metodoPrivado() {
        return 12;
    }
}