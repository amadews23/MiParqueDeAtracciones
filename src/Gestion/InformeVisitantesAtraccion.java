package Gestion;

import Atracciones.Atraccion;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

/**
 *
 * @author Bartolome Vich Lozano
 * @version 1.0 2019/8/15
 */
public class InformeVisitantesAtraccion {

    public InformeVisitantesAtraccion() {
    }
    
    private static ArrayList<LineaInformeVisitantesAtraccion> copiaSinDuplicados( LinkedHashSet<String> listaAtraccionesFecha,
                                                                                  ArrayList<LineaInformeVisitantesAtraccion> informe) {
        //Copiamos a la lista final de nombreAtraccion+" "+fecha
        Iterator <String> iterador2 = listaAtraccionesFecha.iterator();       
        while(iterador2.hasNext()) {

            informe.add(new LineaInformeVisitantesAtraccion(iterador2.next()));

        }
        
        return informe;        
      
        
    }
    
    private static ArrayList<LineaInformeVisitantesAtraccion> contarVisitas (ArrayList<LineaInformeVisitantesAtraccion> informe,
                                                                             ArrayList<LineaInformeVisitantesAtraccion> informeTmp) {
        
        for (int i=0; i < informe.size(); i++) {
            for (int j=0; j < informeTmp.size(); j++) {
                if (informe.get(i).getNombre().equals(informeTmp.get(j).getNombre())) {
                    informe.get(i).sumar();
                }
            }
        }
        return informe;
    }
    
    private static void mostrarInforme(ArrayList<LineaInformeVisitantesAtraccion> informe) {
    
        for (int i = 0; i < informe.size(); i++) {

            System.out.println(informe.get(i).getNombre()+": "+informe.get(i).getNumero());
        }        
        
    }
    
    private static void mostrarInforme(ArrayList<LineaInformeVisitantesAtraccion> informe, 
                                       int media) {
    
        for (int i = 0; i < informe.size(); i++) {

            System.out.println(informe.get(i).getNombre()+": "
                               +informe.get(i).getNumero() + "      ,media: "
                               + (float)informe.get(i).getNumero()/media);
        }        
        
    }    
    
    private static void crearInforme(ArrayList <Atraccion> listaAtracciones,
                                     DateFormat dateFormat, int media) {       

       ArrayList<LineaInformeVisitantesAtraccion> informe = new ArrayList<>();
       ArrayList<LineaInformeVisitantesAtraccion> informeTmp = new ArrayList<>();       
       LinkedHashSet<String> listaAtraccionesFecha = new LinkedHashSet<>();  
  
       //Copiamos al LinkedHashSet (listaAtraccionesFecha) que almacenará sin duplicados
       //y al ArrayList (informeTmp) con duplicados
       for (int i=0; i < listaAtracciones.size(); i++) {
           for (int j=0; j < listaAtracciones.get(i).getListaClientes().size(); j++) {
               
               listaAtraccionesFecha.add(listaAtracciones.get(i).getNombreAtraccion()+" "
                                         +dateFormat.format(listaAtracciones.get(i).getListaClientes().get(j).getFecha().getTime()));
               
               informeTmp.add(new LineaInformeVisitantesAtraccion(listaAtracciones.get(i).getNombreAtraccion()+" "
                                                                  +dateFormat.format(listaAtracciones.get(i).getListaClientes().get(j).getFecha().getTime())));
               
           }
       }
       
       
       informe = copiaSinDuplicados(listaAtraccionesFecha, informe);
       
       informe = contarVisitas(informe, informeTmp);

       mostrarInforme(informe, media);    
       
       System.out.println("");
          
    }
    
    public static void informeSemanual (ListaObjetos listaObjetos) {
        
        System.out.println("------------------------------"); 
        System.out.println("Número de Visitantes semanales"); 
        System.out.println("------------------------------\n");
           
        DateFormat dateFormat = new SimpleDateFormat("w-yyyy"); 
        
        crearInforme(listaObjetos.getListaAtracciones(),                     
                     dateFormat, 
                     52);             
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
        
        crearInforme(listaObjetos.getListaAtracciones(),
                     dateFormat,
                     12);            
    } 
    
    /**
     *
     * @param listaObjetos
     */
    public static void informeAnual (ListaObjetos listaObjetos) {
        
        System.out.println("-----------------------------"); 
        System.out.println("Número de Visitantes anuales"); 
        System.out.println("-----------------------------\n");
              
        DateFormat dateFormat = new SimpleDateFormat("yyyy"); 
        
        crearInforme(listaObjetos.getListaAtracciones(),
                     dateFormat, 
                     1);         
    }       
}
