package practica;

public class NumericDataType implements Operations<Double> {
    @Override
    public void addition(Double a, Double b) {
        double result=a+b;
        System.out.printf("The addition of two numbers is: %.2f",result);
    }

    @Override
    public void subtraction(Double a, Double b) {
        double result=a-b;
        System.out.printf("\nThe subtraction of two numbers is: %.2f",result);
    }

    @Override
    public void multiplication(Double a, Double b) {
        double result=a*b;
        System.out.printf("\nThe multiplication of two numbers is: %.2f",result);
    }

    @Override
    public void division(Double a, Double b) {
        double result=a/b;
        System.out.printf("\nThe division of two numbers is: %.2f",result);
    }
}
