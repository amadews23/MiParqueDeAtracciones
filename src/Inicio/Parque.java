package Inicio;

import Vista.Menu;
//import Gestion.ListaObjetos;



/**
 *
 * @author Bartolome Vich Lozano
 * @version 1.10 2019/7/27
 */

public class Parque {

    /**
     * @param args 
     */
    public static void main(String[] args) {
        
        Apertura apertura = new Apertura();
        Menu menu = new Menu(apertura.iniciarActividad());
        
        //ListaObjetos listaObjetos = new ListaObjetos();  
        //Menu menu = new Menu(listaObjetos);
          
 
        menu.menuPrincipal();

    }
}