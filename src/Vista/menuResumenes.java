package Vista;

import Utilidades.Varios;

/**
 *
 * @author Bartolome Vich Lozano
 * @version 1.0 2019/8/2
 */



public class menuResumenes {
    
    protected menuResumenes() {
        
    }
    
    protected void iniciar() {
        
        int opcion = 0;
        System.out.println("------------------------------------"); 
        System.out.println("Menú Resúmenes Visitantes y Entradas"); 
        System.out.println("------------------------------------\n");
        System.out.println("Seleccione una de las siguientes opciones:");
        System.out.println("1- Número de visitantes");
        System.out.println("2- Lista de Entradas vendidas");
        //System.out.println("*3- Número de visitantes en Atracción*");        
        System.out.println("4- Volver atrás");
        
        do { opcion = Varios.pedirOpcion();
        
            switch (opcion) {
                case 1:
                    //controladorPrincipal.mostrarNumeroVisitantes();
                    break;
                case 2:
                    menuListarEntradas();
                    break;
                case 3:
                    //
                    break;
                case 4:
                    System.out.println("Vamos al menú principal...");
                    break;                    
                default:
                    System.out.println("Seleccione una opción de las del Menú.");
                    break;
            }
        } while (opcion < 1 || opcion > 4);          
    }
    
    private void menuListarEntradas() {
  
        int opcion = 0;
        System.out.println("-------------------"); 
        System.out.println("Menu listas de Entradas"); 
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
                    //System.out.println(listaObjetos.getListaEntradasGeneral());
                    menuListarEntradasGeneral();   
                    //System.out.println("\n");
                    break;
                case 2:
                    //System.out.println(listaObjetos.getListaEntradasLaborable());
                    //mostrarEntradasLaboral();
                    //System.out.println("\n");                    
                    break;
                case 3:
                    //System.out.println(listaObjetos.getListaEntradasTarde());
                    //mostrarEntradasTarde();
                    //System.out.println("\n");                    
                    break;
                case 4:
                    //System.out.println(listaObjetos.getListaEntradasAniversario());
                    //mostrarEntradasAniversario();
                    //System.out.println("\n");                    
                    break;
                case 5:
                    //System.out.println(listaObjetos.getListaEntradasFamilia());
                    //mostrarEntradasFamilia();
                    //System.out.println("\n");                    
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
private void menuListarEntradasGeneral() {
  
        int opcion = 0;
        System.out.println("-------------------------------"); 
        System.out.println("Menu listas de Entradas General"); 
        System.out.println("-------------------------------\n");
        System.out.println("Seleccione una de las siguientes opciones:");
        System.out.println("1- Ver todas las entradas vendidas");
        //System.out.println("2- Ver lista de Entradas Laboral");
        //System.out.println("3- Ver lista de Entradas de Tarde");   
        //System.out.println("4- Ver lista de Entradas Aniversario");  
        //System.out.println("5- Ver lista de Entradas Familiares");      
        System.out.println("6- Volver atrás");
        
        do { opcion = Varios.pedirOpcion();
        
            switch (opcion) {
                case 1:
                    //System.out.println(listaObjetos.getListaEntradasGeneral());
                    //controladorPrincipal.mostrarEntradasGeneral();   
                    System.out.println("\n");
                    break;
                case 2:
                    //System.out.println(listaObjetos.getListaEntradasLaborable());
                   
                    System.out.println("\n");                    
                    break;
                case 3:

                    
                    System.out.println("\n");                    
                    break;
                case 4:

                    
                    System.out.println("\n");                    
                    break;
                case 5:

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
