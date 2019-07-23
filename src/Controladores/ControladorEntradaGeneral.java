package Controladores;

import Gestion.Entrada;
import Gestion.EntradaGeneral;

import java.util.GregorianCalendar;

/**
 *
 * @author Bartolome Vich Lozano
 * @version 1.10 2019/7/23
 */
public class ControladorEntradaGeneral  {

    public ControladorEntradaGeneral() {
    }
    
    public EntradaGeneral crearEntrada( GregorianCalendar fechaHoraHoy) {
        
        ControladorEntrada controladorEntrada = new ControladorEntrada();
        
        Entrada entrada = controladorEntrada.CrearEntrada(fechaHoraHoy);
        
        if(entrada != null) {
        
            EntradaGeneral entradaGeneral = new EntradaGeneral(fechaHoraHoy, 
                                                               entrada.getCliente(), 
                                                               entrada.isEsVip());
      
        return entradaGeneral;
        
        } else {
            
            System.out.println("No se creo la entrada");
            
            return null;
        }
    }

}
