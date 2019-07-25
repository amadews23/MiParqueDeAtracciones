package Controladores;

import Gente.Cliente;
import Gestion.CalculosFechas;
import Gestion.EntradaGeneral;
import Gestion.EntradaFamilia;
import Gestion.EntradaLaborable;
import Gestion.EntradaTarde;
import Gestion.EntradaAniversario;
import Gestion.EnumFestivos;
import Gestion.EnumHorario;
import Gestion.EnumTipoCliente;
import Gestion.ListaObjetos;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Bartolome Vich Lozano
 * @version 1.10 2019/7/24
 */
public class ControladorPrincipal {
    private ListaObjetos listaObjetos;
    private final ControladorEntradaGeneral controladorEntradaGeneral;
    private final ControladorEntradaFamilia controladorEntradaFamilia;
    private final ControladorEntradaTarde controladorEntradaTarde;
    private final ControladorEntradaLaborable controladorEntradaLaborable;
    private final ControladorEntradaAniversario controladorEntradaAniversario;
    private final GregorianCalendar fechaHoraHoy;
    private final ControladorCliente controladorCliente;
    private EnumTipoCliente tipoCliente;

    
    public ControladorPrincipal(ListaObjetos listaObjetos) {
        this.listaObjetos = listaObjetos;
        this.controladorEntradaGeneral = new ControladorEntradaGeneral();
        this.controladorEntradaFamilia  = new ControladorEntradaFamilia();
        this.controladorEntradaTarde = new ControladorEntradaTarde();
        this.controladorEntradaLaborable = new ControladorEntradaLaborable();
        this.controladorEntradaAniversario = new ControladorEntradaAniversario();
        this.fechaHoraHoy = new GregorianCalendar();
        this.controladorCliente = new ControladorCliente();
        

    }
    
    private boolean preguntarSonUstedesFamilia() {
        int seleccion = 0;
        //Preguntamos si cumplen para poder ofrecer la entrada Familiar.
        System.out.println("¿Son ustedes 2 niños y 2 adultos?\n Pulse 1 para (Si)");
        seleccion = Utilidades.Varios.pedirOpcion();
       
        if (seleccion == 1) {  
            return true;
        } 
        return false;
    }
    
    private boolean comprobarHoyEsFestivo() {
        //Comprobamos si hoy es festivo.
        for (EnumFestivos festivos : EnumFestivos.values()) {

            if (festivos.getDiaDelAnyo() == fechaHoraHoy.get(Calendar.DAY_OF_YEAR)) {
                System.out.println("Hoy es " + festivos.getNombreFestivo());
                return true;
            }
        } 
        return false;
    }
    
    private boolean comprobarHoyNoEsFestivoSiLaboral() {
         //Comprobamos si hoy es laborable y no festivo.
        if (fechaHoraHoy.get(Calendar.DAY_OF_WEEK) < 6 
                                && fechaHoraHoy.get(Calendar.DAY_OF_WEEK) > 1 
                                && comprobarHoyEsFestivo() == false) {
            return true;
        }
        return false;
    }
    
    private boolean esHorarioDeTarde() {
        //Si es más tarde del horario de Tarde: podemos ofrecer la entrada de tarde
        //TODO horario maximo
        if (fechaHoraHoy.get(Calendar.HOUR_OF_DAY) >= EnumHorario.TARDE.getHoraMin()) {
            return true;
        }
        return false;
    }
    
    private boolean preguntarHoyEsSuCumpleanyos() {
        //Preguntamos al cliente si cumple años, para ofrecer la entrada Aniversario
        int seleccion = 0;
        System.out.println("¿Es hoy su cumpleaños?\n Pulse 1 para (Si) ");
        seleccion = Utilidades.Varios.pedirOpcion();
        if (seleccion == 1) {
            return true;
        }
        return false;
    }
    
    private ArrayList <String> crearListaEntradas() {
               
        //boolean festivoLaboral = false;
        //boolean familia = false;
        
        //Creamos la lista de las entradas que se pueden vender en el dia de hoy.
        ArrayList <String> listaEntradasPosibles = new ArrayList<>();
        
        //La EntradaGeneral siempre está disponible.
        listaEntradasPosibles.add("General");
        
        //Preguntamos sin son familia (2 Adultos (ADULTO y/o SENIOR y 2 NINYOS).
        if( preguntarSonUstedesFamilia() == true) {
            listaEntradasPosibles.add("Familiar");
        }
        //Comprobamos que hoy se laborable y NO festivo.
        if (comprobarHoyNoEsFestivoSiLaboral() == true) {
            listaEntradasPosibles.add("Laborable");
        }
        //Comprobamos si estamos en horario de tarde
        if (esHorarioDeTarde() == true) {
            listaEntradasPosibles.add("Tarde");         
        }
        if (preguntarHoyEsSuCumpleanyos() == true) {
            listaEntradasPosibles.add("Aniversario");

        }
        return listaEntradasPosibles;
    }
    
