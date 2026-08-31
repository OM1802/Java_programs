import java.util.Scanner;
class Switch{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("ENTER A NUMBER BETWEEN 1 AND 7: ");
    int day=sc.nextInt();
    String dayName=switch (day){
      case 1 -> "MONDAY";
      case 2 -> "TUESDAY";
      case 3 -> "WEDNESDAY";
      case 4 -> "THURSDAY";
      case 5 -> "FRIDAY";
      case 6 -> "SATURDAY";
      case 7 -> "SUNDAY";
      default -> "CHOOSE A NUMBER BETWEEN 1 AND 7!";
    };
    System.out.println(dayName);
  }
}