package main;

public class SavingsBankAccount extends BankAccount {

  private int term;


  public int getTerm() {
    return term;
  }

  public void setTerm(int term) {
    this.term = term;
  }

  @Override
  public String toString() {
    return "SavingsBankAccount{" +
        "term=" + term +
        ", client=" + client +
        ", balance=" + balance +
        ", accountNumber='" + accountNumber + '\'' +
        '}';
  }
}
