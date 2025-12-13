
public class FixedDeposit implements Investment {

  private double principal=10000, timeDuration=2, interestRate=0.05;
  public void printPnL() {
    double pnl = principal * timeDuration * interestRate;
    System.out.printf("My FD PnL is = %f\n", pnl);
  }


} 
