package Gestion;

/**
 *
 * @author Bartolome Vich Lozano
 * @version 1.0 2019/8/7
 */

public class LineaInforme {
    
    private final String fecha;
    private int numero;
    
    public LineaInforme( String fecha) {
        this.fecha = fecha;
        this.numero = 0;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getFecha() {
        return fecha;
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
