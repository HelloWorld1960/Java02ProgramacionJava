package a35BloquesCodigo;

/**
 *
 * @author Panzer01
 */
public class A107Persona {
    private final int idPersona;
    private static int contadorPersonas;

    //Bloque de inicializacion estatico
    //Se asocia a la clase, por lo tanto solo admite valores static.
    //No se pueden usar variables de instancia, es decir NOestaticas.
    static {
        //Iniciamos el idPersonas desde el valor 10
        contadorPersonas=10;
        //Aqui no se pueden usar variables no estaticas
        //idPersona = 1;
        System.out.println("Ejecuta bloque estatico");
    }

    //No estatico
    //Bloque de codigo para inicializar atributos de la clase
    //El bloque se copia a cada constructor de la clase y se ejecuta antes de la ejecucion del constructor de la clase.
    {
        System.out.println("Ejecuta bloque incializador");
        idPersona = ++contadorPersonas;
    }

    A107Persona() {
        System.out.println("Ejecuta Constructor");
    }

    public int getIdPersona() {
        return (idPersona);
    }
}