public class Remove_vowels_in_string {
    public static void main(String[] args) {
        String s = "Alphabet";
        String x = s.toLowerCase();
        
        for (int i = 0; i < s.length(); i++) {
            int count = 0;
            if ((x.charAt(i) == 'a') || (x.charAt(i) == 'e') || (x.charAt(i) == 'i') || (x.charAt(i) == 'o')
                    || (x.charAt(i) == 'u')) {
                count++;
            }
            if(count==0){
                System.out.println(x.charAt(i));
            }
            

        }

    }
}
