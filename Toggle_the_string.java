import java.util.Scanner;

public class Toggle_the_string {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        char x;
        for (int i = 0; i < str.length(); i++) {
            if ((str.charAt(i) >= 'A' && str.charAt(i)<='Z')) {
                 x=Character.toLowerCase(str.charAt(i));

            } else {
                 x=Character.toUpperCase(str.charAt(i));
            }
            System.out.println(x);

        }
        scan.close();
    }
    
}
