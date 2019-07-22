package Utilidades;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Bartolome Vich Lozano
 * @version 1.10 2019/7/21
 */

public class Varios {
    private static final Scanner scan = new Scanner(System.in);

    /**
     *
     * @return
     */
    public static int pedirOpcion() {
        
        int opcion = 0;
        boolean esValido = false;
        
        while (esValido == false) {
            try {
                System.out.println("-");
                opcion = scan.nextInt();
                esValido = true;
            } catch (InputMismatchException e) {
                System.out.print("Inserte un número correcto: ");
                scan.next();
            }
        }
        return opcion;
    }
}

    
