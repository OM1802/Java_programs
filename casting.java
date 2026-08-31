public class Main {

    public static void main(String[] args) {

        // Widening
        int age = 20;
        double decimalAge = age;

        System.out.println(decimalAge);


        // Narrowing
        double price = 99.99;
        int integerPrice = (int) price;

        System.out.println(integerPrice);


        // Integer division
        int a = 5;
        int b = 2;

        System.out.println(a / b);


        // Casting to get decimal division
        double result = (double) a / b;

        System.out.println(result);
    }
}
