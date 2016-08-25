// This is an example of improper encapsualtion.
public class BankAccount {

  // The balance variable is now private, no outside units can access or set
  // it without us creating a method for it to do that. This hides the details
  // of this class in favor of usability for outside classes.
  private double balance

  public BankAccount() {}

  // These logic methods now perform an important operation. Other parts
  // of the program won't know how deposit or withdraw works, which is
  // good, they shouldn't
  public void deposit(double amount) {
    balance += amount;
  }

  public void withdraw(double amount) {
    balance -= amount;
  }

  // With this method, we have restricted access to the balance property,
  // you can get it, but can't set it. This makes us perform our withdraw/deposit
  // logic to modify it.
  public double getBalance() {
    return this.balance;
  }
}
