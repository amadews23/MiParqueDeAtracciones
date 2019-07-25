package Controladores;

import Gente.Cliente;
import Gestion.Entrada;
import Gestion.EntradaAniversario;

import java.util.GregorianCalendar;
/**
 *
 * @author Bartolome Vich Lozano
 * @version 1.10 2019/7/23
 */

public class ControladorEntradaAniversario {

    public ControladorEntradaAniversario() {
    }

    public EntradaAniversario crearEntrada(Cliente cliente, GregorianCalendar fechaHoraHoy) {
        
        ControladorEntrada controladorEntrada = new ControladorEntrada();
        
        Entrada entrada = controladorEntrada.CrearEntrada(fechaHoraHoy);
        
        if ( entrada != null) {
            
            EntradaAniversario entradaAniversario = new EntradaAniversario(fechaHoraHoy, 
                                                                           entrada.getCliente(), 
                                                                           entrada.isEsVip());
            return entradaAniversario;
            
        } else {
            
            System.out.println("No se creo la entrada");
            
            return null;
        }
    }
}
