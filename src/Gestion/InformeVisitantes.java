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
public class InformeVisitantes {
    
    
    public InformeVisitantes() {              
        
    }
    
    private static ArrayList<LineaInformeVisitantes> eliminarFechasDuplicadas(LinkedHashSet<String> listaFechas, 
                                                                              ArrayList<LineaInformeVisitantes> informeDiario ) {
        
        //Copiamos a la lista final las fechas (no estaran duplicadas)
        Iterator <String> iterador2 = listaFechas.iterator();       
        while(iterador2.hasNext()) {

            informeDiario.add(new LineaInformeVisitantes(iterador2.next()));

        }
        
        return informeDiario;
        
    }

    private static ArrayList<LineaInformeVisitantes> contarVisitas(ArrayList<LineaInformeVisitantes> informe,
                                                                   ArrayList<LineaInformeVisitantes> informeTmp) {
        
        //Por cada fecha duplicada incrementamos Numero en el objeto lineaInforme
        for (int i=0; i < informe.size(); i++) {
            for (int j=0; j < informeTmp.size(); j++) {
                if (informe.get(i).getFecha().equals(informeTmp.get(j).getFecha())) {
                    informe.get(i).sumar();
                }
                
            }
        }
        
        return informe;
                
    }
    
    private static void mostrarInforme(ArrayList<LineaInformeVisitantes> informe) {
    
        for (int i = 0; i < informe.size(); i++) {

            System.out.println(informe.get(i).getFecha()+": "+informe.get(i).getNumero());
        }        
        
    }
    
    private static ArrayList<LineaInformeVisitantes> devolverInformeEntradaGeneral(ArrayList<EntradaGeneral> listaEntradasGeneral,
                                                                                   DateFormat dateFormat  ) {
        
        //Recoge la fecha de las entradas (con duplicados).
        ArrayList<LineaInformeVisitantes> informeTmp = new ArrayList<>();
        //Para almacenar las fechas sin duplicados y por orden se insercion.
        LinkedHashSet<String> listaFechas = new LinkedHashSet<>();
        //Informe final de fechas con número de visitas.
        ArrayList<LineaInformeVisitantes> informe = new ArrayList<>();
        
        for (int i = 0 ; i < listaEntradasGeneral.size() ; i++) {       
            
            informeTmp.add(new LineaInformeVisitantes(dateFormat.format(listaEntradasGeneral.get(i).fechaHoraEntrada.getTime())));
            listaFechas.add(dateFormat.format(listaEntradasGeneral.get(i).fechaHoraEntrada.getTime()));

        }

        informe = eliminarFechasDuplicadas(listaFechas, informe);
        informe = contarVisitas(informe, informeTmp);

        return informe;
        
    }
    
    private static ArrayList<LineaInformeVisitantes> devolverInformeEntradaAniversario(ArrayList<EntradaAniversario> listaEntradasAniversario,
                                                                                       DateFormat dateFormat) {

        //Recoge la fecha de las entradas (con duplicados).
        ArrayList<LineaInformeVisitantes> informeTmp = new ArrayList<>();
        //Para almacenar las fechas sin duplicados y por orden se insercion.
        LinkedHashSet<String> listaFechas = new LinkedHashSet<>();
        //Informe final de fechas con número de visitas.
        ArrayList<LineaInformeVisitantes> informe = new ArrayList<>();
        
        for (int i = 0 ; i < listaEntradasAniversario.size() ; i++) {       
            
            informeTmp.add(new LineaInformeVisitantes(dateFormat.format(listaEntradasAniversario.get(i).fechaHoraEntrada.getTime())));
            listaFechas.add(dateFormat.format(listaEntradasAniversario.get(i).fechaHoraEntrada.getTime()));

        }

        informe = eliminarFechasDuplicadas(listaFechas, informe);
        informe = contarVisitas(informe, informeTmp);

        return informe;
        
    }
    
