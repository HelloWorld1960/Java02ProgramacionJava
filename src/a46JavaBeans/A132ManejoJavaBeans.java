/*
 * 
 */
package a46JavaBeans;

/**
 *
 * @author Panzer01
 */

public class A132ManejoJavaBeans {
    
    public static void main(String[] args) {
        A132PersonaBean bean = new A132PersonaBean();
        bean.setNombre("Juan");
        bean.setEdad(29);
        
        System.out.println("Nombre:" + bean.getNombre());
        System.out.println("Edad:" + bean.getEdad());
    }
}