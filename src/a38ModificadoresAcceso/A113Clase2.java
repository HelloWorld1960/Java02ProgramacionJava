package a38ModificadoresAcceso;

/**
 *
 * @author Panzer01
 */
public class A113Clase2 {
    //Constructor
     public A113Clase2() {
        //Prueba constructores
        System.out.println("");
        //Constructor publico
        new A113Clase1(1);
        //Constructor protegido
        new A113Clase1(1, 2);
        //Constructor default o package
        new A113Clase1(1, 2, 3);
        //Constructor private
        //new Clase1(1, 2, 3,4); 
        System.out.println("Constructor private: Acceso negado");
    }

    public void pruebaDesdeClase2() {
        //Acceso a Clase 1 desde Clase2
        A113Clase1 c1 = new A113Clase1();
        System.out.println("");
        System.out.println("Atributo publico:" + c1.atrPublico);
        System.out.println("Atributo protegido:" + c1.atrProtegido);
        System.out.println("Atributo default:" + c1.atrPaquete);
        System.out.println("Atributo private: Acceso negado");

        System.out.println("");
        System.out.println("Metodo publico:" + c1.metodoPublico());
        System.out.println("Metodo protegido:" + c1.metodoProtegido());
        System.out.println("Metodo default:" + c1.metodoPaquete());
        System.out.println("Metodo private: Acceso negado");
    }
}