    private static ArrayList<LineaInformeVisitantes> devolverInformeEntradaFamilia(ArrayList<EntradaFamilia> listaEntradasFamilia,
                                                                                   DateFormat dateFormat) {

        //Recoge la fecha de las entradas (con duplicados).
        ArrayList<LineaInformeVisitantes> informeTmp = new ArrayList<>();
        //Para almacenar las fechas sin duplicados y por orden se insercion.
        LinkedHashSet<String> listaFechas = new LinkedHashSet<>();
        //Informe final de fechas con número de visitas.
        ArrayList<LineaInformeVisitantes> informe = new ArrayList<>();
      
        for (int i = 0 ; i < listaEntradasFamilia.size() ; i++) {       
            
            informeTmp.add(new LineaInformeVisitantes(dateFormat.format(listaEntradasFamilia.get(i).fechaHoraEntrada.getTime())));
            listaFechas.add(dateFormat.format(listaEntradasFamilia.get(i).fechaHoraEntrada.getTime()));

        }

        informe = eliminarFechasDuplicadas(listaFechas, informe);
        informe = contarVisitas(informe, informeTmp);

        return informe;
        
    }

    private static ArrayList<LineaInformeVisitantes> devolverInformeEntradaLaborable(ArrayList<EntradaLaborable> listaEntradasLaborable,
                                                                                     DateFormat dateFormat) {

        //Recoge la fecha de las entradas (con duplicados).
        ArrayList<LineaInformeVisitantes> informeTmp = new ArrayList<>();
        //Para almacenar las fechas sin duplicados y por orden se insercion.
        LinkedHashSet<String> listaFechas = new LinkedHashSet<>();
        //Informe final de fechas con número de visitas.
        ArrayList<LineaInformeVisitantes> informe = new ArrayList<>();
        
        for (int i = 0 ; i < listaEntradasLaborable.size() ; i++) {       
            
            informeTmp.add(new LineaInformeVisitantes(dateFormat.format(listaEntradasLaborable.get(i).fechaHoraEntrada.getTime())));
            listaFechas.add(dateFormat.format(listaEntradasLaborable.get(i).fechaHoraEntrada.getTime()));

        }

        informe = eliminarFechasDuplicadas(listaFechas, informe);
        informe = contarVisitas(informe, informeTmp);


        return informe;
        
    }

    private static ArrayList<LineaInformeVisitantes> devolverInformeEntradaTarde(ArrayList<EntradaTarde> listaEntradasTarde,
                                                                                 DateFormat dateFormat) {
        
            //Recoge la fecha de las entradas (con duplicados).
        ArrayList<LineaInformeVisitantes> informeTmp = new ArrayList<>();
        //Para almacenar las fechas sin duplicados y por orden se insercion.
        LinkedHashSet<String> listaFechas = new LinkedHashSet<>();
        //Informe final de fechas con número de visitas.
        ArrayList<LineaInformeVisitantes> informe = new ArrayList<>();
        
        for (int i = 0 ; i < listaEntradasTarde.size() ; i++) {       
            
            informeTmp.add(new LineaInformeVisitantes(dateFormat.format(listaEntradasTarde.get(i).fechaHoraEntrada.getTime())));
            listaFechas.add(dateFormat.format(listaEntradasTarde.get(i).fechaHoraEntrada.getTime()));

        }

        informe = eliminarFechasDuplicadas(listaFechas, informe);
        informe = contarVisitas(informe, informeTmp);

        return informe;
        
    }    
    
