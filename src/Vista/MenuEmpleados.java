package Vista;

import Controladores.ControladorPrincipal;
import Gestion.ListaObjetos;
import Utilidades.Varios;

/**
 *
 * @author Bartolome Vich Lozano
 * @version 1.0 2019/8/2
 */

public class MenuEmpleados {

    private final ControladorPrincipal controladorPrincipal;
     
    protected MenuEmpleados (ListaObjetos listaObjetos) {
        
        controladorPrincipal = new ControladorPrincipal(listaObjetos);
        
    }
    
    protected void iniciar() {
        
        int opcion = 0;
        System.out.println("---------------"); 
        System.out.println("Menú Empleados"); 
        System.out.println("---------------\n");
        System.out.println("Seleccione una de las siguientes opciones:");
        System.out.println("1- Dar de alta un nuevo empleado ");
        System.out.println("2- Mostrar listas de empleados ");
        System.out.println("3- Volver atrás");
        
        do { opcion = Varios.pedirOpcion();
        
            switch (opcion) {
                case 1:
                    controladorPrincipal.crearEmpleado();
                    break;
                case 2:
                    menuListarEmpleados();
                    break;
                case 3:
                    System.out.println("Vamos al menú principal...");
                    break;                    
                default:
                    System.out.println("Seleccione una opción de las del Menú.");
                    break;
            }
        } while (opcion < 1 || opcion > 3);          
    } 
    
    private void menuListarEmpleados() {

        System.out.println("-------------------"); 
        System.out.println("Listas de Empleados"); 
        System.out.println("-------------------\n");
        System.out.println("Seleccione una de las siguientes opciones:");
        System.out.println("1- Ver lista de Empleados Atención al Cliente");
        System.out.println("2- Ver lista de Empleados Ayudantes de Atracción");
        System.out.println("3- Ver lista de Empleados Relaciones Públicas");
        System.out.println("4- Ver lista de Empleados Responsables de Atracción");
        System.out.println("5- Ver lista de Todos los Empleados");
        System.out.println("6- Volver atrás");
        
        seleccionarListarEmpleados();
    }
    
    private void seleccionarListarEmpleados() {
        
        int opcion = 0;
        do { 
            opcion = Varios.pedirOpcion();
        
            switch (opcion) {
                case 1:
                    controladorPrincipal.mostrarListaEmpleadosAtencion();
                    break;
                case 2:
                    controladorPrincipal.mostrarListaEmpleadosAyudantes();
                    break;
                case 3:
                    controladorPrincipal.mostrarListaEmpleadosRelaciones();
                    break;
                case 4:
                    controladorPrincipal.mostrarListaEmpleadosResponsables();
                    break;    
                case 5:
                    controladorPrincipal.mostrarListaEmpleados();
                    break;    
                case 6:
                    System.out.println("Vamos al menú principal...");
                    break;                    
                default:
                    System.out.println("Seleccione una opción de las del Menú.");
                    break;
            }
        } while (opcion < 1 || opcion > 6);
    }
     
}
