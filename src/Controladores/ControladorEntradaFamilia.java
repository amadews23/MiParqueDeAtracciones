package Controladores;

import Gente.Cliente;
import Gestion.EntradaFamilia;
import java.util.GregorianCalendar;
/**
 *
 * @author Bartolome Vich Lozano
 * @version 1.10 2019/7/23
 */
public class ControladorEntradaFamilia {

    public ControladorEntradaFamilia() {
    }
    //Estas entradas son bonificadas si son 2 Adultos (SENIOR y/o ADULTOS)
    //y 2 NINYOS, deberán ser 4 Entradas y antes se debe verificar que cumplen
    //la restricción. Entrada con VIP Gratis-
    public EntradaFamilia crearEntrada(Cliente cliente, 
                                       GregorianCalendar fechaHoraHoy) {
        boolean vip = true;
        EntradaFamilia entradaFamiliar = new EntradaFamilia(fechaHoraHoy, 
                                                            cliente, 
                                                            vip);
        return entradaFamiliar;
    }
}
