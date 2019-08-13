
package Gestion;

import Atracciones.Atraccion;
import Gente.Empleado;
import java.util.ArrayList;
import java.util.GregorianCalendar;

/**
 *
 * @author Bartolome Vich Lozano
 * @version 1.0 2019/8/12
 */

public class AtraccionFuncionando {
    private GregorianCalendar fechaInicio;  
    private GregorianCalendar fechaHasta;
    private Atraccion atraccion;
    private ArrayList<Empleado> listaEmpleados;

    public AtraccionFuncionando(GregorianCalendar fechaInicio, 
                                GregorianCalendar fechaHasta, 
                                Atraccion atraccion) {
        
        this.fechaInicio = fechaInicio;
        this.fechaHasta = fechaHasta;
        this.atraccion = atraccion;
        this.listaEmpleados = new ArrayList<>();

        
        for (int i = 0; i < atraccion.getListaEmpleadosAtenciones().size(); i++) {
            this.listaEmpleados.add(this.atraccion.getListaEmpleadosAtenciones().get(i));
        }
        
        for (int i = 0; i < atraccion.getListaEmpleadosAyudantes().size(); i++) {
            this.listaEmpleados.add(this.atraccion.getListaEmpleadosAyudantes().get(i));
        }
        
        for (int i = 0; i < atraccion.getListaEmpleadosRelaciones().size(); i++) {
            this.listaEmpleados.add(this.atraccion.getListaEmpleadosRelaciones().get(i));
        }
        for (int i = 0; i < atraccion.getListaEmpleadosResponsables().size(); i++) {
            this.listaEmpleados.add(this.atraccion.getListaEmpleadosRelaciones().get(i));
        }          
        
    }
    
    
}
