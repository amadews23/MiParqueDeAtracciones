
package Vista;

import Gestion.ListaObjetos;
import Utilidades.Varios;
import Controladores.ControladorPrincipal;
import Pantallas.LineaPantalla;
import Pantallas.Pantalla;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Scanner;

/**
 *
 * @author Bartolome Vich Lozano
 * @version 1.0 2019/8/29
 */
public class MenuPantalla {
    private final ListaObjetos listaObjetos;
    private final ControladorPrincipal controladorPrincipal;
    
    protected MenuPantalla( ListaObjetos listaObjetos) {
        
        this.listaObjetos = listaObjetos;
        
        this.controladorPrincipal = new ControladorPrincipal(listaObjetos);
    }
    
    protected void iniciar() {
        
        int opcion = 0;
        System.out.println("-------------"); 
        System.out.println("Menú Pantalla"); 
        System.out.println("-----------\n");
        System.out.println("Seleccione una de las siguientes opciones:");
        System.out.println("1- Crear Incidencia");
        System.out.println("2- Revisar Incidencia");
        System.out.println("3- Ver lista de Incidencias");        
        System.out.println("4- Volver atrás");
        
        do { opcion = Varios.pedirOpcion();
        
            switch (opcion) {
                case 1:
                    menuCrearIncidencia();
                    break;
                case 2:
                    menuRevisarIncidencia();                    
                    break;
                case 3:
                    menuListarIncidencias();
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
    
    private void menuCrearIncidencia() {
  
        int opcion = 0;
        int opcion2 = 0;
        
        Pantalla pantalla = listaObjetos.getPantalla();
        LineaPantalla lineaPantalla; 
        
        Scanner scannerObservacion = new Scanner(System.in);

        System.out.println("-------------------------"); 
        System.out.println("Menu crear Incidencia"); 
        System.out.println("-------------------------\n");
        System.out.println("Seleccione una de las siguientes tipos de entradas:");
        System.out.println("1- General");
        System.out.println("2- Familia");
        System.out.println("3- Laboral");   
        System.out.println("4- Tarde");  
        System.out.println("5- Aniversario");  
        
        System.out.println("6- Volver atrás");
        
        do { opcion = Varios.pedirOpcion();
        
            System.out.println(" Lista de entradas");
            switch (opcion) {
                case 1:
                    controladorPrincipal.mostrarEntradasGeneral(); 
                    
                    System.out.println("Seleccione la entrada");
                    
                    opcion2 = Varios.pedirOpcion();
                    
                    System.out.println("Introduzca observación");
                    
                    lineaPantalla = new LineaPantalla(listaObjetos.getListaEntradaGeneral().get(opcion2).getFechaHoraEntrada(),
                                                      listaObjetos.getListaEntradaGeneral().get(opcion2).getCliente(),
                                                      scannerObservacion.nextLine() );
                    
                    pantalla.anyadirLinea(lineaPantalla);
                    
                    break;
                case 2:
                     controladorPrincipal.mostrarEntradasFamilia();
                    
                    System.out.println("Seleccione la entrada");
                    
                    opcion2 = Varios.pedirOpcion();
                    
                    System.out.println("Introduzca observación");
                    
                    lineaPantalla = new LineaPantalla(listaObjetos.getListaEntradasFamilia().get(opcion2).getFechaHoraEntrada(),
                                                      listaObjetos.getListaEntradasFamilia().get(opcion2).getCliente(),
                                                      scannerObservacion.nextLine() );
                    
                    pantalla.anyadirLinea(lineaPantalla);
                                                             
                    break;
                case 3:
                     controladorPrincipal.mostrarEntradasLaboral();

                    
                    System.out.println("Seleccione la entrada");
                    
                    opcion2 = Varios.pedirOpcion();
                    
                    System.out.println("Introduzca observación");
                    
                    lineaPantalla = new LineaPantalla(listaObjetos.getListaEntradasLaborable().get(opcion2).getFechaHoraEntrada(),
                                                      listaObjetos.getListaEntradasLaborable().get(opcion2).getCliente(),
                                                      scannerObservacion.nextLine() );
                    
                    pantalla.anyadirLinea(lineaPantalla);
                    
                    break;
                case 4:
                    controladorPrincipal.mostrarEntradasTarde();

                    
                    System.out.println("Seleccione la entrada");
                    
                    opcion2 = Varios.pedirOpcion();
                    
                    System.out.println("Introduzca observación");
                    
                    lineaPantalla = new LineaPantalla(listaObjetos.getListaEntradasTarde().get(opcion2).getFechaHoraEntrada(),
                                                      listaObjetos.getListaEntradasTarde().get(opcion2).getCliente(),
                                                      scannerObservacion.nextLine() );
                    
                    pantalla.anyadirLinea(lineaPantalla);
                    
                    break;
                case 5:
                    controladorPrincipal.mostrarEntradasAniversario();

                    
                    System.out.println("Seleccione la entrada");
                    
                    opcion2 = Varios.pedirOpcion();
                    
                    System.out.println("Introduzca observación");
                    
                    lineaPantalla = new LineaPantalla(listaObjetos.getListaEntradasAniversario().get(opcion2).getFechaHoraEntrada(),
                                                      listaObjetos.getListaEntradasAniversario().get(opcion2).getCliente(),
                                                      scannerObservacion.nextLine() );
                    
                    pantalla.anyadirLinea(lineaPantalla);
                    
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
    
    private void menuRevisarIncidencia() {
  
        int opcion = 0;
        System.out.println("-------------------------"); 
        System.out.println("Menu revisar Incidencia"); 
        System.out.println("-------------------------\n");
        System.out.println("Seleccione una de las siguientes opciones:");
        System.out.println("1- ");
        System.out.println("2- ");
        System.out.println("3- ");   
        System.out.println("4- ");     
        System.out.println("5- ");
        
        do { opcion = Varios.pedirOpcion();
        
            switch (opcion) {
                case 1:

                    break;
                case 2:
              
                    break;
                case 3:

                    break;
                case 4:

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
    
    private void menuListarIncidencias() {
  
        DateFormat dateFormat = new SimpleDateFormat("dd-MMMMMM-yyyy"); 

        System.out.println("--------------------------------------"); 
        System.out.println("Ver lista de incidencias de la pantalla"); 
        System.out.println("--------------------------------------\n");

        for (int i = 0; i < listaObjetos.getPantalla().getListaLineasPantalla().size(); i++) {
            System.out.println(listaObjetos.getPantalla().getListaLineasPantalla().get(i).getCliente().getNombre()+" "
                               + listaObjetos.getPantalla().getListaLineasPantalla().get(i).getCliente().getApellidos()+ " "
                               + dateFormat.format(listaObjetos.getPantalla().getListaLineasPantalla().get(i).getFechaHora().getTime())+ " "
                               + listaObjetos.getPantalla().getListaLineasPantalla().get(i).getObservacion());
                
        }


    }         
}
