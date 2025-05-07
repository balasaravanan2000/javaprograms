import java.util.Scanner;

public class exercise {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       int num1=scan.nextInt();
       int a=0;
       int quo=0;
       int rem=0;
       int num2;
       num2=num1;
       while (num2!=0) {
        rem=num2%10;
        quo=num2/10;
        a=rem+(a*10);
        num2=quo;
        
       }
       if(num1==a){
        System.out.println("it is palindrome");

       }
       else{
        System.out.println("it is not a palindrome");
       }
       
}

}