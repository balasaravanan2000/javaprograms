import java.util.Scanner;

public class Strongno {
    public static void main(String[] a) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the number");
        int n = scan.nextInt();
        int num;
        num = n;
        while (num > 0) {
            int rem = num % 10;
            int quo = num / 10;
            num = quo;
            fact( num);
        }
    }

    public static int fact(int num) {
        for(int i=0;i<num;i++){

            

        }
                return num;
        

    }
}
