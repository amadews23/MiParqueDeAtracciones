package Controladores;

import Atracciones.Atraccion;
import Gente.Cliente;
import Gente.Empleado;
import Gente.EnumTipoEmpleado;
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
import Utilidades.Varios;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Bartolome Vich Lozano
 * @version 1.10 2019/7/26
 */
public class ControladorPrincipal {
    private ListaObjetos listaObjetos;
    private final ControladorAtraccion controladorAtraccion;
    private final ControladorEntradaGeneral controladorEntradaGeneral;
    private final ControladorEntradaFamilia controladorEntradaFamilia;
    private final ControladorEntradaTarde controladorEntradaTarde;
    private final ControladorEntradaLaborable controladorEntradaLaborable;
    private final ControladorEntradaAniversario controladorEntradaAniversario;
    private final GregorianCalendar fechaHoraHoy;
    private final ControladorCliente controladorCliente;
    private final ControladorEmpleado controladorEmpleado;
    private EnumTipoCliente tipoCliente;

    
    public ControladorPrincipal(ListaObjetos listaObjetos) {
        this.listaObjetos = listaObjetos;
        this.controladorAtraccion = new ControladorAtraccion();
        this.controladorEntradaGeneral = new ControladorEntradaGeneral();
        this.controladorEntradaFamilia  = new ControladorEntradaFamilia();
        this.controladorEntradaTarde = new ControladorEntradaTarde();
        this.controladorEntradaLaborable = new ControladorEntradaLaborable();
        this.controladorEntradaAniversario = new ControladorEntradaAniversario();
        this.fechaHoraHoy = new GregorianCalendar();
        this.controladorCliente = new ControladorCliente();
        this.controladorEmpleado = new ControladorEmpleado();
        

    }
     /**
     * Método que manda crear una atracción y la inserta en la lista
     * de atracciones
     */
    public void insertarAtraccion() {
        Atraccion atraccion = controladorAtraccion.crearAtraccion();
        if (atraccion != null) {
            listaObjetos.anyadirAtraccion(atraccion);
            System.out.println("Atracción creada correctamente");
        }
    }
    
    /**
     *
     */
    public void listarAtracciones() {
        System.out.println(listaObjetos.getListaAtracciones());
    }
    
    //lista simple para eliminar o modificar
    public void mostrarAtracciones() {
        
        for (int i=0; i< listaObjetos.getListaAtracciones().size(); i++) {
            System.out.println(i+ "- " + listaObjetos.getListaAtracciones().get(i).getNombreAtraccion() 
                    + ", " + listaObjetos.getListaAtracciones().get(i).getTipoAtraccion().getNombreTipotraccion());
        } 
    }
    
    public void quitarAtraccion( int nAtraccion) {
        listaObjetos.quitarAtraccion(nAtraccion);
    }
    
    //De la lista de Objetos
    private void mostrarEmpleados (EnumTipoEmpleado tipoEmpleado){
        System.out.println("Lista de Empleados");
        
        if (tipoEmpleado == EnumTipoEmpleado.ATENCION) {
            for (int i = 0; i < listaObjetos.getListaEmpleadosAtencion().size(); i ++) {
                System.out.println(i + "-" + listaObjetos.getListaEmpleadosAtencion().get(i).getNombre()
                                + " " + listaObjetos.getListaEmpleadosAtencion().get(i).getApellidos()
                                + " Dni " + listaObjetos.getListaEmpleadosAtencion().get(i).getDni());
            }
        }
        if (tipoEmpleado == EnumTipoEmpleado.AYUDANTE) {
            for (int i = 0; i < listaObjetos.getListaEmpleadosAyudante().size(); i ++) {
                System.out.println(i + "-" + listaObjetos.getListaEmpleadosAyudante().get(i).getNombre()
                                + " " + listaObjetos.getListaEmpleadosAyudante().get(i).getApellidos()
                                + " Dni " + listaObjetos.getListaEmpleadosAyudante().get(i).getDni());
            }
            
        }
        if (tipoEmpleado == EnumTipoEmpleado.RELACIONES) {
            for (int i = 0; i < listaObjetos.getListaEmpleadosRelaciones().size(); i ++) {
                System.out.println(i + "-" + listaObjetos.getListaEmpleadosRelaciones().get(i).getNombre()
                                + " " + listaObjetos.getListaEmpleadosRelaciones().get(i).getApellidos()
                                + " Dni " + listaObjetos.getListaEmpleadosRelaciones().get(i).getDni());
            }
        }   
        if (tipoEmpleado == EnumTipoEmpleado.RESPONSABLE) {
            for (int i = 0; i < listaObjetos.getListaEmpleadosResponsable().size(); i ++) {
                System.out.println(i + "-" + listaObjetos.getListaEmpleadosResponsable().get(i).getNombre()
                                + " " + listaObjetos.getListaEmpleadosResponsable().get(i).getApellidos()
                                + " Dni " + listaObjetos.getListaEmpleadosResponsable().get(i).getDni());
            }
        }          
    }
    
