package practica;

import java.util.ArrayList;
import java.util.Scanner;

public class AppMain {
    public static void main(String[] args) {
        System.out.println("¿cuántos valores desea ingresar?'");
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();

        System.out.println("Ingrese "+numero+" valores");
        String[] array=new String[numero];

        for (int i=0;i<array.length;i++){
            array[i]=scanner.next();
        }
        ArrayList<String> myArray=new ArrayList<>();

        MyDynamicArray myDynamicArray=new MyDynamicArray(myArray);

        myDynamicArray.convertToDynamicArray(array);

        myDynamicArray.clearIndex(0);

        myDynamicArray.clearIndex(2);

       var lista= myDynamicArray.obtainArray();

        for (String element:lista){
            System.out.println("elements not null "+element);
        }
    }
}
