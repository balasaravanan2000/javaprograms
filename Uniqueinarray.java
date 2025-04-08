import java.util.Scanner;
public class Uniqueinarray {
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
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=0;j<n;j++){
                if((arr[i]==arr[j])&&(i!=j)){
                    count++;

                }
            }
            System.out.println();
            if (count==0){
                System.out.println(arr[i]);
            }
        }
        

    }

    
}
