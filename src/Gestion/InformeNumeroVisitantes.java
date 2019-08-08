package Gestion;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

/**
 *
 * @author Bartolome Vich Lozano
 * @version 1.0 2019/8/8
 */
public class InformeNumeroVisitantes {
    
   
    
    public InformeNumeroVisitantes() {
        
        
        
    }
    
    private static ArrayList<LineaInforme> eliminarFechasDuplicadas(LinkedHashSet<String> listaFechas, 
                                                                    ArrayList<LineaInforme> informeDiario ) {
        
        //Copiamos a la lista final las fechas (no estaran duplicadas)
        Iterator <String> iterador2 = listaFechas.iterator();       
        while(iterador2.hasNext()) {

            informeDiario.add(new LineaInforme(iterador2.next()));

        }
        
        return informeDiario;
        
    }

    private static ArrayList<LineaInforme> contarVisitas(ArrayList<LineaInforme> informeDiario,
                                                         ArrayList<LineaInforme> informeTmp) {
        
        //Por cada fecha duplicada incrementamos Numero en el objeto lineaInforme
        for (int i=0; i < informeDiario.size(); i++) {
            for (int j=0; j < informeTmp.size(); j++) {
                if (informeDiario.get(i).getFecha().equals(informeTmp.get(j).getFecha())) {
                    informeDiario.get(i).sumar();
                }
                
            }
        }
        
        return informeDiario;
                
    }
    
    private static void mostrarInformeDiario(ArrayList<LineaInforme> informeDiario) {
    
        for (int i = 0; i < informeDiario.size(); i++) {

            System.out.println(informeDiario.get(i).getFecha()+": "+informeDiario.get(i).getNumero());
        }        
        
    }
    
    private static ArrayList<LineaInforme> devolverInformeDiarioEntradaGeneral(ArrayList<EntradaGeneral> listaEntradasGeneral ) {


        DateFormat dateFormat = new SimpleDateFormat("dd-MMMMMM-yyyy");
        //Recoge la fecha de las entradas (con duplicados).
        ArrayList<LineaInforme> informeTmp = new ArrayList<>();
        //Para almacenar las fechas sin duplicados y por orden se insercion.
        LinkedHashSet<String> listaFechas = new LinkedHashSet<>();
        //Informe final de fechas con número de visitas.
        ArrayList<LineaInforme> informeDiario = new ArrayList<>();


        
        for (int i = 0 ; i < listaEntradasGeneral.size() ; i++) {       
            
            informeTmp.add(new LineaInforme(dateFormat.format(listaEntradasGeneral.get(i).fechaHoraEntrada.getTime())));
            listaFechas.add(dateFormat.format(listaEntradasGeneral.get(i).fechaHoraEntrada.getTime()));

        }

        informeDiario = eliminarFechasDuplicadas(listaFechas, informeDiario);
        informeDiario = contarVisitas(informeDiario, informeTmp);


        return informeDiario;
        
    }
    
    private static ArrayList<LineaInforme> devolverInformeDiarioEntradaAniversario(ArrayList<EntradaAniversario> listaEntradasAniversario ) {


        DateFormat dateFormat = new SimpleDateFormat("dd-MMMMMM-yyyy");
        //Recoge la fecha de las entradas (con duplicados).
        ArrayList<LineaInforme> informeTmp = new ArrayList<>();
        //Para almacenar las fechas sin duplicados y por orden se insercion.
        LinkedHashSet<String> listaFechas = new LinkedHashSet<>();
        //Informe final de fechas con número de visitas.
        ArrayList<LineaInforme> informeDiario = new ArrayList<>();


        
        for (int i = 0 ; i < listaEntradasAniversario.size() ; i++) {       
            
            informeTmp.add(new LineaInforme(dateFormat.format(listaEntradasAniversario.get(i).fechaHoraEntrada.getTime())));
            listaFechas.add(dateFormat.format(listaEntradasAniversario.get(i).fechaHoraEntrada.getTime()));

        }

        informeDiario = eliminarFechasDuplicadas(listaFechas, informeDiario);
        informeDiario = contarVisitas(informeDiario, informeTmp);


        return informeDiario;
        
    }
    
