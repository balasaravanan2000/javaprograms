import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
       System.out.println("Enter the numbers") ;
       Scanner scan =new Scanner(System.in);
       int num1=scan.nextInt();
       int num2=scan.nextInt();
       int ans= lcm(num1,num2);
       System.out.println(ans);

    }

    static int lcm(int num1, int num2) {
        int x=0;
        for (int i = 1; i <=num2; i++) {
            if ((i%num1 == 0)&& (i% num2 == 0)) {

                 x=i;

            }
        }
        return x;
    }

}
