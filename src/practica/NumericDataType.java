package practica;

public class NumericDataType implements Operations<Double> {
    @Override
    public void addition(Double a, Double b) {
        double result=a+b;
        System.out.println("The addition of two numbers is: "+result);
    }

    @Override
    public void subtraction(Double a, Double b) {
        double result=a-b;
        System.out.println("The subtraction of two numbers is:"+result);
    }

    @Override
    public void multiplication(Double a, Double b) {
        double result=a*b;
        System.out.println("The multiplication of two numbers is:"+result);
    }

    @Override
    public void division(Double a, Double b) {
        double result=a/b;
        System.out.println("The division of two numbers is: "+result);
    }
}
