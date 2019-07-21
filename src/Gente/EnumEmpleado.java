package Gente;

/**
 *
 * @author Bartolome Vich Lozano
 * @version 1.00 2019/5/21
 */

public enum EnumEmpleado {
    
    //Nombre del puesto y porcentaje sobre el sueldo base
    ATENCION("Atencion al cliente",0.15F),
    AYUDANTE("Ayudante de Atraccion",0F),
    RELACIONES("Realaciones publicas",0.2F),
    RESPONSABLE("Responsable de Atraccion",0.1F);
    
    final static float SUELDO_BASE = 950F; 
    private final String nombreEmpleo;
    private final float incrementoSueldo ;
    
    private EnumEmpleado(String nombreEmpleo, float incrementoSueldo) {
        this.nombreEmpleo = nombreEmpleo;
        this.incrementoSueldo = incrementoSueldo;
    }

    public String getNombreEmpleo() {
        return nombreEmpleo;
    }

    public float getIncrementoSueldo() {
        return incrementoSueldo;
    }
    
    public float obtenerSueldo() {
        return SUELDO_BASE+(incrementoSueldo*SUELDO_BASE);
    }
    
    
    
    
}
