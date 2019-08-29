
package Pantallas;

import Gente.Cliente;
import Gente.Empleado;
import java.util.GregorianCalendar;

/**
 *
 * @author Bartolome Vich Lozano
 * @version 1.00 2019/7/29
 */
public class LineaPantalla {
    
    private GregorianCalendar fechaHora;
    private Cliente cliente;
    private String observacion;
    private boolean revisada;
    private Empleado empleado;
    
    public LineaPantalla( GregorianCalendar fechaHora, Cliente cliente, String observacion) {
        this.fechaHora = fechaHora;
        this.cliente = cliente;
        this.observacion = observacion;
        this.revisada = false;
        this.empleado = null;
    }

    public GregorianCalendar getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(GregorianCalendar fechaHora) {
        this.fechaHora = fechaHora;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public boolean isRevisada() {
        return revisada;
    }

    public void setRevisada(boolean revisada) {
        this.revisada = revisada;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }
    
}