    private static ArrayList<LineaInforme> devolverInformeDiarioEntradaFamilia(ArrayList<EntradaFamilia> listaEntradasFamilia ) {


        DateFormat dateFormat = new SimpleDateFormat("dd-MMMMMM-yyyy");
        //Recoge la fecha de las entradas (con duplicados).
        ArrayList<LineaInforme> informeTmp = new ArrayList<>();
        //Para almacenar las fechas sin duplicados y por orden se insercion.
        LinkedHashSet<String> listaFechas = new LinkedHashSet<>();
        //Informe final de fechas con número de visitas.
        ArrayList<LineaInforme> informeDiario = new ArrayList<>();


        
        for (int i = 0 ; i < listaEntradasFamilia.size() ; i++) {       
            
            informeTmp.add(new LineaInforme(dateFormat.format(listaEntradasFamilia.get(i).fechaHoraEntrada.getTime())));
            listaFechas.add(dateFormat.format(listaEntradasFamilia.get(i).fechaHoraEntrada.getTime()));

        }

        informeDiario = eliminarFechasDuplicadas(listaFechas, informeDiario);
        informeDiario = contarVisitas(informeDiario, informeTmp);


        return informeDiario;
        
    }

    private static ArrayList<LineaInforme> devolverInformeDiarioEntradaLaborable(ArrayList<EntradaLaborable> listaEntradasLaborable ) {


        DateFormat dateFormat = new SimpleDateFormat("dd-MMMMMM-yyyy");
        //Recoge la fecha de las entradas (con duplicados).
        ArrayList<LineaInforme> informeTmp = new ArrayList<>();
        //Para almacenar las fechas sin duplicados y por orden se insercion.
        LinkedHashSet<String> listaFechas = new LinkedHashSet<>();
        //Informe final de fechas con número de visitas.
        ArrayList<LineaInforme> informeDiario = new ArrayList<>();


        
        for (int i = 0 ; i < listaEntradasLaborable.size() ; i++) {       
            
            informeTmp.add(new LineaInforme(dateFormat.format(listaEntradasLaborable.get(i).fechaHoraEntrada.getTime())));
            listaFechas.add(dateFormat.format(listaEntradasLaborable.get(i).fechaHoraEntrada.getTime()));

        }

        informeDiario = eliminarFechasDuplicadas(listaFechas, informeDiario);
        informeDiario = contarVisitas(informeDiario, informeTmp);


        return informeDiario;
        
    }

    private static ArrayList<LineaInforme> devolverInformeDiarioEntradaTarde(ArrayList<EntradaTarde> listaEntradasTarde ) {


        DateFormat dateFormat = new SimpleDateFormat("dd-MMMMMM-yyyy");
        //Recoge la fecha de las entradas (con duplicados).
        ArrayList<LineaInforme> informeTmp = new ArrayList<>();
        //Para almacenar las fechas sin duplicados y por orden se insercion.
        LinkedHashSet<String> listaFechas = new LinkedHashSet<>();
        //Informe final de fechas con número de visitas.
        ArrayList<LineaInforme> informeDiario = new ArrayList<>();


        
        for (int i = 0 ; i < listaEntradasTarde.size() ; i++) {       
            
            informeTmp.add(new LineaInforme(dateFormat.format(listaEntradasTarde.get(i).fechaHoraEntrada.getTime())));
            listaFechas.add(dateFormat.format(listaEntradasTarde.get(i).fechaHoraEntrada.getTime()));

        }

        informeDiario = eliminarFechasDuplicadas(listaFechas, informeDiario);
        informeDiario = contarVisitas(informeDiario, informeTmp);


        return informeDiario;
        
    }      
    
    private static ArrayList<LineaInforme> agruparInformes(ArrayList<LineaInforme> informeDiarioEntradaGeneral,
                                                           ArrayList<LineaInforme> informeDiarioEntradaFamiliar,
                                                           ArrayList<LineaInforme> informeDiarioEntradaLaborable,
                                                           ArrayList<LineaInforme> informeDiarioEntradaTarde,
                                                           ArrayList<LineaInforme> informeDiarioEntradaAniversario) {
     
        ArrayList<LineaInforme> informeDiario = new ArrayList<>();
        
        for (int i = 0 ; i < informeDiarioEntradaGeneral.size() ; i++) { 
            
            informeDiario.add(informeDiarioEntradaGeneral.get(i));

        }
        for (int i = 0 ; i < informeDiarioEntradaFamiliar.size() ; i++) { 
            
            informeDiario.add(informeDiarioEntradaFamiliar.get(i));
        }
        for (int i = 0 ; i < informeDiarioEntradaLaborable.size() ; i++) { 
            
            informeDiario.add(informeDiarioEntradaLaborable.get(i));
        }
        for (int i = 0 ; i < informeDiarioEntradaTarde.size() ; i++) { 
            
            informeDiario.add(informeDiarioEntradaTarde.get(i));
        }
        for (int i = 0 ; i < informeDiarioEntradaAniversario.size() ; i++) { 
            
            informeDiario.add(informeDiarioEntradaAniversario.get(i));
        }        
        
        return informeDiario;
    }
    
