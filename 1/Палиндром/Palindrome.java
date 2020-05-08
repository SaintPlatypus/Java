import java.util.Scanner;

/**
 * Palindrome
 */
public class Palindrome {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input words: ");
        String s = in.nextLine();
        System.out.println("Words palindrome");
        String words[] = s.split(" ");
		for (String word: words){
			System.out.println(isPalindrome(word.toLowerCase()));
		}
    }

    public static String reverseString(String s) { //Переворачиваем слово
        String rev_s = "";
        for (int i = (s.length()-1); i >= 0; i--) {
            rev_s += s.charAt(i);
        }
        return rev_s;
    }
    public static boolean isPalindrome(String s){ //Проверяем на палиндром
        String rev_s = reverseString(s);
        return (s.equals(rev_s));
    }
}