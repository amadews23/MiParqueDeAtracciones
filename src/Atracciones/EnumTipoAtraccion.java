package Atracciones;

/**
 *
 * @author Bartolome Vich Lozano
 * @version 1.10 2019/7/21

 */
public enum EnumTipoAtraccion {

    //Cuando altura es 0 es que no hay limitación
    TIPO_A("Atracción Tipo A",true,true,120,0,true,6,1,2,1),
    TIPO_B("Atracción Tipo B",true,false,120,190,false,5,1,2,1),
    TIPO_C("Atracción Tipo C",false,true,0,120,false,3,1,1,1),
    TIPO_D("Atracción Tipo D",true,true,0,0,true,3,1,2,1), 
    TIPO_E("Atracción Tipo E",true,false,0,0,true,7,1,2,1) ;     
    
    String nombreTipotraccion;
    private final boolean admiteAdultos;
    private final boolean admiteNinyos;
    private final int alturaMin;
    private final int alturaMax;
    private final boolean admiteVip;
    private final int numEmpleadosAyudantes;
    private final int numEmpleadosResponsables;
    private final int numEmpleadosAtenciones;
    private final int numEmpleadosRelaciones;

    private EnumTipoAtraccion(String nombreTipotraccion, 
                              boolean admiteAdultos, 
                              boolean admiteNinyos, 
                              int alturaMin, 
                              int alturaMax, 
                              boolean admiteVip, 
                              int numEmpleadosAyudantes,
                              int numEmpleadosResponsables,
                              int numEmpleadosAtenciones,
                              int numEmpleadosRelaciones) {
        
        this.nombreTipotraccion = nombreTipotraccion;
        this.admiteAdultos = admiteAdultos;
        this.admiteNinyos = admiteNinyos;
        this.alturaMin = alturaMin;
        this.alturaMax = alturaMax;
        this.admiteVip = admiteVip;
        this.numEmpleadosAyudantes = numEmpleadosAyudantes;
        this.numEmpleadosResponsables = numEmpleadosResponsables;
        this.numEmpleadosAtenciones = numEmpleadosAtenciones;
        this.numEmpleadosRelaciones = numEmpleadosRelaciones;
    }

    public String getNombreTipotraccion() {
        return nombreTipotraccion;
    }

    public boolean isAdmiteAdultos() {
        return admiteAdultos;
    }

    public boolean isAdmiteNinyos() {
        return admiteNinyos;
    }

    public int getAlturaMin() {
        return alturaMin;
    }

    public int getAlturaMax() {
        return alturaMax;
    }

    public boolean isAdmiteVip() {
        return admiteVip;
    }

    public int getNumEmpleadosAyudantes() {
        return numEmpleadosAyudantes;
    }

    public int getNumEmpleadosResponsables() {
        return numEmpleadosResponsables;
    }

    public int getNumEmpleadosAtenciones() {
        return numEmpleadosAtenciones;
    }

    public int getNumEmpleadosRelaciones() {
        return numEmpleadosRelaciones;
    }

    @Override
    public String toString() {
        
        String adultos = "No";
        String ninyos = "No";
        String vip = "No";
        String alturaMinima ;
        String alturaMaxima ;
        
        if (admiteAdultos == true ) {
            
            adultos = "Si";
            
        }
        if (admiteNinyos == true ) {
            
            ninyos = "Si";
            
        }
        if (admiteVip == true ) {
            
            vip = "Si";
            
        }
        if (alturaMin == 0) {
            
            alturaMinima="Sin restricción";
            
        } else {
            
            alturaMinima=alturaMin+" centimetros";
        }
        if (alturaMax == 0) {
            
            alturaMaxima="Sin restricción";
            
        } else {
            
            alturaMaxima=alturaMax+" centimetros";
            
        }
        return nombreTipotraccion 
                + "\n -"+ adultos + " admite adultos, "  
                +  ninyos + " admite niños "
                + ", Altura mínima: " + alturaMinima
                + ", Altura máxima: " + alturaMaxima
                + ", " + vip + " admite vip. " 
                + "\nPersonal necesario para funcionar:\n"
                + " Ayudantes: " + numEmpleadosAyudantes 
                + ", Responsables: " + numEmpleadosResponsables 
                + ", Atencion al cliente: " + numEmpleadosAtenciones 
               + ", Relaciones públicas: " + numEmpleadosRelaciones +".\n" ;
    }

    
}
