package Vista;

import Utilidades.Varios;
import Gestion.ListaObjetos;

import Pantallas.ControladorPantalla;


/**
 *
 * @author Bartolome Vich Lozano
 * @version 1.30 2019/8/29
 */
 
public class MenuPrincipal {
    

    private final MenuAtracciones menuAtracciones;
    private final MenuEntradas menuEntradas;
    private final MenuEmpleados menuEmpleados;
    private final MenuInformes menuInformes;
    private final MenuGastoPersonal menuGastoPersonal;
    
    private final MenuPantalla menuPantalla;
    
    public MenuPrincipal(ListaObjetos listaObjetos) {
        menuAtracciones = new MenuAtracciones(listaObjetos);
        menuEntradas = new MenuEntradas(listaObjetos);
        menuEmpleados = new MenuEmpleados(listaObjetos);
        menuInformes = new MenuInformes(listaObjetos);
        menuGastoPersonal = new MenuGastoPersonal(listaObjetos);
        
        menuPantalla = new MenuPantalla(listaObjetos);
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
            System.out.println("4- Resúmenes");  
            System.out.println("5- Gasto de personal"); 
            
            System.out.println("6- Pantalla"); 
            
            System.out.println("7- SALIR\n");
            
            seleccion = Varios.pedirOpcion();
        
            switch (seleccion) {
                case 1:
                    menuAtracciones.iniciar();
                    break;
                case 2:
                    menuEntradas.iniciar();
                    break;   
                case 3:
                    menuEmpleados.iniciar();
                    break;
                case 4:
                    menuInformes.iniciar();
                    break;   
                case 5:
                    menuGastoPersonal.iniciar();
                    break; 
                case 6:
                    menuPantalla.iniciar();
                    break;
                case 7:
                    System.out.println("Saliendo del programa...");
                    break;                    
                default:
                    System.out.println("Seleccione una opción de las del Menú.");
                    break;
            }
        } while (seleccion != 7);
    
    }

}
