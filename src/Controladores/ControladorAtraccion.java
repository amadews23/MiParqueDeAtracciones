package Controladores;

import Atracciones.Atraccion;
import Gente.Empleado;
import Gente.EnumEmpleado;

/**
 * En esta clase están las operaciones a realizar sobre atracciones
 * 
 * @author Bartolome Vich Lozano
 * @version 1.10 2019/7/21
 */
public class ControladorAtraccion {
    
    public void anyadirEmpleado(Atraccion atraccion, 
                                Empleado empleado, 
                                EnumEmpleado tipoEmpleado) {
        
        switch (tipoEmpleado) {
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
                               EnumEmpleado tipoEmpleado, 
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
