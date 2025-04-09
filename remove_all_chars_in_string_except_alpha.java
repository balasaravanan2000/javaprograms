import java.util.Scanner;

public class remove_all_chars_in_string_except_alpha {
    public static void main(String[] args) {
        String str = "Al@$^24RTas^81";
        for (int i = 0; i < str.length(); i++) {
            if ((str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') || (str.charAt(i) >= 'a' && str.charAt(i) <= 'z')) {
                System.out.println(str.charAt(i));
            }
        }
    }
}
