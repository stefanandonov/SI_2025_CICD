package app;

import java.util.Scanner;

public class ReverseWordsApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want to reverse also the words: 1 = yes, 0 = no");
        boolean answer = Boolean.parseBoolean(scanner.nextLine());
        System.out.println("Enter a sentence:");
        String input = scanner.nextLine();

        if (answer) {
            System.out.println(reverseWordsAndLetters(input));
        } else {
            System.out.println(reverseOnlyLettersInWords(input));
        }

    }



    public static String reverseOnlyLettersInWords(String sentence) {
        String[] words = sentence.split("\s+");
        StringBuilder result = new StringBuilder();
        for (int i=0;i<words.length;i++) {
          result.append(words[i]).append(" "); 
         //   result.append(new StringBuilder(words[i]).reverse()).append(" ");
        }
        return result.toString().trim();
    }

    public static String reverseWordsAndLetters(String sentence) {
        String[] words = sentence.split("\s+");
        StringBuilder result = new StringBuilder();
        for (int i=words.length-1;i>=0;i--) {
            result.append(new StringBuilder(words[i]).reverse()).append(" ");
        }
        return result.toString().trim();

    }
}