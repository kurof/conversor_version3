package conversorVer3.src.mx.conversor.logic;

public class Conversor implements ConvToMxn, ConvToForeign{

    //divisas - actualizacion: 28/09/24
    private double valueDollar = 19.70;
    private double valueEuro = 21.99;
    private double valueLibra = 26.35;
    private double valueYen = 0.14;
    private double valueWon = 0.015;


    public void convertingToMxn (int opcion, double foreignAmount){

        //USANDO INTERFAZ ConvToMxn
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

    //USANDO INTERFAZ ConvToForeign
    public void convertingToDivisa(int opcion, double mxnAmount){

        switch (opcion) {
            case 1:
                System.out.println(mxnAmount + " mxn -> "
                + mxnToForeign(mxnAmount, valueDollar) + " dls.");
                break;
            case 2:
                System.out.println(mxnAmount + " mxn -> "
                + mxnToForeign(mxnAmount, valueEuro) + " euros.");
                break;   
            case 3:
                System.out.println(mxnAmount + " mxn -> " 
                + mxnToForeign(mxnAmount, valueLibra) + " libras.");
                break;
            case 4: 
                System.out.println(mxnAmount + " mxn -> " 
                + mxnToForeign(mxnAmount, valueYen) + " yenes.");
                break;
            case 5:
                System.out.println(mxnAmount + " mxn -> "
                + mxnToForeign(mxnAmount, valueWon) + " won.");
                break;        
            default:
                break;
        }
    }

    //OVERRIDES DE LOS METODOS DE LA INTERFAZ
    @Override
    public double foreignToMxn(double foreignAmount, double divisa) {
        return foreignAmount * divisa;
    }

    @Override
    public double mxnToForeign(double mxnAmount, double divisa) {
        return mxnAmount / divisa;
    }
}