    //lista simple para eliminar o modificar
    private void mostrarAtraccionesDisponibles(EnumTipoEmpleado tipoEmpleado) {

        if (tipoEmpleado == EnumTipoEmpleado.ATENCION) {
            for (int i=0; i< listaObjetos.getListaAtracciones().size(); i++) {
                if (listaObjetos.getListaAtracciones().get(i).getListaEmpleadosAtenciones().size() < listaObjetos.getListaAtracciones().get(i).getTipoAtraccion().getNumEmpleadosAtenciones()) {
                    System.out.println(i+ "-" + "Nombre: " + listaObjetos.getListaAtracciones().get(i).getNombreAtraccion() 
                    + ", Tipo:" + listaObjetos.getListaAtracciones().get(i).getTipoAtraccion().getNombreTipotraccion());
                }   
            }
        } 
        if (tipoEmpleado == EnumTipoEmpleado.AYUDANTE) {
            for (int i=0; i< listaObjetos.getListaAtracciones().size(); i++) {
                if (listaObjetos.getListaAtracciones().get(i).getListaEmpleadosAyudantes().size() < listaObjetos.getListaAtracciones().get(i).getTipoAtraccion().getNumEmpleadosAyudantes()) {
                    System.out.println(i+ "-" + "Nombre: " + listaObjetos.getListaAtracciones().get(i).getNombreAtraccion() 
                    + ", Tipo:" + listaObjetos.getListaAtracciones().get(i).getTipoAtraccion().getNombreTipotraccion());
                }   
            }
        } 
        if (tipoEmpleado == EnumTipoEmpleado.RELACIONES) {
            for (int i=0; i< listaObjetos.getListaAtracciones().size(); i++) {
                if (listaObjetos.getListaAtracciones().get(i).getListaEmpleadosRelaciones().size() < listaObjetos.getListaAtracciones().get(i).getTipoAtraccion().getNumEmpleadosRelaciones()) {
                    System.out.println(i+ "-" + "Nombre: " + listaObjetos.getListaAtracciones().get(i).getNombreAtraccion() 
                    + ", Tipo:" + listaObjetos.getListaAtracciones().get(i).getTipoAtraccion().getNombreTipotraccion());
                }   
            }
        }  
        if (tipoEmpleado == EnumTipoEmpleado.RESPONSABLE) {
            for (int i=0; i< listaObjetos.getListaAtracciones().size(); i++) {
                if (listaObjetos.getListaAtracciones().get(i).getListaEmpleadosResponsables().size() < listaObjetos.getListaAtracciones().get(i).getTipoAtraccion().getNumEmpleadosResponsables()) {
                    System.out.println(i+ "-" + "Nombre: " + listaObjetos.getListaAtracciones().get(i).getNombreAtraccion() 
                    + ", Tipo:" + listaObjetos.getListaAtracciones().get(i).getTipoAtraccion().getNombreTipotraccion());
                }   
            }
        }
    } 
    
