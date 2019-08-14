package Atracciones;

import Gente.Cliente;
import java.util.GregorianCalendar;

/**
 *
 * @author Bartolome Vich Lozano
 * @version 1.0 2019/8/14
 */
public class LineaClienteAtraccion {
    
    private Cliente cliente;
    private GregorianCalendar fecha;

    public LineaClienteAtraccion(Cliente cliente, GregorianCalendar fecha) {
        this.cliente = cliente;
        this.fecha = fecha;
    }
}
