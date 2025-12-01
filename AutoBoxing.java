//Java contains wrapper classes named Integer and Double which store instances of the primitive data: int and double inside.
// The main purpose of these wrapper classes is to convert between primitive data and objects.
// Example: The ArrayList class only accept objects as input NOT primitive data.
// This is why we need Integer and Double classes: we cannot use int and double with ArrayList!
// The process of automatically converting a primitive data to an Integer object is called: Autoboxing.

import java.util.ArrayList;

public class AutoBoxing {

    public static void main(String[] args) {
 //This example shows how the ArrayList uses the Integer wrapper to convert any int data it recieves into the Integer objects
        ArrayList<Integer> myArrayList = new ArrayList<>(); 
        myArrayList.add(5);                 // autoboxing int(primitive) -> Integer(Objected)
          myArrayList.add(7);                 // autoboxing int(primitive) -> Integer(Objected)
            myArrayList.add(9);                 // autoboxing int(primitive) -> Integer(Objected)
        //Similarly, when the element is accessed, the integer stored in the ArrayList is automatically 
        // converted from a an Object of the Integer wrapper class to primitive int data again:
        //This lets us store an Integer wrapper value into an int primitive declared variable.
        //This proccess is called unboxing.
        //This proccess of autoboxing and unboxing applies to all wrapper class types:
        // Integer, Double, Float, Long, Short, Boolean, Byte and Character
        int num = myArrayList.get(0);   // unboxing -> Integer(Object) -> int primitive
        System.out.println(myArrayList);
        System.out.println(myArrayList.getClass()); 
        System.out.println(num);

        //Examples of autoboxing:
        Double wrapper = 23.456;
        Integer wrapper2 = 3;
        Double wrapper3 =  Double.valueOf(13.57);
        Integer wrapper4 =  Integer.valueOf(7);
        Double wrapper5 = Double.valueOf(30.59);
        Integer wrapper6 = Integer.valueOf(15);
        System.out.println(wrapper);
        System.out.println(wrapper2);
        System.out.println(wrapper3);
        System.out.println(wrapper4);
        System.out.println(wrapper5);
        System.out.println(wrapper6);

        //Examples of unboxing:
        int primitiveInt2 = wrapper2;
        int primitiveInt4 = wrapper4.intValue();
        System.out.println(primitiveInt2);
        System.out.println(primitiveInt4);

    }
       
}
