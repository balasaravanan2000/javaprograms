import java.util.Scanner;

public class secondsmallestno {
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
        int s = Integer.MAX_VALUE;
        int ss =Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (s > arr[i]) {
                ss = s;
                s = arr[i];
            } else if ((s < arr[i]) && (ss > arr[i])) {
                ss = arr[i];

            }
        }
        System.out.println();
        System.out.println(s   + "   " + ss);

    }

}
