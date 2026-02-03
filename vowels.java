//To check and print all vowels in a string taken from input
import java.util.Scanner;
class vowels{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER STRING: ");
        String s=sc.nextLine();
        int len=s.length();
        System.out.print("THE VOWELS IN THE STRING ARE: ");
        for(int i=0;i<len;i++){
            char c=s.charAt(i);
            if(c=='A' || c=='E' || c=='I' || c=='O' || c=='U' || c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
                System.out.print(c+" ");
            }
        }
        sc.close();
        
    }
}
