public class Emc2 {

    public static void main(String[] args) {
        int mass = 5;
        final int c = 300;

        int energy = calculateEnergy(mass);

        System.out.println("Mass = " + mass);
        System.out.println("Speed of Light = " + c);
        System.out.println("Energy = " + energy);
    }

    static int calculateEnergy(final int mass, final int c) {
        System.out.printf("input mass = %d grams, and speed of light =%d\n", mass, c);
        int energy = mass * c * c;
        return energy;
   }

    static int calculateEnergy(final int mass) {
        final int c = 2000;
        System.out.printf("Only input is mass = %d grams, and we know speed of light = %d\n", mass, c);
        int energy = mass * c * c;
        return energy;
    }

}