    private static ArrayList<LineaInformeVisitantes> agruparInformes(ArrayList<LineaInformeVisitantes> informeEntradaGeneral,
                                                                     ArrayList<LineaInformeVisitantes> informeEntradaFamiliar,
                                                                     ArrayList<LineaInformeVisitantes> informeEntradaLaborable,
                                                                     ArrayList<LineaInformeVisitantes> informeEntradaTarde,
                                                                     ArrayList<LineaInformeVisitantes> informeEntradaAniversario) {
     
        ArrayList<LineaInformeVisitantes> informe = new ArrayList<>();
        
        for (int i = 0 ; i < informeEntradaGeneral.size() ; i++) { 
            
            informe.add(informeEntradaGeneral.get(i));

        }
        for (int i = 0 ; i < informeEntradaFamiliar.size() ; i++) { 
            
            informe.add(informeEntradaFamiliar.get(i));
        }
        for (int i = 0 ; i < informeEntradaLaborable.size() ; i++) { 
            
            informe.add(informeEntradaLaborable.get(i));
        }
        for (int i = 0 ; i < informeEntradaTarde.size() ; i++) { 
            
            informe.add(informeEntradaTarde.get(i));
        }
        for (int i = 0 ; i < informeEntradaAniversario.size() ; i++) { 
            
            informe.add(informeEntradaAniversario.get(i));
        }        
        
        return informe;
    }
    
    private static ArrayList<LineaInformeVisitantes> devolverInformeEntradasTotal(ArrayList<LineaInformeVisitantes> informeEntradaGeneral,
                                                                                  ArrayList<LineaInformeVisitantes> informeEntradaFamiliar,
                                                                                  ArrayList<LineaInformeVisitantes> informeEntradaLaborable,
                                                                                  ArrayList<LineaInformeVisitantes> informeEntradaTarde,
                                                                                  ArrayList<LineaInformeVisitantes> informeEntradaAniversario) {
        LinkedHashSet<String> listaFechas = new LinkedHashSet<>(); 
        
        
        ArrayList<LineaInformeVisitantes> informeAgrupado = agruparInformes(informeEntradaGeneral,
                                                                  informeEntradaFamiliar,
                                                                  informeEntradaLaborable,
                                                                  informeEntradaTarde,
                                                                  informeEntradaAniversario);
        
        //System.out.println("\nInforme agrupado:");
        //mostrarInformeDiario(informeAgrupado);
        
        for (int i = 0 ; i < informeAgrupado.size() ; i++) {       

            listaFechas.add(informeAgrupado.get(i).getFecha());

        }  
        
        ArrayList<LineaInformeVisitantes> informe = new ArrayList<>();
        
        //System.out.println("\nImprimimos fechas");
        
        for (String fecha: listaFechas) {
            //System.out.println(fe);
            informe.add(new LineaInformeVisitantes(fecha));
        }
       
        for (int i=0; i < informe.size(); i++) {
            for (int j=0; j< informeAgrupado.size(); j++) {
                if (informe.get(i).getFecha().equals(informeAgrupado.get(j).getFecha())) {
                    informe.get(i).sumarNumero(informeAgrupado.get(j).getNumero());
                    
                }
            }
        }              
        
        return informe;
        
    }
    
    private static int devolverTotalVisitante(ArrayList<LineaInformeVisitantes> informe) {
        
        int totalVisitantes = 0;
        
        for (LineaInformeVisitantes lineaInforme: informe) {
            totalVisitantes = totalVisitantes + lineaInforme.getNumero();
        }
        
        return totalVisitantes;
    }

