public class Emc2v2 {

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

   //Overloaded function, same name, different parameters - aka signature (name + parameters)
    static int calculateEnergy(final int mass) {
        final int c = 300;
        int squareOfC = 0;
        int i=0;
        while (i < c) {
            squareOfC += c;
            i++;
        }

        int energy = 0;
        int j = 0;
        while (j < mass) {
            energy += squareOfC;
            j++;
        }

        return energy;
    }

}
