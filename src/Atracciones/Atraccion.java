package Atracciones;

import Gente.Cliente;
import Gente.Empleado;
import Gente.EnumEmpleado;

import java.util.ArrayList;


/**
 *
 * @author Bartolome Vich Lozano
 * @version 1.10 2019/7/21
 */
public class Atraccion {
   
        private String nombreAtraccion;
        private boolean esActiva;
        private ArrayList<Cliente> listaClientes ;
        private ArrayList<Empleado> listaEmpleadosAtenciones;
        private ArrayList<Empleado> listaEmpleadosAyudantes;
        private ArrayList<Empleado> listaEmpleadosRelaciones;
        private ArrayList<Empleado> listaEmpleadosResponsables;

        private EnumTipoAtraccion tipoAtraccion;

       
    /**
     *
     * @param nombreAtraccion
     * @param tipoAtraccion
     */
    public Atraccion(String nombreAtraccion, EnumTipoAtraccion tipoAtraccion) {
        this.nombreAtraccion = nombreAtraccion;
        this.esActiva = false; //por defecto Atracción está inactiva
        this.listaClientes = new ArrayList<>();
        this.listaEmpleadosAtenciones = new ArrayList<>();
        this.listaEmpleadosAyudantes = new ArrayList<>();
        this.listaEmpleadosRelaciones = new ArrayList<>();
        this.listaEmpleadosResponsables = new ArrayList<>();
        this.tipoAtraccion = tipoAtraccion;

    }

    /**
     *
     * @param nombreAtraccion
     * @param listaClientes
     * @param listaEmpleadosAyudantes
     * @param listaEmpleadosResponsables
     * @param listaEmpleadosAtenciones
     * @param listaEmpleadosRelaciones
     * @param tipoAtraccion
     */
    public Atraccion(
            String nombreAtraccion, 
            ArrayList<Cliente> listaClientes, 
            ArrayList<Empleado> listaEmpleadosAyudantes, 
            ArrayList<Empleado> listaEmpleadosResponsables, 
            ArrayList<Empleado> listaEmpleadosAtenciones, 
            ArrayList<Empleado> listaEmpleadosRelaciones, 
            EnumTipoAtraccion tipoAtraccion) {
        
        this.nombreAtraccion = nombreAtraccion;
        this.esActiva = false; //por defecto Atracción está inactiva
        this.listaClientes = listaClientes;
        this.listaEmpleadosAyudantes = listaEmpleadosAyudantes;
        this.listaEmpleadosResponsables = listaEmpleadosResponsables;
        this.listaEmpleadosAtenciones = listaEmpleadosAtenciones;
        this.listaEmpleadosRelaciones = listaEmpleadosRelaciones;
        this.tipoAtraccion = tipoAtraccion;
    }


    public String getNombreAtraccion() {
        return nombreAtraccion;
    }

    /**
     *
     * @param nombreAtraccion
     */
    public void setNombreAtraccion(String nombreAtraccion) {
        this.nombreAtraccion = nombreAtraccion;
    }


    public boolean isEsActiva() {
        return esActiva;
    }

    /**
     *
     * @param esActiva
     */
    public void setEsActiva(boolean esActiva) {
        this.esActiva = esActiva;
    }

    public ArrayList<Cliente> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(ArrayList<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }

    public ArrayList<Empleado> getListaEmpleadosAyudantes() {
        return listaEmpleadosAyudantes;
    }

    public void setListaEmpleadosAyudantes(ArrayList<Empleado> listaEmpleadosAyudantes) {
        this.listaEmpleadosAyudantes = listaEmpleadosAyudantes;
    }

    public ArrayList<Empleado> getListaEmpleadosResponsables() {
        return listaEmpleadosResponsables;
    }

    public void setListaEmpleadosResponsables(ArrayList<Empleado> listaEmpleadosResponsables) {
        this.listaEmpleadosResponsables = listaEmpleadosResponsables;
    }

    public ArrayList<Empleado> getListaEmpleadosAtenciones() {
        return listaEmpleadosAtenciones;
    }

    public void setListaEmpleadosAtenciones(ArrayList<Empleado> listaEmpleadosAtenciones) {
        this.listaEmpleadosAtenciones = listaEmpleadosAtenciones;
    }

    public ArrayList<Empleado> getListaEmpleadosRelaciones() {
        return listaEmpleadosRelaciones;
    }

    public void setListaEmpleadosRelaciones(ArrayList<Empleado> listaEmpleadosRelaciones) {
        this.listaEmpleadosRelaciones = listaEmpleadosRelaciones;
    }

    public EnumTipoAtraccion getTipoAtraccion() {
        return tipoAtraccion;
    }

    public void setTipoAtraccion(EnumTipoAtraccion tipoAtraccion) {
        this.tipoAtraccion = tipoAtraccion;
    }
    
    
    @Override
    public String toString() {
        String estaActiva = "No";
        if (esActiva == true) {
            estaActiva = "Si";
        }
        return "\nNombre de Atraccion: " + nombreAtraccion + " ¿Está activa? " + estaActiva  
                + "\n" + tipoAtraccion.toString() + "\n";
    }

}
