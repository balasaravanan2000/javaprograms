import java.util.Scanner;

class Pgr1{
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int n1=scan.nextInt();
        int n2=scan.nextInt();
        if (((n1%3==0)&&(n1%5==0))&& ((n2%3==0)&&(n2%5==0))){
            System.out.println(5 +","+ 3 +"," + "n1 and n2 is divisinble by both 3 and 5");
        }
        
        else{
            System.out.println("both numbers are not divisible by both 3 and 5 ");
        }

        
    }
}