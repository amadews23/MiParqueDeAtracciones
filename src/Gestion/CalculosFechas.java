package Gestion;

import Gente.Persona;


import java.util.Calendar;
import java.util.GregorianCalendar;



/**
 * Métodos útiles para el manejo de fechas
 * 
 * @author Bartolome Vich Lozano
 * @version 1.00 2019/5/17
 */

public class CalculosFechas {
    

    private static int diferenciaAnyos(int anyo, int mes, int dia) {
        int anyoHoy, mesHoy, diaHoy, anyos;
        Calendar fechaHoy = GregorianCalendar.getInstance();
        
        anyoHoy = fechaHoy.get(GregorianCalendar.YEAR);
        mesHoy = fechaHoy.get(GregorianCalendar.MONTH);
        diaHoy = fechaHoy.get(GregorianCalendar.DATE);
        
        anyos = anyoHoy - anyo;

        if (mesHoy - mes < 0) {
            anyos --;
        }
        if ( ( (mesHoy - mes) == 0 ) && ( (dia -diaHoy) > 0 ) ){
            anyos --;         
        }
        return anyos;
    }
    
    /**
     * Método para calcular la edad de una persona o cosa
     * calcularEdad
     *
     * @param persona
     * @return 
     */
    public static int calcularEdad(Persona persona) {
        int edad, anyoPersona, mesPersona, diaPersona;
        
        anyoPersona = persona.getFechaNacimiento().get(GregorianCalendar.YEAR);
        mesPersona = persona.getFechaNacimiento().get(GregorianCalendar.MONTH);
        diaPersona = persona.getFechaNacimiento().get(GregorianCalendar.DATE);

        edad = diferenciaAnyos(anyoPersona, mesPersona, diaPersona);
      
        return edad;
    }
    
     /**
     * Método para calcular la edad de una persona o cosa
     * calcularEdad
     *
     * @param fechaPersona
     * @return 
     */
    public static int calcularEdad(GregorianCalendar fechaPersona) {
        int edad, anyoPersona, mesPersona, diaPersona;

        anyoPersona = fechaPersona.get(GregorianCalendar.YEAR);
        mesPersona = fechaPersona.get(GregorianCalendar.MONTH);
        diaPersona = fechaPersona.get(GregorianCalendar.DATE);
        edad = diferenciaAnyos(anyoPersona, mesPersona, diaPersona);    

        return edad;
    }
    
    /**
     * Método para saber a que temporada pertenece una entrada
     * Importante para calcular el precio de la entrada 
     * 
     * @param fechaEntrada
     * @return
     */
    public static EnumTemporadaPrecio devolverTemporada(GregorianCalendar fechaEntrada) {
 
        EnumTemporadaPrecio tipoTemporada ;
        tipoTemporada = EnumTemporadaPrecio.MEDIA;

        Calendar fechaAnyoNuevo = new GregorianCalendar(2019,0,1);
        Calendar fechaFinNavidades = new GregorianCalendar(2019,0,8);
        int diaAnyoNuevo = fechaAnyoNuevo.get(Calendar.DAY_OF_MONTH);
        int diaFinNavidades = fechaFinNavidades.get(Calendar.DAY_OF_MONTH);
        
        //Comprobamos que no esté comprendido en el periodo de Año Nuevo y fin de Navidades
        if ( (fechaEntrada.get(Calendar.DAY_OF_YEAR) >= diaAnyoNuevo) 
              && (fechaEntrada.get(Calendar.DAY_OF_YEAR) <= diaFinNavidades) ) {
            
            tipoTemporada = EnumTemporadaPrecio.ALTA;
            return tipoTemporada;
        }

        //meses de temporada baja. Febrero y Noviembre
        int arrayTemporadaBaja[] ;
        arrayTemporadaBaja= new int[] {Calendar.FEBRUARY, Calendar.NOVEMBER};
        
        //Verificamos si el mes pertenece a la temporada Baja
        for (int i=0; i<arrayTemporadaBaja.length; i++) {
            if (fechaEntrada.get(Calendar.MONTH) == arrayTemporadaBaja[i]) {
                tipoTemporada = EnumTemporadaPrecio.BAJA;
                return tipoTemporada;
            }    
        }
        
        //meses de temporada alta. Abril, Agosto y Diciembre
        int arrayTemporadaAlta[] ;
        arrayTemporadaAlta = new int[] {Calendar.APRIL, Calendar.AUGUST, Calendar.DECEMBER};
        
        //Verificamos si el mes pertenece a la temporada Alta
        for (int i=0; i<arrayTemporadaAlta.length; i++) {
            if (fechaEntrada.get(Calendar.MONTH) == arrayTemporadaAlta[i]) {
                tipoTemporada = EnumTemporadaPrecio.ALTA;
                return tipoTemporada;
            }    
        }
        //si no es temporada Alta ni baja entonces es Media.
        return tipoTemporada;
    }

    /**
     *  Método para saber que tipo de cliente es: NINYO, ADULTO o SENIOR
     *  Importante para calcular la entrada General
     * 
     * @param persona
     * @return
     */
    public static EnumTipoCliente devolverTipoCliente(Persona persona) {

        EnumTipoCliente tipoCliente = null;
        int edad = persona.getEdad();
        
        if (edad >= EnumTipoCliente.BEBE.getEdadMin() 
            && edad <= EnumTipoCliente.BEBE.getEdadMax() ) {
            
            return EnumTipoCliente.BEBE;
        }
        if ( edad <= EnumTipoCliente.NINYO.getEdadMax() ) {
            return EnumTipoCliente.NINYO;
        }
        if ( (edad >= EnumTipoCliente.ADULTO.getEdadMin()) 
            && ( edad <= EnumTipoCliente.ADULTO.getEdadMax() ) ) {
            return EnumTipoCliente.ADULTO;
        }
        if ( edad >= EnumTipoCliente.SENIOR.getEdadMin()) {
            return EnumTipoCliente.SENIOR;
        } 
        return tipoCliente;
    }

    
}