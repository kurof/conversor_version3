package conversorVer3.src.mx.conversor.menu;

import java.util.Scanner;

import conversorVer3.src.mx.conversor.logic.Conversor;

public class MenuToMxn {

    public void menuConversor2(){

        //Scanner para opciones
        Scanner entradaOpcion = new Scanner(System.in);
        Scanner entradaCantidad = new Scanner(System.in);

        //variable donde se ira la opcion en el menu
        byte opcionMenu = 0; 
        double foreignAmount = 0; //variable de la cantidad

        //para llamar a la clase
        Conversor toMxn = new Conversor();

        //Loop do while para el menu
        do{

            //opcion para que no se este repitiendo el loop una y otra vez - PENDIENTE
            // byte i = 0;

            //Texto del menu
            System.out.println("********* CONVERSOR DE DIVISAS A PESOS MEXICANOS **********\n");
            System.out.println("Selecciona alguna de las siguientes opciones: \n");
            System.out.println("1) Dolares a MXN.");
            System.out.println("2) Euros a MXN.");
            System.out.println("3) Libras esterlinas a MXN.");
            System.out.println("4) Yenes a MXN.");
            System.out.println("5) Won surcoreano a MXN.");
            System.out.println("6) Cerrar programa.");
    
            System.out.println("Opcion: ");
            opcionMenu = entradaOpcion.nextByte();

            if (opcionMenu != 6) {
                //Introducimos la cantidad:
                System.out.println("Introduzca la cantidad: ");
                foreignAmount = entradaCantidad.nextDouble(); //leera la cantidad  
            }

            switch (opcionMenu) {
                case 1:
                    System.out.println("Cambiando de dolares a MXN");
                    toMxn.convertingToMxn(opcionMenu, foreignAmount);
                    break;
                case 2:
                    System.out.println("Cambiando de euros a MXN");
                    toMxn.convertingToMxn(opcionMenu, foreignAmount);
                    break;
                case 3:
                    System.out.println("Cambiando de libras a MXN");
                    toMxn.convertingToMxn(opcionMenu, foreignAmount);
                    break;
                case 4:
                    System.out.println("Cambiando de Yen a MXN");
                    toMxn.convertingToMxn(opcionMenu, foreignAmount);
                    break;
                case 5:
                    System.out.println("Cambiando de Won a MXN");
                    toMxn.convertingToMxn(opcionMenu, foreignAmount);
                    break;
                case 6:
                    System.out.println("Cerrando programa...");
                    break;

                default:
                    System.out.println("La opcion no es valida!!!");
                    break;
            }

            //aqui ira la variable i, si se ejecuta el loop, pasara a 1
            //y debera parar el programa, quizas lo ponga en un if
        } while(opcionMenu != 6);
        entradaOpcion.close(); //cerrando conexion
        entradaCantidad.close();
    }
}
