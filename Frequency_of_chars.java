public class Frequency_of_chars {
    public static void main(String[] args) {
        String str = "prep insta";
        char[] arr = str.toCharArray();

        for (int i = 0; i < str.length(); i++) {

            int count = 1;
            if ((arr[i] != '0')&&(arr[i] != ' ')) {

                for (int j = i + 1; j < str.length(); j++) {

                    if (arr[i] == arr[j]) {
                        count++;
                        arr[j] = '0';

                    }
                }
                System.out.println(arr[i] + ":" + count);
            }

            
        }
    }
}
