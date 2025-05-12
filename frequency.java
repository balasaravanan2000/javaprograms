import java.util.Scanner;

public class frequency {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int arr[] = new int[5];
        
        for (int i = 0; i < 5; i++) {
            
            arr[i] = scan.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            int count = 1;
            int repeat=0;
            for (int j = 0; j < 5; j++) {
                if (arr[i] == arr[j]) {
                    repeat++;
                    break;
                }

            }
            if(repeat==0){
                for(int j=i+1;i<5;i++){
                   if(arr[i]==arr[j]){
                    count++;
                   }
                }
            }
           
         System.out.println(arr[i]  + " occurs " + count + " times");
        }


    
    }

}