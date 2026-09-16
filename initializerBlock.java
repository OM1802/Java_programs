class Student{
  static int age=30;
  String name="PRIME";
  static{
    System.out.println("STATIC INITIALIZER BLOCK TRIGGERED");
    System.out.println(age);
  }

  {
    System.out.println("INSTANCE INITIALIZER BLOCK TRIGGERED");
    System.out.println(name);
    System.out.println(age);
  }

  Student(){
    System.out.println("CONSTRUCTOR TRIGGERED");
  }
}

class Test{
  public static void main(String[] args){
    Student s1=new Student();
    Student s2=new Student();
  }
}