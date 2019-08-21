
package Gestion;


import Gente.EnumTipoEmpleado;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;


/**
 *
 * @author Bartolome Vich Lozano
 * @version 1.0 2019/8/21
 */

public class InformeAtraccionesFuncionando {

    public InformeAtraccionesFuncionando() {
        
    }
    
    private static void crearInforme(ArrayList<AtraccionFuncionando> listaAtraccionesFuncionando) {       

        DateFormat dateFormat = new SimpleDateFormat("dd-MMMMMM-yyyy"); 
       
        for (int i=0; i < listaAtraccionesFuncionando.size(); i++) {             

                float gastoAtenciones = (float)listaAtraccionesFuncionando.get(i).getAtraccion().getTipoAtraccion().getNumEmpleadosAtenciones()
                                  * EnumTipoEmpleado.ATENCION.obtenerSueldo();
                
                float gastoAyudantes = (float)listaAtraccionesFuncionando.get(i).getAtraccion().getTipoAtraccion().getNumEmpleadosAtenciones()
                                  * EnumTipoEmpleado.AYUDANTE.obtenerSueldo();
                
                float gastoRelaciones = (float)listaAtraccionesFuncionando.get(i).getAtraccion().getTipoAtraccion().getNumEmpleadosAtenciones()
                                  * EnumTipoEmpleado.RELACIONES.obtenerSueldo();
                
                float gastoResponsables = (float)listaAtraccionesFuncionando.get(i).getAtraccion().getTipoAtraccion().getNumEmpleadosAtenciones()
                                  * EnumTipoEmpleado.RESPONSABLE.obtenerSueldo();
                
                float gastoTotalMensual = gastoAtenciones + gastoAyudantes + gastoRelaciones + gastoResponsables;
                
                int diasActiva = listaAtraccionesFuncionando.get(i).getFechaHasta().get(GregorianCalendar.DAY_OF_YEAR)
                                 -listaAtraccionesFuncionando.get(i).getFechaInicio().get(GregorianCalendar.DAY_OF_YEAR)+1;
                
                int mesesActiva= listaAtraccionesFuncionando.get(i).getFechaHasta().get(GregorianCalendar.MONTH)
                                -listaAtraccionesFuncionando.get(i).getFechaInicio().get(GregorianCalendar.MONTH)+1;
                
                int semanasActiva = listaAtraccionesFuncionando.get(i).getFechaHasta().get(Calendar.WEEK_OF_YEAR)
                                   -(listaAtraccionesFuncionando.get(i).getFechaInicio().get(Calendar.WEEK_OF_YEAR)-1);
                
                float gastoDiario = gastoTotalMensual/ 31 ;
                float gastoSemanal = gastoTotalMensual/5;
                float gastoTotal = diasActiva*gastoDiario;
                
                System.out.println("________________________________________________");
                System.out.println("\n"+ listaAtraccionesFuncionando.get(i).getAtraccion().getNombreAtraccion() +"\n" 
                                   +"Gasto de sueldos mensuales: "
                                   + "\n Empleados Atención "+ gastoAtenciones 
                                   + "\n Empleados Ayudantes "+ gastoAyudantes
                                   + "\n Empleados Relaciones "+ gastoRelaciones
                                   + "\n Empleados Responsables "+ gastoResponsables 
                                   + "\n Total sueldos mensuales:" + gastoTotalMensual
                                   + "\n Gasto de media en sueldos diarios: " + gastoDiario
                                   + "\n"
                                   + "\nPeriodo:" + dateFormat.format(listaAtraccionesFuncionando.get(i).getFechaInicio().getTime())
                                   +"/" + dateFormat.format(listaAtraccionesFuncionando.get(i).getFechaHasta().getTime())
                                   + "\n Dias activa: " + diasActiva + " .Meses activa :" + mesesActiva + " .Semanas activa:" + semanasActiva
                                   + "\n Gasto total en el periodo:  " + gastoTotal
                                   + "\n Promedio diario : " + gastoTotal/diasActiva
                                   + "\n Promedio mensual: " + gastoTotal/mesesActiva
                                   + "\n Promedio semanal: " + ((gastoTotal/mesesActiva)/5) 
                                   );
        }
        System.out.println("\n");  
    }


    public static void informe (ListaObjetos listaObjetos) {
        
        System.out.println("------------------------------"); 
        System.out.println("Resumen de Gastos de Atracción"); 
        System.out.println("------------------------------\n");

        
        crearInforme(listaObjetos.getListaAtraccionesFuncionando());     
        
    }               
}