    private static void crearInforme(ListaObjetos listaObjetos, DateFormat dateFormat, int media) {       
    
       float promedioVisitantes = 0.0F;        
        
        System.out.println("\n-Entrada General:");
        ArrayList<LineaInformeVisitantes> informeEntradaGeneral = devolverInformeEntradaGeneral(listaObjetos.getListaEntradaGeneral(), 
                                                                                                dateFormat );
        mostrarInforme(informeEntradaGeneral);    
        
        System.out.println("\n-Entrada Familiar:");        
        ArrayList<LineaInformeVisitantes> informeEntradaFamiliar = devolverInformeEntradaFamilia(listaObjetos.getListaEntradasFamilia(),
                                                                                                 dateFormat);
        mostrarInforme(informeEntradaFamiliar);  
        
        System.out.println("\n-Entrada Laborable:");   
        ArrayList<LineaInformeVisitantes> informeEntradaLaborable = devolverInformeEntradaLaborable(listaObjetos.getListaEntradasLaborable(),
                                                                                                    dateFormat);
        mostrarInforme(informeEntradaLaborable);  
        
        System.out.println("\n-Entrada de Tarde:");           
        ArrayList<LineaInformeVisitantes> informeEntradaTarde = devolverInformeEntradaTarde(listaObjetos.getListaEntradasTarde(),
                                                                                            dateFormat);
        mostrarInforme(informeEntradaTarde);
        
        System.out.println("\n-Entrada Aniversario:");           
        ArrayList<LineaInformeVisitantes> informeEntradaAniversario = devolverInformeEntradaAniversario(listaObjetos.getListaEntradasAniversario(),
                                                                                                        dateFormat);
        mostrarInforme(informeEntradaAniversario);    

        ArrayList<LineaInformeVisitantes> informe = devolverInformeEntradasTotal(informeEntradaGeneral,
                                                                                 informeEntradaFamiliar,
                                                                                 informeEntradaLaborable,
                                                                                 informeEntradaTarde,
                                                                                 informeEntradaAniversario);
        System.out.println("\nTOTAL de visitantes:"); 
        mostrarInforme(informe);      

        System.out.println("\nPromedio de Visitantes:");
        
        promedioVisitantes = (float)devolverTotalVisitante(informe)/media;
        
        System.out.println(promedioVisitantes);           
    }

    private static ArrayList<LineaInformeVisitantes> devolverInformePrecioEntradasTotal(ArrayList<LineaInformeVisitantes> informeEntradaGeneral,
                                                                                        ArrayList<LineaInformeVisitantes> informeEntradaFamiliar,
                                                                                        ArrayList<LineaInformeVisitantes> informeEntradaLaborable,
                                                                                        ArrayList<LineaInformeVisitantes> informeEntradaTarde,
                                                                                        ArrayList<LineaInformeVisitantes> informeEntradaAniversario) {
        LinkedHashSet<String> listaFechas = new LinkedHashSet<>(); 
        
        
        ArrayList<LineaInformeVisitantes> informeAgrupado = agruparInformes(informeEntradaGeneral,
                                                                  informeEntradaFamiliar,
                                                                  informeEntradaLaborable,
                                                                  informeEntradaTarde,
                                                                  informeEntradaAniversario);
                
        for (int i = 0 ; i < informeAgrupado.size() ; i++) {       

            listaFechas.add(informeAgrupado.get(i).getFecha());

        }  
        
        ArrayList<LineaInformeVisitantes> informe = new ArrayList<>();
               
        for (String fecha: listaFechas) {

            informe.add(new LineaInformeVisitantes(fecha));
        }
       
        for (int i=0; i < informe.size(); i++) {
            for (int j=0; j< informeAgrupado.size(); j++) {
                if (informe.get(i).getFecha().equals(informeAgrupado.get(j).getFecha())) {
                    informe.get(i).sumarPrecio(informeAgrupado.get(j).getPrecio());
                    
                }
            }
        }              
        
        return informe;
        
    }    

    private static ArrayList<LineaInformeVisitantes> contarPrecio(ArrayList<LineaInformeVisitantes> informe,
                                                                  ArrayList<LineaInformeVisitantes> informeTmp) {
        
        //Por cada fecha duplicada incrementamos Numero en el objeto lineaInforme
        for (int i=0; i < informe.size(); i++) {
            for (int j=0; j < informeTmp.size(); j++) {
                if (informe.get(i).getFecha().equals(informeTmp.get(j).getFecha())) {
                    informe.get(i).sumarPrecio(informeTmp.get(j).getPrecio());
                }
                
            }
        }
        
        return informe;
                
    }

    private static void mostrarInformePrecio(ArrayList<LineaInformeVisitantes> informe) {
    
        for (int i = 0; i < informe.size(); i++) {

            System.out.println(informe.get(i).getFecha()+": "+informe.get(i).getPrecio());
        }        
        
    }
    
