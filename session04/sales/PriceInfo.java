package sales;

public class PriceInfo {

  private int price;
  private String currency;

  public PriceInfo(int price1, String currency1) {

    price = price1;
    currency = currency1;

  }

  @Override
  public String toString() {
    return String.format("%d %s", price, currency);
  }

}
