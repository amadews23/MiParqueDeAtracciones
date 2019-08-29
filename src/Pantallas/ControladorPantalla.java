
package Pantallas;

import Gestion.Entrada;
//import java.util.GregorianCalendar;

/**
 *
 * @author Bartolome Vich Lozano
 * @version 1.00 2019/7/29
 */
public class ControladorPantalla {
    
    public ControladorPantalla() {
        
    }
    
    public void crearObservacion(Entrada entrada, 
                                 String observacion, 
                                 Pantalla pantalla) {
        
        LineaPantalla lineaPantalla = new LineaPantalla(entrada.getFechaHoraEntrada(), 
                                                        entrada.getCliente(), 
                                                        observacion );
        
        pantalla.anyadirLinea(lineaPantalla);
        
    }
}
