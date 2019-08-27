package Controladores;

import Gente.Cliente;
import Gente.Persona;
import Utilidades.Varios;
import java.util.InputMismatchException;

/**
 *
 * @author Bartolome Vich Lozano
 * @version 1.10 2019/7/23
 */
public class ControladorCliente extends ControladorPersona {

    /**
     *
     */
    public ControladorCliente() {
        
    }
    
    /**
     *
     * @return Cliente
     */
    public Cliente crearCliente() {
    
        Persona persona = crearPersona();
        
        if (persona != null) {
            
            int altura = 0;
            boolean esEstudiante = false;
            int opcion;
            int opcion2;
            boolean esDiscapacitado = false;
            boolean esCarnetJoven = false;
            boolean esDesempleado = false;

            boolean valido = false;
            
            while (valido == false) {
                
                try {
                    
                    do {
                        System.out.print("Altura en nº de centimetros aproximados");
                        opcion = Varios.pedirOpcion();
                        altura = opcion;

                    } while (opcion < 10 || opcion > 220);                   
                    
                    do {
                        System.out.print("¿Es estudiante? Pulse 1(Si) 0 2(No)");
                        opcion2 = Varios.pedirOpcion();
                        if (opcion2 == 1) {
                            esEstudiante = true;
                        }
                        
                    } while (opcion2 < 0 || opcion2 > 2);   
            
                    do {
                        System.out.print("¿Es discapacitado? Pulse 1(Si) 0 2(No)");
                        opcion2 = Varios.pedirOpcion();
                        
                        if (opcion2 == 1) {
                            esDiscapacitado = true;
                        }
                        
                    } while (opcion2 < 0 || opcion2 > 2);
                
                    do {
                        System.out.print("¿Tiene carnet joven? Pulse 1(Si) 0 2(No)");
                        opcion2 = Varios.pedirOpcion();
                        if (opcion2 == 1) {
                            esCarnetJoven = true;
                        }
                        
                    } while (opcion2 < 0 || opcion2 > 2); 
                
                    do {
                        System.out.print("¿Está en el paro? Pulse 1(Si) 0 2(No)");
                        opcion2 = Varios.pedirOpcion();
                        
                        if (opcion2 == 1) {
                            esDesempleado = true;
                        }
                    } while (opcion2 < 0 || opcion2 > 2);                 
                
                    valido = true;
                
                } catch (InputMismatchException e) {
                    
                    System.out.println("Inserte valores correcctos:");
                    return null;
                }
            } 

            Cliente cliente = new Cliente(altura, 
                                          esEstudiante, 
                                          esDiscapacitado, 
                                          esCarnetJoven, 
                                          esDesempleado, 
                                          persona.getNombre(), 
                                          persona.getApellidos(), 
                                          persona.getFechaNacimiento());
            
            return cliente;
            
        } 
        
        return null;
    }
}    