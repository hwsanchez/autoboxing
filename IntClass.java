public class IntClass {
    
    public static void main(String[] args) {
        // constructor that accepts a primitive int value which is autoboxed to a wrapper object:
        Integer wInt1 = Integer.valueOf(5);
        Integer wrapperFromStr = Integer.parseInt("56");
        
        //2 String Integer constructor:
        int wStr1 = Integer.parseInt("100");
        int wStr2 = Integer.valueOf("230");


        //Other unboxing options:
        int primitiveInt = wrapperFromStr.intValue();
        double convertedValue = wInt1.doubleValue();

        //MAX and MIN Integer wrapper constants:
        Integer wrapperIntMax = Integer.MAX_VALUE;
        Integer wrapperIntMin = Integer.MIN_VALUE;

        System.out.println("Integer.MAX_VALUE: " + wrapperIntMax);
        System.out.println("Integer.MAX_VALUE: " + wrapperIntMin);

    }
}
