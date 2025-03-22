import java.util.Scanner;
public class fibonacciseries {
    public static void main(String[] args) {
        System.out.println("enter the number n");
        Scanner scan =new Scanner(System.in);
        int n=scan.nextInt();
        int a=0,b=1;
        int c=0;
        System.out.print(a  +" "+ b +  " ");
        for (int i=0;i<n-1;i++){
            c=a+b;
            a=b;
            b=c;

            System.out.print(c +" ");

        }
        System.out.println();
        System.out.println( c );
    }
    
}
