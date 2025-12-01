public class DoubleClass {
    public static void main(String[] args){
        Double wrapperDouble =  Double.valueOf(10.34);
        Double wrapperFromStr = Double.valueOf("345.23");
        Double maxWrapper = Double.MAX_VALUE;
        double minPrimitive = Double.MIN_VALUE;
        Double positiveInfinity = Double.POSITIVE_INFINITY;
        double negativeInfinity = Double.NEGATIVE_INFINITY; 
        System.out.println(maxWrapper);
        System.out.println(minPrimitive);
        System.out.println(positiveInfinity);
        System.out.println(negativeInfinity);
    }
}
