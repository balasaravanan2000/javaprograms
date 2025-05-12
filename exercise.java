import java.util.Scanner;

public class exercise {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int arr[] = new int[5];
        int temp = 0;
        for (int i = 0; i < 5; i++) {
            arr[i] = scan.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            for (int j = i+1; j < 5; j++) {
               if( arr[i]>arr[j]){
                   temp =arr[i];
                   arr[i]=arr[j];
                   arr[j]=temp;
               }
            }
        }
      for(int i=0;i<5;i++){
        System.out.println();
        System.out.print(arr[i]);
      }
    }

}