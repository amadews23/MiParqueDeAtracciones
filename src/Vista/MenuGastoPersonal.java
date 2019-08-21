package Vista;


import Utilidades.Varios;
import Gestion.ListaObjetos;
import Gestion.InformeAtraccionesFuncionando;


/**
 *
 * @author Bartolome Vich Lozano
 * @version 1.0 2019/8/15
**/


public class MenuGastoPersonal {
    

    private final ListaObjetos listaObjetos;
    
    protected MenuGastoPersonal( ListaObjetos listaObjetos) {
        
        this.listaObjetos = listaObjetos;
    }
    
    protected void iniciar() {
        
        int opcion = 0;
        System.out.println("----------------------"); 
        System.out.println("Menú Gasto de Personal"); 
        System.out.println("----------------------\n");
        System.out.println("Seleccione una de las siguientes opciones:");
        System.out.println("1- Resumen");     
        System.out.println("2- Volver atrás");
        
        do { opcion = Varios.pedirOpcion();
        
            switch (opcion) {
                case 1:
                    InformeAtraccionesFuncionando.informe(listaObjetos);
                    break;
                case 2:
                    System.out.println("Vamos al menú principal...");
                    break;                    
                default:
                    System.out.println("Seleccione una opción de las del Menú.");
                    break;
            }
        } while (opcion < 1 || opcion > 2);          
    }
    

}
