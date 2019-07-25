package Gestion;

import Atracciones.Atraccion;
import Gente.Empleado;
import java.util.ArrayList;

/**
 *
 * @author Bartolome Vich Lozano
 * @version 1.10 2019/7/25
 */

public class ListaObjetos {
    private ArrayList<Atraccion> listaAtracciones;
    private ArrayList<EntradaGeneral> listaEntradasGeneral;
    private ArrayList<EntradaLaborable> listaEntradasLaborable;
    private ArrayList<EntradaTarde> listaEntradasTarde;
    private ArrayList<EntradaFamilia> listaEntradasFamilia;
    private ArrayList<EntradaAniversario> listaEntradasAniversario;
    private ArrayList<Empleado> listaEmpleadosAtencion;
    private ArrayList<Empleado> listaEmpleadosAyudante;
    private ArrayList<Empleado> listaEmpleadosRelaciones;
    private ArrayList<Empleado> listaEmpleadosResponsable;


    public ListaObjetos(ArrayList<Atraccion> listaAtracciones) {
        this.listaAtracciones = listaAtracciones;
    }

    public ListaObjetos() {
        this.listaAtracciones = new ArrayList<>();
        this.listaEntradasGeneral = new ArrayList<>();
        this.listaEntradasLaborable = new ArrayList<>();
        this.listaEntradasTarde = new ArrayList<>();
        this.listaEntradasFamilia = new ArrayList<>();
        this.listaEntradasAniversario = new ArrayList<>();
        this.listaEmpleadosAtencion = new ArrayList<>();
        this.listaEmpleadosAyudante = new ArrayList<>();
        this.listaEmpleadosRelaciones = new ArrayList<>();
        this.listaEmpleadosResponsable = new ArrayList<>();
        
        
    }

    public ArrayList<Atraccion> getListaAtracciones() {
        return listaAtracciones;
    }

    public void setListaAtracciones(ArrayList<Atraccion> listaAtracciones) {
        this.listaAtracciones = listaAtracciones;
    }

    public ArrayList<EntradaGeneral> getListaEntradaGeneral() {
        return listaEntradasGeneral;
    }

    public void setListaEntradaGeneral(ArrayList<EntradaGeneral> listaEntradaGeneral) {
        this.listaEntradasGeneral = listaEntradaGeneral;
    }

    public ArrayList<EntradaGeneral> getListaEntradasGeneral() {
        return listaEntradasGeneral;
    }

    public ArrayList<EntradaLaborable> getListaEntradasLaborable() {
        return listaEntradasLaborable;
    }

    public ArrayList<EntradaTarde> getListaEntradasTarde() {
        return listaEntradasTarde;
    }

    public ArrayList<EntradaFamilia> getListaEntradasFamilia() {
        return listaEntradasFamilia;
    }

    public ArrayList<EntradaAniversario> getListaEntradasAniversario() {
        return listaEntradasAniversario;
    }

    public ArrayList<Empleado> getListaEmpleadosAtencion() {
        return listaEmpleadosAtencion;
    }

    public ArrayList<Empleado> getListaEmpleadosAyudante() {
        return listaEmpleadosAyudante;
    }

    public ArrayList<Empleado> getListaEmpleadosRelaciones() {
        return listaEmpleadosRelaciones;
    }

    public ArrayList<Empleado> getListaEmpleadosResponsable() {
        return listaEmpleadosResponsable;
    }
    
    public void anyadirAtraccion(Atraccion atraccion) {
        this.listaAtracciones.add(atraccion);
    }

    /**
     * Elimina una atraccion de la lista de atracciones.
     * @param indice
     */
    public void quitarAtraccion(int indice) {
        this.listaAtracciones.remove(indice);
    }

    /**
     * Añade una Entrada General a lista de Entradas Generales
     * @param entradaGeneral
     */
    public void anyadirEntrada(EntradaGeneral entradaGeneral) {
        listaEntradasGeneral.add(entradaGeneral);
    }
    
    /**
     * Añade una Entrada Laborable a lista de Entradas Laborables
     * @param entradaLaborable
     */
    public void anyadirEntrada(EntradaLaborable entradaLaborable) {
        listaEntradasLaborable.add(entradaLaborable);
    }
    
    /**
     * Añade una Entrada de Tarde a lista de Entradas de Tarde
     * @param entradaTarde
     */
    public void anyadirEntrada(EntradaTarde entradaTarde) {
        listaEntradasTarde.add(entradaTarde);
    }    
    
    /**
     * Añade una Entrada Familiar a lista de Entradas Familiares
     * @param entradaFamilia
     */
    public void anyadirEntrada(EntradaFamilia entradaFamilia) {
        listaEntradasFamilia.add(entradaFamilia);
    }    
    
    /**
     * Añade una Entrada de Aniversario a lista de Entradas de Aniversario

     * @param entradaAniversario
     */
    public void anyadirEntrada(EntradaAniversario entradaAniversario) {
        listaEntradasAniversario.add(entradaAniversario);
    }    
    
    /**
     * Añade un Empleado Atención a la lista
     * 
     * @param empleado
     */
    public void anyadirEmpleado(Empleado empleado) {

       switch (empleado.getTipoEmpleado()) {

           case ATENCION:
                listaEmpleadosAtencion.add(empleado);
                
            case AYUDANTE:
                listaEmpleadosAyudante.add(empleado);
                
            case RELACIONES:
                listaEmpleadosRelaciones.add(empleado);
                
            case RESPONSABLE:
                listaEmpleadosResponsable.add(empleado);
        }

    }    
          
}
