package Gestion;

import Gente.Cliente;
import java.util.GregorianCalendar;
/**
 *
 * @author Bartolome Vich Lozano
 * @version 1.00 2019/5/17
 */

public class EntradaAniversario extends EntradaGeneral {
    final static float DESCUENTO_ANIVERSARIO = -0.3F;
    public EntradaAniversario(GregorianCalendar fechaHoraEntrada, Cliente cliente, boolean esVip) {
        super(fechaHoraEntrada, cliente, esVip);
                this.precio = this.precio + (this.precio*DESCUENTO_ANIVERSARIO);
    }


 
    //definiremos en el/los contructor/es que se asigne el tipoCliente según edad cliente
    //se marcarán autmaticamente
   
}