    private static ArrayList<LineaInformeVisitantes> devolverInformePrecioEntradaGeneral(ArrayList<EntradaGeneral> listaEntradasGeneral,
                                                                                         DateFormat dateFormat  ) {
        
        //Recoge la fecha de las entradas (con duplicados).
        ArrayList<LineaInformeVisitantes> informeTmp = new ArrayList<>();
        //Para almacenar las fechas sin duplicados y por orden se insercion.
        LinkedHashSet<String> listaFechas = new LinkedHashSet<>();
        //Informe final
        ArrayList<LineaInformeVisitantes> informe = new ArrayList<>();
        
        for (int i = 0 ; i < listaEntradasGeneral.size() ; i++) {       
            
            informeTmp.add(new LineaInformeVisitantes(dateFormat.format(listaEntradasGeneral.get(i).fechaHoraEntrada.getTime()),
                                            listaEntradasGeneral.get(i).getPrecio()));
            
            listaFechas.add(dateFormat.format(listaEntradasGeneral.get(i).fechaHoraEntrada.getTime()));

        }

        informe = eliminarFechasDuplicadas(listaFechas, informe);
        informe = contarPrecio(informe, informeTmp);

        return informe;
        
    }

    private static ArrayList<LineaInformeVisitantes> devolverInformePrecioEntradaAniversario(ArrayList<EntradaAniversario> listaEntradasAniversario,
                                                                                             DateFormat dateFormat) {

        //Recoge la fecha de las entradas (con duplicados).
        ArrayList<LineaInformeVisitantes> informeTmp = new ArrayList<>();
        //Para almacenar las fechas sin duplicados y por orden se insercion.
        LinkedHashSet<String> listaFechas = new LinkedHashSet<>();
        //Informe final
        ArrayList<LineaInformeVisitantes> informe = new ArrayList<>();
        
        for (int i = 0 ; i < listaEntradasAniversario.size() ; i++) {       
            
            informeTmp.add(new LineaInformeVisitantes(dateFormat.format(listaEntradasAniversario.get(i).fechaHoraEntrada.getTime()),
                                            listaEntradasAniversario.get(i).getPrecio()));
            
            listaFechas.add(dateFormat.format(listaEntradasAniversario.get(i).fechaHoraEntrada.getTime()));

        }

        informe = eliminarFechasDuplicadas(listaFechas, informe);
        informe = contarPrecio(informe, informeTmp);

        return informe;
        
    }

    private static ArrayList<LineaInformeVisitantes> devolverInformePrecioEntradaFamilia(ArrayList<EntradaFamilia> listaEntradasFamilia,
                                                                                         DateFormat dateFormat) {

        //Recoge la fecha de las entradas (con duplicados).
        ArrayList<LineaInformeVisitantes> informeTmp = new ArrayList<>();
        //Para almacenar las fechas sin duplicados y por orden se insercion.
        LinkedHashSet<String> listaFechas = new LinkedHashSet<>();
        //Informe final 
        ArrayList<LineaInformeVisitantes> informe = new ArrayList<>();
      
        for (int i = 0 ; i < listaEntradasFamilia.size() ; i++) {       
            
            informeTmp.add(new LineaInformeVisitantes(dateFormat.format(listaEntradasFamilia.get(i).fechaHoraEntrada.getTime()),
                                                                listaEntradasFamilia.get(i).getPrecio()));
            
            listaFechas.add(dateFormat.format(listaEntradasFamilia.get(i).fechaHoraEntrada.getTime()));

        }

        informe = eliminarFechasDuplicadas(listaFechas, informe);
        informe = contarPrecio(informe, informeTmp);

        return informe;
        
    }
    
