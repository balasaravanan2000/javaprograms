import java.util.Scanner;
public class Sortthearray{
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int arr[]=new int[5];
        for (int i=0; i<arr.length;i++){
            arr[i]=scan.nextInt();

        }
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]  +  " ");

        }
        int temp=0;
        for (int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++)
            {
                if (arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println();
       for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]);
       } 
        
    }
}