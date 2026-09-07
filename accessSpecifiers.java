class BankAccount{
  String name;
  private int balance;

  BankAccount(String name, int balance){
    this.name=name;
    this.balance=balance;
  }

  void deposit(int value){
    balance+=value;
  }

  int balanceInfo(){
    return balance;
  }
}

class Main{
  public static void main(String[] args){
    BankAccount b1=new BankAccount("OM", 100000);
    System.out.println(b1.balanceInfo());
    b1.deposit(500);
    System.out.println(b1.balanceInfo());
  }
}