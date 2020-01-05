package practica;

import java.util.ArrayList;

public class MyDynamicArray implements MyArrayInterface{
    private ArrayList<String> myArray;

    public MyDynamicArray(ArrayList<String> myArray) {
        myArray=new ArrayList<>();
        this.myArray = myArray;
    }

    @Override
    public void convertToDynamicArray(String[] a) {
        for (int i=0;i<a.length;i++){
            myArray.add(a[i]);
            System.out.println("The element: "+a[i]+" has been added at index "+i);
        }
    }

    @Override
    public void clearIndex(int index) {
        System.out.println("The element: "+ myArray.get(index) +" has been converted in null");
        myArray.set(index, "");
    }

    @Override
    public ArrayList<String> obtainArray() {
        ArrayList<String> array = new ArrayList<>();
        for (String s:myArray){
            if (!s.equals("")){
                array.add(s);
            }
        }
        return array;
    }
}
