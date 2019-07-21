package Gestion;

/**
 *
 * @author Bartolome Vich Lozano
 * @version 1.00 2019/7/21
 */

public enum EnumTipoCliente {
    
    // Nombre del tipo de cliente, edad mínima y máxima, y el descuento/precio aplicado.
    // Bebé tiene el 100% de descuento osea gratis.
    BEBE("Bebé", 0, 2, -1.0F),
    NINYO("Niño", 3, 12, -0.50F),
    ADULTO("Adulto", 13, 64, 0F),
    SENIOR("Senior", 65, 120, -0.35F);
    private final String nombreTipoCliente;
    private final int edadMin;
    private final int edadMax;
    private final float descuento;

    private EnumTipoCliente(String nombreTipoCliente, 
                            int edadMin, 
                            int edadMax, 
                            float descuento) {
        
        this.nombreTipoCliente = nombreTipoCliente;
        this.edadMin = edadMin;
        this.edadMax = edadMax;
        this.descuento = descuento;
    }

    public String getNombreTipoCliente() {
        return nombreTipoCliente;
    }

    public int getEdadMin() {
        return edadMin;
    }

    public int getEdadMax() {
        return edadMax;
    }

    public float getDescuento() {
        return descuento;
    }


}

    
 

