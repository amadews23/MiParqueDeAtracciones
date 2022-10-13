package Inicio;

import Atracciones.Atraccion;
import Atracciones.EnumTipoAtraccion;
import Gente.Cliente;
import Gente.Empleado;
import Gente.EnumTipoEmpleado;
import Gestion.EntradaAniversario;
import Gestion.EntradaFamilia;
import Gestion.EntradaGeneral;
import Gestion.EntradaLaborable;
import Gestion.EntradaTarde;
import Gestion.ListaObjetos;
import Gestion.AtraccionFuncionando;
import java.util.GregorianCalendar;

/**
 *
 * @author Bartolome Vich Lozano
 * @version 1.10 2019/8/14
 */

public class Apertura {
    private final ListaObjetos listaObjetos;
    
    public Apertura() {
        this.listaObjetos = new ListaObjetos();
    }
    
    public ListaObjetos iniciarActividad() {
        
        //*ATRACCIONES*
        Atraccion atraccionA1 = new Atraccion("A1", EnumTipoAtraccion.TIPO_A);
        listaObjetos.anyadirAtraccion(atraccionA1);
        Atraccion atraccionA2 = new Atraccion("A2", EnumTipoAtraccion.TIPO_A);
        listaObjetos.anyadirAtraccion(atraccionA2);        
        Atraccion atraccionA3 = new Atraccion("A3", EnumTipoAtraccion.TIPO_A);
        listaObjetos.anyadirAtraccion(atraccionA3);
        Atraccion atraccionA4 = new Atraccion("A4", EnumTipoAtraccion.TIPO_A);
        listaObjetos.anyadirAtraccion(atraccionA4);    
        Atraccion atraccionB1 = new Atraccion("B1", EnumTipoAtraccion.TIPO_B);
        listaObjetos.anyadirAtraccion(atraccionB1);        
        Atraccion atraccionB2 = new Atraccion("B2", EnumTipoAtraccion.TIPO_B);
        listaObjetos.anyadirAtraccion(atraccionB2);        
        Atraccion atraccionB3 = new Atraccion("B3", EnumTipoAtraccion.TIPO_B);
        listaObjetos.anyadirAtraccion(atraccionB3);        
        Atraccion atraccionB4 = new Atraccion("B4", EnumTipoAtraccion.TIPO_B);
        listaObjetos.anyadirAtraccion(atraccionB4);
        Atraccion atraccionB5 = new Atraccion("B5", EnumTipoAtraccion.TIPO_B);
        listaObjetos.anyadirAtraccion(atraccionB5);        
        Atraccion atraccionB6 = new Atraccion("B6", EnumTipoAtraccion.TIPO_B);
        listaObjetos.anyadirAtraccion(atraccionB6);                                        
        Atraccion atraccionC1 = new Atraccion("C1", EnumTipoAtraccion.TIPO_C);
        listaObjetos.anyadirAtraccion(atraccionC1);        
        Atraccion atraccionC2 = new Atraccion("C2", EnumTipoAtraccion.TIPO_C);
        listaObjetos.anyadirAtraccion(atraccionC2);
        Atraccion atraccionC3 = new Atraccion("C3", EnumTipoAtraccion.TIPO_C);
        listaObjetos.anyadirAtraccion(atraccionC3);
        Atraccion atraccionC4 = new Atraccion("C4", EnumTipoAtraccion.TIPO_C);
        listaObjetos.anyadirAtraccion(atraccionC4);
        Atraccion atraccionD1 = new Atraccion("D1", EnumTipoAtraccion.TIPO_D);
        listaObjetos.anyadirAtraccion(atraccionD1);
        Atraccion atraccionD2 = new Atraccion("D2", EnumTipoAtraccion.TIPO_D);
        listaObjetos.anyadirAtraccion(atraccionD2);        
        Atraccion atraccionD3 = new Atraccion("D3", EnumTipoAtraccion.TIPO_D);        
        listaObjetos.anyadirAtraccion(atraccionD3);
        Atraccion atraccionE1 = new Atraccion("E1", EnumTipoAtraccion.TIPO_E);
        listaObjetos.anyadirAtraccion(atraccionE1);        
        Atraccion atraccionE2 = new Atraccion("E2", EnumTipoAtraccion.TIPO_E);
        listaObjetos.anyadirAtraccion(atraccionE2);
        Atraccion atraccionE3 = new Atraccion("E3", EnumTipoAtraccion.TIPO_E);
        listaObjetos.anyadirAtraccion(atraccionE3);
        Atraccion atraccionE4 = new Atraccion("E4", EnumTipoAtraccion.TIPO_E);
        listaObjetos.anyadirAtraccion(atraccionE4);    
        Atraccion atraccionE5 = new Atraccion("E5", EnumTipoAtraccion.TIPO_E);
        listaObjetos.anyadirAtraccion(atraccionE5);
        Atraccion atraccionE6 = new Atraccion("E6", EnumTipoAtraccion.TIPO_E);
        listaObjetos.anyadirAtraccion(atraccionE6);    
        Atraccion atraccionE7 = new Atraccion("E7", EnumTipoAtraccion.TIPO_E);
        listaObjetos.anyadirAtraccion(atraccionE7);  

        //*EMPLEADOS*
        //
        //Ayudantes
        Empleado empleadoAyudante1 = new Empleado(EnumTipoEmpleado.AYUDANTE, 43120, "Luis", "Covas", 1, 1, 1970);
        listaObjetos.anyadirEmpleado(empleadoAyudante1);
        Empleado empleadoAyudante2 = new Empleado(EnumTipoEmpleado.AYUDANTE, 43121, "Blas", "Covas", 11, 2, 1972);
        listaObjetos.anyadirEmpleado(empleadoAyudante2);
        Empleado empleadoAyudante3 = new Empleado(EnumTipoEmpleado.AYUDANTE, 43122, "Julio", "Vila", 11, 11, 1980);
        listaObjetos.anyadirEmpleado(empleadoAyudante3);
        Empleado empleadoAyudante4 = new Empleado(EnumTipoEmpleado.AYUDANTE, 43123, "Álvaro", "Costa", 1, 1, 1978);
        listaObjetos.anyadirEmpleado(empleadoAyudante4);
        Empleado empleadoAyudante5 = new Empleado(EnumTipoEmpleado.AYUDANTE, 43124, "Juan", "Cos", 21, 1, 1974);
        listaObjetos.anyadirEmpleado(empleadoAyudante5);
        Empleado empleadoAyudante6 = new Empleado(EnumTipoEmpleado.AYUDANTE, 43125, "Berto", "Cuevas", 14, 1, 1979);
        listaObjetos.anyadirEmpleado(empleadoAyudante6);
        Empleado empleadoAyudante7 = new Empleado(EnumTipoEmpleado.AYUDANTE, 43126, "José", "Espósito", 19, 1, 1987);
        listaObjetos.anyadirEmpleado(empleadoAyudante7);
        Empleado empleadoAyudante8 = new Empleado(EnumTipoEmpleado.AYUDANTE, 43127, "Toni", "Garcia", 7, 11, 1990);
        listaObjetos.anyadirEmpleado(empleadoAyudante8);
        Empleado empleadoAyudante9 = new Empleado(EnumTipoEmpleado.AYUDANTE, 43128, "Nicolás", "Juan", 21, 10, 1972);
        listaObjetos.anyadirEmpleado(empleadoAyudante9);
        Empleado empleadoAyudante10 = new Empleado(EnumTipoEmpleado.AYUDANTE, 43129, "Luis", "Gil", 1, 8, 1991);
        listaObjetos.anyadirEmpleado(empleadoAyudante10);
        Empleado empleadoAyudante11 = new Empleado(EnumTipoEmpleado.AYUDANTE, 43130, "Esteban", "Pinpoyo", 1, 5, 1988);
        listaObjetos.anyadirEmpleado(empleadoAyudante11);
        Empleado empleadoAyudante12 = new Empleado(EnumTipoEmpleado.AYUDANTE, 43131, "Javier", "Esteban", 10, 4, 1970);
        listaObjetos.anyadirEmpleado(empleadoAyudante12);
        Empleado empleadoAyudante13 = new Empleado(EnumTipoEmpleado.AYUDANTE, 43132, "Luis", "Fiol", 12, 11, 1999);
        listaObjetos.anyadirEmpleado(empleadoAyudante13);
        Empleado empleadoAyudante14 = new Empleado(EnumTipoEmpleado.AYUDANTE, 43133, "Rafael", "Estévez", 1, 10, 1974);
        listaObjetos.anyadirEmpleado(empleadoAyudante14);
        Empleado empleadoAyudante15 = new Empleado(EnumTipoEmpleado.AYUDANTE, 43134, "Pedro", "Sastre", 11, 11, 1969);
        listaObjetos.anyadirEmpleado(empleadoAyudante15);
        Empleado empleadoAyudante16 = new Empleado(EnumTipoEmpleado.AYUDANTE, 43135, "Juanjo", "Llull", 15, 12, 1967);
        listaObjetos.anyadirEmpleado(empleadoAyudante16);
        Empleado empleadoAyudante17 = new Empleado(EnumTipoEmpleado.AYUDANTE, 43136, "Ramón", "Casas", 19, 11, 1965);
        listaObjetos.anyadirEmpleado(empleadoAyudante17);
        Empleado empleadoAyudante18 = new Empleado(EnumTipoEmpleado.AYUDANTE, 43137, "Roberto", "Langostino", 10, 6, 1975);
        listaObjetos.anyadirEmpleado(empleadoAyudante18);
        Empleado empleadoAyudante19 = new Empleado(EnumTipoEmpleado.AYUDANTE, 43138, "Luis", "Covas", 19, 7, 1967);
        listaObjetos.anyadirEmpleado(empleadoAyudante19);
        Empleado empleadoAyudante20 = new Empleado(EnumTipoEmpleado.AYUDANTE, 43139, "Javier", "Esteban", 10, 4, 1970);
        listaObjetos.anyadirEmpleado(empleadoAyudante20);
        Empleado empleadoAyudante21 = new Empleado(EnumTipoEmpleado.AYUDANTE, 43140, "Luis", "Fiol", 12, 11, 1999);
        listaObjetos.anyadirEmpleado(empleadoAyudante21);
        Empleado empleadoAyudante22 = new Empleado(EnumTipoEmpleado.AYUDANTE, 43141, "Rafael", "Estévez", 1, 10, 1974);
        listaObjetos.anyadirEmpleado(empleadoAyudante22);
        Empleado empleadoAyudante23 = new Empleado(EnumTipoEmpleado.AYUDANTE, 43142, "Pedro", "Sastre", 11, 11, 1969);
        listaObjetos.anyadirEmpleado(empleadoAyudante23);
        Empleado empleadoAyudante24 = new Empleado(EnumTipoEmpleado.AYUDANTE, 43143, "Juanjo", "Llull", 15, 12, 1967);
        listaObjetos.anyadirEmpleado(empleadoAyudante24);
        Empleado empleadoAyudante25 = new Empleado(EnumTipoEmpleado.AYUDANTE, 43144, "Ramón", "Casas", 19, 11, 1965);
        listaObjetos.anyadirEmpleado(empleadoAyudante25);
        Empleado empleadoAyudante26 = new Empleado(EnumTipoEmpleado.AYUDANTE, 43145, "Roberto", "Langostino", 10, 6, 1975);
        listaObjetos.anyadirEmpleado(empleadoAyudante26);
        Empleado empleadoAyudante27 = new Empleado(EnumTipoEmpleado.AYUDANTE, 43146, "Luis", "Covas", 19, 7, 1967);
        listaObjetos.anyadirEmpleado(empleadoAyudante27);

        //Atención al Cliente
        Empleado empleadoAtencion1 =new Empleado(EnumTipoEmpleado.ATENCION, 43147, "Bob", "Esponja", 23, 3, 1988);
        listaObjetos.anyadirEmpleado(empleadoAtencion1);
        Empleado empleadoAtencion2 =new Empleado(EnumTipoEmpleado.ATENCION, 43148, "Juan", "Esponja", 23, 3, 1997);
        listaObjetos.anyadirEmpleado(empleadoAtencion2);
        Empleado empleadoAtencion3 =new Empleado(EnumTipoEmpleado.ATENCION, 43149, "Patricio", "Esponja", 23, 3, 1998);
        listaObjetos.anyadirEmpleado(empleadoAtencion3);
        Empleado empleadoAtencion4 =new Empleado(EnumTipoEmpleado.ATENCION, 43150, "Conan", "Espada", 23, 3, 1989);
        listaObjetos.anyadirEmpleado(empleadoAtencion4);
        Empleado empleadoAtencion5 =new Empleado(EnumTipoEmpleado.ATENCION, 43151, "Batman", "Murciélago", 23, 3, 1998);
        listaObjetos.anyadirEmpleado(empleadoAtencion5);
        Empleado empleadoAtencion6 =new Empleado(EnumTipoEmpleado.ATENCION, 43152, "Hulk", "Marvel", 23, 3, 1984);
        listaObjetos.anyadirEmpleado(empleadoAtencion6);
        Empleado empleadoAtencion7 =new Empleado(EnumTipoEmpleado.ATENCION, 43153, "Mortadelo", "Ruperez", 23, 3, 1986);
        listaObjetos.anyadirEmpleado(empleadoAtencion7);
        Empleado empleadoAtencion8 =new Empleado(EnumTipoEmpleado.ATENCION, 43154, "Juan", "Jo", 23, 3, 1978);
        listaObjetos.anyadirEmpleado(empleadoAtencion8);
        Empleado empleadoAtencion9 =new Empleado(EnumTipoEmpleado.ATENCION, 43155, "Roberto", "Ruiz", 23, 3, 1998);
        listaObjetos.anyadirEmpleado(empleadoAtencion9);
        
        //Relaciones públicas
        Empleado empleadoRelaciones1 =new Empleado(EnumTipoEmpleado.RELACIONES, 43156, "Estrella", "De Mar", 3, 8, 1967);
        listaObjetos.anyadirEmpleado(empleadoRelaciones1);
        Empleado empleadoRelaciones2 =new Empleado(EnumTipoEmpleado.RELACIONES, 43157, "Flor", "Linda", 23, 8, 1976);
        listaObjetos.anyadirEmpleado(empleadoRelaciones2);
        Empleado empleadoRelaciones3 =new Empleado(EnumTipoEmpleado.RELACIONES, 43158, "Azucena", "Blanco", 8, 9, 1977);
        listaObjetos.anyadirEmpleado(empleadoRelaciones3);
        Empleado empleadoRelaciones4 =new Empleado(EnumTipoEmpleado.RELACIONES, 43159, "Rosa", "Rojo", 3, 4, 1987);
        listaObjetos.anyadirEmpleado(empleadoRelaciones4);
        Empleado empleadoRelaciones5 =new Empleado(EnumTipoEmpleado.RELACIONES, 43160, "Juan", "Gris", 13, 8, 1997);
        listaObjetos.anyadirEmpleado(empleadoRelaciones5);
        
        //Responsables
        Empleado empleadoResponsable1 =new Empleado(EnumTipoEmpleado.RESPONSABLE, 43161, "Atila", "De los Unos", 3, 8, 1967);
        listaObjetos.anyadirEmpleado(empleadoResponsable1);
        Empleado empleadoResponsable2 =new Empleado(EnumTipoEmpleado.RESPONSABLE, 43162, "Julio", "Cesar", 3, 8, 1976);
        listaObjetos.anyadirEmpleado(empleadoResponsable2);
        Empleado empleadoResponsable3 =new Empleado(EnumTipoEmpleado.RESPONSABLE, 43163, "Anibal", "Cartago", 3, 8, 1997);
        listaObjetos.anyadirEmpleado(empleadoResponsable3);
        Empleado empleadoResponsable4 =new Empleado(EnumTipoEmpleado.RESPONSABLE, 43161, "Baltasar", "De Guzmán y Pimentel", 3, 8, 1973);
        listaObjetos.anyadirEmpleado(empleadoResponsable4);
        Empleado empleadoResponsable5 =new Empleado(EnumTipoEmpleado.RESPONSABLE, 43162, "Jaume", "Primer", 3, 8, 1979);
        listaObjetos.anyadirEmpleado(empleadoResponsable5);

        //ASIGNAR PUESTOS DE TRABAJO
        //Asignar Empleados Atencion a su atraccion
        atraccionA1.anyadirEmpleado(empleadoAtencion1);
        atraccionA1.anyadirEmpleado(empleadoAtencion2);
        
        atraccionB1.anyadirEmpleado(empleadoAtencion3);
        atraccionB1.anyadirEmpleado(empleadoAtencion4);
        
        atraccionC1.anyadirEmpleado(empleadoAtencion5);
        
        atraccionD1.anyadirEmpleado(empleadoAtencion6);
        atraccionD1.anyadirEmpleado(empleadoAtencion7);
        
        atraccionE1.anyadirEmpleado(empleadoAtencion8);
        atraccionE1.anyadirEmpleado(empleadoAtencion9);
        
        //Asignar Empleados Ayudantes a su atraccion       
        atraccionA1.anyadirEmpleado(empleadoAyudante1);
        atraccionA1.anyadirEmpleado(empleadoAyudante2);
        atraccionA1.anyadirEmpleado(empleadoAyudante3);
        atraccionA1.anyadirEmpleado(empleadoAyudante4);
        atraccionA1.anyadirEmpleado(empleadoAyudante5);
        atraccionA1.anyadirEmpleado(empleadoAyudante6);
        
        atraccionB1.anyadirEmpleado(empleadoAyudante7);
        atraccionB1.anyadirEmpleado(empleadoAyudante8);
        atraccionB1.anyadirEmpleado(empleadoAyudante9);
        atraccionB1.anyadirEmpleado(empleadoAyudante10);  
        atraccionB1.anyadirEmpleado(empleadoAyudante11);   
        
        atraccionC1.anyadirEmpleado(empleadoAyudante12);
        atraccionC1.anyadirEmpleado(empleadoAyudante13);
        atraccionC1.anyadirEmpleado(empleadoAyudante14);
        
        atraccionD1.anyadirEmpleado(empleadoAyudante15);
        atraccionD1.anyadirEmpleado(empleadoAyudante16);
        atraccionD1.anyadirEmpleado(empleadoAyudante17);
        atraccionD1.anyadirEmpleado(empleadoAyudante18);
        atraccionD1.anyadirEmpleado(empleadoAyudante19);
        
        atraccionE1.anyadirEmpleado(empleadoAyudante20);
        atraccionE1.anyadirEmpleado(empleadoAyudante21);
        atraccionE1.anyadirEmpleado(empleadoAyudante22);
        atraccionE1.anyadirEmpleado(empleadoAyudante23);
        atraccionE1.anyadirEmpleado(empleadoAyudante24);
        atraccionE1.anyadirEmpleado(empleadoAyudante25);
        atraccionE1.anyadirEmpleado(empleadoAyudante26);
        
        //Asignar Empleados Relaciones a su atraccion     
        atraccionA1.anyadirEmpleado(empleadoRelaciones1);
        atraccionB1.anyadirEmpleado(empleadoRelaciones2);
        atraccionC1.anyadirEmpleado(empleadoRelaciones3);
        atraccionD1.anyadirEmpleado(empleadoRelaciones4);
        atraccionE1.anyadirEmpleado(empleadoRelaciones5);
        
        //Asignar Empleados Responsables     
        atraccionA1.anyadirEmpleado(empleadoResponsable1);
        atraccionB1.anyadirEmpleado(empleadoResponsable2);
        atraccionC1.anyadirEmpleado(empleadoResponsable3);
        atraccionD1.anyadirEmpleado(empleadoResponsable4);
        atraccionE1.anyadirEmpleado(empleadoResponsable5);
        
        
        //Activamos atracciones
        atraccionA1.setEsActiva(true);
        atraccionB1.setEsActiva(true);
        atraccionC1.setEsActiva(true);
        atraccionD1.setEsActiva(true);
        atraccionE1.setEsActiva(true);

        //*CREAMOS Lista de ATRACCIONESFUNCIONANDO
        
        //Fecha de inio y de fin
        GregorianCalendar unoEnero =  new GregorianCalendar(2019,0,1);
        GregorianCalendar dosFebrero = new GregorianCalendar(2019,1,2);
        GregorianCalendar tresMarzo = new GregorianCalendar(2019,2,3);        
        GregorianCalendar treintaUnoDiciembre = new GregorianCalendar(2019,11,31);
        
        //Objetos AtraccionFuncionando
        AtraccionFuncionando atraccionFuncionandoA1 = new AtraccionFuncionando(unoEnero,
                                                                               dosFebrero,
                                                                               atraccionA1);

        AtraccionFuncionando atraccionFuncionando0A1 = new AtraccionFuncionando(tresMarzo,
                                                                               treintaUnoDiciembre,
                                                                               atraccionA1);        

        AtraccionFuncionando atraccionFuncionandoB1 = new AtraccionFuncionando(unoEnero,
                                                                               treintaUnoDiciembre,
                                                                               atraccionB1);

        AtraccionFuncionando atraccionFuncionandoC1 = new AtraccionFuncionando(unoEnero,
                                                                               treintaUnoDiciembre,
                                                                               atraccionC1);
       
        AtraccionFuncionando atraccionFuncionandoD1 = new AtraccionFuncionando(unoEnero,
                                                                               treintaUnoDiciembre,
                                                                               atraccionD1);
        AtraccionFuncionando atraccionFuncionandoE1 = new AtraccionFuncionando(unoEnero,
                                                                               treintaUnoDiciembre,
                                                                               atraccionE1);  
        //Añadimos a la lista
        listaObjetos.anyadirAtraccionFuncionando(atraccionFuncionandoA1);
        listaObjetos.anyadirAtraccionFuncionando(atraccionFuncionando0A1);      
        listaObjetos.anyadirAtraccionFuncionando(atraccionFuncionandoB1);
        listaObjetos.anyadirAtraccionFuncionando(atraccionFuncionandoC1);
        listaObjetos.anyadirAtraccionFuncionando(atraccionFuncionandoD1);
        listaObjetos.anyadirAtraccionFuncionando(atraccionFuncionandoE1);
        
        //* ENTRADAS *
        //ENTRADAS GENERAL
        //Temporada Baja
	GregorianCalendar temporadaBaja = new GregorianCalendar(2019,1,9);		
        //EntradaGeneral TEMPORADA BAJA - NINYO - VIP
        Cliente cliente1 = new Cliente(122,false,false,false,false,"Pepito","Grillo",10,4,2015);
        EntradaGeneral entradaGeneral1 = new EntradaGeneral(temporadaBaja, cliente1, true);
        listaObjetos.anyadirEntrada(entradaGeneral1);
	//EntradaGeneral TEMPORADA BAJA - BEBE 
        Cliente cliente2 = new Cliente(90,false,false,false,false,"Pepín","Griso",1,9,2016);           
        EntradaGeneral entradaGeneral2 = new EntradaGeneral(temporadaBaja, cliente2, false);
        listaObjetos.anyadirEntrada(entradaGeneral2);
	//EntradaGeneral TEMPORADA BAJA - ADULTO - ESTUDIANTE
	Cliente cliente3 = new Cliente(170,true,false,false,false,"Jonny","Melabo",11,4,1990);
        EntradaGeneral entradaGeneral3 = new EntradaGeneral(temporadaBaja, cliente3, false);
        listaObjetos.anyadirEntrada(entradaGeneral3);
	//EntradaGeneral TEMPORADA BAJA - SENIOR - DISCAPACITADO - VIP
	Cliente cliente4 = new Cliente(155,false,true,false,false,"Juan","De la Mesa",20,8,1935);
        EntradaGeneral entradaGeneral4 = new EntradaGeneral(temporadaBaja, cliente4, true);
        listaObjetos.anyadirEntrada(entradaGeneral4);
        
        //Suben a Atracciones
        atraccionA1.anyadirCliente(entradaGeneral1);
 
        atraccionA1.anyadirCliente(entradaGeneral3);
        atraccionA1.anyadirCliente(entradaGeneral4);
       
        atraccionA1.anyadirCliente(entradaGeneral4); //vuelve a subir
        
        //No pueden subir niños
        //atraccionB1.anyadirCliente(entradaGeneral1);

        atraccionB1.anyadirCliente(entradaGeneral3);
        atraccionB1.anyadirCliente(entradaGeneral4);
        
        //No pueden subir niños de mas 1,20mts       
        //atraccionC1.anyadirCliente(entradaGeneral1);        
        
        atraccionD1.anyadirCliente(entradaGeneral1);
        atraccionD1.anyadirCliente(entradaGeneral1); 
        atraccionD1.anyadirCliente(entradaGeneral3);
        atraccionD1.anyadirCliente(entradaGeneral4);
        
        atraccionE1.anyadirCliente(entradaGeneral3);
        atraccionE1.anyadirCliente(entradaGeneral4);
        
        //Temporada Baja 0     
        GregorianCalendar temporadaBaja0 = new GregorianCalendar(2019,1,19);		
        //EntradaGeneral TEMPORADA BAJA - NINYO - VIP
        Cliente cliente01 = new Cliente(100,false,false,false,false,"Pepito","Grillo",10,4,2015);
        EntradaGeneral entradaGeneral01 = new EntradaGeneral(temporadaBaja0, cliente01, true);
        listaObjetos.anyadirEntrada(entradaGeneral01);
	//EntradaGeneral TEMPORADA BAJA - BEBE 
        Cliente cliente02 = new Cliente(90,false,false,false,false,"Pepín","Griso",1,9,2016);           
        EntradaGeneral entradaGeneral02 = new EntradaGeneral(temporadaBaja0, cliente02, false);
        listaObjetos.anyadirEntrada(entradaGeneral02);
	//EntradaGeneral TEMPORADA BAJA - ADULTO - ESTUDIANTE
	Cliente cliente03 = new Cliente(170,true,false,false,false,"Jonny","Melabo",11,4,1990);
        EntradaGeneral entradaGeneral03 = new EntradaGeneral(temporadaBaja0, cliente03, false);
        listaObjetos.anyadirEntrada(entradaGeneral03);
	//EntradaGeneral TEMPORADA BAJA - SENIOR - DISCAPACITADO - VIP
	Cliente cliente04 = new Cliente(155,false,true,false,false,"Juan","De la Mesa",20,8,1935);
        EntradaGeneral entradaGeneral04 = new EntradaGeneral(temporadaBaja0, cliente04, true);
        listaObjetos.anyadirEntrada(entradaGeneral04);
        
        atraccionC1.anyadirCliente(entradaGeneral01);
        atraccionD1.anyadirCliente(entradaGeneral01); 
        
        atraccionA1.anyadirCliente(entradaGeneral03);
        atraccionA1.anyadirCliente(entradaGeneral04);

        atraccionD1.anyadirCliente(entradaGeneral03);      
        atraccionD1.anyadirCliente(entradaGeneral04);

        atraccionE1.anyadirCliente(entradaGeneral03);      
        atraccionE1.anyadirCliente(entradaGeneral04);    
        
        atraccionE1.anyadirCliente(entradaGeneral03);      
        atraccionE1.anyadirCliente(entradaGeneral04);    
        //
        Cliente cliente004 = new Cliente(155,false,true,false,false,"Juan","De la Mesa",20,8,1935);
        EntradaGeneral entradaGeneral004 = new EntradaGeneral(temporadaBaja, cliente004, true);
        listaObjetos.anyadirEntrada(entradaGeneral004);
        
        atraccionE1.anyadirCliente(entradaGeneral004);  
        atraccionE1.anyadirCliente(entradaGeneral004);  
        atraccionE1.anyadirCliente(entradaGeneral004);  
        atraccionB1.anyadirCliente(entradaGeneral004);
        atraccionA1.anyadirCliente(entradaGeneral004);  
        
	//Temporada Alta
	GregorianCalendar temporadaAlta = new GregorianCalendar(2019,3,10);        
	//EntradaGeneral TEMPORADA ALTA - ADULTO - DESEMPLEADO
        Cliente cliente5 = new Cliente(125,false,false,false,true,"Jordi","Moll",2,4,2001);
        EntradaGeneral entradaGeneral5 = new EntradaGeneral(temporadaAlta, cliente5, false);
        listaObjetos.anyadirEntrada(entradaGeneral5);

        atraccionE1.anyadirCliente(entradaGeneral5);  
        atraccionE1.anyadirCliente(entradaGeneral5);  
        atraccionE1.anyadirCliente(entradaGeneral5);  
        atraccionB1.anyadirCliente(entradaGeneral5);
        atraccionA1.anyadirCliente(entradaGeneral5);         
        
	//EntradaGeneral TEMPORADA ALTA - ADULTO - CARNET JOVEN - VIP
        Cliente cliente6 = new Cliente(125,false,false,true,false,"Marisa","Rubio",12,3,1981);
        EntradaGeneral entradaGeneral6 = new EntradaGeneral(temporadaAlta, cliente6, true);
        listaObjetos.anyadirEntrada(entradaGeneral6);
        
        atraccionE1.anyadirCliente(entradaGeneral6);  
        atraccionE1.anyadirCliente(entradaGeneral6);  
        atraccionE1.anyadirCliente(entradaGeneral6);  
        atraccionB1.anyadirCliente(entradaGeneral6);
        atraccionA1.anyadirCliente(entradaGeneral6);          
        
        //ENTRADAS FAMILIA
	//Temporada Media
	GregorianCalendar temporadaMedia = new GregorianCalendar(2019,2,20);         
        //EntradaFamilia TEMPORADA MEDIA
        //- ADULTO - ESTUDIANTE -CARNE JOVEN ("El Papá")
        Cliente cliente7 = new Cliente(175,true,false,true,false,"Juan","De los Pinos",10,4,1978);
        EntradaFamilia entradaFamilia1 = new EntradaFamilia(temporadaMedia, cliente7, false);
        listaObjetos.anyadirEntrada(entradaFamilia1);
        //- ADULTO - ESTUDIANTE -CARNE JOVEN ("La Mamá")
        Cliente cliente8 = new Cliente(175,true,false,true,false,"Verónica","Lamps",10,4,1980);
        EntradaFamilia entradaFamilia2 = new EntradaFamilia(temporadaMedia, cliente8, false);
        listaObjetos.anyadirEntrada(entradaFamilia2);
        //- NINYO -  ("Hija")
        Cliente cliente9 = new Cliente(155,false,false,false,false,"Sofía","De los Pinos Lamps",10,4,2011);
        EntradaFamilia entradaFamilia3 = new EntradaFamilia(temporadaMedia, cliente9, false);
        listaObjetos.anyadirEntrada(entradaFamilia3);
        //- NINYO -  ("Hija")
        Cliente cliente10 = new Cliente(135,false,false,false,false,"Elsa","De los Pinos Lamps",10,4,2014);
        EntradaFamilia entradaFamilia4 = new EntradaFamilia(temporadaMedia, cliente10, false);
        listaObjetos.anyadirEntrada(entradaFamilia4);
        
        atraccionA1.anyadirCliente(entradaFamilia1);          
        atraccionA1.anyadirCliente(entradaFamilia2);          
        atraccionA1.anyadirCliente(entradaFamilia3);          
        atraccionA1.anyadirCliente(entradaFamilia4);          

        atraccionB1.anyadirCliente(entradaFamilia1);          
        atraccionB1.anyadirCliente(entradaFamilia2);         
        
        atraccionD1.anyadirCliente(entradaFamilia1);          
        atraccionD1.anyadirCliente(entradaFamilia2);          
        atraccionD1.anyadirCliente(entradaFamilia3);          
        atraccionD1.anyadirCliente(entradaFamilia4); 

        atraccionE1.anyadirCliente(entradaFamilia1);          
        atraccionE1.anyadirCliente(entradaFamilia2);          
        
        //ENTRADAS ANIVERSARIO
        //EntradaAniversario  ADULTOs
        GregorianCalendar cumpleanyosBerta = new GregorianCalendar(2019,0,3);
        Cliente cliente110 = new Cliente(168,false,false,false,false,"Berta","Barcelona",3,1,1984);
        EntradaAniversario entradaAniversario0 = new EntradaAniversario(cumpleanyosBerta, cliente110, true);
        listaObjetos.anyadirEntrada(entradaAniversario0);
        
        atraccionA1.anyadirCliente(entradaAniversario0);
        atraccionB1.anyadirCliente(entradaAniversario0);
        atraccionD1.anyadirCliente(entradaAniversario0);
        atraccionE1.anyadirCliente(entradaAniversario0);

        atraccionA1.anyadirCliente(entradaAniversario0);        
        
        //ENTRADAS ANIVERSARIO
        //EntradaAniversario  ADULTO 
        GregorianCalendar cumpleanyosJaume = new GregorianCalendar(2019,5,29);        
        Cliente cliente17 = new Cliente(178,false,false,false,false,"Jaume","Villalonga",29,6,1979);
        EntradaAniversario entradaAniversario3 = new EntradaAniversario(cumpleanyosJaume, cliente17, true);
        listaObjetos.anyadirEntrada(entradaAniversario3);  
        
        atraccionA1.anyadirCliente(entradaAniversario3);
        atraccionB1.anyadirCliente(entradaAniversario3);
        atraccionD1.anyadirCliente(entradaAniversario3);
        atraccionE1.anyadirCliente(entradaAniversario3);

        atraccionA1.anyadirCliente(entradaAniversario3);          
        
        GregorianCalendar cumpleanyosTolo = new GregorianCalendar(2019,5,30);        
        Cliente cliente11 = new Cliente(178,false,false,false,false,"Bartolomé","Vich",30,6,1979);
        EntradaAniversario entradaAniversario1 = new EntradaAniversario(cumpleanyosTolo, cliente11, true);
        listaObjetos.anyadirEntrada(entradaAniversario1);

        atraccionA1.anyadirCliente(entradaAniversario1);
        atraccionB1.anyadirCliente(entradaAniversario1);
        atraccionD1.anyadirCliente(entradaAniversario1);
        atraccionE1.anyadirCliente(entradaAniversario1);

        atraccionA1.anyadirCliente(entradaAniversario1);           
        
        
        //EntradaAniversario  NINYO 
        GregorianCalendar cumpleanyosDaniela = new GregorianCalendar(2019,10,13);        
        Cliente cliente12 = new Cliente(120,false,false,false,false,"Daniela","Lozano",13,11,2015);
        EntradaAniversario entradaAniversario2 = new EntradaAniversario(cumpleanyosDaniela, cliente12, true);
        listaObjetos.anyadirEntrada(entradaAniversario2);

        atraccionA1.anyadirCliente(entradaAniversario2);
        atraccionC1.anyadirCliente(entradaAniversario2);
        atraccionD1.anyadirCliente(entradaAniversario2);        
        atraccionC1.anyadirCliente(entradaAniversario2);
        atraccionC1.anyadirCliente(entradaAniversario2);
        atraccionC1.anyadirCliente(entradaAniversario2);
        
        //ENTRADAS LABORABLE
        //EntradaLaboral TEMPORADA ALTA - ADULTO - CARNET JOVEN - VIP
      	GregorianCalendar temporadaAlta2 = new GregorianCalendar(2019,3,11,17,20);        
        Cliente cliente13 = new Cliente(165,false,false,true,false,"Marta","Gómez",2,3,1971);
        EntradaLaborable entradaLaborable1 = new EntradaLaborable(temporadaAlta2, cliente13, true);
        listaObjetos.anyadirEntrada(entradaLaborable1);

        atraccionA1.anyadirCliente(entradaLaborable1);
        atraccionB1.anyadirCliente(entradaLaborable1);
        atraccionD1.anyadirCliente(entradaLaborable1);
        atraccionE1.anyadirCliente(entradaLaborable1);

        atraccionA1.anyadirCliente(entradaLaborable1);          
        
        //EntradaLaboral TEMPORADA ALTA - ADULTO - CARNET JOVEN - VIP
        Cliente cliente14 = new Cliente(175,false,false,true,false,"Julia","Perez",2,3,1977);
        EntradaLaborable entradaLaborable2 = new EntradaLaborable(temporadaAlta2, cliente14, true);
        listaObjetos.anyadirEntrada(entradaLaborable2);
        
        atraccionA1.anyadirCliente(entradaLaborable2);
        atraccionB1.anyadirCliente(entradaLaborable2);
        atraccionD1.anyadirCliente(entradaLaborable2);
        atraccionE1.anyadirCliente(entradaLaborable2);

        atraccionA1.anyadirCliente(entradaLaborable2);              

        //ENTRADAS TARDE
        //EntradaTarde TEMPORADA ALTA - ADULTO - CARNET JOVEN - VIP
        Cliente cliente15 = new Cliente(165,false,false,true,false,"Catalina","Mesa",2,3,1981);
        EntradaTarde entradaTarde1 = new EntradaTarde(temporadaAlta2, cliente15, true);
        listaObjetos.anyadirEntrada(entradaTarde1);
        
        atraccionA1.anyadirCliente(entradaTarde1);
        atraccionB1.anyadirCliente(entradaTarde1);
        atraccionD1.anyadirCliente(entradaTarde1);
        atraccionE1.anyadirCliente(entradaTarde1);

        atraccionA1.anyadirCliente(entradaTarde1);               
        
        
        //EntradaLaboral TEMPORADA ALTA - ADULTO - CARNET JOVEN 
        Cliente cliente16 = new Cliente(165,false,false,true,false,"Catalina","Bosch",2,3,1977);
        EntradaLaborable entradaTarde2 = new EntradaLaborable(temporadaAlta2, cliente16, false);
        listaObjetos.anyadirEntrada(entradaTarde2);

        atraccionA1.anyadirCliente(entradaTarde2);
        atraccionB1.anyadirCliente(entradaTarde2);
        atraccionD1.anyadirCliente(entradaTarde2);
        atraccionE1.anyadirCliente(entradaTarde2);

        atraccionA1.anyadirCliente(entradaTarde2);           
        
        return listaObjetos;      
        
        
    }    
}
