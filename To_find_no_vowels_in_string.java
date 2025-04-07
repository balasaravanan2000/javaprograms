public class To_find_no_vowels_in_string {
    public static void main(String[] args) {
        String s="Alphabet";
        String x=s.toLowerCase();
        int count=0;
        for(int i=0;i<s.length();i++){
            if((x.charAt(i)=='a')||(x.charAt(i)=='e')||(x.charAt(i)=='i')||(x.charAt(i)=='o')||(x.charAt(i)=='u')){
             count++;
            }
            
        }
        System.out.println(count);
    }
    
}
