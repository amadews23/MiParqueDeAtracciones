package Gestion;

import Gente.Cliente;
import java.util.GregorianCalendar;

/**
 *
 * @author Bartolome Vich Lozano
 * @version 1.10 2019/7/23
 */

public class Entrada {
    final static float PRECIO_BASE_ENTRADA = 60.00F; 
    final static float PRECIO_BASE_VIP = 50.00F;
    protected GregorianCalendar fechaHoraEntrada;
    protected Cliente cliente;
    protected boolean esVip;

    /**
     *
     * @param fechaHoraEntrada
     * @param cliente
     * @param esVip
     */
    public Entrada(GregorianCalendar fechaHoraEntrada, 
                   Cliente cliente, 
                   boolean esVip) {
        
        this.fechaHoraEntrada = fechaHoraEntrada;
        this.cliente = cliente;
        this.esVip = esVip;
    }

    public GregorianCalendar getFechaHoraEntrada() {
        return fechaHoraEntrada;
    }

    public void setFechaHoraEntrada(GregorianCalendar fechaHoraEntrada) {
        this.fechaHoraEntrada = fechaHoraEntrada;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public boolean isEsVip() {
        return esVip;
    }

    public void setEsVip(boolean esVip) {
        this.esVip = esVip;
    }
    
}
