import java.util.Scanner;
public class HCF {
    public static void main(String args[]){
    Scanner scan=new Scanner(System.in);
    int num1=scan.nextInt();
    int num2=scan.nextInt();
    int gcd=hcf(num1, num2);
    System.out.println(gcd);

    }
    static int hcf(int num1, int num2){
        int x=0;
        for (int i=1;i<num1;i++){
            if((num1%i==0)&&(num2%i==0)){
               x=i; 
            }
            
        }
        return x;
    }
}
