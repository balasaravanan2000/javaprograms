public class Sumofelementsinarray {
    public static void main(String[] args) {
        int arr[]={45,22,98,62,31};
        
        int sum;
        sum=sum(arr);
        System.out.println(sum);
        

    }
    static int sum(int[] arr){
        int x=0;
        
        for(int i=0;i<arr.length;i++){
            x=x+arr[i];

            
        }
    return(x);    
    }
    
}
