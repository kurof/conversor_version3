package conversorVer3.src.mx.conversor.menu;

import java.util.Scanner;

import conversorVer3.src.mx.conversor.logic.Conversor;

public class MenuToForeign {

    public void menuToForeign(){

        //entradas de Scanner
        Scanner entradaOpcion = new Scanner(System.in);
        Scanner entradaCantidad = new Scanner(System.in);

        //para depositar lo que se escribe
        byte opcionMenu = 0;
        double mxnAmount = 0;

        //llamando a la clase que implementa la interfaz
        Conversor toForeign = new Conversor();

        do{

            System.out.println("********* MENU DE CONVERSION A MONEDA EXTRANJERA **********");
            System.out.println("\nQuiero convertir MXN a:\n");
            System.out.println("1) Dolares");
            System.out.println("2) Euros");
            System.out.println("3) Libras esterlinas");
            System.out.println("4) Yenes");
            System.out.println("5) Won surcoreano");
            System.out.println("6) Cerrar programa"); //puede ser que cambie esta opcion
            
            System.out.println("\nOpcion: ");
            opcionMenu = entradaOpcion.nextByte();

            if(opcionMenu != 6){
                System.out.println("Ingresa la cantidad a convertir: ");
                mxnAmount = entradaCantidad.nextDouble();
            }
            
            switch (opcionMenu) {
                case 1:
                    System.out.println("Convirtiendo MXN a Dolares:");
                    toForeign.convertingToDivisa(opcionMenu, mxnAmount);
                    break;
                case 2:
                    System.out.println("Convirtiendo MXN a Euros.");
                    toForeign.convertingToDivisa(opcionMenu, mxnAmount);
                    break;
                case 3:
                    System.out.println("Convirtiendo MXN a Libras Esterlinas.");
                    break;
                case 4:
                    System.out.println("Convirtiendo MXN a Yenes.");
                    break;
                case 5: 
                    System.out.println("Convirtiendo MXN a Won surcoreano.");
                    break;
                case 6:
                    System.out.println("Cerrando programa...");
                    break;
            
                default:
                    System.out.println("La opcion no es valida");
                    break;
            }
        } while(opcionMenu != 6);
        entradaOpcion.close();
        entradaCantidad.close();
    }
}
