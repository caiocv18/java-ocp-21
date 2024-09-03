package br.com.caiocv18;

public class GarbageCollector {
    String reference;
    Long positionMemory;

    public static void main(String[] args) {
        var iten1 = new GarbageCollector();
        iten1.reference = "iten1";
        iten1.positionMemory = Long.valueOf(0L);
        System.out.println("iten1 = " + iten1);

        var iten2 = new GarbageCollector();
        iten2.reference = "iten2";
        iten2.positionMemory = Long.valueOf(1L);
        System.out.println("iten2 = " + iten2);

        var iten3 = iten2;
        iten3.reference = "iten3";
        iten3.positionMemory = Long.valueOf(3L);
        System.out.println("iten3 = " + iten3);

        iten1 = iten2;
        System.out.println("iten1 = " + iten1);
        System.out.println("iten2 = " + iten2);
        System.out.println("iten3 = " + iten3);


        System.gc();

        iten1 = null;
        iten2 = null;
        iten3 = null;

        System.out.println("iten1 = " + iten1);
        System.out.println("iten2 = " + iten2);
        System.out.println("iten3 = " + iten3);

    }
    
}
