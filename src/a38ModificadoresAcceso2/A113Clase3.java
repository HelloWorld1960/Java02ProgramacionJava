package a38ModificadoresAcceso2;

import a38ModificadoresAcceso.A113Clase1;

/**
 *
 * @author Panzer01
 */
public class A113Clase3  extends A113Clase1{
    public A113Clase3(){
        //Accediendo al constructor protegido de la clase1, al ser una subclase puede acceder
        //aunque este en otro paquete
        //super invoca al constructor de la clase superior que comparta el mismo tipo de parametrización.
        super(1,2);
        //Acceso package, y al estar fuera de paquete esta restringido
        //super(1,2,3);
        //Acceso privado, restringido
        //super(1,2,3,4);
    }

    public  void pruebaDesdeClase3() {
        //Acceso a Clase 1 desde Clase2
        //Clase 3 extiende de Clase 1
        A113Clase1 c1 = new A113Clase1();
        System.out.println("");
        System.out.println("Atributo publico:" + c1.atrPublico + " o heredado:" + atrPublico);
        System.out.println("Atributo protegido (heredado):" + atrProtegido);
        System.out.println("Atributo default: No se puede acceder desde un paquete externo" );
        System.out.println("Atributo private: Acceso negado" );
        
        //Constructor publico
        new A113Clase1();
        //Los demas constructores no se pueden probar asi, sino desde el constructor de esta clase
        //Ya que esta es una subclase en otro paquete
        
        System.out.println("");
        System.out.println("Metodo publico:" + c1.metodoPublico());
        System.out.println("Metodo protegido (heredado):" + metodoProtegido());
        System.out.println("Metodo default: No se puede acceder desde un paquete externo");
        System.out.println("Metodo private: Acceso negado" );
    }
}