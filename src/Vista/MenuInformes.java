package Vista;

import Utilidades.Varios;
import Gestion.ListaObjetos;
import Gestion.InformeVisitantes;
import Gestion.InformeVisitantesAtraccion;

/**
 *
 * @author Bartolome Vich Lozano
 * @version 1.10 2019/8/15
**/


public class MenuInformes {
    

    private final ListaObjetos listaObjetos;
    
    protected MenuInformes( ListaObjetos listaObjetos) {
        
        this.listaObjetos = listaObjetos;
    }
    
    protected void iniciar() {
        
        int opcion = 0;
        System.out.println("------------------------------------"); 
        System.out.println("Menú Resúmenes Visitantes y Entradas"); 
        System.out.println("------------------------------------\n");
        System.out.println("Seleccione una de las siguientes opciones:");
        System.out.println("1- Número de visitantes");
        System.out.println("2- Gasto de visitantes");
        System.out.println("3- Número de visitantes en Atracción*");        
        System.out.println("4- Volver atrás");
        
        do { opcion = Varios.pedirOpcion();
        
            switch (opcion) {
                case 1:
                    menuListarResumenesVisitantes();
                    break;
                case 2:
                    menuListarResumenesPrecio();                    
                    break;
                case 3:
                    menuListarResumenesAtraccion();
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
        System.out.println("-------------------------"); 
        System.out.println("Menu Resumenes Visitantes"); 
        System.out.println("-------------------------\n");
        System.out.println("Seleccione una de las siguientes opciones:");
        System.out.println("1- Ver número visitantes diarios");
        System.out.println("2- Ver número de visitantes por meses");
        System.out.println("3- Ver número de visitantes por años");   
        System.out.println("4- Ver número de visitantes semanales");  
        System.out.println("5- Volver atrás");
        
        do { opcion = Varios.pedirOpcion();
        
            switch (opcion) {
                case 1:
                    InformeVisitantes.informeDiario(listaObjetos);
                    break;
                case 2:
                    InformeVisitantes.informeMensual(listaObjetos);                                    
                    break;
                case 3:
                    InformeVisitantes.informeAnual(listaObjetos);                                           
                    break;
                case 4:
                    InformeVisitantes.informeSemanal(listaObjetos);                                                             
                    break;
                case 5:
                    System.out.println("Vamos al menú principal...");
                    System.out.println("\n");
                    break;                    
                default:
                    System.out.println("Seleccione una opción de las del Menú.");
                    break;
            }
        } while (opcion < 1 || opcion > 5);
    }
    
    private void menuListarResumenesPrecio() {
  
        int opcion = 0;
        System.out.println("-------------------------"); 
        System.out.println("Menu Número de Visitantes"); 
        System.out.println("-------------------------\n");
        System.out.println("Seleccione una de las siguientes opciones:");
        System.out.println("1- Ver gasto visitantes diario");
        System.out.println("2- Ver gasto visitantes mensual");
        System.out.println("3- Ver gasto visitantes anual");   
        System.out.println("4- Ver gasto visitantes semanal");     
        System.out.println("5- Volver atrás");
        
        do { opcion = Varios.pedirOpcion();
        
            switch (opcion) {
                case 1:
                    InformeVisitantes.informeDiarioPrecio(listaObjetos);
                    break;
                case 2:
                    InformeVisitantes.informeMensualPrecio(listaObjetos);               
                    break;
                case 3:
                    InformeVisitantes.informeAnualPrecio(listaObjetos);
                    break;
                case 4:
                    InformeVisitantes.informeSemanalPrecio(listaObjetos);
                    break;
                case 5:
                    System.out.println("Vamos al menú principal...");
                    System.out.println("\n");
                    break;                    
                default:
                    System.out.println("Seleccione una opción de las del Menú.");
                    break;
            }
        } while (opcion < 1 || opcion > 6);
    } 
    
    private void menuListarResumenesAtraccion() {
  
        int opcion = 0;
        System.out.println("--------------------------------------"); 
        System.out.println("Menu Número de Visitantes en Atraccion"); 
        System.out.println("--------------------------------------\n");
        System.out.println("Seleccione una de las siguientes opciones:");
        System.out.println("1- Ver visitas semanales");
        System.out.println("2- Ver visitas mensuales");
        System.out.println("3- Ver visitas anuales");     
        System.out.println("4- Volver atrás");
        
        do { opcion = Varios.pedirOpcion();
        
            switch (opcion) {
                case 1:
                    InformeVisitantesAtraccion.informeSemanual(listaObjetos);
                    break;
                case 2:
                    InformeVisitantesAtraccion.informeMensual(listaObjetos);             
                    break;
                case 3:
                    InformeVisitantesAtraccion.informeAnual(listaObjetos);
                    break;                  
                case 4:
                    System.out.println("Vamos al menú principal...");
                    System.out.println("\n");
                    break;                    
                default:
                    System.out.println("Seleccione una opción de las del Menú.");
                    break;
            }
        } while (opcion < 1 || opcion > 4);
    }     
}
