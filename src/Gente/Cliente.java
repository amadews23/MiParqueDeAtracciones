package Gente;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
//import static Utilidades.Calculos.calcularEdad;

/**
 *
 * @author Bartolome Vich Lozano
 * @version 1.00 2019/5/17
 */

public class Cliente extends Persona{
    private int altura; //en centimetros
    private boolean esEstudiante;
    private boolean esDiscapacitado;
    private boolean esCarnetJoven;
    private boolean esDesempleado;

    public Cliente(int altura, boolean esEstudiante, boolean esDiscapacitado, boolean esCarnetJoven, boolean esDesempleado, String nombre, String apellidos, int diaNacimiento, int mesNacimiento, int anyoNacimiento) {
        super(nombre, apellidos, diaNacimiento, mesNacimiento, anyoNacimiento);
        this.altura = altura;
        this.esEstudiante = esEstudiante;
        this.esDiscapacitado = esDiscapacitado;
        this.esCarnetJoven = esCarnetJoven;
        this.esDesempleado = esDesempleado;
    }

    public Cliente(int altura, boolean esEstudiante, boolean esDiscapacitado, boolean esCarnetJoven, boolean esDesempleado, String nombre, String apellidos, GregorianCalendar fechaNacimiento) {
        super(nombre, apellidos, fechaNacimiento);
        this.altura = altura;
        this.esEstudiante = esEstudiante;
        this.esDiscapacitado = esDiscapacitado;
        this.esCarnetJoven = esCarnetJoven;
        this.esDesempleado = esDesempleado;
    }

 

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
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

    public boolean isEsCarnetJoven() {
        return esCarnetJoven;
    }

    public void setEsCarnetJoven(boolean esCarnetJoven) {
        this.esCarnetJoven = esCarnetJoven;
    }

    public boolean isEsDesempleado() {
        return esDesempleado;
    }

    public void setEsDesempleado(boolean esDesempleado) {
        this.esDesempleado = esDesempleado;
    }

    @Override
    public String toString() {
        
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MMMMMM/yyyy");
        String estudiante = "No";
        String carnetJoven = "No";
        String discapacitado = "No";
        String desempleado = "No";
        
        if (esEstudiante == true) {
            estudiante="Si";
        }
        
        if (esCarnetJoven == true) {
            carnetJoven="Si";
        }
        
        if (esDiscapacitado == true) {
            discapacitado="Si";
        }
        
        if (esDesempleado == true) {
            desempleado="Si";
        }
        return "\nCliente: " + nombre + " "+ apellidos
                + "\nFecha de Nacimiento: " + formatoFecha.format(fechaNacimiento.getTime())
                + "\n Estudiante: " + estudiante
                + "\n Discapacitado: " + discapacitado
                + "\n Carnet Joven: " + carnetJoven
                + "\n Desempleado: " + desempleado ;
    }
}
