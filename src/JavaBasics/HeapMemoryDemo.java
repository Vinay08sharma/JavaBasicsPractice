package JavaBasics;


public class HeapMemoryDemo {

    public static void main(String[] args) {

        Runtime r = Runtime.getRuntime();

        // to get the memory in Mbs, Intially it will be in bytes

        double mb = 1024 * 1024;
        System.out.println("Maximum Memory : "+r.maxMemory()/mb);
        System.out.println("Initial Memory : "+r.totalMemory()/mb);
        System.out.println("Free Memory : "+r.freeMemory()/mb);
        System.out.println("Consumed Memory : " + (r.totalMemory() - r.freeMemory()/mb));

    }
}