    public void asignarEmpleadoAtraccion() {
        
        int opcion = 0;
        int nEmpleado = 0;
        int nAtraccion = 0;
        
        do { opcion = Varios.pedirOpcion();
        
            switch (opcion) {
                case 1:
                    System.out.println("Empleado Atención al Cliente:");
                    System.out.println("-------------------------------------\n");       
                    mostrarEmpleados(EnumTipoEmpleado.ATENCION);
                    System.out.println("\nSeleccione el número de empleado");

                        try {
                        nEmpleado = Varios.pedirOpcion();
                        Empleado empleado;
                        empleado = listaObjetos.getListaEmpleadosAtencion().get(nEmpleado);
                        System.out.println("\n Lista de atracciones disponibles:");
                        mostrarAtraccionesDisponibles(EnumTipoEmpleado.ATENCION);  
                        System.out.println("\n Seleccione la atraccion");
                        nAtraccion = Varios.pedirOpcion();
                        
                        if (listaObjetos.getListaAtracciones().get(nAtraccion).getListaEmpleadosAtenciones().size() 
                                >= listaObjetos.getListaAtracciones().get(nAtraccion).getTipoAtraccion().getNumEmpleadosAtenciones()) {
                            
                            System.out.println("No hay puestos disponibles");
                        } else {
                            
                            controladorAtraccion.anyadirEmpleado(listaObjetos.getListaAtracciones().get(nAtraccion),
                                                                 empleado);
                            
                            System.out.println("El empleado se agregó correctamente");
                        }
                        } catch (IndexOutOfBoundsException e) {
                            System.out.println("ERROR: No es un número correcto");                            
                        } 
                    break;
                case 2:
                    System.out.println("Empleado Ayudante de Atracción:");
                    System.out.println("---------------------------------------\n");                    
                    mostrarEmpleados(EnumTipoEmpleado.AYUDANTE);
                    System.out.println("\nSeleccione el número de empleado");

                    try {
                        nEmpleado = Varios.pedirOpcion();
                        Empleado empleado;
                        empleado = listaObjetos.getListaEmpleadosAyudante().get(nEmpleado);
                        System.out.println("\n Lista de atracciones disponibles:");
                        mostrarAtraccionesDisponibles(EnumTipoEmpleado.AYUDANTE);  
                        System.out.println("\n Seleccione la atraccion");
                        nAtraccion = Varios.pedirOpcion();
                        if (listaObjetos.getListaAtracciones().get(nAtraccion).getListaEmpleadosAyudantes().size() 
                                >= listaObjetos.getListaAtracciones().get(nAtraccion).getTipoAtraccion().getNumEmpleadosAyudantes()) {
                            
                            System.out.println("No hay puestos disponibles");
                        } else {
                            controladorAtraccion.anyadirEmpleado(listaObjetos.getListaAtracciones().get(nAtraccion),
                                                                 empleado);
                            System.out.println("El empleado se agregó correctamente");
                        }
                        } catch (IndexOutOfBoundsException e) {
                            System.out.println("ERROR: No es un número correcto");                            
                        } 
                    
                    break;
                case 3:
                    System.out.println("Empleado Relaciones Públicas:");
                    System.out.println("-------------------------------------\n");                    
                    mostrarEmpleados(EnumTipoEmpleado.RELACIONES);
                    System.out.println("\nSeleccione el número de empleado");
                    try {
                        nEmpleado = Varios.pedirOpcion();
                        Empleado empleado;
                        empleado = listaObjetos.getListaEmpleadosRelaciones().get(nEmpleado);
                        System.out.println("\n Lista de atracciones disponibles:");
                        mostrarAtraccionesDisponibles(EnumTipoEmpleado.RELACIONES);  
                        System.out.println("\n Seleccione la atraccion");
                        nAtraccion = Varios.pedirOpcion();
                        if (listaObjetos.getListaAtracciones().get(nAtraccion).getListaEmpleadosRelaciones().size() 
                                >= listaObjetos.getListaAtracciones().get(nAtraccion).getTipoAtraccion().getNumEmpleadosRelaciones()) {
                            
                            System.out.println("No hay puestos disponibles");          
                        } else {
                            controladorAtraccion.anyadirEmpleado(listaObjetos.getListaAtracciones().get(nAtraccion),
                                                                 empleado);
                            System.out.println("El empleado se agregó correctamente");
                        }    
                        } catch (IndexOutOfBoundsException e) {
                            System.out.println("ERROR: No es un número correcto");                            
                        } 
                    break;
                case 4:
                    System.out.println("Empleado Responsable de Atracción:");
                    System.out.println("-------------------------------------------\n");                    
                    mostrarEmpleados(EnumTipoEmpleado.RESPONSABLE);
                    System.out.println("\nSeleccione el número de empleado");
                    //Enviamos el empleado a la funcion
                    try {
                        nEmpleado = Varios.pedirOpcion();
                        Empleado empleado;
                        empleado = listaObjetos.getListaEmpleadosResponsable().get(nEmpleado);
                        System.out.println("\n Lista de atracciones disponibles:");
                        mostrarAtraccionesDisponibles(EnumTipoEmpleado.RESPONSABLE);  
                        System.out.println("\n Seleccione la atraccion");
                        nAtraccion = Varios.pedirOpcion();
                        if (listaObjetos.getListaAtracciones().get(nAtraccion).getListaEmpleadosResponsables().size() 
                                >= listaObjetos.getListaAtracciones().get(nAtraccion).getTipoAtraccion().getNumEmpleadosResponsables()) {
                            System.out.println("No hay puestos disponibles");
                        } else {
                            controladorAtraccion.anyadirEmpleado(listaObjetos.getListaAtracciones().get(nAtraccion),
                                                                 empleado);
                        System.out.println("El empleado se agregó correctamente");
                        }
                        } catch (IndexOutOfBoundsException e) {
                            System.out.println("ERROR: No es un número correcto");                            
                        }                   
                    break;     
                case 5:
                    System.out.println("Vamos al menú principal...");
                    break;                
                default:
                    System.out.println("Seleccione una opción de las del Menú.");
                    break;
            }
        } while (opcion < 1 || opcion > 5);  
    }
    
