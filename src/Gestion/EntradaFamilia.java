package Gestion;

import Gente.Cliente;


import java.util.GregorianCalendar;
/**
 *
 * @author Bartolome Vich Lozano
 * @version 1.00 2019/7/22
 */

public class EntradaFamilia extends EntradaGeneral {

    /**
     *
     * @param fechaHoraEntrada
     * @param cliente
     * @param esVip
     */
    public EntradaFamilia(GregorianCalendar fechaHoraEntrada, 
                          Cliente cliente, 
                          boolean esVip) {
        
        super(fechaHoraEntrada, cliente, esVip);
            this.esVip = true; //La entrada Familiar tiene acceso Vip
            this.precio = CalculosPrecios.calcularPrecioEntrada(PRECIO_BASE_ENTRADA,
                                                                tipoTemporada, 
                                                                tipoCliente,                                                   
                                                                esEstudiante,
                                                                esDiscapacitado,
                                                                esCarneJoven,
                                                                esDesempleado,
                                                                false,
                                                                0 );
    }
   
}
