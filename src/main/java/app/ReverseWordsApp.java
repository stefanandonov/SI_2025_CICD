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
        for (int i=0;i<words.length;i++) {
            result.append(new StringBuilder(words[i]).reverse()).append(" ");
        }
        return result.toString().trim();
    }
}