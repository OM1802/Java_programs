abstract class Car{
  Car(){
    System.out.println("ABSTRACT CLASS TRIGGERED");
  }

  abstract void brandName();
}

class Ford extends Car{
  Ford(){
    System.out.println("OBJECT CONSTRUCTOR CALLED");
  }

  void brandName(){
    System.out.println("FORD");
  }
}

class Audi extends Car{
  Audi(){
    System.out.println("OBJECT CONSTRUCTOR CALLED");
  }

  void brandName(){
    System.out.println("AUDI");
  }
}

class testAbstraction{
  public static void main(String[] args){
    Ford c1= new Ford();
    c1.brandName();

    Audi c2= new Audi();
    c2.brandName();

    Car c3= new Ford();
    c1.brandName();

    Car c4= new Audi();
    c2.brandName();
  }
}

