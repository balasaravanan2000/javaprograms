package palindrome;
import java.util.Scanner;

public class palindrome {
    public static void main(String[] args){
         palindromex();
    }
    public static void palindromex(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = scanner.nextInt();
        int n1;
        int a=0;
        int rem;
        int quo;
        n1=n;
        while (n1>0){
            rem=n1%10;
            quo=n1/10;
            n1=quo;
            a=(a*10)+rem;

        }
        if(a==n){
            System.out.println(n + ":it is palindrome");

        }
        else{
            System.out.println(n + ":it is not a palindrome");
        }

    }
}
