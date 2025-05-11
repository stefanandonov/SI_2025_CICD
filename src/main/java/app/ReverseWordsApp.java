package app;

import java.util.Scanner;

public class ReverseWordsApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String input = scanner.nextLine();
        System.out.println(reverseWords(input));
    }

    public static String reverseWords(String sentence) {
        String[] words = sentence.split("\s+");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            result.append(new StringBuilder(word).reverse()).append(" ");
        }
        return result.toString().trim();
    }
}