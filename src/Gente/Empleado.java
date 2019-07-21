package Gente;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
/**
 *
 * @author Bartolome Vich Lozano
 * @version 1.10 2019/7/21
 */

public class Empleado extends Persona {
  
    private final EnumEmpleado tipoEmpleado;
    private int dni;
    private final float sueldo;

    /**
     *
     * @param tipoEmpleado
     * @param dni
     * @param nombre
     * @param apellidos
     * @param fechaNacimiento
     */
    public Empleado(EnumEmpleado tipoEmpleado, 
                    int dni, 
                    String nombre, 
                    String apellidos, 
                    GregorianCalendar fechaNacimiento) {
        
        super(nombre, apellidos, fechaNacimiento);
        this.tipoEmpleado = tipoEmpleado;
        this.dni = dni;
        this.sueldo = tipoEmpleado.obtenerSueldo();
    }

    /**
     *
     * @param tipoEmpleado
     * @param dni
     * @param nombre
     * @param apellidos
     * @param diaNacimiento
     * @param mesNacimiento
     * @param anyoNacimiento
     */
    public Empleado(EnumEmpleado tipoEmpleado, 
                    int dni, 
                    String nombre, 
                    String apellidos, 
                    int diaNacimiento, 
                    int mesNacimiento, 
                    int anyoNacimiento) {
        
        super(nombre, apellidos, diaNacimiento, mesNacimiento, anyoNacimiento);
        this.tipoEmpleado = tipoEmpleado;
        this.dni = dni;
        this.sueldo = tipoEmpleado.obtenerSueldo();
    }


    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }
  
    
    public float getSueldo() {
        return sueldo;
    }

    public EnumEmpleado getTipoEmpleado() {
        return tipoEmpleado;
    }

    @Override
    public String toString() {
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MMMMMM/yyyy");

        return "\n Puesto: " + tipoEmpleado.getNombreEmpleo() + " Sueldo: " + sueldo
               +"\n Nombre: " + nombre + " " + apellidos + " DNI:" + dni 
               + " Fecha de Nacimiento: " + formatoFecha.format(fechaNacimiento.getTime())
               +"\n" ;
  
    }
    

   
}
