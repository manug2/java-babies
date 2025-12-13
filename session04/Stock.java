
public class Stock implements Investment {

  private double purchasePrice;
  private double currentPrice;

  public Stock(double purchasePrice1) {
    purchasePrice = purchasePrice1;
    currentPrice = purchasePrice1;
  }

  public void printPnL() {
    double pnl = currentPrice - purchasePrice;
    System.out.printf("My stock PnL = %f\n", pnl);
  }
 
  public void setCurrentPrice(double currentPrice2) {
    currentPrice = currentPrice2;
  }
 
  public void updateInfo() {
    //had the means to fetch current price.
    //and then set current price
    currentPrice = 111.0;
  }

}
