

public class MyInvestments {

  public static void main(String[] args) {

    Investment firstInvestment = new Stock(102.3);
    Investment secondInvestment = new FixedDeposit();

    firstInvestment.updateInfo();

    firstInvestment.printPnL();
    secondInvestment.printPnL();
  }

}
