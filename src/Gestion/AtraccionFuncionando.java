
package Gestion;


import Atracciones.Atraccion;
import java.util.GregorianCalendar;

/**
 *
 * @author Bartolome Vich Lozano
 * @version 1.0 2019/8/12
 */

public class AtraccionFuncionando {
    private GregorianCalendar fechaInicio;  
    private GregorianCalendar fechaHasta;
    private Atraccion atraccion;

    /**
     * Registramos la fecha de inicio y fin  de la actividad de una atracción
     * 
     * @param fechaInicio
     * @param fechaHasta
     * @param atraccion
     */
    public AtraccionFuncionando(GregorianCalendar fechaInicio, 
                                GregorianCalendar fechaHasta, 
                                Atraccion atraccion) {
        
        this.fechaInicio = fechaInicio;
        this.fechaHasta = fechaHasta;
        this.atraccion = atraccion;

    }

    public GregorianCalendar getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(GregorianCalendar fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public GregorianCalendar getFechaHasta() {
        return fechaHasta;
    }

    public void setFechaHasta(GregorianCalendar fechaHasta) {
        this.fechaHasta = fechaHasta;
    }

    public Atraccion getAtraccion() {
        return atraccion;
    }

    public void setAtraccion(Atraccion atraccion) {
        this.atraccion = atraccion;
    }
    
    
    
}