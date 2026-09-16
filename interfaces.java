interface fly{
  void fly();
}

interface aerodynamic{
  void aerodynamic();
}

interface sky extends fly, aerodynamic{
  void sky();
}

class aeroplane implements fly{
  public void fly(){
    System.out.println("IT CAN FLY");
  }
}

class bird implements fly, aerodynamic{
  public void fly(){
    System.out.println("IT DOES FLY");
  }

  public void aerodynamic(){
    System.out.println("IT USES AERODYNAMICS");
  }
}

class fighterJet implements sky{
  public void fly(){
    System.out.println("IT DOES FLY");
  }

  public void aerodynamic(){
    System.out.println("IT USES AERODYNAMICS");
  }

  public void sky(){
    System.out.println("IT IS IN SKY");
  }
}

class Main{
  public static void main(String[] args){
    aeroplane obj1= new aeroplane();
    obj1.fly();

    bird obj2= new bird();
    obj2.fly();
    obj2.aerodynamic();

    fighterJet obj3= new fighterJet();
    obj3.fly();
    obj3.aerodynamic();
    obj3.sky();
  }
}