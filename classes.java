class Main{
  static class BankAccount{
    private String name;
    private int balance;

    void deposit(int money){
      balance+=money;
    }

    void withdraw(int money){
      balance-=money;
    }

    void info(){
      System.out.println(balance);
    }
  }


  public static void main(String[] args){
    BankAccount b1=new BankAccount();
    b1.name="OM";
    b1.balance=10000;
    b1.info();
    b1.deposit(5000);
    b1.info();
    b1.withdraw(10000);
    b1.info();
    
  }
}