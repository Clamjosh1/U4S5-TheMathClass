package com.codedifferently.labs.partC;

import java.util.Scanner;

public class KeypadConversion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a message: ");
        String message = scanner.nextLine();

        String keyPressSequence = convertToKeypad(message);

        System.out.println(keyPressSequence);

        scanner.close();
    }

    public static String convertToKeypad(String message) {
        String[] keypad = {
                "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"
        };

        StringBuilder result = new StringBuilder();

        for (char c : message.toLowerCase().toCharArray()) {
            if (Character.isLetter(c)) {
                for (int i = 0; i < keypad.length; i++) {
                    if (keypad[i].indexOf(c) != -1) {
                        int pressCount = keypad[i].indexOf(c) + 1;
                        result.append(String.valueOf(i + 1).repeat(pressCount));
                        break;
                    }
                }
            }
        }

        return result.toString();
    }
}