    private static ArrayList<LineaInformeVisitantes> devolverInformePrecioEntradaLaborable(ArrayList<EntradaLaborable> listaEntradasLaborable,
                                                                                           DateFormat dateFormat) {

        //Recoge la fecha de las entradas (con duplicados).
        ArrayList<LineaInformeVisitantes> informeTmp = new ArrayList<>();
        //Para almacenar las fechas sin duplicados y por orden se insercion.
        LinkedHashSet<String> listaFechas = new LinkedHashSet<>();
        //Informe final de fechas con número de visitas.
        ArrayList<LineaInformeVisitantes> informe = new ArrayList<>();
        
        for (int i = 0 ; i < listaEntradasLaborable.size() ; i++) {       
            
            informeTmp.add(new LineaInformeVisitantes(dateFormat.format(listaEntradasLaborable.get(i).fechaHoraEntrada.getTime()),
                                                              listaEntradasLaborable.get(i).getPrecio()));
            
            listaFechas.add(dateFormat.format(listaEntradasLaborable.get(i).fechaHoraEntrada.getTime()));

        }

        informe = eliminarFechasDuplicadas(listaFechas, informe);
        informe = contarPrecio(informe, informeTmp);


        return informe;
        
    }
    
    private static ArrayList<LineaInformeVisitantes> devolverInformePrecioEntradaTarde(ArrayList<EntradaTarde> listaEntradasTarde,
                                                                                       DateFormat dateFormat) {
        
            //Recoge la fecha de las entradas (con duplicados).
        ArrayList<LineaInformeVisitantes> informeTmp = new ArrayList<>();
        //Para almacenar las fechas sin duplicados y por orden se insercion.
        LinkedHashSet<String> listaFechas = new LinkedHashSet<>();
        //Informe final de fechas con número de visitas.
        ArrayList<LineaInformeVisitantes> informe = new ArrayList<>();
        
        for (int i = 0 ; i < listaEntradasTarde.size() ; i++) {       
            
            informeTmp.add(new LineaInformeVisitantes(dateFormat.format(listaEntradasTarde.get(i).fechaHoraEntrada.getTime()),
                                                              listaEntradasTarde.get(i).getPrecio()));
            
            listaFechas.add(dateFormat.format(listaEntradasTarde.get(i).fechaHoraEntrada.getTime()));

        }

        informe = eliminarFechasDuplicadas(listaFechas, informe);
        informe = contarPrecio(informe, informeTmp);

        return informe;
        
    }    
    
    private static float devolverPrecioTotalVisitante(ArrayList<LineaInformeVisitantes> informe) {
        
        float totalPrecio = 0;
        
        for (LineaInformeVisitantes lineaInforme: informe) {
            totalPrecio = totalPrecio + lineaInforme.getPrecio();
        }
        
        return totalPrecio;
    }
    
    private static void crearInformePrecio(ListaObjetos listaObjetos, DateFormat dateFormat, int media) {       
    
       float promedioPrecioVisitantes = 0.0F;        
        
        System.out.println("\n-Entrada General:");
        ArrayList<LineaInformeVisitantes> informeEntradaGeneral = devolverInformePrecioEntradaGeneral(listaObjetos.getListaEntradaGeneral(), 
                                                                                            dateFormat );
        mostrarInformePrecio(informeEntradaGeneral);    
        
        System.out.println("\n-Entrada Familiar:");        
        ArrayList<LineaInformeVisitantes> informeEntradaFamiliar = devolverInformePrecioEntradaFamilia(listaObjetos.getListaEntradasFamilia(),
                                                                                             dateFormat);
        mostrarInformePrecio(informeEntradaFamiliar);  
        
        System.out.println("\n-Entrada Laborable:");   
        ArrayList<LineaInformeVisitantes> informeEntradaLaborable = devolverInformePrecioEntradaLaborable(listaObjetos.getListaEntradasLaborable(),
                                                                                                dateFormat);
        mostrarInformePrecio(informeEntradaLaborable);  
        
        System.out.println("\n-Entrada de Tarde:");           
        ArrayList<LineaInformeVisitantes> informeEntradaTarde = devolverInformePrecioEntradaTarde(listaObjetos.getListaEntradasTarde(),
                                                                                        dateFormat);
        mostrarInformePrecio(informeEntradaTarde);
        
        System.out.println("\n-Entrada Aniversario:");           
        ArrayList<LineaInformeVisitantes> informeEntradaAniversario = devolverInformePrecioEntradaAniversario(listaObjetos.getListaEntradasAniversario(),
                                                                                                    dateFormat);
        mostrarInformePrecio(informeEntradaAniversario);    

        ArrayList<LineaInformeVisitantes> informe = devolverInformePrecioEntradasTotal(informeEntradaGeneral,
                                                                             informeEntradaFamiliar,
                                                                             informeEntradaLaborable,
                                                                             informeEntradaTarde,
                                                                             informeEntradaAniversario);
        System.out.println("\nTOTAL de Gasto de los visitantes:"); 
        mostrarInformePrecio(informe);      

        System.out.println("\nPromedio de Gasto de los Visitantes:");
        
        promedioPrecioVisitantes = devolverPrecioTotalVisitante(informe)/media;
        
        System.out.println(promedioPrecioVisitantes);           
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
        
        //TODO
        //Ojo! son todos los meses de todos los años        
        DateFormat dateFormat = new SimpleDateFormat("MMMMMM"); 
        
        crearInforme(listaObjetos, dateFormat, 12);     
        
    }
    
