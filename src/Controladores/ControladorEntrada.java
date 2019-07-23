package Controladores;

import Gente.Cliente;
import Gestion.Entrada;
import Utilidades.Varios;
import java.util.GregorianCalendar;
/**
 *
 * @author Bartolome Vich Lozano
 * @version 1.00 2019/7/23
 */
public class ControladorEntrada {

    public ControladorEntrada() {
        
    }
    
    public Entrada CrearEntrada(GregorianCalendar fechaHoraHoy) {
        
        ControladorCliente controladorCliente = new ControladorCliente();
        Cliente cliente = controladorCliente.crearCliente();
        
        if (cliente != null) {
            int seleccion = 0;
            boolean vip = false;
            System.out.println("¿Desea pagar suplemento Vip y así poder tener acceso preferente?");

            do { 
            
                System.out.println("Pulse 1 para (Si) y 2 para (No)");
                seleccion = Varios.pedirOpcion();
            
            } while (seleccion < 0 || seleccion > 2);
        
            if (seleccion == 1) {      
                vip = true;
            }
        
            Entrada entrada = new Entrada(fechaHoraHoy, cliente, vip);
        
            return entrada;
        
            } else {
            
                return null;
            
        }
    }
}
