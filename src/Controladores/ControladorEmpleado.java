package Controladores;


import Gente.Empleado;
import Gente.EnumTipoEmpleado;
import Gente.Persona;
import Utilidades.Varios;

import java.util.InputMismatchException;

/**
 *
 * @author Bartolome Vich Lozano
 * @version 1.10 2019/7/25
 */

public class ControladorEmpleado extends ControladorPersona {

    public ControladorEmpleado() {
    
    }
    private EnumTipoEmpleado seleccionarTipoEmpleado() {

        int opcion = 0;
        
        try {
           do {
                System.out.println("Seleccione un numero de la lista");
                opcion = Varios.pedirOpcion();
              } while (opcion < 1 || opcion > EnumTipoEmpleado.values().length );
   
              switch (opcion) {
                  case 1:
                      return EnumTipoEmpleado.ATENCION;
                  case 2:
                      return EnumTipoEmpleado.AYUDANTE;
                  case 3:
                      return EnumTipoEmpleado.RELACIONES;
                  case 4:
                      return EnumTipoEmpleado.RESPONSABLE;
              }
        } catch (InputMismatchException e) {
             
            System.out.println("Inserte valores correctos:");
            return null;

        }
        return null;
   }
    
    private void mostrarTiposEmpleados() {
        
         for (  EnumTipoEmpleado E: EnumTipoEmpleado.values() ) {
            System.out.println((E.ordinal()+1) +"- " + E.getNombreEmpleo());
        }
    }
    private int solicitarDni() {
        
        int opcion;
        int dni =0;
        boolean valido = false;
        while (valido == false) {
            try {
                do {
                    System.out.println("Introduzca el dni del trabajor:");
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
   
    public Empleado crearEmpleado( ) {
        
        System.out.println("Lista de tipos de empleados:");
        
        mostrarTiposEmpleados();
        
        EnumTipoEmpleado tipoEmpleado = seleccionarTipoEmpleado();
        
        Persona persona = crearPersona();
        
        int opcion =0;
        int dni = solicitarDni();

        if (persona != null && dni != 0) {
            do {
                System.out.println("¿Seguro quiere dar de alta el trabajador? "
                                   + "Pulse 1(Si) 0 2(No)");
                opcion = Varios.pedirOpcion();
            } while (opcion < 1 || opcion > 2); 
            
            if (opcion == 1) {
                
                Empleado empleado = new Empleado(tipoEmpleado, 
                                        dni, 
                                        persona.getNombre(), 
                                        persona.getApellidos(), 
                                        persona.getFechaNacimiento());

                return empleado;
            }
          
        }
        return null;
    }
}


  
