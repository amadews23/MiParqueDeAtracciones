package Gestion;

import Gente.Cliente;
import java.util.GregorianCalendar;

/**
 *
 * @author Bartolome Vich Lozano
 * @version 1.00 2019/5/17
 */

public class EntradaTarde extends EntradaGeneral {
    final static float DESCUENTO_TARDE = -0.4F;

    public EntradaTarde(GregorianCalendar fechaHoraEntrada, Cliente cliente, boolean esVip) {
        super(fechaHoraEntrada, cliente, esVip);
                this.precio = this.precio + (this.precio*DESCUENTO_TARDE);
    }

   
}
