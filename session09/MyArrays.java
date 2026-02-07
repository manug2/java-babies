

public class MyArrays {


  public static void main(String[] args) {
    System.out.println("starting sales..");

    int[] sales = {501, 602, 703, 804, 904};

    int total = 0;
    for (int sale : sales) {
      total += sale;
    }

    System.out.printf("Total sales = %d%n", total);

    double avgSales = (1.0 * total) / sales.length;
    System.out.printf("Average sales = %.2f %n", avgSales);

    System.out.println("completed sales.");

  }

}
