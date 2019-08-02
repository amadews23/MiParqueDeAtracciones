package Vista;

import Controladores.ControladorPrincipal;
import Gestion.ListaObjetos;
import Utilidades.Varios;



public class MenuEntradas {
    
    private final ControladorPrincipal controladorPrincipal;
    
    protected MenuEntradas(ListaObjetos listaObjetos) {
        
        controladorPrincipal = new ControladorPrincipal(listaObjetos);        
        
    }
    
    protected void iniciar() {
        
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
}
