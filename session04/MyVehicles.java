
//Need to import other classes if we are going to use them.
//Except class which is in the same directory (java package).

import sales.PriceInfo;

/*
  MyVehicles - Its a class to demonstrate interaction with Vehicle class
*/

public class MyVehicles {

  public static final void main(String[] args) {


    Vehicle aCar = new Vehicle("Santro", "Hyundai");

    PriceInfo priceInfo = new PriceInfo(530000, "INR");

    aCar.printMyInfo();
    aCar.printMyInfo(priceInfo);

  }

}
