package Controladores;

import Atracciones.Atraccion;
import Atracciones.EnumTipoAtraccion;
import Gente.Empleado;
import Gente.EnumTipoEmpleado;
import Utilidades.Varios;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * En esta clase están las operaciones a realizar sobre atracciones
 * 
 * @author Bartolome Vich Lozano
 * @version 1.10 2019/7/21
 */
public class ControladorAtraccion {
    
        private ArrayList<String> listarTiposAtracciones(ArrayList<String> listaTipoAtraccion) {
        for (EnumTipoAtraccion tipoAtracc : EnumTipoAtraccion.values()) {
            //mostramos los tipos de atraccion
            System.out.println((tipoAtracc.ordinal()) +"- " + tipoAtracc.toString());
            //anyadimos a la lista de tipos de atracciones
            listaTipoAtraccion.add(tipoAtracc.name());
        }
        return listaTipoAtraccion;
    }

    /**
     *
     * @return Atraccion
     */
    public Atraccion crearAtraccion() {

    String nombre = "";
    int nTipoAtraccion = 0;
    
    //esta será la lista que mostrará el Enumerado de tipos de atraccion
    ArrayList<String> listaTipoAtraccion = new ArrayList();

    
    Scanner datosAtraccion = new Scanner(System.in);
    System.out.println("Introduzca el nombre para la nueva Atracción");
    
    nombre = datosAtraccion.nextLine();
    System.out.println("\nLista de Tipos de atracciones:\n"
                        + "----------------------");
    
    listarTiposAtracciones(listaTipoAtraccion);
    
    System.out.println("-------------------------------------------\n"
                    + "Elija el número de Tipo para la Atracción " 
                    + nombre);
    
    Atraccion atraccion;
    
    nTipoAtraccion = Varios.pedirOpcion();
    
    try {
        atraccion = new Atraccion(nombre,EnumTipoAtraccion.valueOf(listaTipoAtraccion.get(nTipoAtraccion)));
        //System.out.println(atraccion.toString());
        } catch (IndexOutOfBoundsException e) {
            System.out.println("ERROR: Elija un número válido de Tipo de Atracción,\n vuelva a intentarlo");
            return null;
        }
    
    return atraccion;
    }     
    public void anyadirEmpleado(Atraccion atraccion, 
                                Empleado empleado) {
        
        switch (empleado.getTipoEmpleado()) {
                case ATENCION:
                    atraccion.getListaEmpleadosAtenciones().add(empleado);
                    break;
                case AYUDANTE:
                    atraccion.getListaEmpleadosAyudantes().add(empleado);
                    break;
                case RELACIONES:
                    atraccion.getListaEmpleadosRelaciones().add(empleado); 
                    break;
                case RESPONSABLE:
                    atraccion.getListaEmpleadosResponsables().add(empleado);
                    break;
        }     

    }
    
    public void quitarEmpleado(Atraccion atraccion,
                               EnumTipoEmpleado tipoEmpleado, 
                               int nEmpleado ) {
        
        switch (tipoEmpleado) {
                case ATENCION:
                    atraccion.getListaEmpleadosAtenciones().remove(nEmpleado);
                    break;
                case AYUDANTE:
                    atraccion.getListaEmpleadosAyudantes().remove(nEmpleado);
                    break;
                case RELACIONES:
                    atraccion.getListaEmpleadosRelaciones().remove(nEmpleado);
                    break;
                case RESPONSABLE:
                    atraccion.getListaEmpleadosResponsables().remove(nEmpleado);
                    break;
        }
  
    }
}
