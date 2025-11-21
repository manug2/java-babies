import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Emc2v2 {
    public static void main(String[] args) {
        int mass = Integer.parseInt(args[0]);
        final long c = Long.parseLong(args[1]);
        long energy = calculateEnergy(mass, c);
        System.out.println("Mass = " + mass);
        System.out.println("Speed of Light = " + c);
        System.out.println("Energy = " + energy);
        printScietificNumber("Energy: ", energy);
    }

    private static long calculateEnergy(int mass, long speedOfLight) {
        return mass * speedOfLight * speedOfLight;
    }

    private static void printScietificNumber(String message, long number) {
        NumberFormat numFormat = new DecimalFormat("0.######E0");
        System.out.println(message + numFormat.format(number));
    }

}