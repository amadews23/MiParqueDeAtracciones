package Vista;

import Utilidades.Varios;
import Controladores.ControladorPrincipal;
import Gestion.ListaObjetos;

/**
 *
 * @author Bartolome Vich Lozano
 * @version 1.10 2019/7/29
 */
 
public class Menu {
    
    private final ControladorPrincipal controladorPrincipal;
    
    
    public Menu(ListaObjetos listaObjetos) {
        controladorPrincipal = new ControladorPrincipal(listaObjetos);
    }
    
    public void menuPrincipal() {
        
        int seleccion = 0;
        
        do {
            System.out.println("*****************************************\n");
            System.out.println("* Parque de Atracciones UNED_2018-19    *\n");
            System.out.println("*****************************************\n");
            System.out.println("Seleccione una de las siguientes opciones:");
            System.out.println("1- Gestionar atracciones");
            System.out.println("2- Gestionar entradas");
            System.out.println("3- Gestionar empleados"); 
            //System.out.println("4- Resúmenes de visitantes y entradas");  
            //System.out.println("*5- Resúmenes de costes de atracción*");              
            System.out.println("6- SALIR\n");
            seleccion = Varios.pedirOpcion();
        
            switch (seleccion) {
                case 1:
                    menuAtracciones();
                    break;
                case 2:
                    menuEntradas();
                    break;   
                case 3:
                    menuEmpleados();
                    break;
                case 4:
                    //menuResumenesVisitantes();
                    break;                    
                case 6:
                    System.out.println("Saliendo del programa...");
                    break;                    
                default:
                    System.out.println("Seleccione una opción de las del Menú.");
                    break;
            }
        } while (seleccion != 6);
    
    }
    
    private void menuAtracciones() {
        int opcion = 0;
        System.out.println("-----------------"); 
        System.out.println("Menu Atracciones"); 
        System.out.println("-----------------\n");
        System.out.println("Seleccione una de las siguientes opciones:");
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
     
        int nAtraccion = 0;
        int confirmacion = 0;
        System.out.println("--------------------------"); 
        System.out.println("Menú dar de baja Atracción"); 
        System.out.println("--------------------------\n");        
        System.out.println("Lista de Atracciones");
        System.out.println("--------------------\n");        
        controladorPrincipal.mostrarAtracciones();
        System.out.println("Seleccione el Número de Atracción que quiere dar de baja\n");
        nAtraccion = Varios.pedirOpcion();
        try {
            
            do {
                System.out.println("Confirma que desea eliminar, pulse 1 (Si) o 2 (No)");
                confirmacion = Varios.pedirOpcion();
            } while (confirmacion < 1 || confirmacion > 2);
                if (confirmacion == 1) {
                    controladorPrincipal.quitarAtraccion(nAtraccion);
                    System.out.println("Atracción eliminada con exito");
                } else {
                    System.out.println("Eliminación cancelada");
                }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("ERROR: No ha elejido un número válido de Atracción");
        }
   
    }
    
    private void menuEmpleadoAtraccion() {
        
        System.out.println("Seleccione una de las siguientes opciones:");
        System.out.println("1- Empleado Atención al Cliente");
        System.out.println("2- Empleados Ayudante de Atracción");
        System.out.println("3- Empleado Relaciones Públicas");
        System.out.println("4- Empleado Responsable de Atracción");
        System.out.println("6- Volver atrás\n");
        controladorPrincipal.asignarEmpleadoAtraccion();
    }
    
    private void menuAsignarEmpleadoAtraccion() {
            
        System.out.println("----------------------------------"); 
        System.out.println("Menú Asignar Empleado a Atracción"); 
        System.out.println("----------------------------------\n");
        menuEmpleadoAtraccion();

    
    }
    
    private void menuDarBajaEmpleado() {
        System.out.println("--------------------------------------"); 
        System.out.println("Menú dar de baja Empleado en Atracción"); 
        System.out.println("--------------------------------------\n");
        System.out.println("Lista de Atracciones");  
        System.out.println("--------------------\n");  
        controladorPrincipal.desaignarEmpleadoAtraccion();
        
    }
    
    private void menuMostrarEmpleadoAtraccion() {

        System.out.println("----------------------------------"); 
        System.out.println("Menú Mostrar Empleados en Atracción"); 
        System.out.println("----------------------------------\n");  
        System.out.println("Lista de Atracciones");
        System.out.println("--------------------\n");        
        controladorPrincipal.mostrarEmpleadoAtraccion();
    }
    
    private void menuEntradas() {
        int opcion = 0;
        System.out.println("--------------"); 
        System.out.println("Menú Entradas"); 
        System.out.println("--------------\n");
        System.out.println("Seleccione una de las siguientes opciones:");
        System.out.println("1- Vender Entradas");
        System.out.println("2- Lista de Entradas");
        System.out.println("3- Volver atrás");
        
        do { opcion = Varios.pedirOpcion();
        
            switch (opcion) {
                case 1:
                    controladorPrincipal.venderEntradas();
                    break;
                case 2:
                    menuMostrarEntradas();
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
    
    private void menuMostrarEntradas() {
        int opcion = 0;
        System.out.println("-------------------"); 
        System.out.println("Listas de Entradas"); 
        System.out.println("-------------------\n");
        System.out.println("Seleccione una de las siguientes opciones:");
        System.out.println("1- Ver lista de Entradas General");
        System.out.println("2- Ver lista de Entradas Laboral");
        System.out.println("3- Ver lista de Entradas de Tarde");   
        System.out.println("4- Ver lista de Entradas Aniversario");  
        System.out.println("5- Ver lista de Entradas Familiares");      
        System.out.println("6- Volver atrás");
        
        do { opcion = Varios.pedirOpcion();
        
            switch (opcion) {
                case 1:
                    controladorPrincipal.mostrarEntradasGeneral();   
                    System.out.println("\n");
                    break;
                case 2:
                    controladorPrincipal.mostrarEntradasLaboral();
                    System.out.println("\n");                    
                    break;
                case 3:
                    controladorPrincipal.mostrarEntradasTarde();
                    System.out.println("\n");                    
                    break;
                case 4:
                    controladorPrincipal.mostrarEntradasAniversario();
                    System.out.println("\n");                    
                    break;
                case 5:
                    controladorPrincipal.mostrarEntradasFamilia();
                    System.out.println("\n");                    
                    break;                    
                case 6:
                    System.out.println("Vamos al menú principal...");
                    System.out.println("\n");
                    break;                    
                default:
                    System.out.println("Seleccione una opción de las del Menú.");
                    break;
            }
        } while (opcion < 1 || opcion > 6);
    }

    private void menuEmpleados() {
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
                    seleccionarListarEmpleados();
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
