package Gestion;

import Atracciones.Atraccion;
import Gente.Empleado;
import java.util.ArrayList;
//Ejercicio d) examen Junio
import Pantallas.Pantalla;
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
    private ArrayList<AtraccionFuncionando> listaAtraccionesFuncionando;
    //Ejercicio d) examen Junio
    private Pantalla pantalla;

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
        this.listaAtraccionesFuncionando = new ArrayList<>();
    
        //Ejercicio d) examen Junio
        this.pantalla = new Pantalla();
        
    }

    /**
     *
     * @return
     */
    public ArrayList<Atraccion> getListaAtracciones() {
        return listaAtracciones;
    }

    /**
     *
     * @param listaAtracciones
     */
    public void setListaAtracciones(ArrayList<Atraccion> listaAtracciones) {
        this.listaAtracciones = listaAtracciones;
    }

    /**
     *
     * @return
     */
    public ArrayList<EntradaGeneral> getListaEntradaGeneral() {
        return listaEntradasGeneral;
    }

    /**
     *
     * @param listaEntradaGeneral
     */
    public void setListaEntradaGeneral(ArrayList<EntradaGeneral> listaEntradaGeneral) {
        this.listaEntradasGeneral = listaEntradaGeneral;
    }

    /**
     * Obtiene la lista de entradas General
     * @return
     */
    public ArrayList<EntradaGeneral> getListaEntradasGeneral() {
        return listaEntradasGeneral;
    }

    /**
     * Obtiene la lista de entradas Laborables
     * @return
     */
    public ArrayList<EntradaLaborable> getListaEntradasLaborable() {
        return listaEntradasLaborable;
    }

    /**
     * Obtiene la lista de entradas de Tarde
     * @return
     */
    public ArrayList<EntradaTarde> getListaEntradasTarde() {
        return listaEntradasTarde;
    }

    /**
     * Obtiene la lista de entradas Familia
     * @return
     */
    public ArrayList<EntradaFamilia> getListaEntradasFamilia() {
        return listaEntradasFamilia;
    }

    /**
     * Obtiene la lista de entradas Aniversario
     * @return
     */
    public ArrayList<EntradaAniversario> getListaEntradasAniversario() {
        return listaEntradasAniversario;
    }

    /**
     * Obtiene la lista de los empleados Atención
     * @return
     */
    public ArrayList<Empleado> getListaEmpleadosAtencion() {
        return listaEmpleadosAtencion;
    }

    /**
     * Obtiene la lista de los empleados Ayudante
     * @return
     */
    public ArrayList<Empleado> getListaEmpleadosAyudante() {
        return listaEmpleadosAyudante;
    }

    /**
     * Obtiene la lista de los empleados Relaciones
     * @return
     */
    public ArrayList<Empleado> getListaEmpleadosRelaciones() {
        return listaEmpleadosRelaciones;
    }

    /**
     * Obtiene la lista de los empleados Responsable
     * @return
     */
    public ArrayList<Empleado> getListaEmpleadosResponsable() {
        return listaEmpleadosResponsable;
    }

    /**
     * Obtiene la lista de las atracciones en funcionamiento
     * @return
     */
    public ArrayList<AtraccionFuncionando> getListaAtraccionesFuncionando() {
        return listaAtraccionesFuncionando;
    }
    
    /**
     * Añade una atracción a la lista de atracciones
     * @param atraccion
     */
    public void anyadirAtraccion(Atraccion atraccion) {
        this.listaAtracciones.add(atraccion);
    }

    /**
     * Añadimos un objeto AtraccionFuncionando a la lista
     * @param atraccionFuncionando
     */
    public void anyadirAtraccionFuncionando(AtraccionFuncionando atraccionFuncionando) {
        this.listaAtraccionesFuncionando.add(atraccionFuncionando);
        
    }
    
    /**
     * Elimina un objeto AtraccionFuncionando de la lista
     * @param indice
     */
    public void quitarAtraccionFuncioando(int indice ) {
        this.listaAtraccionesFuncionando.remove(indice);
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
    
    //Ejercicio d) examen Junio
    public Pantalla getPantalla() {
        return pantalla;
    }

    public void setPantalla(Pantalla pantalla) {
        this.pantalla = pantalla;
    }
          
}