    //Crea un ArrayList de una familia, si no cumplen la condición del enunciado
    //Devuelve null
    private ArrayList<Cliente> devolverFamilia() {
        int clientesTipo = 2;
        ArrayList <Cliente> familia = new ArrayList<>();
        
        //Recorremos para cuatro integrantes de una familia
        for (int i=0; i < 4 ;i++) {
            
            Cliente cliente = controladorCliente.crearCliente();
            
            if ((CalculosFechas.devolverTipoCliente(cliente) == EnumTipoCliente.ADULTO) 
                || (CalculosFechas.devolverTipoCliente(cliente) == EnumTipoCliente.SENIOR)) {

                clientesTipo ++;
                
                familia.add(cliente);
                
            }
            
            if (CalculosFechas.devolverTipoCliente(cliente) == EnumTipoCliente.NINYO) {
                
                familia.add(cliente);
                
            }
            
            if (CalculosFechas.devolverTipoCliente(cliente) == EnumTipoCliente.BEBE) {
                clientesTipo --;
                //Si hay un BEBE ya no cumplen la condición
                return null;
            }
        }
        //Adulto (SENIOR o ADULTO) vale 1 y NINYO 0 y BEBE -1
        //Por lo tanto si clientesTipo vale 4 pueden comprar la EntradaFamiliar 
        if (clientesTipo == 4) {
            return familia;
        }
        
        return null;
    }
    
    private boolean esCumpleanyos(GregorianCalendar fechaNacimiento) {
        if ((fechaHoraHoy.get(Calendar.DAY_OF_MONTH) == fechaNacimiento.get(Calendar.DAY_OF_MONTH)) 
                     && (fechaHoraHoy.get(Calendar.MONTH) == fechaNacimiento.get(Calendar.MONTH))) {

                        return true;
        }
        return false;
    }
        
    public void venderEntradas() {
        
        ArrayList <String> listaEntradasPosibles = crearListaEntradas();
        int seleccion;
        
        System.out.println("\nLista de Tipos de entrada:");
        System.out.println("----------------------------");
            for (int i=0; i < listaEntradasPosibles.size(); i++) {
            System.out.println(i+"-"+listaEntradasPosibles.get(i));
        }
            
        System.out.println("Seleccione el número de tipo de Entrada:");
        seleccion = Utilidades.Varios.pedirOpcion();
        try {
            
            if ("General".equals(listaEntradasPosibles.get(seleccion))) {
                System.out.println("Ha elegido la entrada General");

                EntradaGeneral entradaGeneral = controladorEntradaGeneral.crearEntrada(fechaHoraHoy);
                System.out.println("----------------------------------------------------------------------------");
                System.out.println("ENTRADA GENERAL");
                System.out.println(entradaGeneral.toString());
                
                listaObjetos.anyadirEntrada(entradaGeneral);
            }

            if ("Familiar".equals(listaEntradasPosibles.get(seleccion))) {
                System.out.println("Ha elegido la entrada Familiar");          

                ArrayList <Cliente> familia = devolverFamilia();
                if (familia != null) {
                
                    for (Cliente cliente: familia) {
                        EntradaFamilia entradaFamilia = controladorEntradaFamilia.crearEntrada(cliente, fechaHoraHoy);
                        System.out.println("----------------------------------------------------------------------------");
                        System.out.println("ENTRADA FAMILIA ¡VIP Gratis! y muchas más ventajas.");
                        System.out.println(entradaFamilia.toString());
                        
                        listaObjetos.anyadirEntrada(entradaFamilia);
                    }

                } else {
                    System.out.println("Esta familia no está formada por 2 adultos y dos niños");
                }
            }
            
            if ("Laborable".equals(listaEntradasPosibles.get(seleccion))) {
                System.out.println("Ha elegido la entrada Laborable");
                
                EntradaLaborable entradaLaborable = controladorEntradaLaborable.crearEntrada(fechaHoraHoy);
                System.out.println("----------------------------------------------------------------------------");
                System.out.println("ENTRADA LABORABLE ");
                System.out.println(entradaLaborable.toString());
                
                listaObjetos.anyadirEntrada(entradaLaborable);
            }
            
            if ("Tarde".equals(listaEntradasPosibles.get(seleccion))) {
                System.out.println("Ha elegido la entrada de Tarde");
                
                EntradaTarde entradaTarde = controladorEntradaTarde.crearEntrada(fechaHoraHoy);
                System.out.println("----------------------------------------------------------------------------");
                System.out.println("ENTRADA DE TARDE ");
                System.out.println(entradaTarde.toString());
                
                listaObjetos.anyadirEntrada(entradaTarde);
            }
            
            if ("Aniversario".equals(listaEntradasPosibles.get(seleccion))) {
                System.out.println("Ha elegido la entrada Aniversario");
                Cliente cliente = controladorCliente.crearCliente();
                
                //Comprobamos que la fecha introducida sea la del cumpleaños
                if (esCumpleanyos(cliente.getFechaNacimiento()) == true) {
                    System.out.println("¡Feliz cumpleaños!");
                    EntradaAniversario entradaAniversario = controladorEntradaAniversario.crearEntrada(cliente, fechaHoraHoy);
                    System.out.println("----------------------------------------------------------------------------");
                    System.out.println("ENTRADA ANIVERSARIO");
                    System.out.println(entradaAniversario.toString());
                    
                    listaObjetos.anyadirEntrada(entradaAniversario);
                    
                } else {
                    System.out.println("Hoy no es su cumpleaños, elija otro tipo de entrada");
                }
            }
            
        } catch (IndexOutOfBoundsException e) {
            System.out.println("ERROR: No ha elejido una opción válida,\n vuelva a intentarlo");
            
        }
        
    }
}
