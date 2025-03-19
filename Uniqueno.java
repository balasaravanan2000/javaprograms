import java.util.Scanner;
public class Uniqueno {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int n=scan.nextInt();
        int[] x=new int[n];  
        
        for (int i=0; i<n;i++){
            x[i]=scan.nextInt();
        }
        for(int i=0;i<n;i++){
            int repeat=0  ;
            for(int j=0;j<n;j++){
                if((i!=j)&&(x[i]==x[j])){
                    repeat=1;
                    

                }
               
            }
             if(repeat==0){
                System.out.println(x[i]);;
            }

        }
    
    
    
    
    }

    
}
