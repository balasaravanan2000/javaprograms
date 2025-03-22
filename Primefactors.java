import java.util.Scanner;

public class Primefactors {
    public static void main(String[] args) {
         
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();
        
        for(int i=2;i<num;i++){
            int count=0;
            if(num%i==0){
                for(int j=1;j<=i;j++){

                
                    if(i%j==0){
                    count=count+1;
                    }
                
                }
              
            }
            if(count==2){
                System.out.println(i);
            }
        }
        
    }
    
}
