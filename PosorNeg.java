import java.util.Scanner;
public class PosorNeg {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();
        if(num>=0){
            System.out.println(num+ "it is positive number");
        }
        else{
            System.out.println(num +"it is negative number");
        }
     scan.close();
    }
}
