package com.company;

import java.util.Scanner;

public class Main {

    static String originalTerm;
    static String reverse;

    public static void main(String[] args) {    //Ex of Palindromes: Mom, Level, Rayar, Reconocer, Oso...

        Scanner input = new Scanner(System.in);
        System.out.print("Welcome!\nPlease enter the word: ");
        originalTerm = input.next();

        boolean finalResult = isPalindrome(originalTerm);

        if(finalResult == false) {
            System.out.print("The letters: ");
            for (int i = 0; i < originalTerm.length(); i++) {
                if (originalTerm.charAt(i) != reverse.charAt(i)) {
                    System.out.print(reverse.charAt(i) + ", ");
                }
            }
            System.out.println("are not a match with the word.");

        } else {
            System.out.println("The word " + originalTerm + " is a palindrome!");
        }
    }

    public static boolean isPalindrome(String originalTerm) {
        originalTerm = originalTerm.toLowerCase();
        originalTerm = originalTerm.replace(" ", "");

        reverse = "";
        for(int i = originalTerm.length() - 1; i >= 0; i--) {
            reverse += originalTerm.charAt(i);
        }

        boolean result = true;

        for (int k = 0; k < originalTerm.length(); k++) {
            if (originalTerm.charAt(k) != reverse.charAt(k)) {
                result = false;
            }
        }

        return result;
    }
}