    /**
     *
     * @param listaObjetos
     */
    public static void informeAnual (ListaObjetos listaObjetos) {
        
        System.out.println("------------------------------"); 
        System.out.println("Número de Visitantes anuales"); 
        System.out.println("------------------------------\n");
        
        DateFormat dateFormat = new SimpleDateFormat("yyyy"); 
        
        crearInforme(listaObjetos, dateFormat, 1);
             
    }    

    /**
     *
     * @param listaObjetos
     */
    public static void informeSemanal (ListaObjetos listaObjetos) {
        
        System.out.println("------------------------------"); 
        System.out.println("Número de Visitantes semanales"); 
        System.out.println("------------------------------\n");
        
        DateFormat dateFormat = new SimpleDateFormat("w-yyyy"); 
        
        crearInforme(listaObjetos, dateFormat, 52);
              
    }  
    
    /**
     *
     * @param listaObjetos
     */
    public static void informeDiarioPrecio (ListaObjetos listaObjetos) {
            
        System.out.println("----------------------------"); 
        System.out.println("Gasto de Visitantes, diario"); 
        System.out.println("---------------------------\n");
        
        DateFormat dateFormat = new SimpleDateFormat("dd-MMMMMM-yyyy"); 
        
        crearInformePrecio(listaObjetos, dateFormat, 365);   
  
    }    

    /**
     *
     * @param listaObjetos
     */
    public static void informeMensualPrecio (ListaObjetos listaObjetos) {
        
        System.out.println("------------------------------"); 
        System.out.println("Gasto de Visitantes, mensual"); 
        System.out.println("------------------------------\n");
        
        //TODO
        //Ojo! son todos los meses de todos los años        
        DateFormat dateFormat = new SimpleDateFormat("MMMMMM"); 
        
        crearInformePrecio(listaObjetos, dateFormat, 12);     
        
    } 

    /**
     *
     * @param listaObjetos
     */
    public static void informeAnualPrecio (ListaObjetos listaObjetos) {
        
        System.out.println("------------------------------"); 
        System.out.println("Gasto de Visitantes, anual"); 
        System.out.println("------------------------------\n");
        
        DateFormat dateFormat = new SimpleDateFormat("yyyy"); 
        
        crearInformePrecio(listaObjetos, dateFormat, 1);
             
    }   

    /**
     *
     * @param listaObjetos
     */
    public static void informeSemanalPrecio (ListaObjetos listaObjetos) {
        
        System.out.println("------------------------------"); 
        System.out.println("Gasto de Visitantes, semanal"); 
        System.out.println("------------------------------\n");
        
        DateFormat dateFormat = new SimpleDateFormat("w-yyyy"); 
        
        crearInformePrecio(listaObjetos, dateFormat, 52);
              
    }  
     
}
