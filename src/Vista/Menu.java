package Vista;

import Utilidades.Varios;
/**
 *
 * @author Bartolome Vich Lozano
 * @version 1.10 2019/7/21
 */
 
public class Menu {
    
    public void menuPrincipal() {
        
        int seleccion = 0;
        
        do {
            System.out.println("*****************************************\n");
            System.out.println("* Parque de Atracciones UNED_2018-19    *\n");
            System.out.println("*****************************************\n");
            System.out.println("Seleccione una de las siguientes opciones:");
            //System.out.println("1- Gestionar atracciones");
            System.out.println("2- Gestionar entradas");
            //System.out.println("3- Gestionar empleados"); 
            //System.out.println("4- Resúmenes de visitantes y entradas");  
            //System.out.println("*5- Resúmenes de costes de atracción*");              
            System.out.println("6- SALIR\n");
            seleccion = Varios.pedirOpcion();
        
            switch (seleccion) {
                case 1:
                    //menuAtracciones();
                    break;
                case 2:
                    menuEntradas();
                    break;   
                case 3:
                    //menuEmpleados();
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
                    //controladorPrincipal.venderEntrada();
                    break;
                case 2:
                    //controladorPrincipal.listarEntradas();
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

}
