package Gestion;
//import java.util.GregorianCalendar;
/**
 *
 * @author Bartolome Vich Lozano
 * @version 1.00 2019/5/17
 */

public enum EnumHorario {
    // Nombre del tipo de entrada, horario desde y horario hasta.
    GENERAL("Entrada General",9,00,21,00),
    TARDE("Entrada de Tarde",16,00,21,00);
    private final String nombreTipoHorario;
    private final int horaMin;
    private final int minutoMin;
    private final int horaMax;
    private final int minutoMax;

    private EnumHorario(String nombreTipoHorario, int horaMin, int minutoMin, int horaMax, int minutoMax) {
        this.nombreTipoHorario = nombreTipoHorario;
        this.horaMin = horaMin;
        this.minutoMin = minutoMin;
        this.horaMax = horaMax;
        this.minutoMax = minutoMax;
    }

    public String getNombreTipoHorario() {
        return nombreTipoHorario;
    }

    public int getHoraMin() {
        return horaMin;
    }

    public int getMinutoMin() {
        return minutoMin;
    }

    public int getHoraMax() {
        return horaMax;
    }

    public int getMinutoMax() {
        return minutoMax;
    }
    
}

    
 
