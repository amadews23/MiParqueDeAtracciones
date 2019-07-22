package Controladores;
import Gente.Persona;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Bartolome Vich Lozano
 * @version 1.10 2019/7/22
 */

public class ControladorPersona {

    /**
     *
     */
    public ControladorPersona() {
        
    }

    /**
     *
     * @return Persona
     */
    public Persona crearPersona() {
        
        Scanner datosPersona = new Scanner(System.in);
        String nombre = "";
        String apellidos = "";
        int diaNacimiento = 0;
        int mesNacimiento = 0;
        int anyoNacimiento = 0;
        boolean valido = false;
        
        while (valido == false) {
            try {
                System.out.println("Introducir datos: ");
                
                System.out.print("Nombre: ");
                nombre = datosPersona.nextLine();
                
                System.out.print("Apellidos: ");
                apellidos = datosPersona.nextLine();
                
                do {
                    System.out.print("Día de nacimiento: ");
                    diaNacimiento = datosPersona.nextInt();
                } while (diaNacimiento < 0 || diaNacimiento > 31);   
                
                do {
                    System.out.print("Mes de nacimiento: ");
                    mesNacimiento = datosPersona.nextInt();                
                } while (mesNacimiento < 0 || mesNacimiento > 12);
                
                do {
                    System.out.print("Año de nacimiento: ");
                    anyoNacimiento = datosPersona.nextInt();  
                } while (anyoNacimiento < 1899 || anyoNacimiento > 2019);    
                valido = true;
                
            } catch (InputMismatchException e) {
                System.out.println("Inserte un número válido:");
                datosPersona.next();
            }
        }
        Persona persona = new Persona(nombre, 
                                      apellidos, 
                                      diaNacimiento, 
                                      mesNacimiento, 
                                      anyoNacimiento);
        return persona;
        
        
    }
    
 
}