    public void desaignarEmpleadoAtraccion() {
        int opcion = 0;
        int nEmpleado = 0;
        int nTipoEmpleado = 0;
        int nAtraccion = 0;
        int totalTiposEmpleados = 0;
        ArrayList<EnumTipoEmpleado> arrayTipoEmpleados = new ArrayList<>();
        for (EnumTipoEmpleado tiposEmpleados : EnumTipoEmpleado.values()) {
            arrayTipoEmpleados.add(tiposEmpleados);
            totalTiposEmpleados++;
        } 
        mostrarAtracciones();
        System.out.println("\n Seleccione el Número de Atracción en la que quiere dar de baja el Trabajador\n");
        nAtraccion = Varios.pedirOpcion();

        do { 
            System.out.println("\n Seleccione el tipo de Trabajador que quiere dar de baja en Atracción\n");       
            menuListaTiposEmpleados();
            nTipoEmpleado = Varios.pedirOpcion();
        }   while (nTipoEmpleado > totalTiposEmpleados || nTipoEmpleado < 0);

        System.out.println("Lista de Trabajadores");  
        System.out.println("---------------------\n"); 
        
        try {
            if ( controladorAtraccion.mostrarEmpleados(arrayTipoEmpleados.get(nTipoEmpleado-1), 
                                                       listaObjetos.getListaAtracciones().get(nAtraccion)
            ) == true) {
                System.out.println("Seleccione el número de trabajador de la lista\n");                 
                nEmpleado = Varios.pedirOpcion();
                controladorAtraccion.quitarEmpleado(listaObjetos.getListaAtracciones().get(nAtraccion), 
                                                    arrayTipoEmpleados.get(nTipoEmpleado-1), 
                                                    nEmpleado );
                
                System.out.println("El Empleado ha sido dado de baja correctamente en la Atracción\n" );
            }
                 
        } catch (IndexOutOfBoundsException e) {
            System.out.println("ERROR: No es un número correcto\n");                  
        }        
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

    public void mostrarEntradasGeneral() {
        
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MMMMMM/yyyy");
        System.out.println("\nLista de Entradas General");
        System.out.println("--------------------------\n");
        for (int i=0; i< listaObjetos.getListaEntradasGeneral().size(); i++) {
            System.out.println(i+ "-" + "Fecha: " 
                    + formatoFecha.format(listaObjetos.getListaEntradasGeneral().get(i).getFechaHoraEntrada().getTime())
                    + ", Temporada:" + listaObjetos.getListaEntradasGeneral().get(i).getTipoTemporada()
                    + ", Tipo Cliente:" + listaObjetos.getListaEntradasGeneral().get(i).getTipoCliente()
                    + "\n PRECIO:" + listaObjetos.getListaEntradasGeneral().get(i).getPrecio()
                    );
        } 
    }
    
    public void mostrarEntradasLaboral() {
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MMMMMM/yyyy");
        System.out.println("\nLista de Entradas Laboral");
        System.out.println("--------------------------\n");
        for (int i=0; i< listaObjetos.getListaEntradasLaborable().size(); i++) {
            System.out.println(i+ "-" + "Fecha: " + formatoFecha.format(listaObjetos.getListaEntradasLaborable().get(i).getFechaHoraEntrada().getTime())
                    + ", Temporada:" + listaObjetos.getListaEntradasLaborable().get(i).getTipoTemporada()
                    + ", Tipo Cliente:" + listaObjetos.getListaEntradasLaborable().get(i).getTipoCliente()
                    + "\n PRECIO:" + listaObjetos.getListaEntradasLaborable().get(i).getPrecio()
                    );
        } 
    }
    
    public void mostrarEntradasTarde() {
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MMMMMM/yyyy");
        System.out.println("\nLista de Entradas de Tarde");
        System.out.println("---------------------------\n");      
        for (int i=0; i< listaObjetos.getListaEntradasTarde().size(); i++) {
            System.out.println(i+ "-" + "Fecha: " + formatoFecha.format(listaObjetos.getListaEntradasTarde().get(i).getFechaHoraEntrada().getTime())
                    + ", Temporada:" + listaObjetos.getListaEntradasTarde().get(i).getTipoTemporada()
                    + ", Tipo Cliente:" + listaObjetos.getListaEntradasTarde().get(i).getTipoCliente()
                    + "\n PRECIO:" + listaObjetos.getListaEntradasTarde().get(i).getPrecio()
                    );
        } 
    }
    
    public void mostrarEntradasAniversario() {
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MMMMMM/yyyy");
        System.out.println("Lista de Entradas Aniversario");
        System.out.println("-----------------------------\n");        
        for (int i=0; i< listaObjetos.getListaEntradasAniversario().size(); i++) {
            System.out.println(i+ "-" + "Fecha: " + formatoFecha.format(listaObjetos.getListaEntradasAniversario().get(i).getFechaHoraEntrada().getTime())
                    + ", Temporada:" + listaObjetos.getListaEntradasAniversario().get(i).getTipoTemporada()
                    + ", Tipo Cliente:" + listaObjetos.getListaEntradasAniversario().get(i).getTipoCliente()
                    + "\n PRECIO:" + listaObjetos.getListaEntradasAniversario().get(i).getPrecio()
                    );
        } 
    }
    
    public void mostrarEntradasFamilia() {
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MMMMMM/yyyy");
        System.out.println("Lista de Entradas Familia");
        System.out.println("--------------------------\n");        
        for (int i=0; i< listaObjetos.getListaEntradasFamilia().size(); i++) {
            System.out.println(i+ "-" + "Fecha: " + formatoFecha.format(listaObjetos.getListaEntradasFamilia().get(i).getFechaHoraEntrada().getTime())
                    + ", Temporada:" + listaObjetos.getListaEntradasFamilia().get(i).getTipoTemporada()
                    + ", Tipo Cliente:" + listaObjetos.getListaEntradasFamilia().get(i).getTipoCliente()
                    + "\n PRECIO:" + listaObjetos.getListaEntradasFamilia().get(i).getPrecio()
                    );
        } 
    } 
    
    private void menuListaTiposEmpleados() {
        
            System.out.println("-------------------"); 
            System.out.println("Listas de Empleados"); 
            System.out.println("-------------------\n");
            System.out.println("Seleccione una de las siguientes opciones:");
            System.out.println("1- Ver lista de Empleados Atención al Cliente");
            System.out.println("2- Ver lista de Empleados Ayudantes de Atracción");
            System.out.println("3- Ver lista de Empleados Relaciones Públicas");
            System.out.println("4- Ver lista de Empleados Responsables de Atracción");
            System.out.println("5- Ver lista de Todos los Empleados");
            System.out.println("6- Volver atrás");        
    }
    public void mostrarEmpleadoAtraccion() {
        
        int nAtraccion = 0; 
        int opcion = 0;
        mostrarAtracciones();
        System.out.println("Seleccione el Número de Atracción que quiere ver sus empleados\n");
        
        try {
            
            do {
  
                nAtraccion = Varios.pedirOpcion();
                
            } while (nAtraccion < 0 || nAtraccion > listaObjetos.getListaAtracciones().size());
            
            menuListaTiposEmpleados();
            
            do {
                opcion = Varios.pedirOpcion();
                switch (opcion) {
                    case 1:
                        mostrarListaEmpleadosAtencion(listaObjetos.getListaAtracciones().get(nAtraccion));
                        break;
                    case 2:
                        mostrarListaEmpleadosAyudantes(listaObjetos.getListaAtracciones().get(nAtraccion));
                        break;
                    case 3:
                        mostrarListaEmpleadosRelaciones(listaObjetos.getListaAtracciones().get(nAtraccion));
                        break;
                    case 4:
                        mostrarListaEmpleadosResponsables(listaObjetos.getListaAtracciones().get(nAtraccion));  
                        break;
                    case 5:
                        mostrarListaEmpleados(listaObjetos.getListaAtracciones().get(nAtraccion));
                }
                
                
            } while (opcion < 1 || opcion > 6);
            
        } catch (IndexOutOfBoundsException e) {
            System.out.println("ERROR: No ha elejido un número válido de Atracción");
        }
    }
    
    public void mostrarListaEmpleadosAtencion() {
        System.out.println("Lista de Empleados de Atención al Cliente:");
        System.out.println("------------------------------------------\n");       
        System.out.println(listaObjetos.getListaEmpleadosAtencion()); 
    }
        
    private void mostrarListaEmpleadosAtencion( Atraccion atraccion) {
        System.out.println("Lista de Empleados de Atención al Cliente:");
        System.out.println("------------------------------------------\n");       
        System.out.println(atraccion.getListaEmpleadosAtenciones()); 
    }
    
    public void mostrarListaEmpleadosAyudantes() {
        System.out.println("Lista de Empleados de Ayudantes de Atracción:");
        System.out.println("---------------------------------------------\n");                    
        System.out.println(listaObjetos.getListaEmpleadosAyudante());
    }
    
    private void mostrarListaEmpleadosAyudantes( Atraccion atraccion) {
        System.out.println("Lista de Empleados de Ayudantes de Atracción:");
        System.out.println("---------------------------------------------\n");                    
        System.out.println(atraccion.getListaEmpleadosAyudantes());
    }
    
    public void mostrarListaEmpleadosRelaciones() {
        System.out.println("Lista de Empleados de Relaciones Públicas:");
        System.out.println("------------------------------------------\n");                    
        System.out.println(listaObjetos.getListaEmpleadosRelaciones());
    }
    
    private void mostrarListaEmpleadosRelaciones( Atraccion atraccion) {
        System.out.println("Lista de Empleados de Relaciones Públicas:");
        System.out.println("------------------------------------------\n");                    
        System.out.println(atraccion.getListaEmpleadosRelaciones());
    }
    
    public void mostrarListaEmpleadosResponsables() {
        System.out.println("Lista de Empleados de Responsables de Atracción:");
        System.out.println("------------------------------------------------\n");                    
        System.out.println(listaObjetos.getListaEmpleadosResponsable());
    }
    
    private void mostrarListaEmpleadosResponsables(Atraccion atraccion) {       
        System.out.println("Lista de Empleados de Responsables de Atracción:");
        System.out.println("------------------------------------------------\n");                    
        System.out.println(atraccion.getListaEmpleadosResponsables());
    }  
    
    public void mostrarListaEmpleados() {
        System.out.println("Lista todos los Empleados:");
        System.out.println("--------------------------\n");
        System.out.println(listaObjetos.getListaEmpleadosAtencion()); 
        System.out.println(listaObjetos.getListaEmpleadosAyudante());
        System.out.println(listaObjetos.getListaEmpleadosRelaciones());                    
        System.out.println(listaObjetos.getListaEmpleadosResponsable());
    }
    
    private void mostrarListaEmpleados(Atraccion atraccion) {
        System.out.println("Lista todos los Empleados:");
        System.out.println("--------------------------\n");
        System.out.println(atraccion.getListaEmpleadosAtenciones()); 
        System.out.println(atraccion.getListaEmpleadosAyudantes());
        System.out.println(atraccion.getListaEmpleadosRelaciones());                    
        System.out.println(atraccion.getListaEmpleadosResponsables());
    }

    public void crearEmpleado() {
        
        Empleado empleado = controladorEmpleado.crearEmpleado();
        if (empleado != null) {
            listaObjetos.anyadirEmpleado(empleado);
        }
    }
    
}