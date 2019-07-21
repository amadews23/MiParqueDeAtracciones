package Gestion;

/**
 *
 * @author Bartolome Vich Lozano
 * @version 1.00 2019/5/17
 */

public enum EnumClienteDescuentos {
    // Nombre del tipo de descuento aplicable.
    ESTUDIANTE("Estudiante", -0.1F),
    CARNE_JOVEN("Carné Joven", -0.1F),
    DISCAPACITADO("Diversidad Funcional", -0.2F),
    DESEMPLEADO("Desempleado", -0.1F);
    private final String nombreTipoDescuento;
    private final float descuento;

    private EnumClienteDescuentos(String nombreTipoDescuento, float descuento) {
        this.nombreTipoDescuento = nombreTipoDescuento;
        this.descuento = descuento;
    }

    public float getDescuento() {
        return descuento;
    }
}

    
 

