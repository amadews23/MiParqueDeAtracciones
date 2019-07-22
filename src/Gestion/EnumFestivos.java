package Gestion;

/**
 *
 * @author Bartolome Vich Lozano
 * @version 1.00 2019/5/17
 */

public enum EnumFestivos {
    //Festivos que estan entre Lunes y Jueves
    UNO_ENERO("Año Nuevo",1), //Martes
    DIECIOCHO_ABRIL("Jueves Santo",108), //Jueves
    VENTIDOS_ABRIL("Lunes de Pascua",112), //Lunes
    UNO_MAYO("Día del trabajador",121), //Miércoles
    QUINCE_AGOSTO("Día de la Asunción",227), //Jueves
    VENTICINCO_DICIEMBRE("Navidad",359), //Miércoles
    VENTISEIS_DICIEMBRE("Segunda Fiesta de Navidad",360); //Jueves

    private final String nombreFestivo;
    private final int diaDelAnyo;

    private EnumFestivos(String nombreFestivo, int diaDelAnyo) {
        this.nombreFestivo = nombreFestivo;
        this.diaDelAnyo = diaDelAnyo;
    }

    public String getNombreFestivo() {
        return nombreFestivo;
    }

    public int getDiaDelAnyo() {
        return diaDelAnyo;
    }


}

    
 
