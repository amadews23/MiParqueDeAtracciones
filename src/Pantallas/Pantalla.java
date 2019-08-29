
package Pantallas;

import java.util.ArrayList;

/**
 *
 * @author Bartolome Vich Lozano
 * @version 1.00 2019/7/29
 */
public class Pantalla {
    
    private final ArrayList<LineaPantalla> listaLineasPantalla;
    
    public Pantalla() {
        
        this.listaLineasPantalla = new ArrayList<>();
    }

    public ArrayList<LineaPantalla> getListaLineasPantalla() {
        
        return listaLineasPantalla;
    }
    
    public void anyadirLinea (LineaPantalla lineaPantalla) {
        
        listaLineasPantalla.add(lineaPantalla);
    }
    
    public void eliminarLinea ( int numeroLinea) {
        
        listaLineasPantalla.remove(numeroLinea);
    }
    
}
