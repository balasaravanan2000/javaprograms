import java.util.Scanner;
public class Pgr3 {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int m=scan.nextInt();
        int n=scan.nextInt();
        int sum=0;
        for(int i=m;i<n;i++){
             sum=sum+i;
        }
        System.out.println(sum);
    }
    
}
