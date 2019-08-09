package Gestion;

/**
 *
 * @author Bartolome Vich Lozano
 * @version 1.0 2019/8/7
 */

public class LineaInforme {
    
    private final String fecha;
    private int numero;
    private float precio;
    
    public LineaInforme( String fecha) {
        this.fecha = fecha;
        this.numero = 0;
        this.precio = 0;
    }
    public LineaInforme( String fecha, float precio) {
        this.fecha = fecha;
        this.numero = 0;
        this.precio = precio;
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

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public void sumar() {
        this.numero++;
    }
    
    public void sumarNumero(int numero) {
        this.numero = this.numero + numero;
    }
    
    public void sumarPrecio(float precio) {
        this.precio = this.precio + precio;
    }
}
