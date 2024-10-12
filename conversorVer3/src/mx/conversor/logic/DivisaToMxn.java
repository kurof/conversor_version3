package conversorVer3.src.mx.conversor.logic;

public class DivisaToMxn implements ConvToMxn{

    public void convertingToMxn (int opcion, double foreignAmount){

        //divisas - actualizacion: 28/09/24
        double valueDollar = 19.70;
        double valueEuro = 21.99;
        double valueLibra = 26.35;
        double valueYen = 0.14;
        double valueWon = 0.015;

        //operacion
        // double totalMxn = 0;
        
        // if (option == 1) {
        //     totalMxn = foreignAmount * valueDollar;
        //     System.out.println(foreignAmount + " dls -> " + totalMxn + " mxn");
        // } if (option == 2) {
        //     totalMxn = foreignAmount * valueEuro;
        //     System.out.println(foreignAmount + " euros -> " + totalMxn + " mxn");
        // } if (option == 3) {
        //     totalMxn = foreignAmount * valueLibra;
        //     System.out.println(foreignAmount + " libras e. -> " + totalMxn + " mxn");
        // } if (option == 4) {
        //     totalMxn = foreignAmount * valueYen;
        //     System.out.println(foreignAmount + " yen -> " + totalMxn + " mxn");
        // } if (option == 5) {
        //     totalMxn = foreignAmount * valueWon;
        //     System.out.println(foreignAmount + " won -> " + totalMxn + " mxn");
        // }

        //USANDO EL METODO ConvToMxn
        //debere agregar una condicion en caso de que el numero sea 6?
        switch (opcion) {
            case 1:
                System.out.println(foreignAmount + " dls -> " 
                + foreignToMxn(foreignAmount, valueDollar) + " mxn");
                break;
            
            case 2:
                System.out.println(foreignAmount + " euros -> " 
                + foreignToMxn(foreignAmount, valueEuro) + " mxn");
                break; 
            
            case 3:
                System.out.println(foreignAmount + " libra e. -> " 
                + foreignToMxn(foreignAmount, valueLibra) + " mxn");
                break;
            
            case 4:
                System.out.println(foreignAmount + " yen -> " 
                + foreignToMxn(foreignAmount, valueYen) + " mxn");
                break;

            case 5:
                System.out.println(foreignAmount + " won -> " 
                + foreignToMxn(foreignAmount, valueWon) + " mxn");
                break;
        
            default:
                break;
        }

    }

    @Override
    public double foreignToMxn(double foreignAmount, double divisa) {
        return foreignAmount * divisa;
    }
}
