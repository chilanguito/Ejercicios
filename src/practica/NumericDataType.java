package practica;

public class NumericDataType implements Operations<Double> {
    @Override
    public void addition(Double a, Double b) {
        double result=a+b;
        System.out.printf("%.2f",result);
      //  System.out.printf("The addition of two numbers is:  "+"%.2d %n",result);
        //System.out.printf("%+.3f %n", n);
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