    private static ArrayList<LineaInforme> devolverInformeDiarioEntradasTotal(ArrayList<LineaInforme> informeDiarioEntradaGeneral,
                                                                              ArrayList<LineaInforme> informeDiarioEntradaFamiliar,
                                                                              ArrayList<LineaInforme> informeDiarioEntradaLaborable,
                                                                              ArrayList<LineaInforme> informeDiarioEntradaTarde,
                                                                              ArrayList<LineaInforme> informeDiarioEntradaAniversario) {
        LinkedHashSet<String> listaFechas = new LinkedHashSet<>(); 
        
        
        ArrayList<LineaInforme> informeAgrupado = agruparInformes(informeDiarioEntradaGeneral,
                                                             informeDiarioEntradaFamiliar,
                                                             informeDiarioEntradaLaborable,
                                                             informeDiarioEntradaTarde,
                                                             informeDiarioEntradaAniversario);
        
        //System.out.println("\nInforme agrupado:");
        //mostrarInformeDiario(informeAgrupado);
                
        for (int i = 0 ; i < informeAgrupado.size() ; i++) {       

            listaFechas.add(informeAgrupado.get(i).getFecha());

        }  
        
        ArrayList<LineaInforme> informeDiario = new ArrayList<>();
        
        //System.out.println("\nImprimimos fechas");
        
        for (String fe: listaFechas) {
            //System.out.println(fe);
            informeDiario.add(new LineaInforme(fe));
        }

       
        for (int i=0; i < informeDiario.size(); i++) {
            for (int j=0; j< informeAgrupado.size(); j++) {
                if (informeDiario.get(i).getFecha().equals(informeAgrupado.get(j).getFecha())) {
                    informeDiario.get(i).sumarNumero(informeAgrupado.get(j).getNumero());
                }
            }
        }        
       
        
        return informeDiario;
        
    }
    public static void informeDiario (ListaObjetos listaObjetos) {
        
        System.out.println("--------------------"); 
        System.out.println("Número de Visitantes"); 
        System.out.println("---------------------\n");
        
        System.out.println("\n-Entrada General:");
        ArrayList<LineaInforme> informeDiarioEntradaGeneral = devolverInformeDiarioEntradaGeneral(listaObjetos.getListaEntradaGeneral());
        mostrarInformeDiario(informeDiarioEntradaGeneral);
        
        System.out.println("\n-Entrada Familiar:");        
        ArrayList<LineaInforme> informeDiarioEntradaFamiliar = devolverInformeDiarioEntradaFamilia(listaObjetos.getListaEntradasFamilia());
        mostrarInformeDiario(informeDiarioEntradaFamiliar);  
        
        System.out.println("\n-Entrada Laborable:");   
        ArrayList<LineaInforme> informeDiarioEntradaLaborable = devolverInformeDiarioEntradaLaborable(listaObjetos.getListaEntradasLaborable());
        mostrarInformeDiario(informeDiarioEntradaLaborable);  
        
        System.out.println("\n-Entrada de Tarde:");           
        ArrayList<LineaInforme> informeDiarioEntradaTarde = devolverInformeDiarioEntradaTarde(listaObjetos.getListaEntradasTarde());
        mostrarInformeDiario(informeDiarioEntradaTarde);
        
        System.out.println("\n-Entrada Aniversario:");           
        ArrayList<LineaInforme> informeDiarioEntradaAniversario = devolverInformeDiarioEntradaAniversario(listaObjetos.getListaEntradasAniversario());
        mostrarInformeDiario(informeDiarioEntradaAniversario);    
        
        
        ArrayList<LineaInforme> informeDiario = devolverInformeDiarioEntradasTotal(informeDiarioEntradaGeneral,
                                                                                   informeDiarioEntradaFamiliar,
                                                                                   informeDiarioEntradaLaborable,
                                                                                   informeDiarioEntradaTarde,
                                                                                   informeDiarioEntradaAniversario);
        System.out.println("\nTOTAL de visitantes por día:"); 
        mostrarInformeDiario(informeDiario);           
        System.out.println("");
    }
    
    
}