package arraysdatatype;

import java.util.ArrayList;
class arrfun {
    public static void main(String[] args) {
        //in array we have to define the size first
        // but in array we dont have to intialize array with fixed size
        ArrayList arr=new ArrayList();
        // add function use to add elemts in arry
        arr.add(45);
        arr.add(55);
        arr.add(65);
        arr.add(75);
        //  get function use to get the value of an index array
        System.out.println(arr.get(3));
        //we can also add the elemnt at specific index
        //we are adding 67 at index 3
        arr.add(3,67);
        System.out.println(arr.get(3));
        // we can set an element at index by set method
        arr.set(3,44);
        System.out.println(arr.get(3));
        // size method is use to get the size of array
        System.out.println(arr.size());








    }
}
