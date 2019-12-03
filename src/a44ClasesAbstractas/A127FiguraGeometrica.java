/*
 * Una clase abstracta es una clase que tiene al menos un método abstracto. 
 * Una clase que extiende a una clase abstracta debe implementar los métodos abstractos (escribir el código) o bien 
   volverlos a declarar como abstractos, con lo que ella misma se convierte también en clase abstracta.
 * En este ejemplo usaremos un metodo abstracto desde un tipo de la clase padre, pero se manda llamar el metodo implementado 
   en las clases hijas.
 * Una clase abstracta no puede ser instanciada, por eso se implementa como una clase padre y sus clases hijas
   son las que acceden a estos metodos por medio del polimorfismo.
 * Las clases abstractas solo sirven para implementar la herencia.
 * Una clase abstracta puede contener métodos no-abstractos pero al menos uno de los métodos debe ser declarado abstracto. 
 */
package a44ClasesAbstractas;

/**
 *
 * @author Panzer01
 */
/*La firma de la clase es del tipo abstract debido a que se utilizan metodos abstractos*/
public abstract class A127FiguraGeometrica {
    //Atributos
    protected String tipoFigura;

    //Constructor
    protected A127FiguraGeometrica(String tipoFigura){
        this.tipoFigura = tipoFigura;
    }

    //Metodo Abstracto
    //La clase padre no define comportamiento.
    public abstract void dibujar();

    public String getTipoFigura() {
        return tipoFigura;
    }
    public void setTipoFigura(String tipoFigura) {
        this.tipoFigura = tipoFigura;
    }

    @Override
    public String toString() {
        return ("Tipo de Figura: " + this.tipoFigura);
    }
}
