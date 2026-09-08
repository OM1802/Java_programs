class Outer1{
  class Inner1{
    void hello(){
      System.out.println("NON-STATIC NESTED CLASS 1");
    }
  }
}

class Outer2{
  int number1=10;
  static int number2=20;

  static class Inner2{
    void printing(){
      //System.out.println(number1); can't be accessed since it is not static and i2 did not have an object of outer class
      System.out.println(number2);
    }
  }
}

class Outer3{
  void func(){
    class Inner3{
      void message(){
        System.out.println("MESSAGE FROM LOCAL CLASS INSIDE METHODS");
      }
    }
    Inner3 i3=new Inner3();
    i3.message();
  }
}

class Main{
  public static void main(String[] args){
    Outer1 o1=new Outer1();
    Outer1.Inner1 i1=o1.new Inner1();
    i1.hello();

    Outer2.Inner2 i2= new Outer2.Inner2();
    i2.printing();

    Outer3 o3=new Outer3();
    o3.func();
  }
}