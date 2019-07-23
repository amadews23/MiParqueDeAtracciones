package Controladores;

import Gestion.Entrada;
import Gestion.EntradaTarde;
import java.util.GregorianCalendar;
/**
 *
 * @author Bartolome Vich Lozano
 * @version 1.10 2019/7/23
 */

public class ControladorEntradaTarde {

    public ControladorEntradaTarde() {
    }
    
    public EntradaTarde crearEntrada( GregorianCalendar fechaHoraHoy) {
         
        ControladorEntrada controladorEntrada = new ControladorEntrada();
        
        Entrada entrada = controladorEntrada.CrearEntrada(fechaHoraHoy);
        
        if ( entrada != null) {
            
            EntradaTarde entradaTarde = new EntradaTarde(fechaHoraHoy, 
                                                         entrada.getCliente(), 
                                                         entrada.isEsVip());
            return entradaTarde;
            
        } else {
            
            System.out.println("No se creo la entrada");
            
            return null;
        }
    }

}
