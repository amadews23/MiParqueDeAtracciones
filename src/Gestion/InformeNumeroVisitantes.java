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
    
    private static void mostrarInforme(ArrayList<LineaInforme> informeDiario) {
    
        for (int i = 0; i < informeDiario.size(); i++) {

            System.out.println(informeDiario.get(i).getFecha()+": "+informeDiario.get(i).getNumero());
        }        
        
    }
    
    private static ArrayList<LineaInforme> devolverInformeEntradaGeneral(ArrayList<EntradaGeneral> listaEntradasGeneral,
                                                                         DateFormat dateFormat  ) {
        
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
    
    private static ArrayList<LineaInforme> devolverInformeEntradaAniversario(ArrayList<EntradaAniversario> listaEntradasAniversario,
                                                                             DateFormat dateFormat) {

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
    
    private static ArrayList<LineaInforme> devolverInformeEntradaFamilia(ArrayList<EntradaFamilia> listaEntradasFamilia,
                                                                                DateFormat dateFormat) {

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

    private static ArrayList<LineaInforme> devolverInformeEntradaLaborable(ArrayList<EntradaLaborable> listaEntradasLaborable,
                                                                                  DateFormat dateFormat) {

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

    private static ArrayList<LineaInforme> devolverInformeEntradaTarde(ArrayList<EntradaTarde> listaEntradasTarde,
                                                                              DateFormat dateFormat) {
        
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
    
    private static ArrayList<LineaInforme> devolverInformeEntradasTotal(ArrayList<LineaInforme> informeDiarioEntradaGeneral,
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
    
    private static int devolverTotalVisitante(ArrayList<LineaInforme> informeDiario) {
        int totalVisitantes = 0;
        for (LineaInforme lineaInforme: informeDiario) {
            totalVisitantes = totalVisitantes + lineaInforme.getNumero();
        }
        return totalVisitantes;
    }

    private static void crearInforme(ListaObjetos listaObjetos, DateFormat dateFormat, int media) {
        
    
       float promedioVisitantes = 0.0F;        
        
        System.out.println("\n-Entrada General:");
        ArrayList<LineaInforme> informeDiarioEntradaGeneral = devolverInformeEntradaGeneral(listaObjetos.getListaEntradaGeneral(), 
                                                                                            dateFormat );
        mostrarInforme(informeDiarioEntradaGeneral);    
        
       System.out.println("\n-Entrada Familiar:");        
        ArrayList<LineaInforme> informeDiarioEntradaFamiliar = devolverInformeEntradaFamilia(listaObjetos.getListaEntradasFamilia(),
                                                                                             dateFormat);
        mostrarInforme(informeDiarioEntradaFamiliar);  
        
        System.out.println("\n-Entrada Laborable:");   
        ArrayList<LineaInforme> informeDiarioEntradaLaborable = devolverInformeEntradaLaborable(listaObjetos.getListaEntradasLaborable(),
                                                                                                       dateFormat);
        mostrarInforme(informeDiarioEntradaLaborable);  
        
        System.out.println("\n-Entrada de Tarde:");           
        ArrayList<LineaInforme> informeDiarioEntradaTarde = devolverInformeEntradaTarde(listaObjetos.getListaEntradasTarde(),
                                                                                               dateFormat);
        mostrarInforme(informeDiarioEntradaTarde);
        
        System.out.println("\n-Entrada Aniversario:");           
        ArrayList<LineaInforme> informeDiarioEntradaAniversario = devolverInformeEntradaAniversario(listaObjetos.getListaEntradasAniversario(),
                                                                                                           dateFormat);
        mostrarInforme(informeDiarioEntradaAniversario);    

        ArrayList<LineaInforme> informeDiario = devolverInformeEntradasTotal(informeDiarioEntradaGeneral,
                                                                             informeDiarioEntradaFamiliar,
                                                                             informeDiarioEntradaLaborable,
                                                                             informeDiarioEntradaTarde,
                                                                             informeDiarioEntradaAniversario);
        System.out.println("\nTOTAL de visitantes:"); 
        mostrarInforme(informeDiario);      

        System.out.println("\nPromedio de Visitantes:");
        
        promedioVisitantes = devolverTotalVisitante(informeDiario)/media;
        
        System.out.println(promedioVisitantes);           
    }
    
    /**
     *
     * @param listaObjetos
     */
    public static void informeDiario (ListaObjetos listaObjetos) {
            
        System.out.println("----------------------------"); 
        System.out.println("Número de Visitantes diarios"); 
        System.out.println("---------------------------\n");
        
        DateFormat dateFormat = new SimpleDateFormat("dd-MMMMMM-yyyy"); 
        
        crearInforme(listaObjetos, dateFormat, 365);   
  
    }
          
    /**
     *
     * @param listaObjetos
     */
    public static void informeMensual (ListaObjetos listaObjetos) {
        
        System.out.println("------------------------------"); 
        System.out.println("Número de Visitantes mensuales"); 
        System.out.println("------------------------------\n");
        
        DateFormat dateFormat = new SimpleDateFormat("MMMMMM"); 
        
        crearInforme(listaObjetos, dateFormat, 12);
      
        
    }
    
    public static void informeAnual (ListaObjetos listaObjetos) {
        
        System.out.println("------------------------------"); 
        System.out.println("Número de Visitantes anuales"); 
        System.out.println("------------------------------\n");
        
        DateFormat dateFormat = new SimpleDateFormat("yyyy"); 
        
        crearInforme(listaObjetos, dateFormat, 1);
      
        
    }    
    
}
