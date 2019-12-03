package a34Enumeraciones;

/**
 *
 * @author Panzer01
 */
public class A105EnumeracionesPrueba {
    public static void main(String[] args) {

        //Valores de la enumeracion
        System.out.println("Valor 1:" + A105Dias.LUNES);

        //Hacemos un test del dia utiliado
        //El parametro proporcionado es cualquiera que sea valido. Tambien puede ser A105Dias.Lunes
        indicarDia(A105Dias.VIERNES);
        
        //Utilizamos la enumeracion de paises
        System.out.println("Continente no. 4: " + A105Continentes.AMERICA);
        System.out.println("Paises en America: " + A105Continentes.AMERICA.getPaises());
        
        //Hacemos el test del numero de paises por continente
        System.out.println("");
        indicarPaises(A105Continentes.AFRICA);
        
        //Imprimimos los continentes
        System.out.println("");
        imprimirContinentes();
    }

    public static void indicarDia(A105Dias dias) {

        switch (dias) {
            //Podemos usar algun valor constante de la enumeracion directamente
            case LUNES:
                System.out.println("Primer dia de la semana");
                break;
            case MARTES:
                System.out.println("Primer dia de la semana");
                break;
            default:
                System.out.println("Y asi seguimos con los demas dias");
        }
    }
    
    public static void indicarPaises(A105Continentes continentes) {

        switch (continentes) {
            //Podemos usar algun valor constante de la enumeracion directamente
            case AFRICA:
                System.out.println("No. Paises en:" + continentes + ": " + continentes.getPaises());
                break;
            default:
                System.out.println("Y asi seguimos con los demÃ¡s contienentes");
        }
    }

    public static void imprimirContinentes(){
        //Utilizamos un forEach
        //A105Continentes c va a almacenar cada uno de los continentes.
        //A105Continentes.values() almacenara el arreglo de continentes
        for(A105Continentes c: A105Continentes.values()){
            System.out.println("Continente:" + c + " contiene " + c.getPaises() + " paises.");
        }
    }
}