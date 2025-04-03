import java.util.Scanner;

public class Upper_lower_case {
    public static void main(String[] args) {
        System.out.println("enter the char");
        Scanner scan = new Scanner(System.in);
        char x = scan.next().charAt(0);
        if (((x >= 'a') && (x <= 'z')) || ((x >= 'A') && (x <= 'Z'))) {
            System.out.println("it is alphabet");
        }
        else{
            System.out.println("it is not an alphabet"); 
        }

    }

}
