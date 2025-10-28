package exercise4;

public class BankAccount {

  public String name;
  public String surname;
  public int accountNumber;
  public double balance;
  public int limit;

  public BankAccount(String name, String surname, int accountNumber, double balance, int limit) {
      this.name = name;
      this.surname = surname;
      this.accountNumber = accountNumber;
      this.balance = balance;
      this.limit = limit;
  }

  public void withdraw(double amount) {
      if (amount > balance || amount > limit) {
          System.out.println("insufficient funds");
      }
      else  {
          balance -= amount;
      }
  }

  public void deposit(double amount) {
      balance =  balance + amount;
  }

  public void printBalance() {
  }

  @Override
    public String toString() {

      return name + ", " + surname + ", " + accountNumber + ", " + balance + ", " + limit;
  }
}
