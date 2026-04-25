import java.util.Random;

public class CpuDemo {
    public static void main(String[] args) {
        System.out.println("Starting CPU Demo...");
        System.out.println("Run 'jps -l' to find my PID, then use 'top -H -p <pid>' or 'jcmd <pid> Thread.print'");
        
        // Start a few threads to max out multiple CPU cores
        for (int i = 0; i < 3; i++) {
            new Thread(CpuDemo::heavyComputation, "CPU-Hog-Thread-" + i).start();
        }
    }

    private static void heavyComputation() {
        Random random = new Random();
        double result = 0;
        // Infinite loop to keep the CPU busy
        while (true) {
            result += Math.sqrt(random.nextDouble());
            
            // Periodically print to show the thread is alive (optional)
            if (result % 10000000 < 1) {
                // Keep it busy without sleeping
            }
        }
    }
}