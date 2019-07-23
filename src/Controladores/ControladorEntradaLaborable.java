package Controladores;

import Gestion.Entrada;
import Gestion.EntradaLaborable;


import java.util.GregorianCalendar;
/**
 *
 * @author Bartolome Vich Lozano
 * @version 1.00 2019/7/23
 */
public class ControladorEntradaLaborable {

    public ControladorEntradaLaborable() {
    }
    //Antes de crear la entrada se comprobará el horario
    public EntradaLaborable crearEntrada( GregorianCalendar fechaHoraHoy) {
                 
        ControladorEntrada controladorEntrada = new ControladorEntrada();
        
        Entrada entrada = controladorEntrada.CrearEntrada(fechaHoraHoy);
        
        if(entrada != null) {
            
            EntradaLaborable entradaLaborable = new EntradaLaborable(fechaHoraHoy, 
                                                                     entrada.getCliente(), 
                                                                     entrada.isEsVip());
            
            return entradaLaborable;
            
        } else {
            
            System.out.println("No se creo la entrada");
            
            return null;
        }

    }
}
