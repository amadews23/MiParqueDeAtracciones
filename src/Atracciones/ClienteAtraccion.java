package Atracciones;

import Gente.Cliente;
import java.util.GregorianCalendar;

/**
 *
 * @author Bartolome Vich Lozano
 * @version 1.0 2019/8/14
 */
public class ClienteAtraccion {
    
    private Cliente cliente;
    private GregorianCalendar fecha;

    public ClienteAtraccion(Cliente cliente, GregorianCalendar fecha) {
        this.cliente = cliente;
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public GregorianCalendar getFecha() {
        return fecha;
    }
    
}
