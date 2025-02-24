import java.util.Scanner;

public class armstrong {
     public static void main(String[] args){
         armstrongx();
    }
    public static void armstrongx(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = scanner.nextInt();
        scanner.close();
        int n1;
        int a=0;
        int rem;
        int quo;
        n1=n;
        while (n1>0){
            rem=n1%10;
            quo=n1/10;
            n1=quo;
            a=a+(rem*rem*rem);

        }
        if(a==n){
            System.out.println(n + ":it is armstrong no");

        }
        else{
            System.out.println(n + ":it is not a armstrong no");
        }

    }
}
