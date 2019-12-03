/*
 * El objetivo del operador instanceof es conocer si un objeto es de un tipo determinado. 
 * Por tipo nos referimos a clase o interfaz (interface), es decir si el objeto pasaría el test ES-UN para esa clase o 
   ese interfaz, especificado a la derecha del operador.
 */
package a41PalabraInstanceOf;

/**
 *
 * @author Panzer01
 */
public class A120EjemploInstanceOf {
    
        public static void main(String[] args) {

        A120FiguraGeometrica figura;

        figura = new A120Elipse();//aplicando polimorfismo.
        
        //Determina solo un tipo el que corresponda con la jerarquia
        determinaTipo(figura);
        
        //Determina todos los tipos posibles
        System.out.println("\nTodos sus tipos:");
        determinaTodosLosTipos(figura);
        
        //Mas ejemplos

        //figura = new A120Triangulo();
        //determinaTipo(figura);
        
        //System.out.println("\nTodos sus tipos:");
        //determinaTodosLosTipos(figura);

        
        //figura = new A120Rectangulo();
        //determinaTipo(figura);
         
        //System.out.println("\nTodos sus tipos:");
        //determinaTodosLosTipos(figura);

        
        //figura = new A120Circulo();
        //determinaTipo(figura);
        
        //System.out.println("\nTodos sus tipos:");
        //determinaTodosLosTipos(figura);
    }

    private static void determinaTodosLosTipos(A120FiguraGeometrica figura) {
        if (figura instanceof A120Elipse) {
            //Procesa algo particular de la Elipse
            System.out.println("Es una Elipse");
        } 
        if (figura instanceof A120Circulo) {
            //Procesa algo particular del Circulo
            System.out.println("Es un Circulo");
        } 
        if (figura instanceof A120FiguraGeometrica) {
            //Procesa algo particular de la Figura Geometrica
            System.out.println("Es una Figura Geometrica");
        } 
        if (figura instanceof Object) {
            //Procesa algo particular de la clase Object
            System.out.println("Es un Object");
        } else {
            System.out.println("No se encontro el tipo");
        }
    }

        private static void determinaTipo(A120FiguraGeometrica figura) {
        if (figura instanceof A120Elipse) {
            //Procesa algo particular de la Elipse
            System.out.println("Es una Elipse");
        } else if (figura instanceof A120Circulo) {
            //Procesa algo particular del Circulo
            System.out.println("Es un Circulo");
        } else if (figura instanceof A120FiguraGeometrica) {
            //Procesa algo particular de la Figura Geometrica
            System.out.println("Es una Figura Geometrica");
        } else if (figura instanceof Object) {
            //Procesa algo particular de la clase Object
            System.out.println("Es un Object");
        } else {
            System.out.println("No se encontro el tipo");
        }
    }
}