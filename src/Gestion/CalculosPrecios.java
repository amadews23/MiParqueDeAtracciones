package Gestion;

/**
 * Métodos útiles para el cálculo de precios de entradas
 * 
 * @author Bartolome Vich Lozano
 * @version 1.10 2019/7/21
 */

public class CalculosPrecios {
    
    private static float calcularEntrada(float precioBase, 
                                        EnumTemporadaPrecio tipoTemporada,
                                        EnumTipoCliente tipoCliente,
                                        boolean esEstudiante,
                                        boolean esDiscapacitado,
                                        boolean esCarneJoven,
                                        boolean esDesempleado,
                                        boolean esVip,
                                        float precioVip ) {
       
        float precioEntradaTemporada;
        float descuentoEdad ;
        float descuentoEstudiante = 0.0F;
        float descuentoDiscapacitado = 0.0F;
        float descuentoCarneJoven = 0.0F;
        float descuentoDesempleado = 0.0F;
        float precioEntradaEdad;
        float precioEntradaFinal;
        
        //Aplicamos el precio según temporada
        precioEntradaTemporada = precioBase + (precioBase * tipoTemporada.getPorcentaje());
        
        //Cálculo del descuento de la edad
        descuentoEdad = precioEntradaTemporada * tipoCliente.getDescuento();
        
        //Asignamos el precio según temporada y edad
        precioEntradaEdad = precioEntradaTemporada + descuentoEdad;
        
        //Calculamos el resto de descuentos, en base al precio de la entrada según edad
        if (esEstudiante == true) {
            descuentoEstudiante = precioEntradaEdad * EnumClienteDescuentos.ESTUDIANTE.getDescuento();
        }
        if (esDiscapacitado == true) {
            descuentoDiscapacitado = precioEntradaEdad * EnumClienteDescuentos.DISCAPACITADO.getDescuento();
        }
        if (esCarneJoven == true) {
            descuentoCarneJoven = precioEntradaEdad * EnumClienteDescuentos.CARNE_JOVEN.getDescuento();
        }
        if (esDesempleado == true) {
            descuentoDesempleado = precioEntradaEdad * EnumClienteDescuentos.DESEMPLEADO.getDescuento();
        }

        //Comprobamos si paga suplemento VIP
        if (tipoCliente.getDescuento() != 0) {
            precioVip = precioVip + (precioVip *  tipoCliente.getDescuento());
                //tipoCli.getDescuento());
        }
        if (esVip == false) {
            precioVip = 0.0F;
        }
        
        //System.out.println(precioVip);
        //Sumamos todo
        precioEntradaFinal = precioEntradaEdad +
                        descuentoEstudiante + 
                        descuentoDiscapacitado + 
                        descuentoCarneJoven + 
                        descuentoDesempleado + 
                        precioVip;
  

        return precioEntradaFinal;    
        

    }
    /**
     * Método para calcular el precio de la entrada General
     * calcularPrecioEntradaGeneral
     *
     * @param precioBaseEntrada
     * @param tipoTemporada
     * @param tipoCliente 
     * @param esEstudiante
     * @param esDiscapacitado
     * @param esCarneJoven
     * @param precioVip
     * @param esVip
     * @param esDesempleado
     * @return 
     */
    public static float calcularPrecioEntrada(float precioBaseEntrada,
                                                   EnumTemporadaPrecio tipoTemporada, 
                                                   EnumTipoCliente tipoCliente,                                                   
                                                   boolean esEstudiante,
                                                   boolean esDiscapacitado,
                                                   boolean esCarneJoven,
                                                   boolean esDesempleado,
                                                   boolean esVip,
                                                   float precioVip ) {
        
        float precioEntrada ; 
        
        precioEntrada = calcularEntrada(precioBaseEntrada,
                                        tipoTemporada, 
                                        tipoCliente,                                                   
                                        esEstudiante,
                                        esDiscapacitado,
                                        esCarneJoven,
                                        esDesempleado,
                                        esVip,
                                        precioVip );

        return precioEntrada;
        
    }
}