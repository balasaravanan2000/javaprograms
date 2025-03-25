import java.util.Scanner;

public class Strongno {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the number");
        int n = scan.nextInt();
        int num;
        num = n;
        int sum=0;
        Factorial f=new Factorial();
        while (num > 0) {
            int rem = num % 10;
            int quo = num / 10;
            num = quo;
            
            
            int x=f.fact(rem);
            sum=sum+x;
        }
        if(sum==n){
            System.out.println("it is strong number");
        }
        else{
            System.out.println("it is not strong number");
        }
    }
}   
    class Factorial{
     int fact(int rem) {
        int c=1;
        for(int i=1;i<=rem;i++){
             
             c=c*i;
            

        }
                return c;
        

    }

    }