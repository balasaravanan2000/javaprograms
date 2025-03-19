import java.util.Scanner;
public class Leapyear {
    public static void main(String[] args) {
        System.out.println("enter the year");
        Scanner scan =new Scanner(System.in);
        int year=scan.nextInt();
        if((year%4==0)&&(year%100!=0)){
            System.out.println("it is leapyear");

        }
        else{
            System.out.println("it is not a leap year");
        }
     scan.close();
    }


    
}
