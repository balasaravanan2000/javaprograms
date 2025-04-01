import java.util.Scanner;

public class Smallestnoinarray {
    public static void main(String[] args) {
        System.out.println("enter the array");
        Scanner scan=new Scanner(System.in);
        int n=5;
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }
        for (int i=0;i<n;i++){
            System.out.print(arr[i]  +  "  ");
        }
        System.out.println();
        int max=arr[0];
        for (int i=1;i<n;i++){
            
            if(arr[i]<max){
                max=arr[i];
               
            }

    }
     System.out.println(max);
}
}



    

