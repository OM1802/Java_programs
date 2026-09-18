class Main{
  public static void main(String[] args){
    int a=10;
    int b=0;
    System.out.println("START");
    try{
      System.out.println(a/b);
    }
    catch(ArithmeticException e){
      System.out.println("ERROR!!");
      e.printStackTrace();
    }
    finally{
      System.out.println("END");
    }
  }
}