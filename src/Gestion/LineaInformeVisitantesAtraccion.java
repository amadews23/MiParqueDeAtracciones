package Gestion;

/**
 *
 * @author Bartolome Vich Lozano
 * @version 1.0 2019/8/14
 */

public class LineaInformeVisitantesAtraccion {
    private final String nombre;
    private int numero;
    
    public LineaInformeVisitantesAtraccion( String nombre) {
        this.nombre = nombre;
        this.numero = 0;
    }
    
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }



    public int getNumero() {
        return numero;
    }


    public void sumar() {
        this.numero++;
    }
    
    public void sumarNumero(int numero) {
        this.numero = this.numero + numero;
    }

    
}
