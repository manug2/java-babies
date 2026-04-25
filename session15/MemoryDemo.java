import java.util.ArrayList;
import java.util.List;

public class MemoryDemo {
    // A static list that will hold onto memory indefinitely (a simulated memory leak)
    private static final List<byte[]> memoryLeakList = new ArrayList<>();

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Starting Memory Demo...");
        System.out.println("Run 'jps -l' to find my PID.");
        System.out.println("Watch the heap grow with: jstat -gc <pid> 1000");
        System.out.println("Take a heap dump with: jcmd <pid> GC.heap_dump dump.hprof");

        int iteration = 0;
        while (true) {
            // Allocate 1 Megabyte of memory
            byte[] oneMegabyte = new byte[1024 * 1024];
            memoryLeakList.add(oneMegabyte);
            
            System.out.println("Allocated " + (++iteration) + " MBs...");
            
            // Sleep for 200ms so it doesn't crash instantly, giving you time to observe
            Thread.sleep(200); 
        }
    }
}