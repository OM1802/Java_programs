class Animal{
  String name;
  int age1=10;

  void hunt(){
    System.out.println("IT CAN HUNT");
  }

  void domestic(){
    System.out.println("CAN BE A PET");
  }
}

class wolves extends Animal{
  void pack(){
    System.out.println("WOLVES HUNT IN A PACK");
    System.out.println(super.age1);
  }

  @Override
  void domestic(){
    System.out.println("CANNOT BE A PET");
  }
}

class Inheritance{
  public static void main(String[] args){
    wolves w1= new wolves();
    w1.hunt();
    w1.pack();
    w1.domestic();
    Animal a1= new wolves();
    a1.domestic(); // IT WILL PRINT "CANNOT BE A PET". THIS IS CALLED runtime polymorphism or dynamic method dispatch.
  }
}