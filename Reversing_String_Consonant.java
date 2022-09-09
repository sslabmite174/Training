import java.util.*;
class Main {
 

    public static boolean isVowel(char c) {
        return (c == 'a' || c == 'A' || c == 'e'
                || c == 'E' || c == 'i' || c == 'I'
                || c == 'o' || c == 'O' || c == 'u'
                || c == 'U');
    }
 

    public static String reverseVowel(String str1) {
        int j = 0;

        char[] str = str1.toCharArray();
        String vowel = "";
        for (int i = 0; i < str.length; i++) {
            if (!isVowel(str[i])) {
                j++;
                vowel += str[i];
            }
        }
 

        for (int i = 0; i < str.length; i++) {
            if (!isVowel(str[i])) {
                str[i] = vowel.charAt(--j);
            }
        }
 
        return String.valueOf(str);
    }
 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(reverseVowel(str));
    }
}
 
