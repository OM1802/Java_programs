class Bank{
  String bankName="SBI";

  //attributes
  String name;
  int balance;

  //constructor
  Bank(String name, int balance){
    this.name=name;
    this.balance=balance;
  }

  //instance methods
  void deposit(int value){
    balance+=value;
  }

  void withdraw(int value){
    balance-=value;
  }

  void display(){
    System.out.println("NAME: " + this.name + " BALANCE: " + this.balance);
  }  

  //static method
  static int add(int a, int b){
    return a+b;
  }
}

class Test{
  public static void main(String[] args){
    Bank b1=new Bank("OM", 200000);
    System.out.println(b1.bankName);
    b1.display();
    b1.deposit(1000);
    b1.display();
    b1.withdraw(5000);
    b1.display();
    System.out.println(Bank.add(45,25));
  }
}