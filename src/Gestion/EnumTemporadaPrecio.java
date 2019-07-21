package Gestion;


/**
 *
 * @author Bartolome Vich Lozano
 * @version 1.00 2019/5/17
 */

public enum EnumTemporadaPrecio {
    // Nombre del tipo temporada y porcentaje aplicado al precio.
    BAJA("Temporada Baja", -0.15F),
    MEDIA("Temporada Media", 0.00F),
    ALTA("Temporada Alta", 0.15F);
    private final String nombreTipoTemporada;
    private final float porcentaje;

    private EnumTemporadaPrecio(String nombreTipoTemporada, float porcentaje) {
        this.nombreTipoTemporada = nombreTipoTemporada;
        this.porcentaje = porcentaje;
    }

    public String getNombreTipoTemporada() {
        return nombreTipoTemporada;
    }

    public float getPorcentaje() {
        return porcentaje;
    }
    
}

    
 
