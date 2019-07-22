package Controladores;


import Gente.Empleado;
import Gente.EnumEmpleado;
import Gente.Persona;
import Utilidades.Varios;
//import Gestion.ListaObjetos;
import java.util.InputMismatchException;

/**
 *
 * @author Bartolome Vich Lozano
 * @version 1.00 2019/5/17
 */

public class ControladorEmpleado extends ControladorPersona {

    public ControladorEmpleado() {
    
    }
    private int solicitarDni() {
        
        int opcion;
        int dni =0;
        boolean valido = false;
        while (valido == false) {
            try {
                do {
                    System.out.print("Introduzca el dni del trabajor:");
                    opcion = Varios.pedirOpcion();
                    dni = opcion;
                    } while (opcion < 100 || opcion < 9); 
                
                    valido = true;
                    
                } catch (InputMismatchException e) {
                    System.out.println("Inserte valores correcctos:");
                    
                    return 0;
                }
            }
        return dni;
    }
   
    public Empleado crearEmpleado( EnumEmpleado tipoEmpleado) {
        
        Persona persona = crearPersona();
        int opcion2 =0;
        int dni = solicitarDni();
        Empleado empleado = null;
        if (persona != null && dni != 0) {
            do {
                System.out.println("¿Seguro quiere dar de alta el trabajador? "
                                   + "Pulse 1(Si) 0 2(No)");
                opcion2 = Varios.pedirOpcion();
            } while (opcion2 < 1 || opcion2 > 2); 
            
            if (opcion2 == 1) {
                
                empleado = new Empleado( tipoEmpleado, 
                                                  dni, 
                                                  persona.getNombre(), 
                                                  persona.getApellidos(), 
                                                  persona.getFechaNacimiento());

                //listaObjetos.anyadirEmpleado(empleadoAtencion);
                return empleado;
            }
          
        }
    return empleado;
    }
}


  
