package conversorVer3.src.mx.conversor.menu;

import java.util.Scanner;

/***
 * Version 3 del menu para el conversor de divisas.
 * 
 * @author Fanny (github: kurof)
 * @version 0.03
 */

public class Menu1 {
    
    public void menuConversor() {

        //Declarando variables de escaner (introducir datos)
        Scanner entradaOpcion = new Scanner(System.in);
        Scanner entradaConversorA = new Scanner(System.in); //para la primera opcion

        int opcionConversor = 0; //variable para la entrada de switch
        
        //agregando la primera capa del menú
        while(opcionConversor!=3){
            //Texto del menu
            System.out.println("******** CONVERSOR DE DIVISAS *********");
            System.out.println("\nElija la opción que desea hacer: \n");
            System.out.println("1) Divisa extranjera a Pesos mexicanos (MXN).");
            System.out.println("2) Pesos mexicanos (MXN) a divisa extranjera.");
            System.out.println("3) Cerrar el programa.");

            System.out.println("\nOpción: ");
            opcionConversor = entradaOpcion.nextInt(); //para tomar la opcion

            //Opciones entre 1 y 2
            if (opcionConversor == 1) {
                System.out.println("--- Conversor de Divisa extranjera a MXN ---");
            } else if (opcionConversor == 2) {
                System.out.println("--- Conversor de MXN a Divisa extranjera ---");
            }
            
        }

    }
}
