import java.util.Scanner;
public class Primeno{
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int m=scan.nextInt();
        int n=scan.nextInt();
        int x=0;
        for(int i=m;i<n;i++){
            int count=0;
            for(int j=1;j<=n;j++){
            if(i%j==0) {
                count=count+1;
            }
           
           }
           if(count<=2){
            
            x=x+1;
            System.out.println(i);
            

            
        }
        }
        System.out.println(x);
        scan.close();
    }
}