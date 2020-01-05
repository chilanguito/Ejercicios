package practica;

public class StringDataType implements Operations<String> {
    @Override
    public void addition(String a, String b) {
        System.out.println("The addition of 2 strings is: "+a+" "+b);
    }

    @Override
    public void subtraction(String a, String b) {
        System.out.println("This operation can't be perform on strings");
    }

    @Override
    public void multiplication(String a, String b) {
        System.out.println("This operation can't be perform on strings");
    }

    @Override
    public void division(String a, String b) {
        System.out.println("This operation can't be perform on strings");
    }
}
