import java.util.Scanner;
public class Factorofno {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();
        char x='a';
        for(int i=1;i<num;i++){
            if(num%i==0){
                System.out.println(i);
            }
        }
        System.out.println((int)x);
    }
    
}
