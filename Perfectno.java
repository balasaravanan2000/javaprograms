import java.util.Scanner;
public class Perfectno {
    static int divisor(int num){
        int count=0;
        for(int i=1;i<num;i++){
            if(num%i==0){
                count=count+i;
            }
        }

return count;
    
    }

    public static void main(String[] args){
        int x;
        System.out.println("enter the number");
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();
        x=divisor(num);
        if(x==num){
            System.out.println("it is perfectno"); 
        }
        else{
            System.out.println("it is not perfectno");
        }

    }
    

}