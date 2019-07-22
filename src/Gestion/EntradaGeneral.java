package Gestion;

import Gente.Cliente;
import java.util.GregorianCalendar;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;

/**
 *
 * @author Bartolome Vich Lozano
 * @version 1.10 2019/7/21
 */

public class EntradaGeneral extends Entrada {
    protected final EnumTemporadaPrecio tipoTemporada; 
    protected final EnumTipoCliente tipoCliente; 
    protected boolean esEstudiante; 
    protected boolean esDiscapacitado; 
    protected boolean esCarneJoven; 
    protected boolean esDesempleado; 
    protected float precio;

    /**
     *
     * @param fechaHoraEntrada
     * @param cliente
     * @param esVip
     */
    public EntradaGeneral(GregorianCalendar fechaHoraEntrada, 
                          Cliente cliente, 
                          boolean esVip) {
        
        super(fechaHoraEntrada, cliente, esVip);
            this.fechaHoraEntrada = fechaHoraEntrada;
            this.cliente = cliente;
            this.esVip = esVip;
            this.esEstudiante = cliente.isEsEstudiante();
            this.esDiscapacitado = cliente.isEsDiscapacitado();
            this.esCarneJoven = cliente.isEsCarnetJoven();
            this.esDesempleado = cliente.isEsDesempleado();
            
            this.tipoTemporada = CalculosFechas.devolverTemporada(fechaHoraEntrada);
            this.tipoCliente = CalculosFechas.devolverTipoCliente(cliente);
            this.precio = CalculosPrecios.calcularPrecioEntrada(PRECIO_BASE_ENTRADA,
                                                                tipoTemporada, 
                                                                tipoCliente,                                                   
                                                                esEstudiante,
                                                                esDiscapacitado,
                                                                esCarneJoven,
                                                                esDesempleado,
                                                                esVip,
                                                                PRECIO_BASE_VIP );
    }

    public boolean isEsEstudiante() {
        return esEstudiante;
    }

    public void setEsEstudiante(boolean esEstudiante) {
        this.esEstudiante = esEstudiante;
    }

    public boolean isEsDiscapacitado() {
        return esDiscapacitado;
    }

    public void setEsDiscapacitado(boolean esDiscapacitado) {
        this.esDiscapacitado = esDiscapacitado;
    }

    public boolean isEsCarneJoven() {
        return esCarneJoven;
    }

    public void setEsCarneJoven(boolean esCarneJoven) {
        this.esCarneJoven = esCarneJoven;
    }

    public boolean isEsDesempleado() {
        return esDesempleado;
    }

    public void setEsDesempleado(boolean esDesempleado) {
        this.esDesempleado = esDesempleado;
    }

    public GregorianCalendar getFechaHoraEntrada() {
        return fechaHoraEntrada;
    }

    public void setFechaHoraEntrada(GregorianCalendar fechaHoraEntrada) {
        this.fechaHoraEntrada = fechaHoraEntrada;
    }

    public boolean isEsVip() {
        return esVip;
    }

    public void setEsVip(boolean esVip) {
        this.esVip = esVip;
    }

    public EnumTemporadaPrecio getTipoTemporada() {
        return tipoTemporada;
    }

    public EnumTipoCliente getTipoCliente() {
        return tipoCliente;
    }

    public float getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        DecimalFormat formatoMoneda = new DecimalFormat("#.00 €");
        DecimalFormat formatoMonedaDescuentos = new DecimalFormat("#.0 €");
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MMMMMM/yyyy");
        String estudiante = "No";
        String discapacidad = "No";
        String carnetJoven = "No";
        String desempleado = "No";
        String vip = "No";
        String descuentoEstudiante =  "";
        String descuentoDiscapacidad = "";
        String descuentoCarnetJoven = "";
        String descuentoDesempleo = "";
        String descuento ="";
        String precioVip ="";
        float descuentoEdad = 0F;
        float precioTemporada = PRECIO_BASE_ENTRADA + (PRECIO_BASE_ENTRADA * tipoTemporada.getPorcentaje());
        
        if (tipoCliente.getDescuento() != 0) {
            //descuentoEdad = precioTemporada +( precioTemporada * tipoCliente.getDescuento());
            descuentoEdad = precioTemporada * tipoCliente.getDescuento();
      
        }
        
        float precioTipoCliente = precioTemporada - descuentoEdad;
                
        if ( esEstudiante == true) {
            estudiante = "Si";
            descuentoEstudiante = "\n Estudiante:    " + formatoMoneda.format(precioTipoCliente * EnumClienteDescuentos.ESTUDIANTE.getDescuento());
        }
        
        if ( esDiscapacitado == true) {
            discapacidad = "Si";
            descuentoDiscapacidad = "\n Discapacidad: " + formatoMonedaDescuentos.format(precioTipoCliente * EnumClienteDescuentos.DISCAPACITADO.getDescuento()); 
        }
        if ( esCarneJoven == true) {
            carnetJoven = "Si";
            descuentoCarnetJoven = "\n Carnet Joven:  " + formatoMonedaDescuentos.format(precioTipoCliente * EnumClienteDescuentos.CARNE_JOVEN.getDescuento());
        }
        if ( esDesempleado == true) {
            desempleado = "Si";
            descuentoDesempleo = "\n Desempleado:   " + formatoMonedaDescuentos.format(precioTipoCliente * EnumClienteDescuentos.DESEMPLEADO.getDescuento());
        }
        if ( esEstudiante == true || esDiscapacitado == true || esCarneJoven == true || esDesempleado == true ) {
            descuento="\n* Otros descuentos (aplicados sobre la entrada de un " + tipoCliente.getNombreTipoCliente() +") *";
        }
        if (esVip == true) {
            vip = "Si";
            precioVip = "\n* Precio VIP: " + (PRECIO_BASE_VIP + (PRECIO_BASE_VIP *  tipoCliente.getDescuento())) + " (Para " + tipoCliente.getNombreTipoCliente() + ")*";
        }
        
        return  "----------------------------------------------------------------------------\n"
                +"| Fecha: " + formatoFecha.format(fechaHoraEntrada.getTime()) + " - " +tipoTemporada.getNombreTipoTemporada() +" |"
                + "\n | Tipo Cliente: " + tipoCliente.getNombreTipoCliente() + " | VIP :" + vip + " |"
                +"\n | Estudiante: " 
                + estudiante + " | Discapacitado: " + discapacidad 
                + " | Carnet Joven: " + carnetJoven + " | Desempleado :"
                + desempleado + " |\n"
                + "\nPrecio Temporada: "+ formatoMoneda.format(precioTemporada)
                + "\nDescuento edad:  " + descuentoEdad +" €"
                + "\n* Precio Entrada: "+ formatoMoneda.format(precioTemporada + descuentoEdad) + " *"
                + descuento 
                + descuentoEstudiante
                + descuentoDiscapacidad
                + descuentoCarnetJoven
                + descuentoDesempleo
                + precioVip 
                +"\n----------------------------------------------------------------------------\n"
                +"PRECIO TOTAL: " + formatoMoneda.format(precio) +"\n"
                +"----------------------------------------------------------------------------\n";
   }
   
}
    
