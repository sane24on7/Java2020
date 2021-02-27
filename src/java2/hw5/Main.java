package java2.hw5;

public class Main {
    public static void main(String[] args) {
        singleTread();
        doubleTread();
        doubleTreadOpt();
    }

    static void singleTread (){
        TestArray arraySingle = new TestArray();
        long singleStart = System.currentTimeMillis();
        Float[] a1 = arraySingle.doCalculations();
        long singleEnd = System.currentTimeMillis();
        long singleTime = singleEnd-singleStart;
//        for (float value: a1) {
//            System.out.print(value + "  ");
//        }
        System.out.println("Single Tread time: " + singleTime);
    }

    static void doubleTread (){
        TestArray arrayDouble = new TestArray();
        long singleStart = System.currentTimeMillis();
        Float[] a1 = arrayDouble.doThreadCalculations();
        long singleEnd = System.currentTimeMillis();
        long singleTime = singleEnd-singleStart;
//        for (int i=1000; i<a1.length; i+=1000000) {
//            System.out.print(a1[i] + "  ");
//        }
        System.out.println("Double Tread time: " + singleTime);
    }

    static void doubleTreadOpt (){
        TestArray arrayDoubleOpt = new TestArray();
        long singleStart = System.currentTimeMillis();
        Float[] a1 = arrayDoubleOpt.doThreadCalculationsOpt();
        long singleEnd = System.currentTimeMillis();
        long singleTime = singleEnd-singleStart;
//        for (int i=1000; i<a1.length; i+=1000000) {
//            System.out.print(a1[i] + "  ");
//        }
        System.out.println("Double optimised Tread time: " + singleTime);
    }
}
