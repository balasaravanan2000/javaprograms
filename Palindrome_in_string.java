public class Palindrome_in_string{
    public static void main(String[] args){
        String str="TENET";
        String str2="";
        for (int i=str.length()-1;i>=0;i--){
            str2=str2+str.charAt(i);
            
        }
        System.out.print(str2);
        if(str.equals(str2)){
            System.out.println("it is palindrome");
        }
        else{
            System.out.println("it is not palaindrome");
        }    
        
    }
}