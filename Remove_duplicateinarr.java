import java.util.Scanner;
public class Remove_duplicateinarr {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int n=5;
        int arr[]=new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            
        }
        System.out.println();
        for(int i=0;i<arr.length;i++){
            int count=0;
            for(int j=0;j<i;j++){
                if(arr[i]==arr[j]){
                    count++;
                    
                }
            }
            if(count==0){
                
                System.out.print(arr[i]  +  "  ");
            }
        }

    
}
}