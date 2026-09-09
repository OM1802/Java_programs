class User{
  int age;
  String name;

  User setAge(int age){
    this.age=age;
    return this;
  }

  User setName(String name){
    this.name=name;
    return this;
  }

  void displayInfo(){
    System.out.println("NAME: "+name+" AGE: "+age);

  }
}

class test1{
  public static void main(String[] args){
    User u1=new User().setAge(550).setName("OPTIMUS PRIME");
    u1.displayInfo();
  }
}