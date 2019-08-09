package Vista;

import Controladores.ControladorPrincipal;
import Utilidades.Varios;
import Gestion.ListaObjetos;
import Gestion.InformeNumeroVisitantes;

/**
 *
 * @author Bartolome Vich Lozano/**
 *
 * @author Bartolome Vich Lozano
 * @version 1.0 2019/8/2
**/


public class MenuInformes {
    
    private final ControladorPrincipal controladorPrincipal;
    private final ListaObjetos listaObjetos;
    
    protected MenuInformes( ListaObjetos listaObjetos) {
        
        controladorPrincipal = new ControladorPrincipal(listaObjetos);
        this.listaObjetos = listaObjetos;
    }
    
    protected void iniciar() {
        
        int opcion = 0;
        System.out.println("------------------------------------"); 
        System.out.println("Menú Resúmenes Visitantes y Entradas"); 
        System.out.println("------------------------------------\n");
        System.out.println("Seleccione una de las siguientes opciones:");
        System.out.println("1- Número de visitantes");
        //System.out.println("2- Lista de Entradas vendidas");
        //System.out.println("*3- Número de visitantes en Atracción*");        
        System.out.println("4- Volver atrás");
        
        do { opcion = Varios.pedirOpcion();
        
            switch (opcion) {
                case 1:
                    //controladorPrincipal.mostrarNumeroVisitantes();
                    menuListarResumenesVisitantes();
                    break;
                case 2:
                    
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
    
    private void menuListarResumenesVisitantes() {
  
        int opcion = 0;
        System.out.println("-------------------"); 
        System.out.println("Menu Resumenes"); 
        System.out.println("-------------------\n");
        System.out.println("Seleccione una de las siguientes opciones:");
        System.out.println("1- Ver número visitantes diarios");
        System.out.println("2- Ver número de visitantes por meses");
        System.out.println("3- Ver número de visitantes por años");   
        //System.out.println("4- Ver lista de Entradas Aniversario");  
        //System.out.println("5- Ver lista de Entradas Familiares");      
        //System.out.println("6- Volver atrás");
        
        do { opcion = Varios.pedirOpcion();
        
            switch (opcion) {
                case 1:
                    InformeNumeroVisitantes.informeDiario(listaObjetos);
                    break;
                case 2:
                    InformeNumeroVisitantes.informeMensual(listaObjetos);                                    
                    break;
                case 3:
                    InformeNumeroVisitantes.informeAnual(listaObjetos);                                           
                    break;
                case 4:
                  
                    break;
                case 5:
                  
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
    
    private void menuListarResumenesPrecioMedio() {
  
        int opcion = 0;
        System.out.println("-------------------------------"); 
        System.out.println("Menu Número de Visitantes"); 
        System.out.println("-------------------------------\n");
        System.out.println("Seleccione una de las siguientes opciones:");
        System.out.println("1- Ver visitantes recibidos en un año");
        System.out.println("2- Ver visitantes recibidos en una semana");
        System.out.println("3- Ver visitantes recibidos en un mes");   
        System.out.println("4- Ver visitantes recibidos en un día");  
        System.out.println("5- Ver todos los visitantes recibidos");      
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
