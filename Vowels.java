import java.util.Scanner;

public class Vowels {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char arr[] = new char[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.next().charAt(0);
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+  "  ");
        }
        for(int i=0;i<arr.length;i++){
            if((arr[i]=='a')||(arr[i]=='e')||(arr[i]=='i')||(arr[i]=='o')||(arr[i]=='u')){
                System.out.println(arr[i] +  "is vowel");

            }
            else{
                System.out.println(arr[i] +  "is not a vowel");
            }
        }
    }

}
