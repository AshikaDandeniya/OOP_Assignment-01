import java.util.Scanner;
import java.util.StringTokenizer;

public class Q5 {
    public static boolean isPalindrome(String sentence) {
        StringTokenizer tokenizer = new StringTokenizer(sentence, " ,.!?;:");
        StringBuilder cleanedSentence = new StringBuilder();

        while (tokenizer.hasMoreTokens()) {
            cleanedSentence.append(tokenizer.nextToken().toLowerCase());
        }

        String cleanedString = cleanedSentence.toString();
        String reversedString = cleanedSentence.reverse().toString();

        return cleanedString.equals(reversedString);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        if (isPalindrome(sentence)) {
            System.out.println("The sentence is a palindrome.");
        } else {
            System.out.println("The sentence is not a palindrome.");
        }
        scanner.close();
    }
}
