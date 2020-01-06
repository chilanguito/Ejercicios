package practica;

import java.util.Scanner;

public class AppMain {
    public static void main(String[] args) {
        System.out.println("Ingrese valores de tipo String, dos valores");
        Scanner scanner = new Scanner(System.in);


        String primerValor= scanner.next();

        String segundoValor= scanner.next();

        StringDataType stringDataType=new StringDataType();

        stringDataType.addition(primerValor,segundoValor);
        stringDataType.division(primerValor,segundoValor);
        stringDataType.multiplication(primerValor,segundoValor);
        stringDataType.subtraction(primerValor,segundoValor);

        System.out.println("Ingrese dos valores de tipo entero, o flotante");

        NumericDataType numericDataType= new NumericDataType();

        double primero=  scanner.nextDouble();

        double segundo=  scanner.nextDouble();

        numericDataType.addition(primero,segundo);
        numericDataType.division(primero,segundo);
        numericDataType.multiplication(primero,segundo);
        numericDataType.subtraction(primero,segundo);






    }
}
