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
    
    public boolean mostrarEmpleados(EnumTipoEmpleado tipoEmpleado, Atraccion atraccion) {
        switch (tipoEmpleado) {
            
            case ATENCION:
                if ( atraccion.getListaEmpleadosAtenciones().isEmpty()) {
                    System.out.println("No hay trabajadores en el puesto "
                        + tipoEmpleado.getNombreEmpleo()+ " para la Atracción " 
                        + atraccion.getNombreAtraccion() +"\n");
                    return false;
                } else {
                    for (int i = 0; i < atraccion.getListaEmpleadosAtenciones().size(); i++) {
                        System.out.println(i + "- " + atraccion.getListaEmpleadosAtenciones().get(i).getNombre() 
                                    + " " + atraccion.getListaEmpleadosAtenciones().get(i).getApellidos() 
                                    + " dni: " + atraccion.getListaEmpleadosAtenciones().get(i).getDni());
                    }
                    return true; 
                }
            
            case AYUDANTE: 
                if ( atraccion.getListaEmpleadosAyudantes().isEmpty()) {
                    System.out.println("No hay trabajadores en el puesto "
                        + tipoEmpleado.getNombreEmpleo()+ " para la Atracción " 
                        + atraccion.getNombreAtraccion() +"\n");
                    return false;
                } else {
                    for (int i = 0; i < atraccion.getListaEmpleadosAyudantes().size();i++) {
                        System.out.println(i+ "- " + atraccion.getListaEmpleadosAyudantes().get(i).getNombre() 
                                    + " " + atraccion.getListaEmpleadosAyudantes().get(i).getApellidos() 
                                    + " dni: " + atraccion.getListaEmpleadosAyudantes().get(i).getDni());
                    }
                return true;
                } 
            case RELACIONES:            
                if ( atraccion.getListaEmpleadosRelaciones().isEmpty()) {
                    System.out.println("No hay trabajadores en el puesto "
                        + tipoEmpleado.getNombreEmpleo()+ " para la Atracción " 
                        + atraccion.getNombreAtraccion() +"\n");
                    return false;
                } else {            
                    for (int i = 0; i < atraccion.getListaEmpleadosRelaciones().size();i++) {
                        System.out.println(i+ "- " + atraccion.getListaEmpleadosRelaciones().get(i).getNombre() 
                                + " " + atraccion.getListaEmpleadosRelaciones().get(i).getApellidos()         
                                + " dni: " + atraccion.getListaEmpleadosRelaciones().get(i).getDni());
                    }
                    return true;                
                }
            case RESPONSABLE:    
                if ( atraccion.getListaEmpleadosResponsables().isEmpty()) {
                    System.out.println("No hay trabajadores en el puesto "
                        + tipoEmpleado.getNombreEmpleo()+ " para la Atracción " 
                        + atraccion.getNombreAtraccion() +"\n");
                    return false;
                } else {              
                    for (int i = 0; i < atraccion.getListaEmpleadosResponsables().size();i++) {
                        System.out.println(i+ "- " + atraccion.getListaEmpleadosResponsables().get(i).getNombre() 
                                    + " " + atraccion.getListaEmpleadosResponsables().get(i).getApellidos() 
                                    + " dni: " + atraccion.getListaEmpleadosResponsables().get(i).getDni());
                    }
                    return true;
                }    
        }    
        return false;
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
