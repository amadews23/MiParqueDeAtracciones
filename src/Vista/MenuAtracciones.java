package Vista;

import Controladores.ControladorPrincipal;
import Gestion.ListaObjetos;
import Utilidades.Varios;

/**
 *
 * @author Bartolome Vich Lozano
 * @version 1.0 2019/8/2
 */

public class MenuAtracciones {
    
    private final ControladorPrincipal controladorPrincipal;

    protected MenuAtracciones(ListaObjetos listaObjetos) {
        controladorPrincipal = new ControladorPrincipal(listaObjetos);
    } 
    protected void iniciar() {
        
        int opcion = 0;
        System.out.println("-----------------"); 
        System.out.println("Menu Atracciones"); 
        System.out.println("-----------------\n");
        System.out.println("Seleccione una de las siguientes opciones:\n");
        System.out.println("1- Dar de alta una nueva atracción");
        System.out.println("2- Mostrar la lista de todas las atracciones");// también por tipo?
        System.out.println("3- Dar de baja una atracción");   
        System.out.println("4- Asignar un empleado a una atraccion");
        System.out.println("5- Dar de baja un empleado en una atracción");
        System.out.println("6- Mostrar lista de empleados en una atracción");
        System.out.println("7- Volver atrás");
        
        do { opcion = Varios.pedirOpcion();
        
            switch (opcion) {
                case 1:
                    controladorPrincipal.insertarAtraccion();
                    break;
                case 2:
                    controladorPrincipal.listarAtracciones();
                    break;
                case 3:
                    menuDarDeBajaAtraccion();
                    break;
                case 4:
                    menuEmpleadoAtraccion();
                    break;         
                case 5:
                    menuDarBajaEmpleado();
                    break; 
                case 6:
                    menuMostrarEmpleadoAtraccion();
                    break;                     
                case 7:
                    System.out.println("Vamos al menú principal...");
                    break;                    
                default:
                    System.out.println("Seleccione una opción de las del Menú.");
                    break;
            }
        } while (opcion < 1 || opcion > 6);    

    }
    
    private void menuDarDeBajaAtraccion () {
    
        System.out.println("--------------------------"); 
        System.out.println("Menú dar de baja Atracción"); 
        System.out.println("--------------------------\n");        
        controladorPrincipal.darDeBajaAtraccion();

   
    }
    
    private void menuEmpleadoAtraccion() {

        controladorPrincipal.asignarEmpleadoAtraccion();
    }
        
    private void menuDarBajaEmpleado() {
        
        System.out.println("--------------------------------------"); 
        System.out.println("Menú dar de baja Empleado en Atracción"); 
        System.out.println("--------------------------------------\n");
        controladorPrincipal.desaignarEmpleadoAtraccion();
        
    }
    
    private void menuMostrarEmpleadoAtraccion() {

        System.out.println("----------------------------------"); 
        System.out.println("Menú Mostrar Empleados en Atracción"); 
        System.out.println("----------------------------------\n");        
        controladorPrincipal.mostrarEmpleadoAtraccion();
    }
    
}
