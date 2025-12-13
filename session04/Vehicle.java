import sales.PriceInfo;

public class Vehicle {

  private String modelName;

  private String make;

  public Vehicle(String modelName1, String make1) {
    modelName = modelName1;
    make = make1;
  }

  public void printMyInfo() {
    System.out.printf("This car is of Make=%s, Model=%s\n", make, modelName);
  }

  /*
    printMyInfo is overloaded. Following version accepts a priceInfo parameter
  */
  public void printMyInfo(PriceInfo pInfo) {
    System.out.printf("This car is of Make=%s, Model=%s, and it costs %s\n", make, modelName, pInfo);
  }

}
