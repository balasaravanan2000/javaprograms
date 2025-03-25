import java.util.Scanner;
public class Sumtheno {
    public static void main(String[] args) {
        System.out.println("enter the number");
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();
        int n=num;
        int a=0;
        while(n!=0){
           int rem=n%10;
           int quo=n/10;
           
           a=a+rem;
           n=quo;

        }
        System.out.println("sum of the given number  =" +a);
     scan.close();
    }
    
}
