record Students(String name, int age){

}

class TestRecords{
  public static void main(String[] args){
    Students s1= new Students("OM", 88);
    System.out.println(s1.name());
    System.out.println(s1.age());

  }
}