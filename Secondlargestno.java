import java.util.Scanner;

public class Secondlargestno {
   public static void main(String[] args) {
        System.out.println("enter the array");
        Scanner scan = new Scanner(System.in);
        int arr[] = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
        int l = Integer.MIN_VALUE;
        int sl =Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if ((l > arr[i])&&(sl<arr[i]) ){
                sl = arr[i];
            
            } else if (l < arr[i]) {
                sl=l;
                l=arr[i];


            }
        }
        System.out.println();
        System.out.println(l   + "   " + sl);

    }

}
 

